<%--
  Created by IntelliJ IDEA.
  User: r
  Date: 2018/10/29
  Time: 7:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%pageContext.setAttribute("jspPath", request.getContextPath());%>
    <%pageContext.setAttribute("staticPath", request.getContextPath()+"/static");%>
    <title>错误</title>
<script src="${staticPath}/js/pageResource.js" type="text/javascript"></script>
</head>
<body>
	<input type="hidden" id="jspPath" value="${jspPath}">
	<input type="hidden" id="staticPath" value="${staticPath}">
    ${errorMsg}
</body>
</html>
