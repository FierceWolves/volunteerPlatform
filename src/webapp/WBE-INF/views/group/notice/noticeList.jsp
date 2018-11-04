<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>

	<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
		<meta charset="UTF-8">
		<title>通知列表</title>
		<link rel="stylesheet" href="${staticPath}/css/group.mainframe.css" />
		<script type="text/javascript" src="${staticPath}/js/jquery-3.3.1.js"></script>
	<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>

	<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
		<div class="notice-list-wrap">
			<h4>通知列表</h4>
			<div class="notice-table-wrap">
				<table class="notice-table" border="1">
					<form class="notice-form" id="noticeForm" action="${staticPath}/group/notice/noticeList.jsp" target="_self">
						<tr class="notice-title">
							<th><input class="cb-all" id="checkAll" type="checkbox"></th>
							<th class="notice-icon">
								<div class="icon-title"></div>
							</th>
							<th> 通知人</th>
							<th> 主题</th>
							<th> 时间</th>
						</tr>
						<tr class="notice-item">
							<td><input class="cb-item" id="checkItem" type="checkbox"></td>
							<td class="notice-icon">
								<div class="icon-unread"></div>
							</td>
							<td class="notice-person">余星辰</td>
							<td class="notice-theme">
								<div class="notice-theme-content">
									<u class="notice-title">东辰御园小区清理卫生</u>
									<b class="notice-content">&nbsp;-&nbsp;希望通过本次展览向观众揭示鲁迅艺术世界的精神层面，并与所城里社区图书馆合办——“你不曾了解的鲁迅” 历史文化讲堂主题活动。此次历史文化讲堂特邀鲁东大学教授、所城里社区图书馆馆长等学界大咖，来跟大家面对面地聊聊你不曾了解的鲁迅的多彩世界。</b>
								</div>
							</td>
							<td class="notice-time">2018/6/18 18:44:23</td>
						</tr>
						<tr class="notice-item">
							<td><input class="cb-item" id="checkItem" type="checkbox"></td>
							<td class="notice-icon">
								<div class="icon-unread"></div>
							</td>
							<td class="notice-person">余星辰</td>
							<td class="notice-theme">
								<div class="notice-theme-content">
									<u class="notice-title">东辰御园小区清理卫生</u>
									<b class="notice-content">&nbsp;-&nbsp;希望通过本次展览向观众揭示鲁迅艺术世界的精神层面，并与所城里社区图书馆合办——“你不曾了解的鲁迅” 历史文化讲堂主题活动。此次历史文化讲堂特邀鲁东大学教授、所城里社区图书馆馆长等学界大咖，来跟大家面对面地聊聊你不曾了解的鲁迅的多彩世界。</b>
								</div>

							</td>
							<td class="notice-time">2018/6/18 18:44:23</td>
						</tr>
						<tr class="notice-item">
							<td><input class="cb-item" id="checkItem" type="checkbox"></td>
							<td class="notice-icon">
								<div class="icon-unread"></div>
							</td>
							<td class="notice-person">余星辰</td>
							<td class="notice-theme">
								<div class="notice-theme-content">
									<u class="notice-title">东辰御园小区清理卫生</u>
									<b class="notice-content">&nbsp;-&nbsp;希望通过本次展览向观众揭示鲁迅艺术世界的精神层面，并与所城里社区图书馆合办——“你不曾了解的鲁迅” 历史文化讲堂主题活动。此次历史文化讲堂特邀鲁东大学教授、所城里社区图书馆馆长等学界大咖，来跟大家面对面地聊聊你不曾了解的鲁迅的多彩世界。</b>
								</div>
							</td>
							<td class="notice-time">2018/6/18 18:44:23</td>
						</tr>
						<tr class="notice-item">
							<td><input class="cb-item" id="checkItem" type="checkbox"></td>
							<td class="notice-icon">
								<div class="icon-unread"></div>
							</td>
							<td class="notice-person">余星辰</td>
							<td class="notice-theme">
								<div class="notice-theme-content">
									<u class="notice-title">东辰御园小区清理卫生</u>
									<b class="notice-content">&nbsp;-&nbsp;希望通过本次展览向观众揭示鲁迅艺术世界的精神层面，并与所城里社区图书馆合办——“你不曾了解的鲁迅” 历史文化讲堂主题活动。此次历史文化讲堂特邀鲁东大学教授、所城里社区图书馆馆长等学界大咖，来跟大家面对面地聊聊你不曾了解的鲁迅的多彩世界。</b>
								</div>
							</td>
							<td class="notice-time">2018/6/18 18:44:23</td>
						</tr>
						<tr class="notice-item">
							<td><input class="cb-item" id="checkItem" type="checkbox"></td>
							<td class="notice-icon">
								<div class="icon-read"></div>
							</td>
							<td class="notice-person">余星辰</td>
							<td class="notice-theme">
								<div class="notice-theme-content">
									<u class="notice-title">东辰御园小区清理卫生</u>
									<b class="notice-content">&nbsp;-&nbsp;希望通过本次展览向观众揭示鲁迅艺术世界的精神层面，并与所城里社区图书馆合办——“你不曾了解的鲁迅” 历史文化讲堂主题活动。此次历史文化讲堂特邀鲁东大学教授、所城里社区图书馆馆长等学界大咖，来跟大家面对面地聊聊你不曾了解的鲁迅的多彩世界。</b>
								</div>
							</td>
							<td class="notice-time">2018/6/18 18:44:23</td>
						</tr>
						<tr class="notice-item">
							<td><input class="cb-item" id="checkItem" type="checkbox"></td>
							<td class="notice-icon"><div class="icon-read"></div></td>
							<td class="notice-person">余星辰</td>
							<td class="notice-theme">
								<div class="notice-theme-content">
									<u class="notice-title">东辰御园小区清理卫生</u>
									<b class="notice-content">&nbsp;-&nbsp;希望通过本次展览向观众揭示鲁迅艺术世界的精神层面，并与所城里社区图书馆合办——“你不曾了解的鲁迅” 历史文化讲堂主题活动。此次历史文化讲堂特邀鲁东大学教授、所城里社区图书馆馆长等学界大咖，来跟大家面对面地聊聊你不曾了解的鲁迅的多彩世界。</b>
								</div>
							</td>
							<td class="notice-time">2018/6/18 18:44:23</td>
						</tr>
						<tr class="notice-item">
							<td><input class="cb-item" id="checkItem" type="checkbox"></td>
							<td class="notice-icon"><div class="icon-read"></div></td>
							<td class="notice-person">余星辰</td>
							<td class="notice-theme">
								<div class="notice-theme-content">
									<u class="notice-title">东辰御园小区清理卫生</u>
									<b class="notice-content">&nbsp;-&nbsp;希望通过本次展览向观众揭示鲁迅艺术世界的精神层面，并与所城里社区图书馆合办——“你不曾了解的鲁迅” 历史文化讲堂主题活动。此次历史文化讲堂特邀鲁东大学教授、所城里社区图书馆馆长等学界大咖，来跟大家面对面地聊聊你不曾了解的鲁迅的多彩世界。</b>
								</div>
							</td>
							<td class="notice-time">2018/6/18 18:44:23</td>
						</tr>
						<tr class="notice-item">
							<td><input class="cb-item" id="checkItem" type="checkbox"></td>
							<td class="notice-icon"><div class="icon-read"></div></td>
							<td class="notice-person">余星辰</td>
							<td class="notice-theme">
								<div class="notice-theme-content">
									<u class="notice-title">东辰御园小区清理卫生</u>
									<b class="notice-content">&nbsp;-&nbsp;希望通过本次展览向观众揭示鲁迅艺术世界的精神层面，并与所城里社区图书馆合办——“你不曾了解的鲁迅” 历史文化讲堂主题活动。此次历史文化讲堂特邀鲁东大学教授、所城里社区图书馆馆长等学界大咖，来跟大家面对面地聊聊你不曾了解的鲁迅的多彩世界。</b>
								</div>
							</td>
							<td class="notice-time">2018/6/18 18:44:23</td>
						</tr>
						<tr class="notice-item">
							<td><input class="cb-item" id="checkItem" type="checkbox"></td>
							<td class="notice-icon"><div class="icon-read"></div></td>
							<td class="notice-person">余星辰</td>
							<td class="notice-theme">
								<div class="notice-theme-content">
									<u class="notice-title">东辰御园小区清理卫生</u>
									<b class="notice-content">&nbsp;-&nbsp;希望通过本次展览向观众揭示鲁迅艺术世界的精神层面，并与所城里社区图书馆合办——“你不曾了解的鲁迅” 历史文化讲堂主题活动。此次历史文化讲堂特邀鲁东大学教授、所城里社区图书馆馆长等学界大咖，来跟大家面对面地聊聊你不曾了解的鲁迅的多彩世界。</b>
								</div>
							</td>
							<td class="notice-time">2018/6/18 18:44:23</td>
						</tr>
						<tr class="notice-item">
							<td><input class="cb-item" id="checkItem" type="checkbox"></td>
							<td class="notice-icon"><div class="icon-read"></div></td>
							<td class="notice-person">余星辰</td>
							<td class="notice-theme">
								<div class="notice-theme-content">
									<u class="notice-title">东辰御园小区清理卫生</u>
									<b class="notice-content">&nbsp;-&nbsp;希望通过本次展览向观众揭示鲁迅艺术世界的精神层面，并与所城里社区图书馆合办——“你不曾了解的鲁迅” 历史文化讲堂主题活动。此次历史文化讲堂特邀鲁东大学教授、所城里社区图书馆馆长等学界大咖，来跟大家面对面地聊聊你不曾了解的鲁迅的多彩世界。</b>
								</div>
							</td>
							<td class="notice-time">2018/6/18 18:44:23</td>
						</tr>
						<tr>
							<td colspan="5">
								<button type="submit" class="delete-notice" id="deleteNotices">删除</button>
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
			$("#checkAll").on('click', function() {
				$("input[class='cb-item']").prop("checked", this.checked);
			});

			$("input[class='cb-item']").on('click', function() {
				var ckItems = $("input[class='cb-item']");
				$("#checkAll").prop("checked", ckItems.length == ckItems.filter(":checked").length ? true : false);
			});

			$("td[class='notice-theme']").on('click', function() {
				$("#mainIframe", parent.document).attr('src', '<%=request.getContextPath()%>/group/notice/noticeDetail.jsp');
			})

			$("#deleteNotices").on('click', function() {
				var ckItems = $("input[class='cb-item']").filter(":checked");
				console.log('开始删除' + ckItems.length);
				if(ckItems.length > 0) {
					ckItems.each(function() {
						$(this).closest('tr').remove();
					})
					alert('删除成功');
					$("#noticeForm").submit();
				} else {
					alert('删除失败')
					return false;
				}
			})
		</script>

	</body>

</html>