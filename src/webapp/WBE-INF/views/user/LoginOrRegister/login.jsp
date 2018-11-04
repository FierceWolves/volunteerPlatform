<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="en-US">

<head>
    <%pageContext.setAttribute("jspPath", request.getContextPath());%>
    <%pageContext.setAttribute("staticPath", request.getContextPath() + "/static");%>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="api_token" content="">
    <title>登录</title>
    <link rel="shortcut icon" href="${staticPath}/images/titleLogo.png"/>
    <link href="${staticPath}/css/core.css" rel="stylesheet">
    <script src="${staticPath}/js/jquery-3.3.1.js" type="text/javascript"></script>
    <script src="${staticPath}/js/jsrender.min.js" type="text/javascript"></script>
    <script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
    <script src="${staticPath}/js/belatedPNG.js" type="text/javascript"></script>
    <script src="${staticPath}/js/md5.pro.js" type="text/javascript"></script>
</head>

<body>
<input type="hidden" id="jspPath" value="${jspPath}">
<input type="hidden" id="staticPath" value="${staticPath}">

<div class="main-fix-window">
    <div class="main-fix-item1" onClick="goTop()">回到顶部</div>
    <div class="main-fix-item3" onClick="advice()">意见建议</div>
</div>

<div class="wrap">

    <div class="header">
        <nav>
            <img class="header-logo">
            <div class="header-city">
                <nobr>
                    <em id="header-city-name">全国站</em> <font
                        onclick="openCity()">［切换城市］</font>
                </nobr>
            </div>
            <ul class="header-ul">
                <li class="header-ul-li" id="home-li">首页</li>
                <li class="header-ul-li" id="activity-li">活动</li>
                <li class="header-ul-li" id="org-li">组织</li>
                <li class="header-ul-li" id="information-li">资讯</li>
                <li class="header-ul-li" id="creditShop-li">积分商城</li>
                <ul class="header-user">
                    <li class="header-ul-li header-user-downlist"><a id="userLogin" val="0">登录</a></li>
                    <li class="header-ul-li header-user-downlist"><a class="userRegister">注册</a></li>
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
        <link href="${staticPath}/css/login.css"
              rel="stylesheet">
        <div class="login-tripe-box">
            <div class="login-tripe">
                <div class="login-left">
                    <h1>
                        已经有五千一百万志愿者找到了组织，您还在等什么？<a>团员成为注册志愿者的官方网站</a>
                    </h1>
                    <p style="margin-top:15px;border-top:1px solid white;">
                        "志愿者平台"是在共青团中央指导下，成都东软学院GreyWolf团队建设和运营的中国注册志愿者信息系统。网站提供志愿者注册，志愿者组织注册和管理，以及积分换购相关激励领取等核心功能。</p>
                    <p>
                        共青团中央正联合国家发展改革委、中国人民银行开展青年信用体系建设，联合社会信用体系建设部级联系会议相关成员单位实施“优秀志愿者守信联合激励行动计划”。
                    </p>
                </div>
                <div class="login-right">
                    <form id="loginForm">
                        <h2>
                            登录志愿中国与<span>51,000,000+</span>志愿者，一起为爱公益吧
                        </h2>
                        <label class="input-label number-label"></label>
                        <input class="login-input" id="volTelInput" type="text" name="volTel" required
                               placeholder="手机号"><br>
                        <label class="input-label password-label"></label>
                        <input class="login-input" id="volPsdInput" type="password" name="volPassword" required
                               placeholder="密码"><br>
                        <div style="text-align: left;padding-left: 15px;" id="captcha_div">
                            <label class="input-label code-label"></label>
                            <input class="login-input" id="codeInput" type="text" name="captcha_code" required
                                   placeholder="验证码"
                                   style="width: 265px;">
                            <img id="captcha_img" title="点击刷新" align="absbottom"
                                 src="${jspPath}/verifyCode/getVerifyCodeImage" onclick="changeImg()" width="90"
                                 height="28" alt="验证码" style="display:inline-block;">
                        </div>
                        <div class="check-box">
                            <span>
                                <a href="${jspPath}/user/forgetPsd">忘记密码？</a>|
                                <a class="userRegister">注册</a>
                            </span>
                        </div>
                    </form>
                    <button class="login-submit" id="loginBtn" onclick="doLogin()">登录</button>
                    <div class="org-login"
                         onclick="window.open('${jspPath}/org/login')">
                        志愿组织点此登录
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            function changeImg() {
                var img = document.getElementById("captcha_img");
                //防止页面缓存
                img.src = "${jspPath}/verifyCode/getVerifyCodeImage" + "?r=" + Math.random();
            }

            DD_belatedPNG.fix('div, ul, img, li, input,p,ul,ol,h1,h2,h3,a,span,i');

            //正则数据校验
            function check(regular, data) {
                if (regular.test(data)) {
                    return true;
                } else {
                    return false;
                }
            }

            //志愿者登录
            function doLogin() {
                //验证手机格式
                var tel = $("#volTelInput").val();
                var telRegular = /^1(3|4|5|7|8)\d{9}$/;
                if (tel != "") {
                    if (!check(telRegular, tel)) {
                        alert("手机号码格式错误!");
                        return false;
                    }
                } else {
                    alert("手机号码不能为空");
                    return false;
                }

                var psd = $("#volPsdInput").val();
                var psdRegular = /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$/;
                //验证密码
                if (psd != "") {
                    if (check(psdRegular, psd)) {
                        psd = hex_md5(psd + "greywolf");
                    } else {
                        alert("密码由6-16字母和数字组成，不能是纯数字或纯英文，不能包含特殊字符");
                        return false;
                    }
                } else {
                    alert("密码不能为空")
                }

                //验证码
                var code = $("#codeInput").val();
                $.ajax({
                    url: "${jspPath}/user/doLogin",
                    type: "put",
                    data: {volTel: tel, volPassword: psd, captcha_code: code},
                    success: function (result) {
                        if (result.code == 200) {
                            alert("登录成功");
                            if (sessionStorage.getItem("loginId") == null) {
                                sessionStorage.setItem("loginId", result.data.loginId);
                            }else {
                                sessionStorage.removeItem("loginId");
                                sessionStorage.setItem("loginId", result.data.loginId);
                            }
                            window.location.href = "${jspPath}/site/home";
                        } else {
                            alert(result.message);
                        }
                    }
                })
            }


        </script>
    </div>

</div>

<footer class="footer">
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
        <img class="footer-right">
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
    // var ch = checkCurrentCity();
    // if (!ch['status']) {
    //     var city = new Array();
    //     city["name"] = "全国站";
    //     city["val"] = "0";
    //     city["id"] = "14737477846505d6208a5e781435b84e2e079304353cb";
    //     setCookie("currentDistrict", city);
    // }
</script>

</body>

</html>