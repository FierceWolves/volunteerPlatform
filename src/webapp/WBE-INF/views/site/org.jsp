<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="en-US">

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="api_token" content="">
		<title>组织</title>
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
				<link href="${staticPath}/css/org.css" rel="stylesheet">
				<script src="${staticPath}/js/org.js" type="text/javascript"></script>
				<div class="org-top">
					<div class="org-top-itemlist-box">
						<div class="part-box-title">
							<h3>公益组织排行</h3>
						</div>
						<div class="org-top-item item-box0">
							<div class="org-top-item-num item0">1</div>
							<img class="org-top-item-img" src="http://image.zyz.org.cn/1477373875147695c61a329da4abcb42ac0495dd33edd?imageView2/2/w/100/h/100&amp;v=123">
							<h3 class="org-top-item-h3" onclick="window.location.href='/web/site/orgdetail?id=14760841123571a4618eba11e682992c56dcba85b9'">安徽省</h3>
							<p class="org-top-item-p">累计社会服务时数<br><span>4008346.3</span></p>
						</div>
						<div class="org-top-item item-box1">
							<div class="org-top-item-num item1">2</div>
							<img class="org-top-item-img" src="http://image.zyz.org.cn/1504136443555e36af6fce5144098bc967df48ec19f80.jpg?imageView2/2/w/100/h/100&amp;v=123">
							<h3 class="org-top-item-h3" onclick="window.location.href='/web/site/orgdetail?id=1476084112357373fd8eba11e682992c56dcba85b9'">温州市</h3>
							<p class="org-top-item-p">累计社会服务时数<br><span>3549259.9</span></p>
						</div>
						<div class="org-top-item item-box2">
							<div class="org-top-item-num item2">3</div>
							<img class="org-top-item-img" src="http://image.zyz.org.cn/14773737176429f7aa958092d4df5bf7cf48630a80c79?imageView2/2/w/100/h/100&amp;v=123">
							<h3 class="org-top-item-h3" onclick="window.location.href='/web/site/orgdetail?id=147608411235719b488eba11e682992c56dcba85b9'">河北省</h3>
							<p class="org-top-item-p">累计社会服务时数<br><span>3015543.9</span></p>
						</div>
						<div class="org-top-item item-box3">
							<div class="org-top-item-num item3">4</div>
							<img class="org-top-item-img" src="/views/site/images/org_01.jpg">
							<h3 class="org-top-item-h3" onclick="window.location.href='/web/site/orgdetail?id=14798133823E2DCC3F4C294992983ACBE530FDACCE'">温州市各县（市、区）志愿服务组织</h3>
							<p class="org-top-item-p">累计社会服务时数<br><span>2672311.6</span></p>
						</div>
						<div class="org-top-item item-box4">
							<div class="org-top-item-num item4">5</div>
							<img class="org-top-item-img" src="/views/site/images/org_01.jpg">
							<h3 class="org-top-item-h3" onclick="window.location.href='/web/site/orgdetail?id=1479813382FE41A5179BFE42E0A92668500A1ACB60'">五个县</h3>
							<p class="org-top-item-p">累计社会服务时数<br><span>2463285.0</span></p>
						</div>
					</div>
				</div>
				<div class="org-tripe">
					<form id="org-search-form" method="post">
						<div class="search-itemlist-box">
							<div class="tag-items" style="margin-top:0px;">
								<dl class="search-item-dl" id="search-item-class">
									<dt><i></i>&nbsp;&nbsp;分类</dt>
									<div class="search-item-dd-box">
										<dd onclick="classItemClick(this)" val="">全部</dd>
										<dd onclick="classItemClick(this)" val="14737479685567a9bd838f8a944c6adeca570b178dbaa">扶贫济困</dd>
										<dd onclick="classItemClick(this)" val="14737479685643f59cc04b0e040e89c116f916a758177">助老助残</dd>
										<dd onclick="classItemClick(this)" val="14737479685646500bec6550f4ff19d9fbb076e1a1cc8">社区服务</dd>
										<dd onclick="classItemClick(this)" val="14737479685649c9d1fba4e3f43d9a49a8dfdd8940b69">生态建设</dd>
										<dd onclick="classItemClick(this)" val="14737479685644d714c822d484620b918e5ff5e0f14f9">大型活动</dd>
										<dd onclick="classItemClick(this)" val="1473757064332477fa9e1035e4e2c9e0e8300c871548b">抢险救灾</dd>
										<dd onclick="classItemClick(this)" val="1473747968564e3ac1b7c2dff4a0895df8964749107b3">社会管理</dd>
										<dd onclick="classItemClick(this)" val="14737479685644478543b5dbc4f18919ecd7fb0366192">文化建设</dd>
										<dd onclick="classItemClick(this)" val="14737479685641bc7d02507a84b7b8da042081a034a12">西部开发</dd>
										<dd onclick="classItemClick(this)" val="1473747968564bc40c1e366b448bb878854494e0babb0">海外服务</dd>
										<dd onclick="classItemClick(this)" val="1473747968564881d539d25cc4e0eb1daa69512b0cc9d">综合/其他</dd>
										<input id="category" name="category" type="hidden" value="" onchange="searchNow()">
									</div>
								</dl>
							</div>
						</div>
						<div class="search-orderlist-box">
							<ul class="search-order-ullist">
								<li class="search-order-lilist">
									<a class="search-order-a" id="search-order-area-show" onclick="downList(this)" style="width:150px;">不限地区<i></i></a>
									<ul class="search-order-itemlist" id="search-order-area" style="width:160px;">

										<li onclick="downListItemClick(this)" val="">不限地区</li>

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
										<input name="province" id="pca" type="hidden" onchange="searchNow()">
									</ul>
								</li>
								<input name="search_title" class="all-search-input" id="search-activity-input" onchange="searchNow()" placeholder="搜索组织..." style="width:328px;margin-left:20px;" type="text">
								<button class="all-btn" type="button" style="width:100px;">搜索</button>
								<input style="display:none;">
							</ul>
						</div>
					</form>
					<div id="org-list-box" class="org-list-box">
						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(http://image.zyz.org.cn/1477373875147695c61a329da4abcb42ac0495dd33edd?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='orgDetail.jsp'">安徽省</h3>
								<p>累计社会服务时数<br><span>4008346.3<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="安徽省合肥市">安徽省合肥市</abbr></a>
									<a class="activity-item-other-join"><i></i>2729044</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(http://image.zyz.org.cn/1504136443555e36af6fce5144098bc967df48ec19f80.jpg?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=1476084112357373fd8eba11e682992c56dcba85b9'">温州市</h3>
								<p>累计社会服务时数<br><span>3549259.9<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="浙江省温州市">浙江省温州市</abbr></a>
									<a class="activity-item-other-join"><i></i>2371486</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(http://image.zyz.org.cn/14773737176429f7aa958092d4df5bf7cf48630a80c79?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=147608411235719b488eba11e682992c56dcba85b9'">河北省</h3>
								<p>累计社会服务时数<br><span>3015543.9<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="河北省石家庄市">河北省石家庄市</abbr></a>
									<a class="activity-item-other-join"><i></i>8121767</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=14798133823E2DCC3F4C294992983ACBE530FDACCE'">温州市各县（市、区）志愿服务组织</h3>
								<p>累计社会服务时数<br><span>2672311.6<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="浙江省温州市">浙江省温州市</abbr></a>
									<a class="activity-item-other-join"><i></i>2124336</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=1479813382FE41A5179BFE42E0A92668500A1ACB60'">五个县</h3>
								<p>累计社会服务时数<br><span>2463285<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="浙江省嘉兴市">浙江省嘉兴市</abbr></a>
									<a class="activity-item-other-join"><i></i>537531</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(http://image.zyz.org.cn/vms/2016/58//1477724286569299b942e122141b988125fc95706bde7?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=14760841123571b41c8eba11e682992c56dcba85b9'">甘肃省</h3>
								<p>累计社会服务时数<br><span>2002419.9<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="甘肃省">甘肃省</abbr></a>
									<a class="activity-item-other-join"><i></i>1259418</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(http://image.zyz.org.cn/14773739605505723ebda3a6340a9879d57b3fabd4db8?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=14760841123571a8ab8eba11e682992c56dcba85b9'">湖北省</h3>
								<p>累计社会服务时数<br><span>1799230.3<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="湖北省">湖北省</abbr></a>
									<a class="activity-item-other-join"><i></i>1629976</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=1499392915208269e15b1bff74973a8f0fb608eb52f3f'">富阳平安志愿服务总队</h3>
								<p>累计社会服务时数<br><span>1620947.9<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="浙江省杭州市">浙江省杭州市</abbr></a>
									<a class="activity-item-other-join"><i></i>52319</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(http://image.zyz.org.cn/1531727919103112fb7d422634ca4bceda7937887fe54.jpg?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=14760841123589e1a58eba11e682992c56dcba85b9'">萧山区</h3>
								<p>累计社会服务时数<br><span>1591474.7<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="浙江省杭州市">浙江省杭州市</abbr></a>
									<a class="activity-item-other-join"><i></i>300713</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=1479813382B3371657967846FDB38A25C70BAD961B'">市属志愿服务组织</h3>
								<p>累计社会服务时数<br><span>1338553.9<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="浙江省杭州市">浙江省杭州市</abbr></a>
									<a class="activity-item-other-join"><i></i>318284</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(http://image.zyz.org.cn/vms/2017/46//15047560002021c075fc5e4404b2d8cc9239401d1d6fc?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=14798138545B33A115EACF4AEE81FF7EF521A238AF'">淮北师范大学</h3>
								<p>累计社会服务时数<br><span>1302403.7<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="安徽省淮北市">安徽省淮北市</abbr></a>
									<a class="activity-item-other-join"><i></i>27022</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(http://image.zyz.org.cn/147737376513014dc0d767b69450fa25ee4796ed88030?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=147608411235719e5a8eba11e682992c56dcba85b9'">内蒙古自治区</h3>
								<p>累计社会服务时数<br><span>1174381<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="内蒙古自治区呼和浩特市">内蒙古自治区呼和浩特市</abbr></a>
									<a class="activity-item-other-join"><i></i>1185084</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=1520298456539300ca0fe469240b186854ce52064d290'">镇街志愿服务队</h3>
								<p>累计社会服务时数<br><span>1117049<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="浙江省杭州市">浙江省杭州市</abbr></a>
									<a class="activity-item-other-join"><i></i>163771</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=1479813382933EB6C9ECF842AF974C671F364857EC'">镇（街道）志愿服务工作站</h3>
								<p>累计社会服务时数<br><span>1092543.7<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="浙江省嘉兴市">浙江省嘉兴市</abbr></a>
									<a class="activity-item-other-join"><i></i>89401</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=147981338237FBDF3860464FC2905602DD923CAB71'">高校志愿服务联盟</h3>
								<p>累计社会服务时数<br><span>871508.8<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="浙江省杭州市">浙江省杭州市</abbr></a>
									<a class="activity-item-other-join"><i></i>168417</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=1479813854F9D75EA74EC14E53AA43DFD6BCA0857A'">高校</h3>
								<p>累计社会服务时数<br><span>835349.6<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="湖北省武汉市">湖北省武汉市</abbr></a>
									<a class="activity-item-other-join"><i></i>362582</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=14798138546E9328890C2540B1B9A966DF4A514AF5'">河南省高校</h3>
								<p>累计社会服务时数<br><span>741007.7<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="河南省郑州市">河南省郑州市</abbr></a>
									<a class="activity-item-other-join"><i></i>577252</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(http://image.zyz.org.cn/1477373740648082f19dfc1224493b53e3be6199c5da9?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=147608411235719d698eba11e682992c56dcba85b9'">山西省</h3>
								<p>累计社会服务时数<br><span>728161.5<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="山西省">山西省</abbr></a>
									<a class="activity-item-other-join"><i></i>1032416</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(http://image.zyz.org.cn/1513257829530137f5c4d249240e38b80d8ec2e19a34d.jpg?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=147608411235886a2a8eba11e682992c56dcba85b9'">平湖市</h3>
								<p>累计社会服务时数<br><span>682245.6<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="浙江省嘉兴市">浙江省嘉兴市</abbr></a>
									<a class="activity-item-other-join"><i></i>115850</a>
								</p>
							</div>
						</div>

						<div class="org-item">
							<div class="org-item-content">
								<div class="org-item-content-img" style="background-image:url(?imageView2/2/w/100/h/100&amp;v=1532830249000)"></div>
								<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id=1479813382881BD409E16D4851B18488D7D3CC2B86'">丽水市区</h3>
								<p>累计社会服务时数<br><span>674475.6<span></span></span>
								</p>
							</div>
							<div class="column-area">
								<p class="activity-item-other">
									<a class="activity-item-other-city"><i></i><abbr title="浙江省丽水市">浙江省丽水市</abbr></a>
									<a class="activity-item-other-join"><i></i>55679</a>
								</p>
							</div>
						</div>
					</div>
					<div class="tcdPageCode"><span class="disabled">上一页</span><span class="current">1</span>
						<a href="javascript:;" class="tcdNumber">2</a>
						<a href="javascript:;" class="tcdNumber">3</a>
						<a href="javascript:;" class="tcdNumber">4</a><span>...</span>
						<a href="javascript:;" class="tcdNumber">6244</a>
						<a href="javascript:;" class="nextPage">下一页</a>
					</div>
				</div>
				<script id="org" type="text/x-jsrender" data-jsv-tmpl="jsvTmpl">
					<div class="org-item">
						<div class="org-item-content">
							<div class="org-item-content-img" style="background-image:url({{if avatar==null}}/views/site/images/personbg.png{{else}}{{>avatar}}?imageView2/2/w/100/h/100&v={{> ~v()}}{{/if}})"></div>
							<h3 class="org-item-content-h3" onclick="window.location.href='/web/site/orgdetail?id={{>id}}'">{{>title}}</h3>
							<p>累计社会服务时数<br><span>{{> ~time1(hours)}}<span></p>
						</div>
					<div class="column-area">
						<p class="activity-item-other"><a class="activity-item-other-city"><i></i><abbr title="{{>province_name}}{{>city_name}}">{{>province_name}}{{>city_name}}</abbr></a><a class="activity-item-other-join"><i></i>{{>person}}</a></p>
					</div>
					</div>
				</script>
			<script id="city-listrender" type="text/x-jsrender" data-jsv-tmpl="jsvTmpl">
				{{if #index==0}}
					<li onclick="downListItemClick(this)" val="">不限地区</li>
				{{/if}}
					<li onclick="downListItemClick(this)" val="{{:id}}">{{:name}}</li>
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