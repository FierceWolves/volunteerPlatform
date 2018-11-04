<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>活动通知</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js" ></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="release-notice-wrap">
			<h4>活动通知</h4>
			<div class="release-notice-main-wrap">
				<div class="notice-wrap">
					<form class="notice-form" id="activityNoticeForm" target="_self" action="<%=request.getContextPath()%>/group/activity/groupActivity.html" onsubmit="return releaseNotice()">
						<div class="notice-activity-wrap">
							<span>选择活动:</span>
							<select class="notice-activity-title" id="noticeActivity">
								<option class="activity-item">东辰御园小区清理卫生</option>
								<option class="activity-item">所图公益活动66讲-所图周年庆（三)|你不曾</option>
								<option class="activity-item">全国文明城市创建|衢山镇环卫工人送清凉活动</option>
							</select>
						</div>
						<div class="notice-title-wrap">
							<input class="notice-title" id="noticeTitle" placeholder="请输入通知标题" required="required" oninvalid="alert('标题不能为空')" />
						</div>
						<div class="notice-content-wrap">
							<textarea class="notice-content" id="noticeContent" placeholder="请输入通知内容..." required="required" oninvalid="alert('通知内容不能为空	')"></textarea>
						</div>
						<div class="notice-btn-wrap">
							<button type="submit" class="ensure-release">发送</button>
							<button class="cancel-release" onclick="cancelNotice()">取消</button>
						</div>
					</form>
				</div>
			</div>
		</div>
		<script>
			function releaseNotice(){
				alert("发送成功!");
				$(".group-manage-item li",parent.document).removeClass("item-actived");
			}
			function cancelNotice(){
				alert("取消成功!")
				$(".group-manage-item li",parent.document).removeClass("item-actived");
			}
			
		</script>
	</body>

</html>