// 初始化下拉菜单
function startDownlist(renderid,data,inputid){
	var myTmpl = $.templates("#"+renderid);
	var html = myTmpl.render(data);
	$("#"+inputid).prevAll().remove();
	$("#"+inputid).before(html);
}
// 初始化多选框
function startCheckbox(renderid,data,inputid){
	var myTmpl = $.templates("#"+renderid);
	var html = myTmpl.render(data);
	$("#"+inputid).html(html);
}
// 显示下拉列表
function downList(dom){
	var is_show = $(dom).next().is(":hidden");
	$(".search-order-itemlist").hide();
	if( is_show ){
		$(dom).next().fadeIn(200);
		$(dom).next().find("input").focus();
	} else {
		$(dom).next().hide();
	}
}
// 点选下拉列表项事件
function downListItemClick(dom){
	var dom_fa = $(dom).parent();
	var dom_gfa = dom_fa.parent();
	dom_fa.find("li").removeClass("search-order-itemlist-actived");
	$(dom).addClass("search-order-itemlist-actived");
	dom_fa.hide();
	dom_fa.find("input").val($(dom).attr("val"));
	dom_gfa.find("a").html($(dom).html()+"<i></i>");
	dom_fa.find("input").change();
}
// 城市联动三级菜单change事件
function downlistOfProvince(lv, maxlv, publicid, dom){
	// 获取数据
	var formData = new FormData();
	formData.append("typecode", "areatree");
	formData.append("parentid", dom.value);
	formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
	var data = ajaxPost('/web/site/public?url=api/comm/basicdataTree.do', formData);
	for( var i=lv+1;i<maxlv+1;i++ ){
		// 初始化后几级菜单
		$("#" + publicid + i).val("");
		$("#" + publicid + i).prevAll().remove();
		$("#" + publicid + "show_" + i).html("请选择<i></i>");
	}
	// 填充下级菜单
	var domnext = $("#" + publicid + (lv+1));
	var myTmpl = $.templates("#city-listrender");
	var html = myTmpl.render(data);
	domnext.before(html);
}
/*
 * 点击空闲时间
 */
function mytime(dom, str){
	if( $(dom).attr("check") == 'false' ){
		$(dom).addClass(str + "-active");
		$(dom).attr("check", true);
	}else{
		$(dom).removeClass(str + "-active");
		$(dom).attr("check", false);
	}
}