<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>添加活动</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js"></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="activity-detail-wrap">
			<h4>申请活动</h4>
			<div class="activity-img-wrap">
				<img class="activity-img" id="activityImgShow" src="${staticPath}/images/group_activity_bg.png" alt="活动默认图片"/>
			</div>
			<div class="activity-table-wrap">
				<table class="activity-table">
					<form class="change-activity-form" id="changeActivityForm" action="<%=request.getContextPath()%>/group/activity/groupActivity.jsp" target="_self" onsubmit="return ensureApply()">
						<tr class="content">
							<td class="title">标题</td>
							<td class="data"><input type="text" id="activityTitle" required="required"/></td>
						</tr>
						<tr class="content">
							<td class="title">活动描述</td>
							<td class="data"><textarea id="activityDescription" class="description-input" required="required" placeholder="描述一下活动吧...比如活动内容，意义，让志愿者们更加清楚活动"></textarea></td>
						</tr>
						<tr class="content">
							<td class="title">地点</td>
							<td class="data"><input type="text" id="activityLocation" required="required"/></td>
						</tr>
						<tr class="content">
							<td class="title">开始时间</td>
							<td class="data"><input type="date" id="activityStartTime" required="required"/></td>
						</tr>
						<tr class="content">
							<td class="title">结束时间</td>
							<td class="data"><input type="date" id="activityEndTime" required="required"/></td>
						</tr>
						<tr class="content">
							<td class="title">活动图片</td>
							<td class="data"><input type="file" id="activityImg" onchange="changeImg()"/></td>
						</tr>
						<tr class="content">
							<td class="title">活动组织</td>
							<td class="data"><input type="text" id="activityGroup"  required="required"/></td>
						</tr>
						<tr class="content">
							<td class="title">负责人</td>
							<td class="data"><input type="text" id="activityPrincipal" required="required" /></td>
						</tr>
						<tr class="content">
							<td class="title">电话</td>
							<td class="data"><input type="tel" pattern="^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\d{8}$" id="pincipalTel" required="required" oninvalid="alert('手机号码格式错误')"/></td>
						</tr>
						<tr class="content">
							<td class="title">状态</td>
							<td class="data"><input type="text" id="activityStatus" value="招募中" required="required"/></td>
						</tr>
						<tr class="operate-method">
							<td colspan="2">
								<button type="submit" class="change-btn">确认</button>
								<button class="cancel-btn" onclick="cancelApply()">取消</button>
							</td>
						</tr>
					</form>
				</table>
			</div>
		</div>
		<script>
			function ensureApply() {
				//表单时间检测
				var startTime = $("#activityStartTime").val();
				var endTime = $("#activityEndTime").val();
				var startDate = Date.parse(new Date(startTime.replace(/-/g, "/"))); 
				var endDate = Date.parse(new Date(endTime.replace(/-/g, "/"))); 
				//起始时间早于结束时间
				if(startDate-endDate > 0){
					alert("时间选择错误...");
					return false;
				}else{
					alert("申请成功!");
					$(".group-manage-item li",parent.document).removeClass("item-actived");
				}
			}
			
			function cancelApply() {
				alert("取消成功!");
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