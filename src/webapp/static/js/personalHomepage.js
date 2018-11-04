$(function() {
	var get = _get();
	if(typeof(get["clickhow"]) != 'undefined') {
		$("#" + get["clickhow"]).click();
	} else {
		$("#userinfo").click();
	}
})

function setClass(dom) {
	$(".userlayout-itemlist-a").removeClass("userlayout-itemlist-a-active");
	$(dom).find("a").addClass("userlayout-itemlist-a-active");
}
// 获取内容
function getTripe(str) {
	$(".userlayout-itemlist li").removeClass("userlayout-itemlist-activity");
	
	if(typeof(this_tripe) == 'undefined' || (typeof(this_tripe) != 'undefined' && this_tripe != str)) {
		$(".userlayout-right").hide();
		$("."+str).fadeIn();
//		this_tripe = str;
//		$.get("/web/user/" + str, function(result) {
//			$(".userlayout-right").html(result);
//		});
//	} else {
//		this_tripe = str;
	}
}
// 二级添加选中状态
function setClass2(dom) {
	$(dom).addClass("userlayout-itemlist-activity");
}