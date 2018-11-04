<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>参与人员</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js"></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="activity-member-wrap">
			<div class="page-title">
				<h3>参与人员</h3>
			</div>
			<div class="member-left-wrap-activity member-warp">
				<div class="member-img-wrap-activity">
					<img class="activity-img" src="${staticPath}/images/orgDetail-bg.png" />
				</div>
				<div class="member-table-activity-wrap">
					<table class="member-table-activity">
						<tr class="content">
							<td class="table-title" colspan="2">活动简介</td>
						</tr>
						<tr class="activity-title">
							<td class="title">标题</td>
							<td class="data">东辰御园小区清理卫生</td>
						</tr>
						<tr class="content">
							<td class="title">地点</td>
							<td class="data">东辰御园(河北省张家口市下花园区新辰路)</td>
						</tr>
						<tr class="content">
							<td class="title">时间</td>
							<td class="data">2018/08/25-2018/08/25</td>
						</tr>
					</table>
				</div>
			</div>

			<div class="member-right-wrap-member member-warp">
				<div class="member-table-wrap-member">
					<table class="member-table">
						<tr class="table-title">
							<th class="item-col1">姓名</th>
							<th class="item-col2">电话</th>
						</tr>
						<tr class="item-row">
							<td class="item-col1">余星辰</td>
							<td class="item-col2">15182839862</td>
						</tr>
						<tr class="item-row">
							<td class="item-col1">余星辰</td>
							<td class="item-col2">15182839862</td>
						</tr>
						<tr class="item-row">
							<td class="item-col1">余星辰</td>
							<td class="item-col2">15182839862</td>
						</tr>
						<tr class="item-row">
							<td class="item-col1">余星辰</td>
							<td class="item-col2">15182839862</td>
						</tr>
						<tr class="item-row">
							<td class="item-col1">余星辰</td>
							<td class="item-col2">15182839862</td>
						</tr>
						<tr class="item-row">
							<td class="item-col1">余星辰</td>
							<td class="item-col2">15182839862</td>
						</tr>
						<tr class="item-row">
							<td class="item-col1">余星辰</td>
							<td class="item-col2">15182839862</td>
						</tr>
						<tr class="item-row">
							<td class="item-col1">余星辰</td>
							<td class="item-col2">15182839862</td>
						</tr>
						<tr class="item-row">
							<td class="item-col1">余星辰</td>
							<td class="item-col2">15182839862</td>
						</tr>
						<tr class="item-row">
							<td class="item-col1">余星辰</td>
							<td class="item-col2">15182839862</td>
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
		</div>
	</body>
</html>