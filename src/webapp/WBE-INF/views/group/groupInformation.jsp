<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>组织信息</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js" ></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>
	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="group-information-wrap">
			<h4>组织信息</h4>
			<div class="oprate-menu">
				<span onclick="changeGroupInformation('<%=request.getContextPath()%>/group/changeGroupInformation.jsp')">修改</span>
			</div>
			<div class="information-table-wrap">
				<table class="information-table">
					<tr class="information-item">
						<td class="item-title">名称</td>
						<td class="item-content">兰溪市永昌街道社区卫生服务中心志愿者服务队</td>
					</tr>
					<tr>
						<td class="item-title">位置</td>
						<td class="item-content">浙江省金华市永扬路9号永昌街道社区卫生服务中心</td>
					</tr>
					<tr>
						<td class="item-title">头像</td>
						<td class="item-content"><img class="group-head-img" src="${staticPath}/images/group_activity_bg.png"/></td>
					</tr>
					<tr>
						<td class="item-title">负责人</td>
						<td class="item-content">小小</td>
					</tr>
					<tr>
						<td class="item-title">电话</td>
						<td class="item-content">15182839862</td>
					</tr>
					<tr>
						<td class="item-title">邮箱</td>
						<td class="item-content">1274626368@qq.com</td>
					</tr>
				</table>
			</div>
		</div>
		<script>
			function changeGroupInformation(src){
				$("#mainIframe",parent.document).attr('src',src);
			}
		</script>
	</body>
</html>
