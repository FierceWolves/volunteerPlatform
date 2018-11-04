<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head>
		<%pageContext.setAttribute("jspPath", request.getContextPath());%>
		<%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>活动详情</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js"></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="activity-detail-wrap">
			<div class="page-title">
				<h3>活动详情</h3></div>
			<div class="activity-img-wrap">
				<img class="activity-img" src="${staticPath}/images/orgDetail-bg.png" />
			</div>
			<div class="activity-table-wrap">
				<table class="activity-table">
					<tr class="activity-title">
						<td class="title">标题</td>
						<td class="data">东辰御园小区清理卫生</td>
					</tr>
					<tr class="content">
						<td class="title">活动描述</td>
						<td class="data">希望通过本次展览向观众揭示鲁迅艺术世界的精神层面，并与所城里社区图书馆合办——“你不曾了解的鲁迅” 历史文化讲堂主题活动。此次历史文化讲堂特邀鲁东大学教授、所城里社区图书馆馆长等学界大咖，来跟大家面对面地聊聊你不曾了解的鲁迅的多彩世界。</td>
					</tr>
					<tr class="content">
						<td class="title">地点</td>
						<td class="data">东辰御园(河北省张家口市下花园区新辰路)</td>
					</tr>
					<tr class="content">
						<td class="title">时间</td>
						<td class="data">2018/08/25-2018/08/25</td>
					</tr>
					<tr class="content">
						<td class="title">组织</td>
						<td class="data">下花园区人大志愿服务队</td>
					</tr>
					<tr class="content">
						<td class="title">负责人</td>
						<td class="data">小华</td>
					</tr>
					<tr class="content">
						<td class="title">电话</td>
						<td class="data">15310320101</td>
					</tr>
					<tr class="content join-person" onclick="lookActivityMember('<%=request.getContextPath()%>/group/activity/activityMember.jsp')">
						<td class="title">参与人数</td>
						<td class="data">14</td>
					</tr>
					<tr class="content">
						<td class="title">状态</td>
						<td class="data">招募中</td>
					</tr>
					<tr class="operate-method">
						<td colspan="2">
							<button class="change-btn" onclick="changeActivity('<%=request.getContextPath()%>/group/activity/changeActivity.jsp')">修改</button>
							<button class="cancel-btn" onclick="cancelActivity()">取消活动</button>
						</td>
					</tr>
				</table>
			</div>
		</div>
		<script>
			//查看参与活动的人
			function lookActivityMember(src){
				$("#mainIframe", parent.document).attr('src', src);
			}
			
			function changeActivity(src) {
				$("#mainIframe", parent.document).attr('src', src);
			}
			
			function cancelActivity() {
				alert("取消活动成功！");
			}
		</script>
	</body>

</html>