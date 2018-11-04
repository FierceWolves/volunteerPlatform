<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>活动列表</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js" ></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>
	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="group-activity-main-wrap">
			<h4>组织活动</h4>
			<div class="activity-col-menu-wrap">
				<div class="col-menu-item title">标题</div>
				<div class="col-menu-item location">地点</div>
				<div class="col-menu-item time">时间</div>
				<div class="col-menu-item org">组织</div>
				<div class="col-menu-item principal">负责人</div>
				<div class="col-menu-item statu">状态</div>
			</div>
			<div class="group-activity-list-wrap">
				<ul class="group-activity-list">
					<li class="group-activity-list-item" onclick="activityDetail('<%=request.getContextPath()%>/group/activity/activityDetail.jsp')">
						<div class="col-menu-item title">东辰御园小区清理卫生</div>
						<div class="col-menu-item location">东辰御园(河北省张家口市下花园区新辰路)</div>
						<div class="col-menu-item time">2018/08/25-2018/08/25</div>
						<div class="col-menu-item org">下花园区人大志愿服务队</div>
						<div class="col-menu-item principal">小黄</div>
						<div class="col-menu-item statu">招募中</div>
					</li>
					<li class="group-activity-list-item">
						<div class="col-menu-item title">所图公益活动66讲-所图周年庆（三)|你不曾</div>
						<div class="col-menu-item location">烟台市芝罘区所城里时彦街12号所城里社区图书馆</div>
						<div class="col-menu-item time">2018/08/25-2018/08/26</div>
						<div class="col-menu-item org">烟台市社会实践爱心志愿者服务队</div>
						<div class="col-menu-item principal">小冰</div>
						<div class="col-menu-item statu">招募中</div>
					</li>
					<li class="group-activity-list-item">
						<div class="col-menu-item title">全国文明城市创建|衢山镇环卫工人送清凉活动</div>
						<div class="col-menu-item location">浙江省舟山市岱山县岛渔线祥和嘉园</div>
						<div class="col-menu-item time">2018/08/25-2018/08/26</div>
						<div class="col-menu-item org">衢山千帆志愿服务队</div>
						<div class="col-menu-item principal">小何</div>
						<div class="col-menu-item statu">招募中</div>
					</li>
				</ul>
			</div>
		</div>
		<script>
			function activityDetail(src){
				$("#mainIframe", parent.document).attr('src',src);
			}
		</script>
	</body>
</html>
