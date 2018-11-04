<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head>
		<%pageContext.setAttribute("jspPath", request.getContextPath());%>
		<%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>成员信息</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="member-detail-wrap">
			<h4>成员信息</h4>
			<div class="member-information-container">
				<ul>
					<li><div class="li-title">姓名：</div><div class="li-content">余星辰</div></li>
					<li><div class="li-title">证件号：</div><div class="li-content">51302119960103005X</div></li>
					<li><div class="li-title">政治面貌：</div><div class="li-content">共青团员</div></li>
					<li><div class="li-title">注册区域：</div><div class="li-content">四川省成都市都江堰市</div></li>
					<li><div class="li-title">性别：</div><div class="li-content">男</div></li>
					<li><div class="li-title">民族：</div><div class="li-content">汉</div></li>
					<li><div class="li-title">籍贯：</div><div class="li-content">四川省达州市</div></li>
					<li><div class="li-title">现居地址：</div><div class="li-content">四川省成都市都江堰市青城山镇成都东软学院1号</div></li>
					<li><div class="li-title">联系邮箱：</div><div class="li-content">1274626368@qq.com</div></li>
					<li><div class="li-title">从业情况：</div><div class="li-content">学生</div></li>
					<li><div class="li-title">最高学历：</div><div class="li-content">本科</div></li>
				</ul>
			</div>
		</div>
	</body>

</html>