<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
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
		<script src="<%=request.getContextPath()%>/js/core.js" type="text/javascript"></script>
		<script src="${staticPath}/js/main.js" type="text/javascript"></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="container">
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
					<div class="register-box-title register-box-title-active" onclick="registerMode('手机', this)" style="width:100%">手机验证</div>
					<div class="register-input-box" id="register-byphone">
						<form id="forget-byphone-form" method="post" action="javascript:registerForPhone()">
							<input name="_csrf" value="UkNCekRvQTI5LQcLIF8WRREndiwqVghCOSc1NXFCI1wkNDo3IR84XQ==" type="hidden">
							<input name="type" value="tel" type="hidden">
							<label class="register-label" for="forget-idcard">身份证号：</label><input id="forget-idcard" class="register-input" name="forget-idcard" placeholder="请输入身份证号" type="text" autocomplete="off"><br>
							<label class="register-label" for="forget-phone">手机号码：</label><input id="forget-phone" class="register-input" name="forget-phone" placeholder="请输入手机号码" type="text" autocomplete="off"><br>
							<label class="register-label" for="register-pcode">验证码：</label><input id="forget-pcode" class="register-input" name="forget-pcode" placeholder="请输入短信验证码" style="width:170px;" type="text" autocomplete="off">
							<div class="register-btn" style="margin-top:7px;width:90px;" onclick="sendCode(this)" id="time">获取验证码</div><br>
							<label class="register-label" for="password">设置密码：</label><input id="password" class="register-input" name="password" placeholder="请输入6-16位字符，不可为纯数字" type="password"><br>
							<label class="register-label" for="check-password">确认密码：</label><input id="check-password" class="register-input" placeholder="请再次输入密码" type="password"><br>
							<br><br>
							<div class="register-btn" onclick="registerForPhone()">提交</div><br>
						</form>
					</div>
				</div>
			</div>
			<div class="registerperson-tripe tripe3" style="display: none;">
				<div class="register-success-box">
					<i></i>
					<h3>操作成功!</h3>
					<p>请用新密码重新登录</p>
					<div onclick="window.location.href='/login/login.do'">登录</div>
				</div>
			</div>
		</div>
	
		<script type="text/javascript">
			function checkMobile(mobile) {
				var regMphone = /^13\d{9}|15\d{9}|17\d{9}|18\d{9}$/;
				if(mobile == '') {
					alert("手机号不能为空");
					return false;
				} else {
					if(regMphone.test(mobile) == false) {
						alert("手机号格式不正确");
						return false;
					} else {
						return true;
					}
				}
			}
	
			function checkIdCard(idcard) {
				var regIdCard = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
				if(idcard == '') {
					alert("身份证号不能为空");
					return false;
				} else {
					if(regIdCard.test(idcard) == false) {
						alert("身份证输入不合法");
						return false;
					} else {
						return true;
					}
				}
			}
			//获取验证码
			function sendCode(obj) {
				var idcard = $("#forget-idcard").val();
				var mobile = $("#forget-phone").val();
				if(checkIdCard(idcard) == false) {
					return;
				}
				if(checkMobile(mobile) == false) {
					return;
				}
				$.ajax({
					type: "POST",
					url: ContextPath + "/find/sendCode.do",
					dataType: "json",
					data: {
						"idcard": idcard,
						"mobile": mobile
					},
					cache: false,
					success: function(data) {
						if(data.b == "0000") {
							$("#time").attr("onclick", "");
							s(60);
						} else {
							alert(data.message);
						}
					}
				});
			}
			// 时间
			function s(number) {
				$("#time").html(number + "秒");
				number--;
				if(number == -1) {
					$("#time").html("重新发送");
					$("#time").attr("onclick", "sendCode(this)");
					return;
				}
				var t = setTimeout("s(" + number + ")", 1000);
			}
			//验证表单
			function checkForm() {
				var idcard = $("#forget-idcard").val();
				var mobile = $("#forget-phone").val();
				var code = $("#forget-pcode").val();
				var password = $("#password").val();
				var checkPassword = $("#check-password").val();
				if(idcard == "") {
					alert("身份证不能为空");
					return false;
				}
				if(mobile == "") {
					alert("手机号不能为空");
					return false;
				} else {
					if(checkMobile(mobile) == false) {
						return;
					}
				}
				if(code == "") {
					alert("验证码不能为空");
					return false;
				}
				if(password == "") {
					alert("密码不能为空");
					return false;
				} else {
					if(password.length < 6 || password.length > 16) {
						alert("密码长度在6-16之间");
						return false;
					}
				}
				if(password != checkPassword) {
					alert("两次密码不一致");
					return false;
				}
				return true;
			}
			//表单提交
			function registerForPhone() {
				if(!checkForm()) {
					return;
				}
				var idcard = $("#forget-idcard").val();
				var mobile = $("#forget-phone").val();
				var code = $("#forget-pcode").val();
				var password = $("#password").val();
				$.ajax({
					type: "POST",
					url: ContextPath + "/find/submit.do",
					dataType: "json",
					data: {
						"mobile": mobile,
						"code": code,
						"password": password,
						"idcard": idcard
					},
					cache: false,
					success: function(data) {
						if(data.b == false) {
							alert(data.message);
						} else {
							return setpChange(3);
						}
					}
				});
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
		</script>
	</body>
</html>
