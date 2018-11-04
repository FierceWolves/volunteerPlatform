$(function (){
	// 初始化查询参数
	PAGE_INDEX = 1;
	PAGE_COUNT = 1;
	PAGE_SIZE = 15;

	// 导航栏标记状态
	$("#activity-li").addClass("header-active");
	// 当前城市值
	currentDistrict = checkCurrentCity();
	var get = _get();
	if( typeof(get["type"])!='undefined' ){
		$("#category").val(get["type"]);
	}
	searchNow(PAGE_INDEX);
	pcaList();
})
// 生成地区下拉菜单
function pcaList(){
	var formData = new FormData();
	formData.append("typecode", "areatree");
	formData.append("parentid", currentDistrict['id']);
	formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
	var data = ajaxPost('/web/site/public?url=api/comm/basicdataTree.do', formData);
	$("#pca").attr("name", "province");
	if( currentDistrict['class']=='city' ){
		$("#pca").attr("name", "county");
	}
	
	var myTmpl = $.templates("#city-listrender");
	var html = myTmpl.render(data);
	$("#pca").prevAll().remove();
	$("#pca").before(html);
}
// 开始搜索内容
function searchNow(page){
	if (typeof(page) == "undefined") {
		page = 1;
	} 
	PAGE_INDEX = page;
	
	var formData = new FormData($("#activity-search-form")[0]);
	formData.append("page", PAGE_INDEX);
	formData.append("rows", PAGE_SIZE);
	if( currentDistrict['status'] ){
		if( currentDistrict['class']=='province' ){
			formData.append("province", currentDistrict['id']);
		}
		if( currentDistrict['class']=='city' ){
			formData.append("city", currentDistrict['id']);
		}
	}
	formData.append("ordertype", "releaseTime desc");
	formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
	ajaxPostAsync('/web/site/public?url=api/recruit/list.do', formData, activityList);
}
// 刷新视图
function activityList(data){
	PAGE_COUNT = data['totoalcount'];
	data = data['data'];
	// 处理活动数据
	data = setupActData(data);
	var myTmpl = $.templates("#activity");
	var html = myTmpl.render(data);
	$(".activity-itemlist-box").html(html);
	if(html==""){
		$(".activity-itemlist-box").html('<div class="pubic-none-box"><img src="/views/public/images/none.png"></div>');
	}
	// 刷新分页插件
	activity = $(".tcdPageCode").createPage({
        pageCount:parseInt(PAGE_COUNT/PAGE_SIZE)+1,
        current:PAGE_INDEX,
        backFn:function(p){
            //PAGE_INDEX = p;
			searchNow(p);
        }
    });
	// 页面回到顶部
	goTop();
}