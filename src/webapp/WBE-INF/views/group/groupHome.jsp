<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>组织管理中心</title>
		<link rel="stylesheet" href="${staticPath}/css/groupHome.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js" ></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>
	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="windows-wrap">
			<div class="top-wrap">
				<div class="logout-div">
					<button class="btn-login" id="loginBtn" disabled="true" onclick="login()">已登录</button>&nbsp;|
					<button class="btn-logout" id="logoutBtn" onclick="logout()">注销</button>
				</div>
				<div class="title-div">
					<span class="span-title">组织管理中心</span>
				</div>
			</div>
			<div class="main-wrap">
				<div class="main-left-wrap">
					<ul class="group-manage-menu">
						<li class="group-manage-item" onclick="setClass(this)">
							<a class="group-manage-item-a item-actived" onclick="getTripe('<%=request.getContextPath()%>/group/groupDetail.jsp')">组织资料</a>
						</li>
						<li class="group-manage-item" onclick="setClass(this)">
							<a class="group-manage-item-a" onclick="getTripe('<%=request.getContextPath()%>/group/activity/groupActivity.jsp')">组织活动</a>
							<ul class="org-activity-items">
								<li onclick="getTripe('<%=request.getContextPath()%>/group/activity/addActivity.jsp');setClass2(this)">申请活动</li>
								<li onclick="getTripe('<%=request.getContextPath()%>/group/activity/applyList.jsp');setClass2(this)">申请列表</li>
								<li onclick="getTripe('<%=request.getContextPath()%>/group/activity/releaseActivityNotice.jsp');setClass2(this)">活动通知</li>
							</ul>
						</li>
						<li class="group-manage-item" onclick="setClass(this)">
							<a class="group-manage-item-a" onclick="getTripe('<%=request.getContextPath()%>/group/member/groupMember.jsp')">组织成员</a>
							<ul class="org-activity-items">
								<li onclick="getTripe('<%=request.getContextPath()%>/group/member/applyList.jsp');setClass2(this)">申请列表</li>
							</ul>
						</li>
						<li class="group-manage-item" onclick="setClass(this)">
							<a class="group-manage-item-a" onclick="getTripe('<%=request.getContextPath()%>/group/releaseNotice.jsp')">发布通知</a>
						</li>
						<li class="group-manage-item" onclick="setClass(this)">
							<a class="group-manage-item-a" onclick="getTripe('<%=request.getContextPath()%>/group/notice/noticeList.jsp')">消息提醒</a>
						</li>
						<li class="group-manage-item" onclick="setClass(this)">
							<a class="group-manage-item-a" onclick="getTripe('<%=request.getContextPath()%>/group/dissolveGroup.jsp')">组织解散</a>
						</li>
					</ul>
				</div>
				
				<div class="main-right-wrap">
					<iframe class="main-right-content" id="mainIframe" src="<%=request.getContextPath()%>/group/groupDetail.jsp" scrolling="no"></iframe>
				</div>
			</div>
		</div>
		<script>
			function getTripe(src){
				$(".group-manage-item li").removeClass("item-actived");
				$("#mainIframe").attr("src",src);
			}
			function setClass(dom){
				$(".group-manage-item-a").removeClass("item-actived");
				$(dom).find("a").addClass("item-actived");
			}
			function setClass2(dom) {
				$(dom).addClass("item-actived");
			}
			
			function login(){
				if($("#loginBtn").text()=='登录'){
					window.location.href ="<%=request.getContextPath()%>/group/LoginOrRegister/loginOrg.jsp";
				}
			}
			function logout(){
				if($("#loginBtn").text()=='已登录'){
					alert("注销成功!");
					$("#loginBtn").text("登录");
					$("#logoutBtn").attr('disabled','true');	
					$("#loginBtn").removeAttr('disabled');
				}
			}
		</script>
	</body>
</html>
