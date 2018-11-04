<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head>
		<%pageContext.setAttribute("jspPath", request.getContextPath());%>
		<%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>组织成员</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js"></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="member-apply-wrap">
			<h4>申请列表</h4>
			<div class="grop-member-list-wrap">
				<table class="member-list">
					<form class="member-apply-form" id="memberApplyForm" target="_self" action="<%=request.getContextPath()%>/group/groupMember.jsp">
						<tr class="list-title">
							<th class="check-item"><input type="checkbox" class="check-all" id="applyAllMember" /></th>
							<th class="name">姓名</th>
							<th class="sex">性别</th>
							<th class="tel">电话</th>
							<th class="email">邮箱</th>
							<th class="address">地址</th>
							<th class="apply-time">申请时间</th>
						</tr>
						<tr class="member-item">
							<td class="check-item"><input type="checkbox" class="checkItem" /></td>
							<td class="name">余星辰</td>
							<td class="sex">男</td>
							<td class="tel">15182839862</td>
							<td class="email">1274626368@qq.com</td>
							<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
							<td class="apply-time">2018/8/18 18:32</td>
						</tr>
						<tr class="member-item">
							<td class="check-item"><input type="checkbox" class="checkItem" /></td>
							<td class="name">余星辰</td>
							<td class="sex">男</td>
							<td class="tel">15182839862</td>
							<td class="email">1274626368@qq.com</td>
							<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
							<td class="apply-time">2018/8/18 18:32</td>
						</tr>
						<tr class="member-item">
							<td class="check-item"><input type="checkbox" class="checkItem" /></td>
							<td class="name">余星辰</td>
							<td class="sex">男</td>
							<td class="tel">15182839862</td>
							<td class="email">1274626368@qq.com</td>
							<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
							<td class="apply-time">2018/8/18 18:32</td>
						</tr>
						<tr class="member-item">
							<td class="check-item"><input type="checkbox" class="checkItem" /></td>
							<td class="name">余星辰</td>
							<td class="sex">男</td>
							<td class="tel">15182839862</td>
							<td class="email">1274626368@qq.com</td>
							<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
							<td class="apply-time">2018/8/18 18:32</td>
						</tr>
						<tr class="member-item">
							<td class="check-item"><input type="checkbox" class="checkItem" /></td>
							<td class="name">余星辰</td>
							<td class="sex">男</td>
							<td class="tel">15182839862</td>
							<td class="email">1274626368@qq.com</td>
							<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
							<td class="apply-time">2018/8/18 18:32</td>
						</tr>
						<tr class="member-item">
							<td class="check-item"><input type="checkbox" class="checkItem" /></td>
							<td class="name">余星辰</td>
							<td class="sex">男</td>
							<td class="tel">15182839862</td>
							<td class="email">1274626368@qq.com</td>
							<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
							<td class="apply-time">2018/8/18 18:32</td>
						</tr>
						<tr class="member-item">
							<td class="check-item"><input type="checkbox" class="checkItem" /></td>
							<td class="name">余星辰</td>
							<td class="sex">男</td>
							<td class="tel">15182839862</td>
							<td class="email">1274626368@qq.com</td>
							<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
							<td class="apply-time">2018/8/18 18:32</td>
						</tr>
						<tr class="member-item">
							<td class="check-item"><input type="checkbox" class="checkItem" /></td>
							<td class="name">余星辰</td>
							<td class="sex">男</td>
							<td class="tel">15182839862</td>
							<td class="email">1274626368@qq.com</td>
							<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
							<td class="apply-time">2018/8/18 18:32</td>
						</tr>
						<tr class="member-item">
							<td class="check-item"><input type="checkbox" class="checkItem" /></td>
							<td class="name">余星辰</td>
							<td class="sex">男</td>
							<td class="tel">15182839862</td>
							<td class="email">1274626368@qq.com</td>
							<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
							<td class="apply-time">2018/8/18 18:32</td>
						</tr>
						<tr class="member-item">
							<td class="check-item"><input type="checkbox" class="checkItem" /></td>
							<td class="name">余星辰</td>
							<td class="sex">男</td>
							<td class="tel">15182839862</td>
							<td class="email">1274626368@qq.com</td>
							<td class="address">四川省成都市都江堰青城山镇东软大道1号</td>
							<td class="apply-time">2018/8/18 18:32</td>
						</tr>
						<tr class="btn-apply">
							<td colspan="7">
								<button type="submit" class="apply-btn" id="applyMember">同意加入</button>
							</td>
						</tr>
					</form>
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
			$("#applyAllMember").on('click', function() {
				$("input[class='checkItem']").prop("checked", this.checked);
			});

			$("input[class='checkItem']").on('click', function() {
				var ckItems = $("input[class='checkItem']");
				$("#applyAllMember").prop("checked", ckItems.length == ckItems.filter(":checked").length ? true : false);
			});
			$("#applyMember").on('click', function() {
				var ckItems = $("input[class='checkItem']").filter(":checked");
				if(ckItems.length > 0) {
					alert('修改成功');
					$("#memberApplyForm").submit();
				} else {
					alert('修改失败')
					return false;
				}
			})
		</script>
	</body>

</html>