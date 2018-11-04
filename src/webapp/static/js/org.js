$(function (){
	// 初始化查询参数
	PAGE_INDEX = 1;
	PAGE_COUNT = 1;
	PAGE_SIZE = 20;

	// 导航栏标记状态
	$("#org-li").addClass("header-active");
	// 当前城市值
	currentDistrict = checkCurrentCity();
	console.log(currentDistrict);
	$.views.helpers({
		"time1": function(time){
			return Math.round(time*Math.pow(10, 1))/Math.pow(10, 1);
		},
		"v": function(){
			return Date.parse(new Date());;
		}
    });
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
	
	var formData = new FormData($("#org-search-form")[0]);
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
	formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
	ajaxPostAsync('/web/site/public?url=api/department/list.do', formData, orgList);
}
// 刷新组织数据
function orgList(data){
	PAGE_COUNT = data['totoalcount'];
	data = data['data'];
	var myTmpl = $.templates("#org");
	var html = myTmpl.render(data);
	$("#org-list-box").html(html);
	if(html==""){
		$("#org-list-box").html('<div class="pubic-none-box"><img src="/views/public/images/none.png"></div>');
	}
	// 重置分页插件
	$(".tcdPageCode").createPage({
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