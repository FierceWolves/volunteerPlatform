<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<%pageContext.setAttribute("jspPath", request.getContextPath());%>
		<%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>组织成员</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js" ></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="group-member-wrap">
			<h4>组织成员</h4>
			<div class="grop-member-list-wrap">
				<table class="member-list">
					<tr class="list-title">
						<th class="name">姓名</th>
						<th class="sex">性别</th>
						<th class="tel">电话</th>
						<th class="email">邮箱</th>
						<th class="address">地址</th>
					</tr>
					<tr class="member-item">
						<td class="name">余星辰</td>
						<td class="sex">男</td>
						<td class="tel">15182839862</td>
						<td class="email">1274626368@qq.com</td>
						<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
					</tr>
					<tr class="member-item">
						<td class="name">余星辰</td>
						<td class="sex">男</td>
						<td class="tel">15182839862</td>
						<td class="email">1274626368@qq.com</td>
						<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
					</tr>
					<tr class="member-item">
						<td class="name">余星辰</td>
						<td class="sex">男</td>
						<td class="tel">15182839862</td>
						<td class="email">1274626368@qq.com</td>
						<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
					</tr>
					<tr class="member-item">
						<td class="name">余星辰</td>
						<td class="sex">男</td>
						<td class="tel">15182839862</td>
						<td class="email">1274626368@qq.com</td>
						<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
					</tr>
					<tr class="member-item">
						<td class="name">余星辰</td>
						<td class="sex">男</td>
						<td class="tel">15182839862</td>
						<td class="email">1274626368@qq.com</td>
						<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
					</tr>
					<tr class="member-item">
						<td class="name">余星辰</td>
						<td class="sex">男</td>
						<td class="tel">15182839862</td>
						<td class="email">1274626368@qq.com</td>
						<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
					</tr>
					<tr class="member-item">
						<td class="name">余星辰</td>
						<td class="sex">男</td>
						<td class="tel">15182839862</td>
						<td class="email">1274626368@qq.com</td>
						<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
					</tr>
					<tr class="member-item">
						<td class="name">余星辰</td>
						<td class="sex">男</td>
						<td class="tel">15182839862</td>
						<td class="email">1274626368@qq.com</td>
						<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
					</tr>
					<tr class="member-item">
						<td class="name">余星辰</td>
						<td class="sex">男</td>
						<td class="tel">15182839862</td>
						<td class="email">1274626368@qq.com</td>
						<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
					</tr>
					<tr class="member-item">
						<td class="name">余星辰</td>
						<td class="sex">男</td>
						<td class="tel">15182839862</td>
						<td class="email">1274626368@qq.com</td>
						<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
					</tr>
				</table>
			</div>
			<div class="row-clearfix">
				<ul class="pagination">
					<li>
						<a href="#">Prev</a>
					</li>
					<li>
						<a href="#">1</a>
					</li>
					<li>
						<a href="#">2</a>
					</li>
					<li>
						<a href="#">3</a>
					</li>
					<li>
						<a href="#">4</a>
					</li>
					<li>
						<a href="#">5</a>
					</li>
					<li>
						<a href="#">Next</a>
					</li>
				</ul>
			</div>

		</div>
		<script>
			$(".member-item").on('click',function(){
				$("#mainIframe",parent.document).attr('src','<%=request.getContextPath()%>/group/member/memberDetail.jsp');
			})
		</script>
	</body>

</html>