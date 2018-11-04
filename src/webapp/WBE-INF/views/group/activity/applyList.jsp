<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>申请列表</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js"></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="apply-list-wrap">
			<h4>活动申请列表</h4>
			<div class="apply-table-wrap">
				<table class="apply-table" border="1">
					<form class="apply-form" id="applyForm" onsubmit="" action="<%=request.getContextPath()%>/group/groupHome.jsp"></form>
					<tr class="apply-title">
						<th><input class="cb-all" id="checkAll" type="checkbox" onclick="checkAll()"></th>
						<th> 姓名</th>
						<th> 电话</th>
						<th> 申请活动</th>
						<th> 申请时间</th>
						<th> 操作</th>
					</tr>
					<tr class="apply-item">
						<td><input class="cb-item" id="checkItem" type="checkbox"></td>
						<td class="apply-person-name">余星辰</td>
						<td class="apply-person-tel">15182839862</td>
						<td class="apply-activity-title">东辰御园小区清理卫生</td>
						<td class="apply-time">2018/6/18 18:44:23</td>
						<td class="apply-opreate">
							<button class="agree-btn" type="submit" onclick="agreeApply()">同意</button>
							<button class="disagrer-btn" type="submit" onclick="disaggreeApply()">不同意</button>
						</td>
					</tr>
					<tr class="apply-item">
						<td><input class="cb-item" id="checkItem" type="checkbox"></td>
						<td class="apply-person-name">余星辰</td>
						<td class="apply-person-tel">15182839862</td>
						<td class="apply-activity-title">东辰御园小区清理卫生</td>
						<td class="apply-time">2018/6/18 18:44:23</td>
						<td class="apply-opreate">
							<button class="agree-btn" type="submit" onclick="agreeApply()">同意</button>
							<button class="disagrer-btn" type="submit" onclick="disaggreeApply()">不同意</button>
						</td>
					</tr>
					<tr class="apply-item">
						<td><input class="cb-item" id="checkItem" type="checkbox"></td>
						<td class="apply-person-name">余星辰</td>
						<td class="apply-person-tel">15182839862</td>
						<td class="apply-activity-title">东辰御园小区清理卫生</td>
						<td class="apply-time">2018/6/18 18:44:23</td>
						<td class="apply-opreate">
							<button class="agree-btn" type="submit" onclick="agreeApply()">同意</button>
							<button class="disagrer-btn" type="submit" onclick="disaggreeApply()">不同意</button>
						</td>
					</tr>
					<tr class="apply-item">
						<td><input class="cb-item" id="checkItem" type="checkbox"></td>
						<td class="apply-person-name">余星辰</td>
						<td class="apply-person-tel">15182839862</td>
						<td class="apply-activity-title">东辰御园小区清理卫生</td>
						<td class="apply-time">2018/6/18 18:44:23</td>
						<td class="apply-opreate">
							<button class="agree-btn" type="submit" onclick="agreeApply()">同意</button>
							<button class="disagrer-btn" type="submit" onclick="disaggreeApply()">不同意</button>
						</td>
					</tr>
					<tr class="apply-item">
						<td><input class="cb-item" id="checkItem" type="checkbox"></td>
						<td class="apply-person-name">余星辰</td>
						<td class="apply-person-tel">15182839862</td>
						<td class="apply-activity-title">东辰御园小区清理卫生</td>
						<td class="apply-time">2018/6/18 18:44:23</td>
						<td class="apply-opreate">
							<button class="agree-btn" type="submit" onclick="agreeApply()">同意</button>
							<button class="disagrer-btn" type="submit" onclick="disaggreeApply()">不同意</button>
						</td>
					</tr>
					<tr class="apply-item">
						<td><input class="cb-item" id="checkItem" type="checkbox"></td>
						<td class="apply-person-name">余星辰</td>
						<td class="apply-person-tel">15182839862</td>
						<td class="apply-activity-title">东辰御园小区清理卫生</td>
						<td class="apply-time">2018/6/18 18:44:23</td>
						<td class="apply-opreate">
							<button class="agree-btn" type="submit" onclick="agreeApply()">同意</button>
							<button class="disagrer-btn" type="submit" onclick="disaggreeApply()">不同意</button>
						</td>
					</tr>
					<tr class="more-item-operate">
						<td class="apply-opreate" colspan="6">
							<button class="agree-btn" type="submit" onclick="agreeApply()">同意</button>
							<button class="disagrer-btn" type="submit" onclick="disaggreeApply()">不同意</button>
						</td>
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
			$("#checkAll").on('click', function() {
				$("input[class='cb-item']").prop("checked", this.checked);
			});

			$("input[class='cb-item']").on('click', function() {
				var ckItems = $("input[class='cb-item']");
				$("#checkAll").prop("checked", ckItems.length == ckItems.filter(":checked").length ? true : false);
			});
		</script>
	</body>

</html>