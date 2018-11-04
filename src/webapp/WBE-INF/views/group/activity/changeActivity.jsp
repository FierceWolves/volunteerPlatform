<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>修改活动</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js"></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="activity-detail-wrap">
			<div class="page-title">
				<h3>活动修改</h3></div>
			<div class="activity-img-wrap">
				<img class="activity-img" id="activityImgShow" src="${staticPath}/images/orgDetail-bg.png" />
			</div>
			<div class="activity-table-wrap">
				<table class="activity-table">
					<form class="change-activity-form" id="changeActivityForm" action="<%=request.getContextPath()%>/group/activity/groupActivity.jsp" target="_self">
						<tr class="content">
							<td class="title">标题</td>
							<td class="data"><input type="text" id="activityTitle" value="东辰御园小区清理卫生" required="required"/></td>
						</tr>
						<tr class="content">
							<td class="title">活动描述</td>
							<td class="data"><textarea id="activityDescription" class="description-input" required="required">希望通过本次展览向观众揭示鲁迅艺术世界的精神层面，并与所城里社区图书馆合办——“你不曾了解的鲁迅” 历史文化讲堂主题活动。此次历史文化讲堂特邀鲁东大学教授、所城里社区图书馆馆长等学界大咖，来跟大家面对面地聊聊你不曾了解的鲁迅的多彩世界。</textarea></td>
						</tr>
						<tr class="content">
							<td class="title">地点</td>
							<td class="data"><input type="text" id="activityLocation" value="东辰御园(河北省张家口市下花园区新辰路)" required="required"/></td>
						</tr>
						<tr class="content">
							<td class="title">时间</td>
							<td class="data"><input type="text" id="activityTime" value="2018/08/25-2018/08/25" required="required"/></td>
						</tr>
						<tr class="content">
							<td class="title">图片</td>
							<td class="data"><input type="file" id="activityImg" value="${staticPath}/images/orgDetail-bg.png" onchange="changeImg()"/></td>
						</tr>
						<tr class="content">
							<td class="title">组织</td>
							<td class="data"><input type="text" id="activityGroup" value="下花园区人大志愿服务队" required="required"/></td>
						</tr>
						<tr class="content">
							<td class="title">负责人</td>
							<td class="data"><input type="text" id="activityPrincipal" value="小华" required="required"/></td>
						</tr>
						<tr class="content">
							<td class="title">电话</td>
							<td class="data"><input type="tel" id="pincipalTel" value="15310320101" required="required"/></td>
						</tr>
						<tr class="content">
							<td class="title">参与人数</td>
							<td class="data"><input type="number" id="pincipalTel" value="14" disabled="true" required="required"/></td>
						</tr>
						<tr class="content">
							<td class="title">状态</td>
							<td class="data"><input type="text" id="activityStatus" value="招募中" required="required"/></td>
						</tr>
						<tr class="operate-method">
							<td colspan="2">
								<button type="submit" class="change-btn" onclick="ensureChange()">确定</button>
								<button class="cancel-btn" onclick="cancelChange()">取消</button>
							</td>
						</tr>
					</form>
				</table>
			</div>
		</div>
		<script>
			function ensureChange() {
				alert("修改成功!");
			}

			function cancelChange() {
				alert("取消成功！");
			}
			//文件预览
			function changeImg() {
				var r = new FileReader();
				f = document.getElementById('activityImg').files[0];
				r.readAsDataURL(f);
				r.onload = function(e) {
					document.getElementById('activityImgShow').src = this.result;
				};
			}
		</script>
	</body>

</html>