<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/CategoryInsertServlet">
    <table border="1" bordercolor="blue" align="center">
        <tr>
            <td>类别名：<input name="categoryName" type="text" size="16" value=""></td>
        </tr>
        <tr>
            <td><input type=submit value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>

