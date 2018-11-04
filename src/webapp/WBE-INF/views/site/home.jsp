<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="en-US">

<head>
    <%pageContext.setAttribute("jspPath", request.getContextPath());%>
    <%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="api_token" content="">
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
        <link href="${staticPath}/css/index.css" rel="stylesheet">
        <script src="${staticPath}/js/index.js" type="text/javascript"></script>
        <div class="index-tripe">
            <input id="actlist" type="hidden" value="">
            <input id="orglist" type="hidden"
                   value="1476084112356dd9738eba11e682992c56dcba85b9,1476084112357199d98eba11e682992c56dcba85b9,147608411235719b488eba11e682992c56dcba85b9,147608411235719d698eba11e682992c56dcba85b9,147608411235719e5a8eba11e682992c56dcba85b9,147608411235719f378eba11e682992c56dcba85b9,14760841123571a0108eba11e682992c56dcba85b9,14760841123571a1ce8eba11e682992c56dcba85b9,14760841123571a2a78eba11e682992c56dcba85b9,14760841123571a3848eba11e682992c56dcba85b9,14760841123571a4618eba11e682992c56dcba85b9,14760841123571a6f18eba11e682992c56dcba85b9,14760841123571a7ce8eba11e682992c56dcba85b9,14760841123571a8ab8eba11e682992c56dcba85b9,14760841123571a9848eba11e682992c56dcba85b9,14760841123571aaf78eba11e682992c56dcba85b9,14760841123571adf58eba11e682992c56dcba85b9,14773741353438cef32970d65456a820a302c083e1c7d">
            <div id="index-banner-box">
                <div class="index-banner-box" onmouseover="stop()" onmouseout="star(num)">
                    <div class="index-banner-img-box">
                        <a href="http://zyz.org.cn/web/information/detail?id=60" target="_blank"><img
                                id="index-banner-img0" style="display:block;"
                                src="http://image.zyz.org.cn/admin/homepic/o_1bp5qs5qeb2p41a2ajgrs83b28.jpg"></a>
                        <a href="http://zyz.org.cn/web/information/detail?id=27" target="_blank"><img
                                id="index-banner-img1" style="display:none;"
                                src="http://image.zyz.org.cn/admin/homepic/o_1c460qsdbsvk1gbg5at1ks71hnv28.jpg"></a>
                        <!---->
                    </div>
                    <div class="index-banner-btn-box">
                        <!---->
                        <div id="index-banner-btn0" class="index-banner-btn-active" onclick="star(0)"></div>
                        <div id="index-banner-btn1" class="" onclick="star(1)"></div>
                    </div>
                </div>
            </div>
            <div class="index-model">
                <h3 class="index-model-h3">活动</h3>
                <p class="index-model-p">
                    <a href="/web/site/activity?time=8984-07-26 15:32:59">招募中</a>
                    <span id="index-actclass-box">
				<a href="/web/site/activity?type=14745450301624f443b187c334a8cb7bb0c7d0c680efa">扶贫济困</a>
				<a href="/web/site/activity?type=14745450405247f7d4a314fa84e08b31fa6eb3ee7016f">助老助残</a>
				<a href="/web/site/activity?type=14745450516403cbc5fcc3f544ba9898d3d45683c233e">生态建设</a>
				<a href="/web/site/activity?type=14745450606120ec88a587c284956b55ba14bafe110a1">平安巡防</a>
				<a href="/web/site/activity?type=14745450703080ad56fb6e4e546148b35e9ba9a449017">实践培训</a>
				<a href="/web/site/activity?type=1474545079792ca13d2d68b53446bab51d23aa607eab7">社区服务</a>
				<a href="/web/site/activity?type=1474545089659e63a4eb9289b47a59420267aaf7b3780">大型活动</a>
				<a href="/web/site/activity?type=147454509835829382e1485524edf89d5c89aa3134419">抢险救灾</a>
				</span>
                    <a class="more" href="${jspPath}/site/activity.jsp">＋更多</a>
                </p>
                <div class="activity-itemlist-box">
                    <div class="activity-item-box"
                         onclick="window.location.href='/web/site/activitydetail?id=1532597121367e210382424c94e68b3c8bc953cf47742'">
                        <div class="activity-item-img"
                             style="background-image:url(http://image.zyz.org.cn/1532597058290cf705655fc264b2ca183b576e329988a.jpg?imageView2/2/w/400/h/280)"></div>
                        <h3 class="activity-item-box-h3">携手关爱小候鸟 聚力点亮微心愿</h3>
                        <div class="activity-item-day">
                            <span class="activity-item-day-span">报名截止：</span>
                            <p class="activity-item-day-p"><i style="width:62%;"></i></p> <span
                                class="activity-item-day-span">2天</span></div>
                        <p class="activity-item-other">
                            <a class="activity-item-other-city"><i></i>湖北省武汉市</a>
                            <a class="activity-item-other-join"><i></i>4</a>
                            <a class="activity-item-other-number"><i></i>12</a>
                        </p>
                    </div>
                    <div class="activity-item-box"
                         onclick="window.location.href='/web/site/activitydetail?id=1532596980600570b25dba3c8439e8a8e2c356e4e08b8'">
                        <div class="activity-item-img"
                             style="background-image:url(http://image.zyh365.com/vms/2018/09//1532596198853d1daeb7332b942c5ab1cd80fb07ed9ff?imageView2/2/w/400/h/280)"></div>
                        <h3 class="activity-item-box-h3">“绿谷文体”新星少儿大型汇演</h3>
                        <div class="activity-item-day">
                            <span class="activity-item-day-span">报名截止：</span>
                            <p class="activity-item-day-p"><i style="width:75%;"></i></p> <span
                                class="activity-item-day-span">3天</span></div>
                        <p class="activity-item-other">
                            <a class="activity-item-other-city"><i></i>浙江省丽水市</a>
                            <a class="activity-item-other-join"><i></i>0</a>
                            <a class="activity-item-other-number"><i></i>0</a>
                        </p>
                    </div>
                    <div class="activity-item-box"
                         onclick="window.location.href='/web/site/activitydetail?id=1532595920027f427d5a2fa2049298d3ec77e2ebb1fe8'">
                        <div class="activity-item-img"
                             style="background-image:url(http://image.zyz.org.cn/15325957176465caf16a8554d48eda580f567ae5ce226.jpg?imageView2/2/w/400/h/280)"></div>
                        <h3 class="activity-item-box-h3">创建全国文明城市~《孝文化》公益讲座</h3>
                        <div class="activity-item-day">
                            <span class="activity-item-day-span">报名截止：</span>
                            <p class="activity-item-day-p"><i style="width:125%;"></i></p> <span
                                class="activity-item-day-span">2天</span></div>
                        <p class="activity-item-other">
                            <a class="activity-item-other-city"><i></i>浙江省舟山市</a>
                            <a class="activity-item-other-join"><i></i>0</a>
                            <a class="activity-item-other-number"><i></i>0</a>
                        </p>
                    </div>
                    <div class="activity-item-box"
                         onclick="window.location.href='/web/site/activitydetail?id=15325947683534d29c2a014be40a8b4b8401f87346a18'">
                        <div class="activity-item-img"
                             style="background-image:url(http://image.zyh365.com/vms/2018/41//153259449460099e3631d071f44f7bedd889e69f6f215?imageView2/2/w/400/h/280)"></div>
                        <h3 class="activity-item-box-h3">全国文明城市创建：市红十字会爱心敬老志愿服务队进白泉敬老院</h3>
                        <div class="activity-item-day">
                            <span class="activity-item-day-span">报名截止：</span>
                            <p class="activity-item-day-p"><i style="width:75%;"></i></p> <span
                                class="activity-item-day-span">3天</span></div>
                        <p class="activity-item-other">
                            <a class="activity-item-other-city"><i></i>浙江省舟山市</a>
                            <a class="activity-item-other-join"><i></i>0</a>
                            <a class="activity-item-other-number"><i></i>0</a>
                        </p>
                    </div>
                    <div class="activity-item-box"
                         onclick="window.location.href='/web/site/activitydetail?id=153259444889137fc3724a6ed4a81bcb2995bc1bec2e2'">
                        <div class="activity-item-img"
                             style="background-image:url(http://image.zyz.org.cn/1532594399778725fbc2c8b0a489f94f043387fc80b10.jpg?imageView2/2/w/400/h/280)"></div>
                        <h3 class="activity-item-box-h3">全国文明城市创建 翁洲大道兴舟大道环境清扫</h3>
                        <div class="activity-item-day">
                            <span class="activity-item-day-span">报名截止：</span>
                            <p class="activity-item-day-p"><i style="width:75%;"></i></p> <span
                                class="activity-item-day-span">3天</span></div>
                        <p class="activity-item-other">
                            <a class="activity-item-other-city"><i></i>浙江省舟山市</a>
                            <a class="activity-item-other-join"><i></i>3</a>
                            <a class="activity-item-other-number"><i></i>14</a>
                        </p>
                    </div>
                    <div class="activity-item-box"
                         onclick="window.location.href='/web/site/activitydetail?id=1532594278477c77efecddb14433ebf1dc923f0667027'">
                        <div class="activity-item-img"
                             style="background-image:url(http://image.zyh365.com/vms/2018/30//15325938351616d7e47be525d49e3aeac7c218994e270?imageView2/2/w/400/h/280)"></div>
                        <h3 class="activity-item-box-h3">市民问政志愿者招募</h3>
                        <div class="activity-item-day">
                            <span class="activity-item-day-span">报名截止：</span>
                            <p class="activity-item-day-p"><i style="width:85%;"></i></p> <span
                                class="activity-item-day-span">5天</span></div>
                        <p class="activity-item-other">
                            <a class="activity-item-other-city"><i></i>浙江省金华市</a>
                            <a class="activity-item-other-join"><i></i>0</a>
                            <a class="activity-item-other-number"><i></i>0</a>
                        </p>
                    </div>

                </div>
            </div>
            <div class="index-model">
                <h3 class="index-model-h3">公益组织</h3>
                <p class="index-model-p">
							<span id="index-orgclass-box">
				<a href="/web/site/org?type=14737479685567a9bd838f8a944c6adeca570b178dbaa">扶贫济困</a>
				<a href="/web/site/org?type=14737479685643f59cc04b0e040e89c116f916a758177">助老助残</a>
				<a href="/web/site/org?type=14737479685646500bec6550f4ff19d9fbb076e1a1cc8">社区服务</a>
				<a href="/web/site/org?type=14737479685649c9d1fba4e3f43d9a49a8dfdd8940b69">生态建设</a>
				<a href="/web/site/org?type=14737479685644d714c822d484620b918e5ff5e0f14f9">大型活动</a>
				<a href="/web/site/org?type=1473757064332477fa9e1035e4e2c9e0e8300c871548b">抢险救灾</a>
				<a href="/web/site/org?type=1473747968564e3ac1b7c2dff4a0895df8964749107b3">社会管理</a>
				<a href="/web/site/org?type=14737479685644478543b5dbc4f18919ecd7fb0366192">文化建设</a>
				<a href="/web/site/org?type=14737479685641bc7d02507a84b7b8da042081a034a12">西部开发</a>
				<a href="/web/site/org?type=1473747968564bc40c1e366b448bb878854494e0babb0">海外服务</a>
				</span>
                    <a class="more" href="${jspPath}/site/org.jsp">＋更多</a>
                </p>
                <div class="org-itemlist-box">
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/vms/2016/07//1477642065455ba37d22d3ace49f8ab1082209988425a?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=14773741353438cef32970d65456a820a302c083e1c7d"
                           class="org-item-box-a">中青信用</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/14773740132026ec63d081be54faaaa24c5a1de7ac4d0?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=14760841123571adf58eba11e682992c56dcba85b9"
                           class="org-item-box-a">重庆市</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/14773739830656be5c77467b04f14bc253a97d2d19383?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=14760841123571aaf78eba11e682992c56dcba85b9"
                           class="org-item-box-a">广东省</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/vms/2016/38//1477723096757067c5a1f70974b2d9305a03aff6c0814?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=14760841123571a9848eba11e682992c56dcba85b9"
                           class="org-item-box-a">湖南省</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/14773739605505723ebda3a6340a9879d57b3fabd4db8?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=14760841123571a8ab8eba11e682992c56dcba85b9"
                           class="org-item-box-a">湖北省</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/152568519846954b269db38224c389c335c712b493dd8.jpg?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=14760841123571a7ce8eba11e682992c56dcba85b9"
                           class="org-item-box-a">河南省</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/1477373906729ce40456032024d60a198e234c86e1fd9?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=14760841123571a6f18eba11e682992c56dcba85b9"
                           class="org-item-box-a">山东省</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/1477373875147695c61a329da4abcb42ac0495dd33edd?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=14760841123571a4618eba11e682992c56dcba85b9"
                           class="org-item-box-a">安徽省</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/1477373857917f9d7df9ac0794ff1b9103d3927a95ca6?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=14760841123571a3848eba11e682992c56dcba85b9"
                           class="org-item-box-a">浙江省</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/vms/2016/36//1477723017748872da1f963f3449c99492f91cbfe4a5b?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=14760841123571a2a78eba11e682992c56dcba85b9"
                           class="org-item-box-a">江苏省</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/1523929691404b93bd5800c8c40e195d8a62c05eb447f.jpg?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=14760841123571a1ce8eba11e682992c56dcba85b9"
                           class="org-item-box-a">上海市</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/147737382154380026acd8f314a7fa3f3dc62082ccac7?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=14760841123571a0108eba11e682992c56dcba85b9"
                           class="org-item-box-a">吉林省</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/1477373793423ce398214c7b748028de4d49d4cef234e?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=147608411235719f378eba11e682992c56dcba85b9"
                           class="org-item-box-a">辽宁省</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/147737376513014dc0d767b69450fa25ee4796ed88030?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=147608411235719e5a8eba11e682992c56dcba85b9"
                           class="org-item-box-a">内蒙古自治区</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/1477373740648082f19dfc1224493b53e3be6199c5da9?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=147608411235719d698eba11e682992c56dcba85b9"
                           class="org-item-box-a">山西省</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/14773737176429f7aa958092d4df5bf7cf48630a80c79?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=147608411235719b488eba11e682992c56dcba85b9"
                           class="org-item-box-a">河北省</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/1477373688340e736d542b70042f99efad1978cc55daf?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=1476084112357199d98eba11e682992c56dcba85b9"
                           class="org-item-box-a">天津市</a>
                    </div>
                    <div class="org-item-box"
                         style="background-image:url(http://image.zyz.org.cn/1477373325032b861317c5f084cd28c2bf9536fab097b?imageView2/1/w/200/h/200);">
                        <a href="/web/site/orgdetail?id=1476084112356dd9738eba11e682992c56dcba85b9"
                           class="org-item-box-a">北京市</a>
                    </div>

                </div>
            </div>
            <div id="index-information-box">
                <div class="index-model">
                    <h3 class="index-model-h3">资讯</h3>
                    <p class="index-model-p">
                        <a href="#">推送有价值的资讯</a>
                        <a class="more" href="${jspPath}/site/information.jsp">＋更多</a>
                    </p>
                    <div class="info-itemlist-box">
                        <div class="info-item-box" onclick="window.location.href='/web/information/detail?id=51'">
                            <div class="info-item-left"
                                 style="background-image:url(http://image.zyz.org.cn/admin/information/o_1b2292pirpupe61befvedamn9.jpg?imageView2/2/w/260/h/180)">
                                <i class="info-item-left-i">大型活动</i>
                            </div>
                            <div class="info-item-right">
                                <h3 class="info-item-right-h3">响应文明提升倡议 迎金砖会晤志愿者在行动</h3>
                                <p class="info-item-right-p"> 办好金砖会晤，人人都是东道主，人人都是展示厦门城市形象的一扇窗。我该做些什么？我能做些什么？</p>
                                <p class="info-item-right-time">2016-11-21 09:48:35</p>
                            </div>
                        </div>
                        <div class="info-item-box" onclick="window.location.href='/web/information/detail?id=50'">
                            <div class="info-item-left"
                                 style="background-image:url(http://image.zyz.org.cn/admin/information/o_1b228if0vet3u2h3qa1033mnb9.jpg?imageView2/2/w/260/h/180)">
                                <i class="info-item-left-i">社会管理</i>
                            </div>
                            <div class="info-item-right">
                                <h3 class="info-item-right-h3">14家APP接入公安部“团圆”系统2.0，儿童失踪信息覆盖移动互联</h3>
                                <p class="info-item-right-p">
                                    016年11月16日上午，公安部儿童失踪信息紧急发布平台“团圆”系统2.0版上线启动仪式在北京举行，14家APP接入系统。启动仪式上，国务院反拐部际联席会议办公室主任、公安部刑事侦查局局长杨东介绍了平台上线以来的情况，公安部刑事侦查局打拐办主任陈建锋展示了“团圆”系统2.0的功能。李咏、黄晓明被聘为第二批“中国反拐义务宣传员”，并与首批宣传员沙溢一起表示了对打拐工作的支持。</p>
                                <p class="info-item-right-time">2016-11-21 09:39:05</p>
                            </div>
                        </div>
                        <div class="info-item-box" onclick="window.location.href='/web/information/detail?id=49'">
                            <div class="info-item-left"
                                 style="background-image:url(http://image.zyz.org.cn/admin/information/o_1b1qh5g981nh2l33spj1cbo10o59.jpg?imageView2/2/w/260/h/180)">
                                <i class="info-item-left-i">综合/其他</i>
                            </div>
                            <div class="info-item-right">
                                <h3 class="info-item-right-h3">暖青汇红丝带征集令丨世界艾滋病日，我们一起用行动关注艾，传递爱</h3>
                                <p class="info-item-right-p">
                                    12月1日，世界艾滋病日从第一个艾滋病日开始越来越多的人参与到遏制艾滋病的活动中因为遏制艾滋，需要你我他共同携手第29个世界艾滋病日暖青汇红丝带征集令期待你的加入。</p>
                                <p class="info-item-right-time">2016-11-18 09:35:18</p>
                            </div>
                        </div>
                        <div class="info-item-box" onclick="window.location.href='/web/information/detail?id=48'">
                            <div class="info-item-left"
                                 style="background-image:url(http://image.zyz.org.cn/admin/information/o_1b1qgnu0ssgm1g0616sauf1lf09.jpg?imageView2/2/w/260/h/180)">
                                <i class="info-item-left-i">扶贫济困</i>
                            </div>
                            <div class="info-item-right">
                                <h3 class="info-item-right-h3">【帮助别人 快乐自己】我们想做的是每个人都能做的事</h3>
                                <p class="info-item-right-p">帮助别人·快乐自己。 我们想做的是每个人都能做的事。
                                </p>
                                <p class="info-item-right-time">2016-11-18 09:27:54</p>
                            </div>
                        </div>
                        <div class="info-item-box" onclick="window.location.href='/web/information/detail?id=47'">
                            <div class="info-item-left"
                                 style="background-image:url(http://image.zyz.org.cn/admin/information/o_1b1nu8s7bsi91n4r4lt13de1ab79.jpg?imageView2/2/w/260/h/180)">
                                <i class="info-item-left-i">社区服务</i>
                            </div>
                            <div class="info-item-right">
                                <h3 class="info-item-right-h3">2015年先进典型社区志愿服务特色回顾</h3>
                                <p class="info-item-right-p">
                                    百姓是社区主体，也是社区活动的参与者及社区服务的对象。社区志愿服务，要与居民需求相融合。随着居民物质文化需求的不断提升，志愿服务势必也要转变思路和方式，让其成为居民的生活方式和精神追求。下面，小编为大家带来一些先进典型社区的经验做法，它们的来头可都不小，全部是入选2015年学雷锋志愿服务“四个100”先进典型的社区哦！</p>
                                <p class="info-item-right-time">2016-11-17 09:28:20</p>
                            </div>
                        </div>
                        <div class="info-item-box" onclick="window.location.href='/web/information/detail?id=33'">
                            <div class="info-item-left"
                                 style="background-image:url(http://image.zyz.org.cn/admin/information/o_1b4b3ecc0130f1hrn3ui3h130c9.jpg?imageView2/2/w/260/h/180)">
                                <i class="info-item-left-i">综合/其他</i>
                            </div>
                            <div class="info-item-right">
                                <h3 class="info-item-right-h3">【志愿快播】志愿中国信息系统注册志愿者突破4700万</h3>
                                <p class="info-item-right-p">
                                    自7月29日团中央召开全团青年志愿者信息系统培训班以来，组建工作组先后赴山西、河南、湖北、内蒙古、安徽、江西、河北、天津、陕西、四川、重庆、上海、浙江、广东、青海、甘肃、新疆、新疆生产建设兵团、山东等19家省级单位实地对接信息系统建设，并加强与江苏、黑龙江、吉林、辽宁、云南、广西、湖南、福建、贵州、海南、西藏等单位联系推动志愿者数据归集。截止日前，已完成全国志愿者数据归集4700万。</p>
                                <p class="info-item-right-time">2016-12-19 16:34:50</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <script type="text/javascript" language="javascript">
            $(function () {
                // 定义动画位置
                num = 0;
                // 导航栏标记状态
                $("#home-li").addClass("header-active");
                // 开始动画
                star(0);
            })
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