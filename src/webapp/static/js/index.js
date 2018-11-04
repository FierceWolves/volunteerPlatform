// 动画开始
var num;
function star(star){
	if( num != star ){
		num = star - 1;
		bannerAction();
		return true;
	}
	stop();
	t = setInterval("bannerAction()", 3000);
}
// 动画暂停
function stop(){
	if( typeof(t) != "undefined"){
		clearInterval(t);
	}
}
// 执行动画
function bannerAction(){
	if($(".index-banner-img-box img").length<2){
		return;
	}
	num++;
	if( num>$(".index-banner-img-box img").length-1 || num<0 ){
		num = 0;
	}
	$(".index-banner-img-box img").hide();
	$("#index-banner-img" + num).fadeIn();
	$(".index-banner-btn-box div").removeClass("index-banner-btn-active");
	$("#index-banner-btn" + num).addClass("index-banner-btn-active");
}
// 重新加载首页数据
function indexStar(){
	var formData = new FormData();
	formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
	// 活动分类数据
	formData.append("typecode", "activitytype");
	ajaxPostAsync('/web/site/public?url=api/comm/basicdataTree.do', formData, indexActClass);
	// 活动数据
	formData.append("ids", $("#actlist").val());
	ajaxPostAsync('/web/site/public?url=api/recruit/listbyids.do', formData, indexActivity);
	// 组织分类数据
	formData.append("typecode", "depttype");
	ajaxPostAsync('/web/site/public?url=api/comm/basicdataTree.do', formData, indexOrgClass);
	// 组织数据
	formData.append("ids", $("#orglist").val());
	ajaxPostAsync('/web/site/public?url=api/department/listbyids.do', formData, indexOrg);
}
// 活动分类数据
function indexActClass(data){
	var myTmpl = $.templates("#index-actclass");
	var html = myTmpl.render(data);
	$("#index-actclass-box").html(html);
}
// 活动数据
function indexActivity(data){
	data = data['data'];
	// 处理活动数据
	data = setupActData(data);
	var myTmpl = $.templates("#index-activity");
	var html = myTmpl.render(data);
	if(html!="")
	$(".activity-itemlist-box").html(html);
}
// 组织分类数据
function indexOrgClass(data){
	var myTmpl = $.templates("#index-orgclass");
	var html = myTmpl.render(data);
	$("#index-orgclass-box").html(html);
}
// 组织数据
function indexOrg(data){
	data = data['data'];
	var myTmpl = $.templates("#index-org");
	var html = myTmpl.render(data);
	if(html!="")
	$(".org-itemlist-box").html(html);
}