<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>修改组织信息</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js"></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="group-information-wrap">
			<h4>修改组织信息</h4>
			<div class="group-img-preview-wrap">
				<img class="group-img-preview" id="groupImgPreview" src="${staticPath}/images/group_activity_bg.png" />
			</div>
			<div class="information-table-wrap information-change">
				<table class="information-table">
					<form id="changeGroupInformationForm"  action="<%=request.getContextPath()%>/group/groupDetail.jsp" target="_self">
						<tr class="information-item">
							<td class="item-title">名称</td>
							<td class="item-content"><input type="text" id="groupName" value="兰溪市永昌街道社区卫生服务中心志愿者服务队" required="required" /></td>
						</tr>
						<tr>
							<td class="item-title">位置</td>
							<td class="item-content"><input type="text" id="groupAddress" value="浙江省金华市永扬路9号永昌街道社区卫生服务中心" required="required" /></td>
						</tr>
						<tr>
							<td class="item-title">头像</td>
							<td class="item-content"><input type="file" id="groupHead" onchange="changeImg()" /></td>
						</tr>
						<tr>
							<td class="item-title">负责人</td>
							<td class="item-content"><input type="text" id="groupPrincipal" value="小小" required="required" /></td>
						</tr>
						<tr>
							<td class="item-title">电话</td>
							<td class="item-content"><input type="tel" id="groupPhone" value="15182839862" required="required" /></td>
						</tr>
						<tr>
							<td class="item-title">邮箱</td>
							<td class="item-content"><input type="email" id="groupEmail" value="1274626368@qq.com" required="required" /></td>
						</tr>
						<tr>
							<td class="change-btn-wrap" colspan="2">
								<button type="submit" class="ensure-btn" onclick="ensureChange()">确认</button>
								<button class="cancel-btn" onclick="alert('取消修改')">取消</button>
							</td>
						</tr>
					</form>
				</table>
			</div>
		</div>
		<script>
			function changeGroupInformation(src) {
				$("#mainIframe", parent.document).attr('src', src);
			}
			
			function ensureChange(){
				alert('修改成功');
			}
			
			//文件预览
			function changeImg() {
				var r = new FileReader();
				f = document.getElementById('groupHead').files[0];
				r.readAsDataURL(f);
				r.onload = function(e) {
					document.getElementById('groupImgPreview').src = this.result;
				};
			}
		</script>
	</body>

</html>