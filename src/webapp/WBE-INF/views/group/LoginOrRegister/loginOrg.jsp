<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>志愿服务管理平台</title>
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js" ></script>
		<link rel="stylesheet" type="text/css" href="${staticPath}/css/loginOrg.css">
		<script type="text/javascript">
			if(top.location.href != window.location.href) {
				top.location.href = window.location.href;
			}
			var error = '';
			$(function() {
				initWH();
				ieVer();
				if(error != "") {
					$("#errorDiv").html(error);
				}
				jQuery(window).resize(function() {
					initWH();
				});
	
			});
	
			function initWH() {
				var h = $(document).height();
				var w = $(document).width();
				if(h > 768) {
					$("#loginDiv").addClass("logindiv_y");
				};
				if(w > 1024) {
					$("#loginDiv").addClass("logindiv_x");
				};
			}
	
			function ieVer() {
				if(false && !$.support.leadingWhitespace) {
					alert("您的浏览器版本过低，请升级浏览器(IE9+,火狐，谷歌)后再访问本网站。");
				}
			}
			var submit = true;
	
			function doSubmit() {
				if(false && !$.support.leadingWhitespace) {
					alert("您的浏览器版本过低，请升级浏览器(IE9+,火狐，谷歌)后再访问本网站。");
					return;
				}
				if(submit) {
					submit = false;
					var loginName = $.trim($("#loginName").val());
					var loginPWD = $.trim($("#loginPWD").val());
					if(loginName == "") {
						submit = true;
						$("#errorDiv").html("登陆用户名不能为空！");
						return;
					}
					if(loginPWD == "") {
						submit = true;
						$("#errorDiv").html("登陆用户密码不能为空！");
						return;
					}
					$("#loginForm").submit();
				}
	
			}
	
			function logKeyup(event) {
				if(event.keyCode == 13) {
					var loginName = $.trim($("#loginName").val());
					var loginPWD = $.trim($("#loginPWD").val());
					if(loginName == "") {
						$("#loginName").focus();
						return;
					}
					if(loginPWD == "") {
						$("#loginPWD").focus();
						return;
					}
					doSubmit();
				}
			}
	
			function showEwm(pd, o) {
				if(pd) {
	
				} else {
	
				}
			}
			function showMessage(){
				alert("登录成功!");
			}
		</script>
		
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="box logindiv_x" id="loginDiv">
			<div class="main">
				<div class="logo"><img src="${staticPath}/images/logo.png"></div>
				<div class="loginBox">
					<div class="loginIn">
						<form action="<%=request.getContextPath()%>/group/groupHome.jsp" method="post" id="loginForm" onsubmit="showMessage()">
							<div class="inputBox">请输入用户名或身份证号码：<br>
								<input name="userName" id="loginName" onkeyup="logKeyup(event)" type="text">
							</div>
							<div class="inputBox">请输入密码：<br>
								<input name="password" id="loginPWD" onkeyup="logKeyup(event)" type="password">
								<br>
								<div class="errorDiv" id="errorDiv"></div>
							</div>
						</form>
						<div class="btnBox">&nbsp;<br>
							<input name="" value="登录" type="button" onclick="doSubmit()">
						</div>
						<div class="btn">
							<a href="<%=request.getContextPath()%>/group/LoginOrRegister/forget.jsp">忘记密码</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		
	
	</body>
</html>
