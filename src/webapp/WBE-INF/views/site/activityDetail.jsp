<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="en-US">

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="api_token" content="">
		<title>活动详情</title>
		<link rel="shortcut icon" href="${staticPath}/images/titleLogo.png" />
		<link href="${staticPath}/css/core.css" rel="stylesheet">
		<script src="${staticPath}/js/jquery-3.3.1.js" type="text/javascript"></script>
		<script src="${staticPath}/js/jsrender.min.js" type="text/javascript"></script>
		<script src="${staticPath}/js/jquery.page.js" type="text/javascript"></script>
		<script src="${staticPath}/js/core.js" type="text/javascript"></script>
		<script src="${staticPath}/js/main.js" type="text/javascript"></script>

	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">

		<div class="main-fix-window">
			<div class="main-fix-item1" onClick="goTop()">回到顶部</div>
			<div class="main-fix-item3" onClick="advice()">意见建议</div>
		</div>

		<div class="wrap">

			<div class="header" >
				<nav>
					<img class="header-logo">
					<div class="header-city">
						<nobr><em id="header-city-name" >全国站</em>
							<font onclick="openCity()" >［切换城市］</font>
						</nobr>
					</div>
					<ul class="header-ul">
						<li class="header-ul-li" id="home-li" >首页</li>
						<li class="header-ul-li" id="activity-li" >活动</li>
						<li class="header-ul-li" id="org-li" >组织</li>
						<li class="header-ul-li" id="information-li" >资讯</li>
						<li class="header-ul-li" id="creditShop-li" >积分商城</li>

						<ul class="header-user">
							<li class="header-ul-li header-user-downlist">
								<a  id="userLogin" val="0" >登录</a>
							</li>
							|
							<li class="header-ul-li header-user-downlist">
								<a class="userRegister" >注册</a>
							</li>

						</ul>
					</ul>
				</nav>
			</div>

			<div class="header-city-box">
				<p onClick="headerCityChange(this)" val="0">全国站</p>
				<ul class="header-city-tag">
					<li onClick="areaChange(this)" id="first" isold="false" val="1">华东</li>
					<li onClick="areaChange(this)" val="2">华南</li>
					<li onClick="areaChange(this)" val="3">中南</li>
					<li onClick="areaChange(this)" val="4">东北</li>
					<li onClick="areaChange(this)" val="5">西南</li>
					<li onClick="areaChange(this)" val="6">华北</li>
					<li onClick="areaChange(this)" val="7">西北</li>
					<li onClick="areaChange(this)" val="8">其他</li>
				</ul>
			</div>
			<div class="container">
				<link href="${staticPath}/css/orgdetail.css" rel="stylesheet">
				<link href="${staticPath}/css/activitydetail.css" rel="stylesheet">
				<script src="${staticPath}/js/activity-action.js" type="text/javascript"></script>
				<script src="${staticPath}/js/activitydetail.js" type="text/javascript"></script>
				<div class="activitydetail-tripe">
					<div class="activitydetail-left">
						<div class="activity-item-box activitydetail-basic-box" style="height:auto;padding-bottom:10px;">
							<div class="activity-item-img" style="background-image:url(http://image.zyz.org.cn/1532768805430a15c5b927fc94163bd4ce64ec8ff84a9.jpg?imageView2/2/w/400/h/270);">
							</div>
							<h3 class="activity-item-box-h3">廿三里卫生院助力"最多跑一次"改革志愿服务活动</h3>
							<div class="activity-item-day">
								<span class="activity-item-day-span">报名截止：</span>

								<p class="activity-item-day-p"><i style="width:41.22%;"></i></p>

								<span class="activity-item-day-span">2天</span>

							</div>

							<div class="activitydetail-btn activitydetail-join" onclick="sendForm('join', true, this)">
								参加(3)
							</div>

							<div class="activitydetail-btn activitydetail-get" onclick="sendForm('collection', true, this)">
								收藏(0)
							</div>
							<div class="activitydetail-btn activitydetail-send" onclick="sendForm('share', true, this)">
								分享(25)
							</div>
							<p class="activity-item-plist"></p>
							<p class="activity-item-plist"><i class="act-time-icon"></i>2018年07月28日 - 2018年07月29日</p>
							<p class="activity-item-plist"><i class="act-addr-icon"></i>廿三里中心卫生院(浙江省金华市义乌市长宁路1号)</p>
							<p class="activity-item-plist"><i class="act-cat-icon"></i>社区服务</p>
							<p class="activity-item-plist"><i class="act-org-icon"></i>发起组织：
								<a href="/web/site/orgdetail?id=153147070444950762e2afea54e6f8844904239657738">廿三里卫生院 天使志愿服务队</a>
							</p>
							<p class="activity-item-plist"><i class="act-p-icon"></i>联系人：朱昂青</p>
							<p class="activity-item-plist"><i class="act-tel-icon"></i>联系方式：13735755033</p>
						</div>
						<div class="activity-join-box">
							<h3>报名动态</h3>

							<div class="activity-join-item">
								<div class="activity-join-item-mask" onmouseover="showdetails(this,'1531489016932fddf58acd3584bb299ee3d10b7b36140')" onmouseout="$('.show-userdetail').hide()" style="background-image:url(http://image.zyz.org.cn/image/default/184.jpg);"></div>
								<p>1小时前</p>
							</div>

							<div class="activity-join-item">
								<div class="activity-join-item-mask" onmouseover="showdetails(this,'15277807458724c4672761fa94185b269410c175b8cd8')" onmouseout="$('.show-userdetail').hide()" style="background-image:url(http://image.zyz.org.cn/image/default/160.jpg);"></div>
								<p>1小时前</p>
							</div>

							<div class="activity-join-item">
								<div class="activity-join-item-mask" onmouseover="showdetails(this,'1510209086500bc59a1e1b0be4c1685c313b638d6c291')" onmouseout="$('.show-userdetail').hide()" style="background-image:url(http://image.zyz.org.cn/image/default/24.jpg);"></div>
								<p>1小时前</p>
							</div>

						</div>
					</div>
					<div class="activitydetail-info-box">
						<h4 class="activitydetail-info-h4">活动详情</h4>
						<div class="activitydetail-info-detail">
							服务内容：引导宣传一人一诊室，健康宣教，自助机使用，科室引导，维持秩序。
						</div>
						<div class="activitydetail-info-zan-box">
							<div class="activitydetail-info-zan" onclick="sendForm('like', true, this)">
								<i></i> 0
							</div>
						</div>
						<br><br><br>
						<div class="register-btn" style="float:left;" onclick="actReport('/web/site/actreport?act_name=廿三里卫生院助力&quot;最多跑一次&quot;改革志愿服务活动&amp;activityid=1532768829372dc17d589fe19494b94887650eb8d39e6')">举报</div>
					</div>
				</div>
				<div class="orgdetail-orginfo show-userdetail">
					<div class="orgdetail-orgdetail"></div>
					<div class="orgdetail-orgmask" id="usermask"></div>
					<abbr title="姓名"><h3 class="orgdetail-orgname" id="name">姓名</h3></abbr>
					<div style="position:absolute;padding:0px 20px;height:50px;width:300px;background-color:#5ec16b;top:200px;left:25px;">
						<p style="text-align:center;color:white;line-height:50px;">
							<span style="float:left;">已服务社会</span>0<span style="float:right;">小时</span>
						</p>
					</div>
					<p style="padding:3px 25px;color:#999;">服务领域：</p>
					<p style="padding:3px 25px;color:#999;">擅长技能：</p>
					<p style="padding:3px 25px;color:#999;padding-bottom:25px;">Ta的活动(12) | Ta的组织(1)</p>
				</div>
				<script id="activitydetail" type="text/x-jsrender" data-jsv-tmpl="jsvTmpl">
					<div class="activitydetail-left">
						<div class="activity-item-box activitydetail-basic-box" style="height:auto;padding-bottom:10px;">
							<div class="activity-item-img" style="background-image:url({{>thumb}}?imageView2/2/w/400/h/270);">
							</div>
							<h3 class="activity-item-box-h3">{{>name}}</h3>
							<div class="activity-item-day">
								<span class="activity-item-day-span">报名截止：</span> {{if is_finish=='1'}}
								<p class="activity-item-day-p"><i style="width:100%;"></i></p>
								{{else}}
								<p class="activity-item-day-p"><i style="width:{{>timeline}};"></i></p>
								{{/if}} {{if is_finish=='1'}}
								<span class="activity-item-day-span">已结束</span> {{else}}
								<span class="activity-item-day-span">{{>time}}天</span> {{/if}}
							</div>

							{{if is_finish=='0'}} {{if is_signup==0}}
							<div class="activitydetail-btn activitydetail-join" onclick="sendForm('join', true, this)">
								参加({{>signup_people}})
							</div>
							{{else}}
							<div class="activitydetail-btn activitydetail-join" onclick="sendForm('join', false, this)">
								已参加({{>signup_people}})
							</div>
							{{/if}} {{/if}}

							<div class="activitydetail-btn activitydetail-get" onclick="sendForm('collection', true, this)">
								收藏({{>follow_num}})
							</div>
							<div class="activitydetail-btn activitydetail-send" onclick="sendForm('share', true, this)">
								分享({{>share_num}})
							</div>
							<p class="activity-item-plist"></p>
							<p class="activity-item-plist"><i class="act-time-icon"></i>{{>recruit_start_time}} - {{>recruit_finish_time}}</p>
							<p class="activity-item-plist"><i class="act-addr-icon"></i>{{>address}}</p>
							<p class="activity-item-plist"><i class="act-cat-icon"></i>{{>category}}</p>
							<p class="activity-item-plist"><i class="act-org-icon"></i>发起组织：
								<a href="/web/site/orgdetail?id={{:departmentid}}">{{>department_name}}</a>
							</p>
							<p class="activity-item-plist"><i class="act-p-icon"></i>联系人：{{>contact}}</p>
							<p class="activity-item-plist"><i class="act-tel-icon"></i>联系方式：{{>contact_phone}}</p>
						</div>
						<div class="activity-join-box">
							<h3>报名动态</h3> {{for join_item}}
							<div class="activity-join-item">
								<div class="activity-join-item-mask" onmouseover="showdetails(this,'{{:zyzid}}')" onmouseout="$('.show-userdetail').hide()" style="background-image:url({{if avatar==''}}{{> ~mask(id)}}{{else}}{{>avatar}}?imageView2/2/w/100/h/100{{/if}});"></div>
								<p>{{>time}}</p>
							</div>
							{{/for}}
						</div>
					</div>
					<div class="activitydetail-info-box">
						<h4 class="activitydetail-info-h4">活动详情</h4>
						<div class="activitydetail-info-detail">
							{{:content}}
						</div>
						<div class="activitydetail-info-zan-box">
							<div class="activitydetail-info-zan" onclick="sendForm('like', true, this)">
								<i></i> {{>like_num}}
							</div>
						</div>
						<br><br><br>
						<div class="register-btn" style="float:left;" onclick="actReport('/web/site/actreport?act_name={{>name}}&activityid={{:id}}')">举报</div>
					</div>
				</script>
			</div>

			<footer class="footer" >
				<div class="footer-box">
					<div class="footer-left">
						<dl>
							<dt>友情链接</dt>
							<dd onClick="window.location.href='http://www.ccyl.org.cn/'">共青团中央委员会</dd>
							<dd onClick="window.location.href='http://www.cyol.net/'">中青在线</dd>
						</dl>
						<dl>
							<dt>&nbsp;</dt>
							<dd onClick="window.location.href='http://www.zgzyz.org.cn/'">中国青年志愿者网</dd>
							<dd onClick="window.location.href='http://www.creditchina.gov.cn/'">信用中国</dd>
						</dl>
						<dl>
							<dt>主办单位</dt>
							<dd onClick="window.location.href='http://www.nsu.edu.cn/'">成都东软学院</dd>
							<dd onClick="window.location.href='#'">青年志愿者协会</dd>
						</dl>
						<p style="margin-top:20px;padding-top:20px;border-top:#727171 1px solid;">联系邮箱：i-my-love@outlook.com&nbsp;&nbsp;&nbsp;&nbsp;联系电话：028-6488-8001</p>
					</div>
					<img class="footer-right" >
				</div>
			</footer>

			<script id="cityList" type="text/x-jsrender">
				<dl>
					{{if url!=null}}
					<dt onclick="window.location.href='{{>url}}'">{{:name}}</dt> {{else}}
					<dt onclick="headerCityChange(this)" val="{{>areaid}}" newid="{{>newareaid}}" class="province">{{>name}}</dt> {{/if}}
					<div class="header-city-ddlist">
						{{for city ~parentareaid=areaid}} {{if url!=null}}
						<dd onclick="window.location.href='{{>url}}'">{{:name}}</dd>
						{{else}}
						<dd onclick="headerCityChange(this)" val="{{>areaid}}" newid="{{>newareaid}}" class="city" upclass="{{>~parentareaid}}">{{>name}}</dd>
						{{/if}} {{/for}}
					</div>
				</dl>
			</script>
			<script>
				var ch = checkCurrentCity();
				if(!ch['status']) {
					var city = new Array();
					city["name"] = "全国站";
					city["val"] = "0";
					city["id"] = "14737477846505d6208a5e781435b84e2e079304353cb";
					setCookie("currentDistrict", city);
				}
			</script>

	</body>

</html>