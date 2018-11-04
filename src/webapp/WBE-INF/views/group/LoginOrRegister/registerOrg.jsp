<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="en-US">

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="api_token" content="">
		<title>注册组织</title>
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
								<a id="userLogin" id="userLogin" val="0" >登录</a>
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
				<link href="${staticPath}/css/registerPerson.css" rel="stylesheet">
					<style>
						.register-label {
							width: 130px;
						}
						
						.register-input {
							width: 300px;
						}
						
						.registerorg-text {
							width: 300px;
							max-width: 300px;
							height: 100px;
							line-height: 30px;
							padding-top: 5px;
						}
						
						.register-label span {
							color: red;
						}
					</style>
				<div class="setp-tripe" style="width:350px;">
					<div class="setpitem">
						<div class="setp-btn setp-btn-active" id="setp-btn1">1</div>
						<h3>提交申请</h3>
					</div>
					<hr>
					<div class="setpitem">
						<div class="setp-btn" id="setp-btn2">2</div>
						<h3>申请成功</h3>
					</div>
				</div>
				<div class="registerperson-tripe tripe1" style="display:block;">
					<div class="register-box">
						<form id="org-register-form" method="post">
							<input type="hidden" name="_csrf" value="ZENwdlIuemcSFBoTC3ZXIhV1OBgrREosBSBIB39jDSEVDR46EWpDKg==">
							<div class="register-input-box" style="margin-top:30px;margin-bottom:30px;margin-left:65px;width:480px;" id="register-byphone">
								<label class="register-label" for="register-phone"><span>* </span>组织名称：</label><input name="deptname" id="register-phone" type="text" class="register-input" placeholder="请输入组织名称"><br>
								<label class="register-label" for="register-password"><span>* </span>组织地址：</label>
								<ul class="search-order-ullist" style="left:138px;">
									<li class="search-order-lilist">
										<a class="search-order-a" onclick="downList(this)" id="register_area_show_1" style="width:150px;">请选择<i></i></a>
										<ul class="search-order-itemlist" style="width:160px;">
			
											<li onclick="downListItemClick(this)" val="1476084112356dd9738eba11e682992c56dcba85b9">北京市</li>
			
											<li onclick="downListItemClick(this)" val="1476084112357199d98eba11e682992c56dcba85b9">天津市</li>
			
											<li onclick="downListItemClick(this)" val="147608411235719b488eba11e682992c56dcba85b9">河北省</li>
			
											<li onclick="downListItemClick(this)" val="147608411235719d698eba11e682992c56dcba85b9">山西省</li>
			
											<li onclick="downListItemClick(this)" val="147608411235719e5a8eba11e682992c56dcba85b9">内蒙古自治区</li>
			
											<li onclick="downListItemClick(this)" val="147608411235719f378eba11e682992c56dcba85b9">辽宁省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571a0108eba11e682992c56dcba85b9">吉林省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571a0f18eba11e682992c56dcba85b9">黑龙江省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571a1ce8eba11e682992c56dcba85b9">上海市</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571a2a78eba11e682992c56dcba85b9">江苏省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571a3848eba11e682992c56dcba85b9">浙江省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571a4618eba11e682992c56dcba85b9">安徽省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571a53a8eba11e682992c56dcba85b9">福建省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571a6138eba11e682992c56dcba85b9">江西省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571a6f18eba11e682992c56dcba85b9">山东省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571a7ce8eba11e682992c56dcba85b9">河南省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571a8ab8eba11e682992c56dcba85b9">湖北省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571a9848eba11e682992c56dcba85b9">湖南省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571aaf78eba11e682992c56dcba85b9">广东省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571ac728eba11e682992c56dcba85b9">广西壮族自治区</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571ad678eba11e682992c56dcba85b9">海南省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571adf58eba11e682992c56dcba85b9">重庆市</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571ae778eba11e682992c56dcba85b9">四川省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571b0888eba11e682992c56dcba85b9">贵州省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571b1128eba11e682992c56dcba85b9">云南省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571b1948eba11e682992c56dcba85b9">西藏自治区</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571b3928eba11e682992c56dcba85b9">陕西省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571b41c8eba11e682992c56dcba85b9">甘肃省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571b4ba8eba11e682992c56dcba85b9">青海省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571b6bb8eba11e682992c56dcba85b9">宁夏回族自治区</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571b7418eba11e682992c56dcba85b9">新疆维吾尔自治区</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571b9468eba11e682992c56dcba85b9">台湾省</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571b9cc8eba11e682992c56dcba85b9">香港特别行政区</li>
			
											<li onclick="downListItemClick(this)" val="14760841123571bbce8eba11e682992c56dcba85b9">澳门特别行政区</li>
			
											<li onclick="downListItemClick(this)" val="147755953095894f0d512954e45e9b36032382474450a">新疆生产建设兵团</li>
			
											<li onclick="downListItemClick(this)" val="14787596135921f30134d42254b3cab258f015139d530">其他</li>
											<input name="province" type="hidden" id="register_area_1" onchange="downlistOfProvince(1,3,'register_area_',this)">
										</ul>
									</li>
									<li class="search-order-lilist">
										<a class="search-order-a" onclick="downList(this)" id="register_area_show_2" style="width:150px;">请选择<i></i></a>
										<ul class="search-order-itemlist" style="width:160px;">
											<input name="city" type="hidden" id="register_area_2" onchange="downlistOfProvince(2,3,'register_area_',this)">
										</ul>
									</li>
									<li class="search-order-lilist" style="margin-top:5px;">
										<a class="search-order-a" onclick="downList(this)" id="register_area_show_3" style="width:150px;">请选择<i></i></a>
										<ul class="search-order-itemlist" style="width:160px;">
											<input name="county" type="hidden" id="register_area_3">
										</ul>
									</li>
								</ul><br>
								<label class="register-label" for="register-phone"><span>* </span>邮箱：</label><input name="email" id="register-phone" type="text" class="register-input" placeholder="请输入邮箱"><br>
								<label class="register-label" for="register-phone"><span>* </span>联系人姓名：</label><input name="applyuser" id="register-phone" type="text" class="register-input" placeholder="请输入真实姓名"><br>
								<label class="register-label" for="register-phone"><span>* </span>联系人身份证号：</label><input name="idcard" id="register-phone" type="text" class="register-input" placeholder="请输入联系人身份证号"><br>
								<label class="register-label" for="register-phone"><span>* </span>联系人手机：</label><input name="mobile" id="register-phone" type="text" class="register-input" placeholder="务必输入有效联系方式"><br>
								<label class="register-label" for="register-phone" style="vertical-align:top;margin-top:10px;">申请理由：</label><textarea name="reason" id="register-phone" type="text" class="register-input registerorg-text" placeholder="请输入申请理由"></textarea><br>
								<label class="register-label" for="register-phone" style="vertical-align:top;margin-top:10px;">备注：</label><textarea name="remark" id="register-phone" type="text" class="register-input registerorg-text" placeholder="请输入备注"></textarea><br>
								<input type="checkbox" id="check" class="register-checkbox">
								<label for="check" class="register-checkbox-label">提交代表您同意<span onclick="window.open('<%=request.getContextPath()%>/site/volunteerShould.jsp')">《志愿者平台用户使用协议》</span></label><br>
								<div class="register-btn" onclick="registerForOrg()">提交</div>
							</div>
						</form>
					</div>
				</div>
				<div class="registerperson-tripe tripe3">
					<div class="register-success-box">
						<i></i>
						<h3 style="margin-top:10px;">申请成功!</h3>
						<p>你的信息正在审核中，我们将尽快完成审核，审核通过后我们将会把资料信息以短信的方式发送到你的手机上。</p>
						<div onclick="window.location.href='/'">返回首页</div>
					</div>
				</div>
				<script id="city-listrender" type="text/x-jsrender" data-jsv-tmpl="jsvTmpl">
					<li onclick="downListItemClick(this)" val="{{:id}}">{{:name}}</li>
				</script>
				<script src="/views/public/js/register.js" type="text/javascript"></script>
				<script src="/views/site/js/registerorg.js" type="text/javascript"></script>
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