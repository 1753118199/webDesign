<%@ page import="main.bean.CategorySelect" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList categorySelectList = (ArrayList) session.getAttribute("categorySelectList");
    String n1 = request.getParameter("n");
    int n2 = Integer.parseInt(n1);
    CategorySelect category = (CategorySelect) categorySelectList.get(n2);
%>
<form method="post" action="${pageContext.request.contextPath}/CategoryInsertChildServlet">
    <table border="1" bordercolor="blue" align="center">
        <tr>
            <td>子类名：<input name="childName" type="text" size="16" value=""></td>
        </tr>
        <tr>
            <td>类别号：<input name="categoryId" type="text" size="16" value="<%= category.getCategoryId() %>"
                           readonly="true"></td>
        </tr>
        <tr>
            <td>类别名：<input name="categoryName" type="text" size="16" value="<%= category.getCategoryName() %>"
                           readonly="true"></td>
        </tr>
        <tr>
            <td><input type=submit value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>

