<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="en-US">

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="api_token" content="">
		<title>忘记密码</title>
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
								<a href="login.jsp" id="userLogin" val="0" >登录</a>
							</li>
							|
							<li class="header-ul-li header-user-downlist">
								<a href="../../site/register.jsp" >注册</a>
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
				<link href="${staticPath}/css/registerPerson.css" rel="stylesheet">
				<div class="setp-tripe" style="width:350px;">
					<div class="setpitem">
						<div class="setp-btn setp-btn-active" id="setp-btn1">1</div>
						<h3>重置密码</h3>
					</div>
					<hr>
					<div class="setpitem">
						<div class="setp-btn" id="setp-btn2">2</div>
						<h3>重置成功</h3>
					</div>
				</div>
				<div class="registerperson-tripe tripe1" style="display:block;">
					<div class="register-box">
						<div class="register-box-title register-box-title-active" onclick="registerMode('手机', this)" style="width:100%">忘记密码</div>
						<!--<div class="register-box-title" id="registerByCardBtn" onclick="registerMode('身份证', this)">邮箱验证</div>-->
						<div class="register-input-box" id="register-byphone">
							<form id="forget-byphone-form" method="post" action="javascript:registerForPhone()">
								<input type="hidden" name="_csrf" value="S0t1QS0wcEY9HB8kdGhdAzp9PS9UWkANKihNMAB9BwA6BRsNbnRJCw==">
								<input type="hidden" name="type" value="tel">
								<label class="register-label" for="forget-phone">证件号码：</label><input id="forget-idcard" type="text" class="register-input" name="idcard" placeholder="请输入证件号码"><input id="forget-mphone" type="hidden" class="register-input" name="mphone"><br>
			
								<div id="captcha_div" style=""><label class="register-label" for="register-pcode">图片验证码：</label><input id="captcha_code" type="text" class="register-input" name="captcha_code" placeholder="请输入图片验证码" style="width:170px;">
									<input type="hidden" name="code_id" id="code_id" value="153286026794612"><img id="captcha_img" style="margin-bottom:8px;" height="33" width="90" title="点击刷新" src="https://appapi.zyh365.com/other/captcha/?web_id=h5&amp;code_id=153286026794612" onclick="captcha()" align="absbottom"><br>
								</div>
			
								<label class="register-label" for="register-pcode">验证码：</label><input id="forget-pcode" type="text" class="register-input" name="icode" placeholder="请输入短信验证码" style="width:170px;">
								<div class="register-btn" style="margin-top:7px;width:90px;" onclick="getIcode(this)" id="time">获取验证码</div><br>
								<label class="register-label" for="password">设置密码：</label><input id="password" type="password" class="register-input" name="password" placeholder="请输入6-16位字符，不可为纯数字"><br>
								<label class="register-label" for="check-password">确认密码：</label><input id="check-password" type="password" class="register-input" placeholder="请再次输入密码"><br>
								<br><br>
								<div class="register-btn" onclick="registerForPhone()">提交</div><br>
							</form>
						</div>
					</div>
				</div>
				<div class="registerperson-tripe tripe3">
					<div class="register-success-box">
						<h3>操作成功!</h3>
						<p>请用新密码重新登录</p>
						<div onclick="window.location.href='login.jsp'">登录</div>
						<a href="<%=request.getContextPath()%>/site/home.jsp">返回首页</a>
					</div>
				</div>
				<script id="city-listrender" type="text/x-jsrender">
					<li onclick="downListItemClick(this)" val="{{:code}}">{{:name}}</li>
				</script>
				<script>
					/*
					 * 获取图片验证码
					 */
					function captcha() {
						var formData = new FormData();
						var data = ajaxPost('/web/site/captcha-data', formData);
						if(data['status']) {
							//图片验证码是否显示
							if(data['data']['open'] == '1') {
								//赋值
								$('#code_id').val(data['data']['code_id']);
								$('#captcha_img').attr('src', data['data']['linkurl']);
								$('#captcha_div').show();
							} else {
								$('#captcha_div').hide();
							};
			
						}
					}
					//获取图片验证码
					captcha();
			
					/*
					 * 获取手机验证码
					 */
					function getIcode() {
						var rs = filter($("#forget-idcard").val(), '证件号码');
						if(!rs['status']) {
							return alert(rs['message']);
						}
						var formData = new FormData();
						formData.append("idcard", $("#forget-idcard").val());
						formData.append("type", "2");
						formData.append("code_id", $("#code_id").val());
						formData.append("captcha_code", $("#captcha_code").val());
						formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
			
						if($("#code_id").val() != '' && $("#captcha_code").val() == '') {
							alert('图片验证码不能为空');
							return false;
						}
			
						//var data = ajaxPost('/web/user/forgetpsd-mobile', formData);
						var data = ajaxPost('/web/site/mobile-send', formData);
						if(data['status'] === 'true' || data['status'] === true) {
							alert(data['message']);
							$('#forget-mphone').val(data['mphone']); //证件的手机号码
							$("#time").attr("onclick", "");
							s(60);
							return;
						}
						alert(data['message']);
						//获取图片验证码
						captcha();
					}
					// 时间
					function s(number) {
						$("#time").html(number + "秒");
						number--;
						if(number == -1) {
							$("#time").html("再次获取");
							$("#time").attr("onclick", "getIcode(this)");
							return;
						}
						var t = setTimeout("s(" + number + ")", 1000);
					}
					// 步骤切换
					function setpChange(num) {
						$(".registerperson-tripe").hide();
						$(".tripe" + num).fadeIn();
						$(".setp-btn").removeClass("setp-btn-active");
						for(var i = 1; i < num + 1; i++) {
							$("#setp-btn" + i).addClass("setp-btn-active");
						}
					}
					// 表单提交
					function registerForPhone() {
						if(!checkForm()) {
							return;
						}
						var formData = new FormData($("#forget-byphone-form")[0]);
						formData.append("_csrf", $("meta[name=csrf-token]").attr("content"));
						var data = ajaxPost('/web/user/forgetpsd', formData);
						if($("#password").val() != $("#check-password").val()) {
							return alert("新密码与确认密码不一致");
						}
						if(data['status'] === 'true' || data['status'] === true) {
							return setpChange(3);
						}
						return alert(data['message']);
					}
					// 表单验证
					function checkForm() {
						var rs = filter($("#forget-idcard").val(), '证件号码');
						if(!rs['status']) {
							alert(rs['message']);
							return false;
						}
						rs = filter($("#forget-pcode").val(), '短信验证码');
						if(!rs['status']) {
							alert(rs['message']);
							return false;
						}
						rs = filter($("#password").val(), '密码');
						if(!rs['status']) {
							alert(rs['message']);
							return false;
						}
						if($("#check-password").val() != $("#password").val()) {
							alert("密码不一致");
							return false;
						}
						return true;
					}
				</script>
			</div>
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