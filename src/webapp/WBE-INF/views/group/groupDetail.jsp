<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>组织介绍</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js" ></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>
	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="group-detail-container">
			<div class="left-wrap">
				<div class="group-head" onclick="groupInformation('<%=request.getContextPath()%>/group/groupInformation.jsp')"></div>
				<div class="group-name">安徽省</div>
			</div>
			<div class="right-wrap">
				<ul class="group-content">
					<li>为社会输送志愿时间：<span id="org-time">4008346.3</span>小时</li>
					<li>输送志愿者：<span id="org-member">2729044</span>人</li>
					<li>发起活动：<span id="org-activity">1343</span>场</li>
				</ul>
				<ul class="group-activity">
					<li>发起的活动：</li>
					<li class="group-activity-item" id="activity1">9月21日三下乡支教活动</li>
					<li class="group-activity-item" id="activity2">8月11日动车站导航志愿者活动</li>
					<li class="group-activity-item" id="activity3">7月12日街道打扫志愿者活动</li>
					<li class="group-activity-more">.</li>
					<li class="group-activity-more">.</li>
					<li class="group-activity-more">.</li>
				</ul>
			</div>
			
		</div>
		
		<script>
			function groupInformation(src){
				$("#mainIframe",parent.document).attr('src',src);
			}
		</script>
	</body>
</html>