/*
 * 参加和取消活动请求
 */
function joinActivity( bool, id ){
	if( $("#user").attr("val")=="0" ){
		alert("未登录，无法进行相关操作");
		return;
	}
	var formData = new FormData();
	formData.append("id", id);
	// csrf
	formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
	var data;
	// 如果true就是参加
	if( bool ){
		data = ajaxPost('/web/site/public?url=api/recruit/signup.do', formData);
	}else{
		data = ajaxPost('/web/site/public?url=api/recruit/cancelSignup.do', formData);
	}
	return data;
}

/*
 * 活动点赞请求
 */
function likeActivity(bool,id){
	if( $("#user").attr("val")=="0" ){
		alert("未登录，无法进行相关操作");
		return;
	}
	var formData = new FormData();
	// 活动id
	formData.append("id", id);
	// csrf
	formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
	var data = ajaxPost('/web/site/public?url=api/recruit/GoodPoint.do', formData);
	return data;
	if( data["status"] == "true" ){
		$(dom).html("<i></i>" + (parseInt(($(dom).html()).replace(/[^0-9]/ig,"")) + 1));
		return $(dom).attr("onclick", "");
	}
}

/*
 * 活动收藏请求
 */
function collectionActivity(bool, id){
	if( $("#user").attr("val")=="0" ){
		alert("未登录，无法进行相关操作");
		return;
	}
	var formData = new FormData();
	// 活动id
	formData.append("id", id);
	// csrf
	formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
	var data = ajaxPost('/web/site/public?url=api/recruit/Collection.do', formData);
	return data;
}

/*
 * 活动分享请求
 */
function shareActivity(bool,id){
	var formData = new FormData();
	// 活动id
	formData.append("id", id);
	// csrf
	formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
	var data = ajaxPost('/web/site/public?url=api/recruit/Share.do', formData);
	return data;
}