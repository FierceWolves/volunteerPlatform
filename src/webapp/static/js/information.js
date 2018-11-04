$(function(){
	PAGE_INDEX = 1;
	PAGE_SIZE = 12;
	PAGE_COUNT = 1;
	$("#information-li").addClass("header-active");
	currentDistrict = checkCurrentCity();
	changeClass();
})
function changeClass(){
	var formData = new FormData($("#info_search")[0]);
	formData.append("page_size", PAGE_SIZE);
	formData.append("page_index", PAGE_INDEX);
	ajaxPostAsync('/web/information/index', formData, informationList);
}
function informationList(data){
	if(data["status"]){
		$(".info-itemlist-box").html("");
		$("#info_item_s_pre").nextAll().remove();
		var myTmpl = $.templates("#info_item");
		var html = myTmpl.render(data["data"]);
		$(".info-itemlist-box").html(html);
		if(html==""){
			$(".info-itemlist-box").html('<div class="pubic-none-box" style="width:782px;"><img src="/views/public/images/none.png"></div>');
		}
		data["data"] = data["data"].slice(0, 6);
		myTmpl = $.templates("#info_item_s");
		html = myTmpl.render(data["data"]);
		$("#info_item_s_pre").after(html);
		
		PAGE_COUNT = data['page_count'];
		$(".tcdPageCode").createPage({
			pageCount:parseInt(PAGE_COUNT/PAGE_SIZE)+1,
			current:PAGE_INDEX,
			backFn:function(p){
				PAGE_INDEX = p;
				changeClass();
			}
		});
	}
}