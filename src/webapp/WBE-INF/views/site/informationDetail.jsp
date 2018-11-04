<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="en-US">

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="api_token" content="">
		<title>资讯详情</title>
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
				<script>
					var j = 0;
					var g = 0;

					function reply(id, name, k, comm_time) {

						var html = '';
						alert('亲，您还没登陆不能回复哦！');
					}

					function replytwo(id, name, k, comm_time) {

						var html = '';
						alert('亲，您还没登陆不能回复哦！');
					}

					function existcontent(name) {

						var comment_value = $('#commentid' + j).val();
						var content_value = "回复@" + name + "：";
						if(comment_value == content_value) {
							alert("您还没有回复内容哦！");
							return false;
						} else {
							$('#submitreply' + j).click();
						}
						j = j + 1;
					}

					function existcontent2(name) {

						var comment_value = $('#re_comment' + g).val();
						var content_value = "回复@" + name + "：";
						if(comment_value == content_value) {
							alert("您还没有回复内容哦！");
							return false;
						} else {
							$('#submitreplytwo' + g).click();
						}
						g = g + 1;
					}

					function comment_test() {

						alert('您还没有登陆哦！');
						return false;

					}
				</script>
				<script>
				</script>
				<div class="information-tripe">
					<div class="infoDetailsLeft">
						<div class="infoDetails">
							<h1>2018年西部计划全面启动</h1>
							<!--			<a href="" class="main-pub-btn infoshare">分享（<em class="bds_count" data-cmd="count" id="bds_count">0</em>）</a>-->
							<p>
							</p>
							<p style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;text-align:center;">
								&nbsp;2018年西部计划全面启动
							</p>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								2018年大学生志愿服务西部计划招募工作正式启动！由全国大学生志愿服务西部计划项目管理办公室、中国青年志愿者协会主办，团中央“青年之声”志愿服务联盟、山东大学和共青团山东省委承办的“2018年大学生志愿服务西部计划全国宣讲报告会”将于4月26日（星期四）15:00在山东大学举办。
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								&nbsp;
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								想第一时间领略西部计划优秀志愿者的风采吗？想感受现场浓浓的志愿氛围吗？届时，可通过关注共青团中央、团中央学校部、中国青年志愿者、中国青年网、团中央“青年之声”和未来网官方微博等平台观看直播。
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								&nbsp;
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								2018年西部计划
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								报名相关高能信息
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								必看：报名攻略
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								&nbsp;
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								报名时间：2018年4月27日至6月10日
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								服务专项：2018年西部计划实施规模为18300人，将实施基础教育、服务三农、医疗卫生、基层青年工作、基层社会管理、服务新疆、服务西藏7个专项
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								报名方式：在西部计划官方网站（http://xibu.youth.cn/）和“西部志愿汇”微信公众号填写报名表并下载打印，交所在高校项目办（设在校团委）
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								全国项目办咨询电话：010-85212269
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								各省（区、市）项目办电话请关注“西部志愿汇”微信公众号后查询
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								西部志愿汇
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								微信：xbzyz010
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								&nbsp;
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								关于西部计划
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								你应该知道的那些事
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								大学生志愿服务西部计划由共青团中央、教育部、财政部、人力资源社会保障部自2003年开始联合实施。
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								由中央财政支持，每年招募一定数量的普通高等学校应届毕业生或在读研究生，到西部基层开展为期1至3年的志愿服务工作，鼓励志愿者服务期满后扎根当地就业创业。
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								项目实施15年来，已累计选派27万余名大学生志愿者到中西部22个省区市及新疆生产建设兵团的2100多个县市区旗基层服务。
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								习近平总书记曾多次就西部计划和研究生支教团工作作出批示或给志愿者回信，勉励青年人以志愿者为榜样，到基层和人民中去建功立业，让青春之花绽放在祖国最需要的地方，在实现中国梦的伟大实践中书写别样精彩的人生。
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								在政策支持方面，服务期满且考核合格的西部计划志愿者，在考研加分、报考公务员或事业单位、学费补偿、助学贷款代偿等方面享受相应的政策优惠（详见相关文件）。
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								在资金保障方面，各地统筹中央财政和地方财力，为西部计划志愿者发放工作生活补贴，提供住宿和餐饮等方面的便利，购买人身意外险等商业保险，购买相关社会保险，全面提高服务保障水平。
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								&nbsp;
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								4月26日（星期四）15:00，欢迎关注全国宣讲报告会直播。让我们以志愿之名，赴西部之约!
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								&nbsp;
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								&nbsp;
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								到西部去，
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								到基层去，
							</div>
							<div style="font-family:Helvetica;font-size:small;background-color:#F0F8FB;">
								到祖国和人民最需要的地方去！
							</div>
							<p></p>
						</div>

						<a id="comments" name="comments"></a>
						<div class="pl_list" id="comment" style="clear:both;" width="670px">
							<p style="height: 20px;line-height: 20px;padding-bottom: 20px;">评论</p>

							<div id="commentlist">
								<!--评论列表-->

							</div>

							<form method="post" action="/admin/comment/add" width="670px">
								<!--<input type="hidden" name="toId" value=""/>-->
								<input type="hidden" name="_csrf" value="aHBDS01yNUgqQxwhHiJEOgIFEScPQE0JKhgQDAg9cHoKIRY8Ox19KQ==">
								<input type="hidden" name="data[comm_id]" value="68">
								<input type="hidden" name="data[comm_time]" value="1532831965842">
								<input type="hidden" name="data[pid]" value="0">
								<input type="hidden" name="data[user_id]" value="">
								<input type="hidden" name="data[user_type]" value="1">
								<input type="hidden" name="data[extra]" value="{&quot;id&quot;:68,&quot;title&quot;:&quot;2018\u5e74\u897f\u90e8\u8ba1\u5212\u5168\u9762\u542f\u52a8&quot;}">
								<div class="pub-comment-alert">
									发表评论，请先
									<a id="userLogin">登录</a>
								</div>
								<!-- 未登录提示结束 -->
								<textarea placeholder="说说你的看法吧~ " class="pub-comment-textarea" name="data[content]" id="commentid"></textarea>

								<div class="pub-comment-btn">
									<input type="button" class="pub-btn" value="评 论" onclick="comment_test()">

								</div>
								<div style="display:none"><input type="submit" id="submitcomment"></div>
								<!--<div class="pub-comment-alert-bg"></div>-->

							</form>
							<!-- 评论框结束 -->
						</div>
					</div>

				</div>
				<div class="relevant-info">
					<h3 class="information-class-h3">相关资讯</h3>
					<a href="/web/information/detail?id=68">
						<div class="relevant-item">2018年西部计划全面启动</div>
					</a>
					<a href="/web/information/detail?id=67">
						<div class="relevant-item">宁德市大学生志愿服务欠发达地区计划招募笔试选拔实施方案</div>
					</a>
					<a href="/web/information/detail?id=66">
						<div class="relevant-item">闽侯团县委为“春节不停工项目”工人送去温暖</div>
					</a>
					<a href="/web/information/detail?id=65">
						<div class="relevant-item">【青行动】闽侯团县委为山区留守儿童送去暖冬和欢笑......</div>
					</a>
					<a href="/web/information/detail?id=64">
						<div class="relevant-item">慰问信</div>
					</a>
					<a href="/web/information/detail?id=63">
						<div class="relevant-item">关于开展2018年福建省铁路春运青年志愿者招募的通知</div>
					</a>
				</div>
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