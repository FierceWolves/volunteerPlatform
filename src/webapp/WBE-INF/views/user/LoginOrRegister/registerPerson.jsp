<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="en-US">

<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath() + "/static");%>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="api_token" content="">
    <title>注册个人</title>
    <link rel="shortcut icon" href="${staticPath}/images/titleLogo.png"/>
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

    <div class="header">
        <nav>
            <img class="header-logo">
            <div class="header-city">
                <nobr><em id="header-city-name">全国站</em>
                    <font onclick="openCity()">［切换城市］</font>
                </nobr>
            </div>
            <ul class="header-ul">
                <li class="header-ul-li" id="home-li">首页</li>
                <li class="header-ul-li" id="activity-li">活动</li>
                <li class="header-ul-li" id="org-li">组织</li>
                <li class="header-ul-li" id="information-li">资讯</li>
                <li class="header-ul-li" id="creditShop-li">积分商城</li>

                <ul class="header-user">
                    <li class="header-ul-li header-user-downlist">
                        <a id="userLogin" val="0">登录</a>
                    </li>
                    |
                    <li class="header-ul-li header-user-downlist">
                        <a class="userRegister">注册</a>
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
        <script src="${staticPath}/js/registerPerson.js" type="text/javascript"></script>
        <script src="${staticPath}/js/downlist.js" type="text/javascript"></script>
        <div class="setp-tripe">
            <div class="setpitem">
                <div class="setp-btn setp-btn-active" id="setp-btn1">1</div>
                <h3>注册账号</h3>
            </div>
            <hr>
            <div class="setpitem">
                <div class="setp-btn" id="setp-btn2" onclick="startSetp2();setpChange(2);">2</div>
                <h3>完善信息</h3>
            </div>
            <hr>
            <div class="setpitem">
                <div class="setp-btn" id="setp-btn3">3</div>
                <h3>注册成功</h3>
            </div>
        </div>
        <div class="registerperson-tripe tripe1" style="display:block;">
            <div class="register-box">

                <div class="register-box-title register-box-title-active" >手机号码注册</div>
                <div class="register-input-box" id="register-byphone" style="">
                    <form id="register-byphone-form" method="post"
                          action="javascript:userRegSetp1(new FormData($('#register-byphone-form')[0]))">
                        <input type="hidden" name="_csrf"
                               value="c183dDlqZ0wFCF0RYDJKCQJpfxpAAFcHEjwPBRQnEAoCEVk4ei5eAQ==">
                        <input type="hidden" name="regtype" value="tel">
                        <label class="register-label" for="register-phone">手机号码：</label>
                        <input id="register-phone" type="text" class="register-input" name="UserRegisterForm[tel]"
                               placeholder="请输入手机号码"><br>

                        <div id="captcha_div" style=""><label class="register-label" for="register-pcode">图片验证码：</label>
                            <input id="captcha_code" type="text" class="register-input" name="captcha_code"
                                   placeholder="请输入图片验证码" style="width:170px;">
                            <input type="hidden" name="code_id" id="code_id" value="153285765780795">
                            <img id="captcha_img" style="margin-bottom:8px;" height="33" width="90" title="点击刷新"
                                 src="https://appapi.zyh365.com/other/captcha/?web_id=h5&amp;code_id=153285765780795"
                                 onclick="captcha()" align="absbottom"><br>
                        </div>

                        <label class="register-label" for="register-pcode">短信验证：</label>
                        <input id="register-pcode" type="text" class="register-input" name="icode"
                               placeholder="请输入短信验证码" style="width:170px;">
                        <div class="register-btn" id="time" style="margin-top:7px;width:90px;" onclick="getIcode()">
                            获取验证码
                        </div>
                        <br>
                        <label class="register-label" for="register-password">设置密码：</label>
                        <input id="register-password" type="password" class="register-input"
                               name="UserRegisterForm[password]" placeholder="请输入6-16位字符，不可为纯数字"><br>
                        <input type="checkbox" id="check" class="register-checkbox">
                        <label for="check" class="register-checkbox-label">注册代表您同意
                            <span onclick="window.open('${jspPath}/site/volunteerShould')">《志愿者平台用户使用协议》</span></label><br>
                        <div class="register-btn" onclick="userRegSetp1(new FormData($('#register-byphone-form')[0]))">
                            提交
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="registerperson-tripe tripe2">
            <form id="tripe2-form" method="post" action="/web/site/registerall">
                <input id="userid" type="hidden" name="userid">
                <input id="regall_regtype" type="hidden" name="regtype" value="2">

                <div id="noeighteen-box" class="register-noeighteen-box">
                    <label class="tripe2-label"><span>*</span> 监护人姓名：</label>
                    <input type="text" name="guardianname" placeholder="请填写监护人真实姓名"><br>
                    <label class="tripe2-label"><span>*</span> 监护人手机：</label>
                    <input type="text" name="guardiantel" placeholder="请填写监护人常用手机号码"><br>
                    <label class="tripe2-label"><span>*</span> 监护人身份证：</label>
                    <input type="text" name="guardianidcard" placeholder="请填写监护人身份证号码">
                </div>
                <label class="tripe2-label"><span>*</span> 真实姓名：</label>
                <input id="username" name="name" type="text" placeholder="请填写真实姓名"><br>
                <label class="tripe2-label"><span>*</span> 证件类型：</label>
                <input id="useridcardtype" name="IDNumberType" type="text" placeholder="护照/身份证">
                <br>
                <label class="tripe2-label"><span>*</span> 证件号：</label>
                <input id="useridcard" name="IDNumber" type="text" placeholder="请填写证件号码"><br>
                <label class="tripe2-label"><span>*</span> 政治面貌：</label>
                <ul class="search-order-ullist">
                    <li class="search-order-lilist">
                        <a class="search-order-a" onclick="downList(this)" style="width:200px;">请选择<i></i></a>
                        <ul class="search-order-itemlist" style="width: 210px; display: none;">
                            <li onclick="downListItemClick(this)">中国共产主义青年团团员</li>
                            <input id="political" name="political" type="hidden" value="">
                        </ul>
                    </li>
                </ul>
                <br>
                <div id="ismemeber-box" class="register-noeighteen-box">
                    <label class="tripe2-label"><span>*</span> 团组织关系所在单位：</label>
                    <input name="relationshipunit" type="text" placeholder="请填写团组织关系所在单位"><br>
                    <label class="tripe2-label"><span>*</span> 入团日期：</label>
                    <input name="joingrouptime" class="sang_Calender" type="text" placeholder="请填写入团日期"><br>
                    <label class="tripe2-label"><span>*</span> 团内职务：</label>
                    <input name="cyouthjob" type="text" placeholder="请填写团内职务">
                </div>
                <label class="tripe2-label"><span>*</span> 请输入注册区域：</label>
                <input id="registplace" name="registPlace" type="text" placeholder="如:四川-成都">
                <br>
                <label class="tripe2-label"><span>*</span> 性别：</label>
                <label class="label-list"><input name="sex" type="radio" value="1">男</label>
                <label class="label-list"><input name="sex" type="radio" value="2"> 女</label>
                <br>
                <label class="tripe2-label"><span>*</span> 民族：</label>
                <input name="nation" type="text">
                <br>
                <label class="tripe2-label"><span>*</span> 籍贯：</label>
                <input name="nativePlace" type="text" placeholder="如:四川-达州">
                <br>
                <label class="tripe2-label"><span>*</span> 现住地址：</label>
                <input name="userAddress" type="text" placeholder="详细地址" style="margin-left:198px"><br>
                <label class="tripe2-label">是否在读：</label>
                <input name="studyStatus" type="text" placeholder="是or否">
                <label class="tripe2-label">学校/工作单位：</label>
                <input name="school" type="text" placeholder="请填写学校"><br>
                <label class="tripe2-label">学号：</label>
                <input name="studentNumber" type="text" placeholder="请填写学号"><br>
                <label class="tripe2-label"><span>*</span> 联系邮箱：</label>
                <input id="email" name="userEmail" type="text" placeholder="请填写常用邮箱"><br>
                <label class="tripe2-label"><span>*</span> 最高学历：</label>
                <input name="highestEducation" type="text" placeholder="请填写最高学历">
                <br>
                <label class="tripe2-label"><span>*</span> 擅长技能：</label>
                <span class="tripe-span">请填写1-2项你擅长的专业或技能</span><br>
                <input name="skill" type="text" placeholder="如:唱歌，跳舞">
                <label class="tripe2-label"><span>*</span> 服务领域：</label>
                <span class="tripe-span">请填写1-3项你的志愿服务领域</span><br>
                <input name="serviceRange" placeholder="如：支教，三下乡，西部大开发，公益等">
                <br><br>
                <br><br><br>
            </form>
            <div class="register-btn" style="float:left;" onclick="registerForAll()">提交</div>
        </div>
        <div class="registerperson-tripe tripe3">
            <div class="register-success-box">
                <i></i>
                <h3>注册成功!</h3>
                <p>加入组织，让更多志愿伙伴认识你</p>
                <div>申请加入组织</div>
                <a href="${jspPath}/site/home">返回首页</a>
            </div>
        </div>
        <script id="other-listrender" type="text/x-jsrender">
			<li onclick="downListItemClick(this)" val="{{:_id}}">{{:name}}</li>

        </script>
        <script id="city-listrender" type="text/x-jsrender">
					<li onclick="downListItemClick(this)" val="{{:id}}">{{:name}}</li>

        </script>
        <script id="skills-render" type="text/x-jsrender">
					<label class="label-list"><input name="skills" type="checkbox" value="{{>_id}}"> {{>name}}</label>

        </script>
        <script id="servicearea-render" type="text/x-jsrender">
					<label class="label-list"><input name="servicearea" type="checkbox" value="{{>_id}}"> {{>name}}</label>

        </script>
        <script>
            /*
             * 获取图片验证码
             */
            function captcha() {
                var formData = new FormData();
                var data = ajaxPost('/web/site/captcha-data', formData);
                if (data['status']) {
                    //图片验证码是否显示
                    if (data['data']['open'] == '1') {
                        //赋值
                        $('#code_id').val(data['data']['code_id']);
                        $('#captcha_img').attr('src', data['data']['linkurl']);
                        $('#captcha_div').show();
                    } else {
                        $('#captcha_div').hide();
                    }
                    ;

                }
            }

            //获取图片验证码
            captcha();

            $(function () {
                var get = _get();
                if (typeof(get["ismemeber"]) == 'undefined' || typeof(get["iseighteen"]) == 'undefined') {
                    console.log("传入参数不足");
                }
                if (get["ismemeber"] != 'true') {
                    $("#regall_regtype").val(1);
                    $("#ismemeber-box").remove();
                }
                if (get["iseighteen"] == 'true') {
                    // $("#noeighteen-box").remove();
                    // $(".register-box-title").remove();
                    // $("#register-byphone").css("margin-top", "40px");
                    $("#registerByCardBtn").attr("onclick", "");
                }

                // 点击其他位置隐藏下拉菜单
                $("body").click(function () {
                    $(".search-order-itemlist").hide();
                });
                $(".search-order-a").click(function (e) {
                    e.stopPropagation();
                })
            })
        </script>
        <script src="${staticPath}//js/datetime.js" type="text/javascript"></script>
        <iframe frameborder="0" style="display:none;position:absolute;" width="200" height="215" scrolling="no"
                name="sangcalender" id="sangcalender"></iframe>
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
    var ch = checkCurrentCity();
    if (!ch['status']) {
        var city = new Array();
        city["name"] = "全国站";
        city["val"] = "0";
        city["id"] = "14737477846505d6208a5e781435b84e2e079304353cb";
        setCookie("currentDistrict", city);
    }
</script>

</body>

</html>