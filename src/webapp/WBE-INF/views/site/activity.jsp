<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="en-US">

<head>
    <%pageContext.setAttribute("jspPath", request.getContextPath());%>
    <%pageContext.setAttribute("staticPath", request.getContextPath() + "/static");%>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>活动</title>
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
    <div class="main-fix-item3" onClick="window.location.href='<%=request.getContextPath()%>advice.jsp'">意见建议</div>
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
        <script type="text/javascript" src="" id="getAspx"></script>
        <link href="${staticPath}/css/activity.css" rel="stylesheet">
        <script src="${staticPath}/js/activity.js" type="text/javascript"></script>
        <div class="activity-tripe">
            <form id="activity-search-form" method="post">
                <div class="search-itemlist-box">
                    <dl class="search-item-dl" id="search-item-class">
                        <dt><i></i>&nbsp&nbsp分类</dt>
                        <div class="search-item-dd-box">
                            <dd onclick="classItemClick(this)" val="">全部</dd>
                            <dd onclick="classItemClick(this)" val="14745450301624f443b187c334a8cb7bb0c7d0c680efa">
                                扶贫济困
                            </dd>
                            <dd onclick="classItemClick(this)" val="14745450405247f7d4a314fa84e08b31fa6eb3ee7016f">
                                助老助残
                            </dd>
                            <dd onclick="classItemClick(this)" val="14745450516403cbc5fcc3f544ba9898d3d45683c233e">
                                生态建设
                            </dd>
                            <dd onclick="classItemClick(this)" val="14745450606120ec88a587c284956b55ba14bafe110a1">
                                平安巡防
                            </dd>
                            <dd onclick="classItemClick(this)" val="14745450703080ad56fb6e4e546148b35e9ba9a449017">
                                实践培训
                            </dd>
                            <dd onclick="classItemClick(this)" val="1474545079792ca13d2d68b53446bab51d23aa607eab7">
                                社区服务
                            </dd>
                            <dd onclick="classItemClick(this)" val="1474545089659e63a4eb9289b47a59420267aaf7b3780">
                                大型活动
                            </dd>
                            <dd onclick="classItemClick(this)" val="147454509835829382e1485524edf89d5c89aa3134419">
                                抢险救灾
                            </dd>
                            <dd onclick="classItemClick(this)" val="14745451073892f2efcb48d1f47f498ac696559acd3ce">
                                网络文明
                            </dd>
                            <dd onclick="classItemClick(this)" val="14745451160845df127e516e44c9389fdb9ac9b9bcc06">
                                社会管理
                            </dd>
                            <dd onclick="classItemClick(this)" val="1474545123136b8dcb9d5eefd4fa1b008f68cc87ea80f">
                                文化建设
                            </dd>
                            <dd onclick="classItemClick(this)" val="1474545130607b3962269bf474717a5884b32c7ae54ea">
                                海外服务
                            </dd>
                            <dd onclick="classItemClick(this)" val="14745451394392f276b010b8140ec8f35991bc326e823">
                                西部开发
                            </dd>
                            <dd onclick="classItemClick(this)" val="1497835798730be6b5b87da244a4aa27c6d7f9410a63c">三下乡
                            </dd>
                            <dd onclick="classItemClick(this)" val="1499659060567ba0f54709fc34027a951e804fc712f0b">
                                平安志愿（浙江专用）
                            </dd>
                            <dd onclick="classItemClick(this)" val="150969765033709ba8c9b1d7846f6a4097822117c2b1a">
                                应急救援
                            </dd>
                            <dd onclick="classItemClick(this)" val="1529393624256dfee9a40895946ce9a239f8ba8402fae">
                                公益小天使
                            </dd>
                            <input id="category" name="category" type="hidden" onchange="searchNow()">
                        </div>
                    </dl>
                </div>
                <div class="search-orderlist-box">
                    <ul class="search-order-ullist">
                        <li class="search-order-lilist">
                            <a class="search-order-a" id="search-order-status-show" onclick="downList(this)">不限状态<i></i></a>
                            <ul class="search-order-itemlist" id="search-order-status">
                                <li onclick="downListItemClick(this)" val="">不限状态</li>
                                <li onclick="downListItemClick(this)" val="2">招募中</li>
                                <li onclick="downListItemClick(this)" val="3">已结束</li>
                                <input name="status" type="hidden" onchange="searchNow()">
                            </ul>
                        </li>
                        <li class="search-order-lilist">
                            <a class="search-order-a" id="search-order-area-show" onclick="downList(this)"
                               style="width:150px;">不限地区<i></i></a>
                            <ul class="search-order-itemlist" id="search-order-area" style="width:160px;">
                                <input name="" id="pca" type="hidden" onchange="searchNow()">
                            </ul>
                        </li>
                        <input name="search_title" class="all-search-input" id="search-activity-input"
                               onchange="searchNow()" placeholder="搜索活动..." style="width:328px;margin-left:20px;"
                               type="text">
                        <button class="all-btn" type="button" style="width:100px;">搜索</button>
                        <input style="display:none;">
                    </ul>
                </div>
            </form>
            <div class="activity-itemlist-box">
                <div class="activity-item-box"
                     onclick="window.location.href='<%=request.getContextPath()%>/activityDetail.jsp'">
                    <div class="activity-item-img"
                         style="background-image:url(http://image.zyz.org.cn/1532768805430a15c5b927fc94163bd4ce64ec8ff84a9.jpg?imageView2/2/w/400/h/300)"></div>
                    <h3 class="activity-item-box-h3">廿三里卫生院助力"最多跑一次"改革志愿服务活动</h3>
                    <div class="activity-item-day">
                        <span class="activity-item-day-span">报名截止：</span>
                        <p class="activity-item-day-p"><i style="width:40.29%;"></i></p>
                        <span class="activity-item-day-span">1天</span>
                    </div>
                    <p class="activity-item-other">
                        <a class="activity-item-other-city"><i></i><abbr title="浙江省金华市">浙江省金华市</abbr></a>
                        <a class="activity-item-other-join"><i></i>3</a>
                        <a class="activity-item-other-number"><i></i>9</a>
                    </p>
                </div>
            </div>
            <div class="tcdPageCode"></div>
        </div>
        <script id="activity" type="text/x-jsrender">
					<div class="activity-item-box" onclick="window.location.href='/web/site/activitydetail?id={{>id}}'">
						<div class="activity-item-img" style="background-image:url({{>thumb}}?imageView2/2/w/400/h/300)"></div>
						<h3 class="activity-item-box-h3">{{>title}}</h3>
						<div class="activity-item-day">
							<span class="activity-item-day-span">报名截止：</span> {{if is_finish=='1'}}
							<p class="activity-item-day-p"><i style="width:100%;"></i></p>
							{{else}}
							<p class="activity-item-day-p"><i style="width:{{>timeline}};"></i></p>
							{{/if}} {{if is_finish=='1'}}
							<span class="activity-item-day-span">已结束</span> {{else}}
							<span class="activity-item-day-span">{{>time}}天</span> {{/if}}
						</div>
						<p class="activity-item-other">
							<a class="activity-item-other-city"><i></i><abbr title="{{>province}}{{>city}}">{{>province}}{{>city}}</abbr></a>
							<a class="activity-item-other-join"><i></i>{{>signup_people}}</a>
							<a class="activity-item-other-number"><i></i>{{>read_num}}</a>
						</p>
					</div>

        </script>
        <script id="city-listrender" type="text/x-jsrender">
					{{if #index==0}}
					<li onclick="downListItemClick(this)" val="">不限地区</li>
					{{/if}}
					<li onclick="downListItemClick(this)" val="{{:id}}">{{:name}}</li>

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