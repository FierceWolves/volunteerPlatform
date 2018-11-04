<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="en-US">

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="api_token" content="">
		<title>志愿者平台</title>
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
				<div class="show-text" style="margin-top:20px;margin-bottom:50px;">
					<h1>
				《 志愿者平台使用协议 》
			</h1>
					<h2>
				志愿者誓词：“我愿意成为一名光荣的志愿者。我承诺：尽己所能，不计报酬，帮助他人，服务社会，践行志愿精神，传播先进文化，为社会进步贡献力量！”
			</h2>
					<br>
					<h2>
				本网站遵从《中国注册志愿者管理办法》
			</h2>
					<br>
					<p align="left">
						本网站及与本网站链接的网站，仅提供志愿者、志愿服务团体、志愿服务机构及其它与此相关联之志愿服务项目。志愿者、志愿服务团体、志愿服务机构以及因 其它任何目的进入本网站的访问者接受本协议书条款，注册成为中国青年志愿者信息平台网站会员，并遵守本协议所述之条款使用本网站所提供之服务。如果您不接受本声明之条款，请勿使用本网站。接受本声明之条款，您将遵守本协议之规定。 <br>
						<br> 1.信息的发布 <br> ·不得发布任何违反有关法律规定信息； <br> ·不得发布任何与本网站志愿服务目的不适之信息； <br> ·不得发布任何不完整、虚假的信息； <br> ·用户对所发布的信息承担完全责任。 <br>
						<br> 2.信息的使用 <br> ·志愿服务团体、志愿服务机构仅可就志愿服务目的使用志愿者之个人信息； <br> ·志愿者仅可因参加某志愿服务项目，使用志愿服务团体、志愿服务机构发布之项目招募信息； <br> ·本网站提供的其它信息，仅与其相应内容有关的目的而被使用； <br> ·不得将任何本网站的信息用作任何商业目的。 <br>
						<br> 3.信息的公开 <br> 在本网站所登录的任何信息，均有可能被任何本网站的访问者浏览，也可能被错误使用。本网站对此将不予承担任何责任。 <br>
						<br> 4.信息的准确性 <br> 任何在本网站发布的信息，均必须符合合法、准确、及时、完整的原则。但本网站将不能保证所有由第三方提供的信息，或本网站自行采集的信息完全准确。使用 者了解，对这些信息的使用，需要经过进一步核实。本网站对访问者未经自行核实误用本网站信息造成的任何损失不予承担任何责任。 <br>
						<br> 5.信息更改与删除 <br> 除了信息的发布者外，任何访问者不得更改或删除他人发布的任何信息。本网站有权根据其判断保留修改或删除任何不适信息之权利。 <br>
						<br> 6.版权、商标权 <br> 本网站的图形、图像、文字及其程序等均属中国青年志愿者信息平台网站之版权，受商标法及相关知识产权法律保护，未经中国青年志愿者信息平台网站书面许可，任何人不得下载、复制、再使用。在本网发布信息之商标，归其相应的商标所有权人，受商标法保护 <br>
						<br> 7.注册信息使用 <br> 注册会员所提供的个人信息将会被中国青年志愿者信息平台网站统计、汇总，在我们的严格管理下，为中国青年志愿者信息平台网站的合作者提供依据。中国青年志愿者信息平台网站会不定期地通过注册会员留下的电子邮件、电话或通信地址同该会员保持联系。 <br>
						<strong><br>
			中国青年志愿者信息平台网站承诺：在未经访问者授权同意的情况下，中国青年志愿者信息平台网站不会将访问者的个人资料泄露给第三方。但以下情况除外：</strong><strong> </strong><br>
						<strong>·</strong><strong>根据执法单位之要求或为公共之目的向相关单位提供个人资料；</strong><strong> </strong><br>
						<strong> ·为中国青年志愿者事业发展及青年信用体系建设等之公益目的向相关单位提供；</strong> <br> ·由于您将用户密码告知他人或与他人共享注册帐户，由此导致的任何个人资料泄露； <br> ·由于计算机2000年问题、黑客攻击、计算机病毒侵入或发作、因政府管制而造成的暂时性关闭等影响网络正常经营之不可抗力而造成的个人资料泄露、丢失、被盗用或被窜改等； <br> ·由于与中国青年志愿者信息平台网站链接的其它网站所造成之个人资料泄露及由此而导致的任何法律争议和后果； <br> ·为免除访问者在生命、身体或财产方面之急迫危险。 <br>
						<br> 8.自责 <br> 所有使用本网站的用户，对使用本网站信息和在本网站发布信息的被使用，承担完全责任。本网站对任何因使用本网站而产生的第三方之间的纠纷，不负任何责任。 <br>
						<br> 9.服务终止 <br> 本网站有权在预先通知或不予通知的情况下终止任何免费服务。 <br>
						<br> 10.争议处理 <br> 本网站因正常的系统维护、系统升级，或者因网络拥塞而导致网站不能访问，本网站不承担任何责任。 <br>
						<br> 11.免责条款 <br> 本网并无随时监视此网址，但保留对其实施实时监视的权利。对于他方输入的，不是本网发布的材料，本网概不负任何法律责任。对于其他网址链接在本网址的内容，本网概不负法律责任。 <br>
						<br> 12．协议条款的更新与修订 <br> 本网站有权根据需要对条款的内容予以变更，并在网站公告，不再另行单独通知。变更后的协议内容一经公布即代替原来的协议内容，本网站用户须定期审阅本协议及其变更后的内容。若不同意对协议所作的变更，用户应立即停止使用本网站下全部服务并注销账户。若用户在本协议内容公告变更后继续使用本协议下服务及账户，表示用户已充分阅读、理解并接受修改后的协议内容，也将遵循修改后的协议内容使用本协议下服务。
					</p>
					<p align="left">
						<strong><br>
			《中国注册志愿者管理办法》</strong><strong> </strong><br> （2013年11月修订） <br>
						<strong>第一章总则</strong><strong> </strong><br> 第一条为规范志愿者注册工作，加强注册志愿者管理，特制定本办法。 <br> 第二条志愿者（英文名称为Volunteer）是指不以物质报酬为目的，利用自己的时间、技能等资源，自愿为国家、社会和他人提供服务的人。 <br> 第三条注册志愿者（China Registered Volunteer）是指按照本办法规定的程序，在共青团组织及其授权的志愿者组织注册登记、参加服务活动的志愿者。 <br> 第四条 志愿精神：奉献、友爱、互助、进步。 <br> 第五条 志愿者标识 注册志愿者标识（通称“心手标”）的整体构图为心的造型，又是英文“Volunteer”的第一个字母“V”，红色，图案中央是手的造型，也是鸽子的造型，白色。标志寓意为中国志愿者向社会上所有需要帮助的人们奉献一片爱心，伸出友爱之手，表达“爱心献社会，真情暖人心”和“团结互助、共创和谐”的主题（图案见附件1）。 <br> 第六条每年3月5日是中国青年志愿者服务日，12月5日是国际志愿者日。
						<br>
						<br>
						<strong>第二章注册</strong><strong> </strong><br> 第七条基本条件
						<br> （一）年满十八周岁或十六至十八周岁以自己劳动收入为主要生活来源者；十四至十八周岁者，须经其法定代理人同意；未满十八周岁的在校学生申请注册的，按所在学校有关规定办理。 <br> （二）具备参加志愿服务相应的基本能力和身体素质。 <br> （三）遵守国家法律法规和注册机构的相关规定。 <br> 第八条注册机构
						<br> 市（地、州、盟）、县（市、区、旗）、乡（镇、街道）以及大中专院校团组织及其授权的志愿者组织为志愿者注册机构。 <br> 第九条注册程序 <br> （一）申请人直接到开展志愿者注册工作的团组织、志愿者组织提出申请或通过网络、通讯等方式提出申请，填写《志愿者注册登记表》（参考式样见附件2）。 <br> （二）注册机构对申请人进行审核。 <br> （三）审核合格，注册机构向申请人颁发注册志愿者证章。注册机构可根据实际需要，为注册志愿者编制本地管理服务号码。
						<br>
						<br>
						<strong>第三章权利和义务</strong><strong> </strong><br> 第十条权利 <br> （一）参加志愿服务活动。 <br> （二）接受相关的志愿服务培训，获得志愿服务活动真实、必要的信息。 <br> （三）获得从事志愿服务的必需条件和必要保障。 <br> （四）优先获得志愿者组织和其他志愿者提供的服务。 <br> （五）对志愿服务工作提出意见和建议。 <br> （六）相关法律、法规、政策所赋予的权利。 <br> （七）可申请取消注册志愿者身份。 <br> 第十一条义务 <br> （一）遵守国家法律法规及团组织、志愿者组织的相关规定。 <br> （二）每名注册志愿者根据个人意愿至少选择参加一个志愿服务项目或活动，每年参加志愿服务时间累计不少于20小时。 <br> （三）履行志愿服务承诺，完成志愿服务任务，传播志愿服务理念。 <br> （四）自觉维护团组织、志愿者组织和志愿者的形象。 <br> （五）在志愿者职责范围内，自觉维护服务对象的合法权益。 <br> （六）自觉抵制任何以志愿者身份从事的赢利活动或其他违背社会公德的活动（行为）。 <br> （七）依法应当承担的其它义务。
						<br>
						<br>
						<strong>第四章志愿服务</strong><strong> </strong><br> 第十二条志愿服务 <br> （一）志愿服务是指志愿者不以物质报酬为目的，利用自己的时间、技能等资源，自愿为国家、社会和他人提供服务的行为。 <br> （二）志愿服务主要领域包括：扶贫济困、助老助残、社区服务、生态建设、大型活动、抢险救灾、社会管理、文化建设、西部开发、海外服务等。 <br> （三）团组织、志愿者组织根据服务对象的需求，向注册志愿者发布服务信息、提供服务岗位，志愿者按照相关要求开展志愿服务。注册志愿者也可按照相关规定自行开展志愿服务。提倡具有相同服务意向和志趣爱好的注册志愿者在团组织、志愿者组织指导下结成志愿服务团队开展服务。 <br> （四）注册志愿者参加志愿服务，应通过与志愿者组织或服务对象签定服务协议书等形式，明确服务内容、时间和有关的权利、义务。未满十八周岁的注册志愿者可参加与其年龄、智力相适应的志愿服务；未满十八周岁的在校学生注册后，按所在学校有关规定参与相关志愿服务。 <br> （五）各级团组织、志愿者组织可依托服务需求相对集中的社会公益机构，通过签定协议、命名挂牌等形式创建志愿服务基地，探索建立志愿者经常性、就近就便开展志愿服务的有效机制。 <br> （六）各级团组织、志愿者组织要推进志愿服务平台建设，形成实体型、网络型、复合型平台。鼓励依托网络新媒体组织开展志愿服务活动，同时应面向社会公开相关信息，遵守有关法律规定。
					</p>
					<p align="left">
						<strong><br>
			第五章组织与管理</strong><strong> </strong><br> 第十三条组织机构 <br> （一）共青团中央、中国青年志愿者协会负责全国注册志愿者工作的规划、协调和指导。 <br> （二）省级团委、志愿者协会根据本地区、本系统的实际，制定相应的实施细则，广泛推行志愿者注册制度。根据实际需要，也可直接开展志愿者注册工作。 <br> （三）市、县两级团委应普遍建立志愿者专门工作机构和志愿者协会，安排专人负责志愿者注册和管理工作。 <br> （四）县级以下基层团组织应通过建立志愿者协会、创建志愿者服务站、培育志愿服务伙伴、发展志愿者服务队和服务团队等形式，广泛开展志愿者注册工作，实现志愿者注册和服务的便利化。 <br> （五）社区和机关团体、企事业单位、中学的团组织、志愿者组织（含志愿者服务站、服务队、服务团队等），经所在地注册机构同意可以开展志愿者注册工作。 <br> （六）注册机构及其下属的团组织、志愿者组织负责志愿者的管理服务，建立健全宣传动员、注册登记、管理培训、考核评价、激励表彰、个人信息保密等制度。 <br> 第十四条日常管理 <br> （一）注册志愿者参加志愿服务后，由服务对象或组织者提供志愿者的服务时间、服务内容等证明，注册机构及其下属团组织、志愿者组织予以认定。服务时间为实际服务时间（不含往返时间），以小时为单位计量。 <br> （二）注册机构应建立健全注册志愿者档案和信息管理系统，逐步实现网上注册和管理，促进管理工作的科学化、制度化、规范化。 <br> （三）注册志愿者使用全国统一的标识。开展志愿服务活动时，注册志愿者应佩带以全国统一标识为主体图案的标志。志愿者旗帜和服装以红、蓝、白为基本色调。 <br> （四）注册机构可在重大活动时或定期组织志愿者进行宣誓。志愿者誓词：“我愿意成为一名光荣的志愿者。我承诺：尽己所能，不计报酬，帮助他人，服务社会，践行志愿精神，传播先进文化，为社会进步贡献力量！”
						<br> （五）注册志愿者培训工作主要由注册机构及其下属的团组织、志愿者组织负责，对注册志愿者申请人进行志愿服务基本理念培训，定期向注册志愿者提供志愿服务相关技能等方面的培训，向志愿者骨干提供专门的培训，提高志愿者的服务能力和综合素质。 <br> （六）团组织、志愿者组织应探索和完善注册志愿者服务时间储蓄制度，使注册志愿者在本人需要帮助时，优先得到志愿者组织和其他志愿者的服务。 <br> （七）对拒不履行义务的，注册机构可取消其注册志愿者身份。 <br> （八）注册志愿者在志愿者组织安排的志愿服务过程中对服务对象造成损害的，由志愿者组织承担责任；志愿者组织承担责任后，有权向有故意或者重大过失的注册志愿者追偿。 <br> （九）各级团组织、志愿者组织应逐步建立志愿者权益保障机制。依据有关法律法规、政策规定维护志愿者正当权益，推动建立志愿者保险和应急基金，做好相关救助和慰问工作。如服务对象在接受服务过程中对注册志愿者造成损害，志愿者组织应当支持受损害的注册志愿者向有关服务对象追偿损失，并提供必要的帮助。
					</p>
					<p align="left">
						<strong><br>
			第六章激励和表彰</strong><strong> </strong><br> 第十五条团组织、志愿者组织应完善志愿者评价机制，组织实施星级认证制度，评选表彰和奖章授予制度等。 <br> 第十六条星级认证制度
						<br> 星级认证制度由省级团委、志愿者协会组织实施。注册机构负责具体认证工作，根据志愿者注册后参加志愿服务的时间累计，认定其为一至五星志愿者。星级志愿者认定后，可由相关注册机构在其注册证上进行标注，并佩戴相应标志。 <br> （一）志愿者注册后，参加志愿服务时间累计达到100小时的，认定为“一星志愿者”； <br> （二）志愿者注册后，参加志愿服务时间累计达到300小时的，认定为“二星志愿者”； <br> （三）志愿者注册后，参加志愿服务时间累计达到600小时的，认定为“三星志愿者”； <br> （四）志愿者注册后，参加志愿服务时间累计达到1000小时的，认定为“四星志愿者”； <br> （五）志愿者注册后，参加志愿服务时间累计达到1500小时的，认定为“五星志愿者”。 <br> 第十七条评选表彰和奖章授予制度 <br> 各级团组织、志愿者组织主要依据注册志愿者的服务时间、服务业绩，根据有关规定，定期组织开展评选表彰活动，授予志愿者荣誉称号和相应服务奖章。共青团中央、中国青年志愿者协会定期组织开展中国青年志愿者优秀个人奖、组织奖、项目奖评选表彰活动。
					</p>
					<p>
						&nbsp;
					</p>
					<p style="font-size:13px;font-family:'Helvetica Neue';">
						<strong>本人申请注册系统，在此本人郑重承诺：</strong>
					</p>
					<p style="font-size:13px;font-family:'Helvetica Neue';">
						<strong>一、 真实、准确地提供本人个人信息、获奖信息等相关材料；</strong>
					</p>
					<p style="font-size:13px;font-family:'Helvetica Neue';">
						<strong>二、 自觉遵守《关于实施优秀青年志愿者守信联合激励 加快推进青年信用体系建设的行动计划》相关政策和规定，在教育服务和管理、就业和创新创业服务、社会保障服务、金融与住房租赁、文化生活服务、评先树优等七大领域及其他领域诚实守信；</strong>
					</p>
					<p style="font-size:13px;font-family:'Helvetica Neue';">
						<strong>三、 自觉遵守共青团中央与其他部门共同签署的守信联合激励与失信联合惩戒备忘录；</strong>
					</p>
					<p style="font-size:13px;font-family:'Helvetica Neue';">
						<strong>四、 本人严格遵守以上承诺，如有违反，愿意承担相应责任，接受将失信违法行为纳入不良信用记录并向社会公开。</strong>
					</p>
					<br></div>
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