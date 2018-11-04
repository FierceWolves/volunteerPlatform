<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>发布通知</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js" ></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="release-notice-wrap">
			<h4>发布通知</h4>
			<div class="release-notice-main-wrap">
				<div class="notice-wrap">
					<form class="notice-form" id="releaseNoticeForm" target="_self" action="<%=request.getContextPath()%>/group/groupDetail.html" onsubmit="return releaseNotice()">
						<div class="notice-title-wrap">
							<input class="notice-title" id="noticeTitle" placeholder="请输入通知标题" required="required" oninvalid="alert('标题不能为空')"/>
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
				alert('通知成功');	
				var items = $(".group-manage-item-a",parent.document);
				items.eq(3).removeClass("item-actived");
				items.eq(0).addClass("item-actived");
			}
			function cancelNotice(){
				alert("取消成功");
			}
		</script>
	</body>

</html>