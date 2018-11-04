<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>通知详情</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js"></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="notice-detail-wrap">
			<h5>通知详情</h5>
			<div class="notice-container">
				<table class="notice-content">
					<tr class="notice-item">
						<td colspan="2" class="notice-title" id="noticeTitle">
							东辰御园小区清理卫生
						</td>
					</tr>
					<tr class="notice-item">
						<td class="title">通知人&nbsp;&nbsp;&nbsp;：</td>
						<td class="content">余星辰</td>
					</tr>
					<tr class="notice-item">
						<td class="title">通知时间：</td>
						<td class="content">2018/6/18 18:44:23</td>
					</tr>
					
					<tr class="notice-item">
						<td colspan="2" class="content">
							<div id="noticeContent">
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;希望通过本次展览向观众揭示鲁迅艺术世界的精神层面，并与所城里社区图书馆合办——“你不曾了解的鲁迅”
								历史文化讲堂主题活动。此次历史文化讲堂特邀鲁东大学教授、所城里社区图书馆馆长等学界大咖，
								来跟大家面对面地聊聊你不曾了解的鲁迅的多彩世界。
							</div>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</body>

</html>