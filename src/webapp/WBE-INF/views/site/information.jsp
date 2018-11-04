<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="en-US">

	<head>
		<%pageContext.setAttribute("jspPath", request.getContextPath());%>
		<%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="api_token" content="">
		<title>资讯</title>
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
				<link href="${staticPath}/css/information.css" rel="stylesheet">
				<script src="${staticPath}/js/information.js" type="text/javascript"></script>
				<div class="information-tripe">
					<div class="information-class">
						<h3 class="information-class-h3">资讯<span class="information-class-span">推送有价值的资讯</span></h3>
					</div>
					<div class="info-itemlist-box">
						<div class="info-item-box" onclick="window.location.href='<%=request.getContextPath()%>/site/informationDetail.jsp'">
							<div class="info-item-left" style="background-image:url(http://image.zyz.org.cn/admin/information/o_1cbvq30r6g701jnph96lr4ea59.jpg?imageView2/2/w/270/h/190)">
								<i class="info-item-left-i">西部开发</i>
							</div>
							<div class="info-item-right">
								<h3 class="info-item-right-h3">2018年西部计划全面启动</h3>
								<p class="info-item-right-p">报名时间4月27日-6月10日</p>
								<p class="info-item-right-time">2018-04-26 09:45:42</p>
							</div>
						</div>

						<div class="info-item-box" onclick="window.location.href='/web/information/detail?id=67'">
							<div class="info-item-left" style="background-image:url(http://image.zyz.org.cn/admin/information/o_1c8hngga71but1pekor9ccshi19.jpg?imageView2/2/w/270/h/190)">
							</div>
							<div class="info-item-right">
								<h3 class="info-item-right-h3">宁德市大学生志愿服务欠发达地区计划招募笔试选拔实施方案</h3>
								<p class="info-item-right-p">宁德市大学生志愿服务欠发达地区计划招募笔试选拔实施方案</p>
								<p class="info-item-right-time">2018-03-14 15:45:48</p>
							</div>
						</div>

						<div class="info-item-box" onclick="window.location.href='/web/information/detail?id=66'">
							<div class="info-item-left" style="background-image:url(http://image.zyz.org.cn/admin/information/o_1c5s3vucg1odp33k87uf7amsv9.jpg?imageView2/2/w/270/h/190)">
							</div>
							<div class="info-item-right">
								<h3 class="info-item-right-h3">闽侯团县委为“春节不停工项目”工人送去温暖</h3>
								<p class="info-item-right-p">为贯彻落实县委、县政府关于“两节”期间的工作部署和要求，积极响应团市委关于开展“春节不停工、青春温暖行”主题活动的号召</p>
								<p class="info-item-right-time">2018-02-09 09:49:32</p>
							</div>
						</div>

						<div class="info-item-box" onclick="window.location.href='/web/information/detail?id=65'">
							<div class="info-item-left" style="background-image:url(http://image.zyz.org.cn/admin/information/o_1c5n25ia9h1o7oe1d71ugs1fd99.png?imageView2/2/w/270/h/190)">
							</div>
							<div class="info-item-right">
								<h3 class="info-item-right-h3">【青行动】闽侯团县委为山区留守儿童送去暖冬和欢笑......</h3>
								<p class="info-item-right-p">闽侯团县委为山区留守儿童送去暖冬和欢笑......</p>
								<p class="info-item-right-time">2018-02-07 10:40:37</p>
							</div>
						</div>

						<div class="info-item-box" onclick="window.location.href='/web/information/detail?id=64'">
							<div class="info-item-left" style="background-image:url(http://image.zyz.org.cn/admin/information/o_1c5kusbs03u31pmqbus771v7b9.png?imageView2/2/w/270/h/190)">
							</div>
							<div class="info-item-right">
								<h3 class="info-item-right-h3">慰问信</h3>
								<p class="info-item-right-p">寒来暑往，踏雪而归，新春佳节，合家欢聚。谨向你们和你们的家人致以节日的问候和崇高的敬意！</p>
								<p class="info-item-right-time">2018-02-06 15:05:10</p>
							</div>
						</div>

						<div class="info-item-box" onclick="window.location.href='/web/information/detail?id=63'">
							<div class="info-item-left" style="background-image:url(http://image.zyz.org.cn/admin/information/o_1c46k08ao1gl61d5opl612af1cj69.jpg?imageView2/2/w/270/h/190)">
							</div>
							<div class="info-item-right">
								<h3 class="info-item-right-h3">关于开展2018年福建省铁路春运青年志愿者招募的通知</h3>
								<p class="info-item-right-p">关于开展2018年福建省铁路春运青年志愿者招募开始</p>
								<p class="info-item-right-time">2018-01-19 15:09:25</p>
							</div>
						</div>

						<div class="info-item-box" onclick="window.location.href='/web/information/detail?id=62'">
							<div class="info-item-left" style="background-image:url(http://image.zyz.org.cn/admin/information/o_1c3kkugqv1v8ihrjjkc1tgf1uu29.jpg?imageView2/2/w/270/h/190)">
							</div>
							<div class="info-item-right">
								<h3 class="info-item-right-h3">关于公布“福建省‘七彩课堂’示范课程”评选结果的通知</h3>
								<p class="info-item-right-p">关于公布“福建省‘七彩课堂’示范课程”评选结果的通知</p>
								<p class="info-item-right-time">2018-01-12 15:39:40</p>
							</div>
						</div>

						<div class="info-item-box" onclick="window.location.href='/web/information/detail?id=61'">
							<div class="info-item-left" style="background-image:url(http://image.zyz.org.cn/admin/information/o_1bq9dn4fn1vk0i0910481cr01mu6c.png?imageView2/2/w/270/h/190)">
							</div>
							<div class="info-item-right">
								<h3 class="info-item-right-h3">倡议书—抗击九寨沟地震福建青年志愿者在行动</h3>
								<p class="info-item-right-p">抗击九寨沟地震福建青年志愿者在行动</p>
								<p class="info-item-right-time">2017-09-18 10:40:47</p>
							</div>
						</div>

						<div class="info-item-box" onclick="window.location.href='/web/information/detail?id=60'">
							<div class="info-item-left" style="background-image:url(http://image.zyz.org.cn/admin/information/o_1bp5qpcra6jg11ql1j2ln53a759.jpg?imageView2/2/w/270/h/190)">
							</div>
							<div class="info-item-right">
								<h3 class="info-item-right-h3">志愿中国</h3>
								<p class="info-item-right-p">“志愿中国”是在共青团中央指导下的中国注册志愿者信息系统，是共青团中央联合国家发展改革委、中国人民银行开展的青年信用体系建设先导工程。</p>
								<p class="info-item-right-time">2017-09-04 15:02:02</p>
							</div>
						</div>

						<div class="info-item-box" onclick="window.location.href='/web/information/detail?id=59'">
							<div class="info-item-left" style="background-image:url(http://image.zyz.org.cn/admin/information/o_1bm4hnimd1mfm162gm1bvc013ef9.jpg?imageView2/2/w/270/h/190)">
							</div>
							<div class="info-item-right">
								<h3 class="info-item-right-h3">“志愿中国” 诚信公告</h3>
								<p class="info-item-right-p">给广大志愿者的公开信</p>
								<p class="info-item-right-time">2017-07-30 09:29:10</p>
							</div>
						</div>

						<div class="info-item-box" onclick="window.location.href='/web/information/detail?id=57'">
							<div class="info-item-left" style="background-image:url(http://image.zyz.org.cn/admin/information/o_1bbl7jnk01mdu1d7k1upcr8umvt9.jpg?imageView2/2/w/270/h/190)">
							</div>
							<div class="info-item-right">
								<h3 class="info-item-right-h3">“学习弘扬雷锋精神，建设美丽和谐江西”——江西青年志愿者将有6项大动作！</h3>
								<p class="info-item-right-p">“学习弘扬雷锋精神，建设美丽和谐江西”——江西青年志愿者将有6项大动作！</p>
								<p class="info-item-right-time">2017-03-20 14:49:04</p>
							</div>
						</div>

						<div class="info-item-box" onclick="window.location.href='/web/information/detail?id=56'">
							<div class="info-item-left" style="background-image:url(http://image.zyz.org.cn/admin/information/o_1b8tse75f1qsm1dio1s8d16he5gl9.jpg?imageView2/2/w/270/h/190)">
							</div>
							<div class="info-item-right">
								<h3 class="info-item-right-h3">江西团省委领导看望慰问南昌铁路局春运志愿者和团员青年</h3>
								<p class="info-item-right-p">2月13日上午，江西团省委党组副书记马健、团省委副书记孙鑫到南昌火车站检查指导青年志愿者服务春运“暖冬行动”实施情况，看望慰问坚守在服务岗位上的志愿者和团员青年。南昌铁路局党委副书记万军等一同看望。</p>
								<p class="info-item-right-time">2017-02-14 16:47:34</p>
							</div>
						</div>
					</div>
					<div class="relevant-info">
						<h3 id="info_item_s_pre" class="information-class-h3">相关资讯</h3>
						<div class="relevant-item" onclick="window.location.href='/web/information/detail?id=68'">2018年西部计划全面启动</div>

						<div class="relevant-item" onclick="window.location.href='/web/information/detail?id=67'">宁德市大学生志愿服务欠发达地区计划招募笔试选拔实施方案</div>

						<div class="relevant-item" onclick="window.location.href='/web/information/detail?id=66'">闽侯团县委为“春节不停工项目”工人送去温暖</div>

						<div class="relevant-item" onclick="window.location.href='/web/information/detail?id=65'">【青行动】闽侯团县委为山区留守儿童送去暖冬和欢笑......</div>

						<div class="relevant-item" onclick="window.location.href='/web/information/detail?id=64'">慰问信</div>

						<div class="relevant-item" onclick="window.location.href='/web/information/detail?id=63'">关于开展2018年福建省铁路春运青年志愿者招募的通知</div>

					</div>
					<div class="tcdPageCode"><span class="disabled">上一页</span><span class="current">1</span>
						<a href="javascript:;" class="tcdNumber">2</a>
						<a href="javascript:;" class="tcdNumber">3</a>
						<a href="javascript:;" class="tcdNumber">4</a><span>...</span>
						<a href="javascript:;" class="tcdNumber">6</a>
						<a href="javascript:;" class="nextPage">下一页</a>
					</div>
				</div>
				<script id="info_item" type="text/x-jsrender" data-jsv-tmpl="jsvTmpl">
					<div class="info-item-box" onclick="window.location.href='/web/information/detail?id={{:id}}'">
						<div class="info-item-left" style="background-image:url(http://image.zyz.org.cn/{{>main_pic}}?imageView2/2/w/270/h/190)">
							<i class="info-item-left-i">{{>catalogue_id}}</i>
						</div>
						<div class="info-item-right">
							<h3 class="info-item-right-h3">{{>title}}</h3>
							<p class="info-item-right-p">{{>summary}}</p>
							<p class="info-item-right-time">{{>updated_at}}</p>
						</div>
					</div>
				</script>
				<script id="info_item_s" type="text/x-jsrender" data-jsv-tmpl="jsvTmpl">
					<div class="relevant-item" onclick="window.location.href='/web/information/detail?id={{:id}}'">{{>title}}</div>
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
		
	</body>

</html>