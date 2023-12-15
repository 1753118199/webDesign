<%--
  Created by IntelliJ IDEA.
  User: 泷心阁
  Date: 2023/12/5
  Time: 0:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/UserSelectAllServlet">
<%--    <input type="text" name="uName" value="<%= session.getAttribute("customer") %>"readonly>--%>
    <input type="submit" value="查看所有的用户">
</form>
</body>
</html>
