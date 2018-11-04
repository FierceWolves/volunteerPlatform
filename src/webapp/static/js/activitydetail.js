$(function (){
	$.views.helpers({
		"mask": function(zyzid){
			zyzid = zyzid.replace(/[^0-9]/ig,"");
			zyzid = parseInt(zyzid);
			zyzid = zyzid%200;
			return 'http://image.zyz.org.cn/image/default/'+zyzid+'.jpg';
		},
    });
	// 导航栏标记状态
	$("#activity-li").addClass("header-active");
	get = _get();
	if( typeof(get['id']) == 'undefined' ){
		return window.location.href="/web/site/activity";
	}
	// 获取活动详情数据
	var data = getActivityData();
	var myTmpl = $.templates("#activitydetail");
	var html = myTmpl.render(data);
	$(".activitydetail-tripe").html(html);
	// 缓存用户详情
	userdata = new Array();
})

/*
 * 举报活动
 */
function actReport(url){
	if( $("#user").attr("val")=="0" ){
		alert("未登录，无法进行相关操作");
		return;
	}
	window.location.href = url;
}

/*
 * 获取活动详情
 */
function getActivityData(){
	var formData = new FormData();
	// 活动id
	formData.append("id", get['id']);
	// 志愿者id
	formData.append("zyzid", $("#user").attr("val"));
	// csrf
	formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
	// 获取详情基本数据
	var data = ajaxPost('/web/site/public?url=api/recruit/detail.do', formData);
	// 获取参加人员数据
	var join_data = ajaxPost('/web/site/public?url=api/recruit/signupList.do', formData);
	// 当前时间
	var time_now = Date.parse(new Date());
	// 计算参加人员距离现在的时间
	join_data = join_data['data'];
	for( var newdata in join_data ){
		var time = (time_now - join_data[newdata]["create_time"])/3600000;
		if( time<1 ){
			time = "刚刚";
		}else if( time<24 && time>=1 ){
			time = parseInt(time) + "小时前";
		}else if( time>24 ){
			time = parseInt(time/24) + "天前";
		}
		
		join_data[newdata]["time"] = time;
	}
	// 将计算后的结果加入详情数据
	data["join_item"] = join_data;
	// 计算时间百分比也已过去的天数
	var day = (data["recruit_finish_time"] - time_now)/86400000;
	if( day>0.001 && day<1 ){
		day = 1;
	}
	if( day<0.001){
		day = 0;
	}
	
	data["time"] = Math.ceil(day);
	data["timeline"] = (time_now - data["recruit_start_time"])/(data["recruit_finish_time"] - data["recruit_start_time"]);
	data["timeline"] = data["timeline"].toFixed(4)*100 + "%";
	data["recruit_finish_time"] = formatDate(data["recruit_finish_time"]);
	data["recruit_start_time"] = formatDate(data["recruit_start_time"]);
	
	return data;
}
function sendForm(str, bool, dom){
	var get = _get();
	switch(str){
		case 'join':
			var data = joinActivity( bool, get['id'] );
			if( data["status"] != "true" ){
				return alert(data["message"]);
			}
			if( bool ){
				// $(dom).html("已参加(" + (parseInt(($(dom).html()).replace(/[^0-9]/ig,"")) + 1) + ")");
				// return $(dom).attr("onclick", "sendForm('join', false, this)");
				return window.location.href="/web/site/actsuccess";
			}else{
				$(dom).html("参加(" + (parseInt(($(dom).html()).replace(/[^0-9]/ig,"")) - 1) + ")");
				return $(dom).attr("onclick", "sendForm('join', true, this)");
			}
		break;
		case 'like':
			var data = likeActivity( bool, get['id'] );
			if( data["status"] != "true" ){
				return alert(data["message"]);
			}
			if( bool ){
				$(dom).html("<i></i>" + (parseInt(($(dom).html()).replace(/[^0-9]/ig,"")) + 1));
				return $(dom).attr("onclick", "");
			}
		break;
		case 'collection':
			var data = collectionActivity( bool, get['id'] );
			if( data["status"] != "true" ){
				return alert(data["message"]);
			}
			if( bool ){
				$(dom).html("已收藏(" + (parseInt(($(dom).html()).replace(/[^0-9]/ig,"")) + 1) + ")");
				return $(dom).attr("onclick", "sendForm('collection', false, this)");
			}{
				$(dom).html("收藏(" + (parseInt(($(dom).html()).replace(/[^0-9]/ig,"")) - 1) + ")");
				return $(dom).attr("onclick", "sendForm('join', true, this)");
			}
		break;
		case 'share':
			var data = shareActivity( bool, get['id'] );
			if( data["status"] != "true" ){
				return alert(data["message"]);
			}
			if( bool ){
				return $(dom).html("分享(" + (parseInt(($(dom).html()).replace(/[^0-9]/ig,"")) + 1) + ")");
			}
		break;
	}
}
// 显示用户详情
function showdetails(dom,id){
	var X = $(dom).parent().offset().top;
	var Y = $(dom).parent().offset().left;
	$(".show-userdetail").css("top",X-$(".show-userdetail").height()-10);
	$(".show-userdetail").css("left",Y);
	var data;
	if(userdata[id]==undefined){
		var formData = new FormData();
		// 志愿者id
		formData.append("zyzid", id);
		var data = ajaxPost('/web/site/public?url=api/volunteer/reduceInfo.do', formData);
		userdata[id] = data;
	}else{
		data = userdata[id];
	}
	console.log(data);
	// $("#name").html(data['extend']['guardianname']);
	$("#usermask").css("backgroundImage",$(dom).css("backgroundImage"));
	$(".show-userdetail").show();
}