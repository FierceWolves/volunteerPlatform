<%--
  Created by IntelliJ IDEA.
  User: r
  Date: 2018/10/29
  Time: 9:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><%pageContext.setAttribute("jspPath", request.getContextPath());%><%pageContext.setAttribute("staticPath", request.getContextPath() + "/static");%>
    <title>Title</title>
    <script rel="script" src="static/js/jquery-3.3.1.js"></script>
</head>
<body>
<script>
    window.location.href = '${jspPath}/site/home'
</script>
</body>
</html>
