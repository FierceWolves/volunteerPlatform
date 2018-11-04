<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="en-US">

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="api_token" content="">
		<title>组织详情</title>
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
				<script src="${staticPath}/js/orgdetail.js" type="text/javascript"></script>
				<div class="orgdetail-tripe">
					<div class="orgdetail-orginfo">
						<div class="orgdetail-orgdetail"></div>
						<div class="orgdetail-orgmask" style="background-image:url(http://image.zyz.org.cn/1477373875147695c61a329da4abcb42ac0495dd33edd?imageView2/2/w/100/h/100)"></div>
						<abbr title="安徽省"><h3 class="orgdetail-orgname">安徽省</h3></abbr>
						<div class="orgdetail-btn">未开放招募</div>

					</div>
					<div class="orgdetail-right">
						<div class="orgdetail-three hour">
							<p>为社会输送志愿时间</p>
							<h3>4008346.3</h3>
							<p>小时</p>
						</div>
						<div class="orgdetail-three person">
							<p>输送志愿者</p>
							<h3>2729044</h3>
							<p>人</p>
						</div>
						<div class="orgdetail-three act">
							<p>发起活动</p>
							<h3>0</h3>
							<p>场</p>
						</div>
						<h3 class="orgdetail-h3">发起的活动</h3>
					</div>
				</div>
				<div id="usermessage" style="display:none;"></div>
				<script id="orgdetail" type="text/x-jsrender">

				</script>
				<!--<script>
					$(function() {
						// 导航栏标记状态
						$("#org-li").addClass("header-active");
						get = _get();
						if(typeof(get['id']) == 'undefined') {
							return window.location.href = "activity.html";
						}
						// 获取活动详情数据
						/* var data = getActivityData();
						var myTmpl = $.templates("#orgdetail");
						var html = myTmpl.render(data);
						$(".orgdetail-tripe").html(html); */
					})
				</script>-->
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