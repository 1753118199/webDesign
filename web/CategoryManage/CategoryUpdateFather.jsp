<%@ page import="main.bean.Category" %>
<%@ page import="main.bean.CategorySelect" %>
<%@ page import="main.dao.CategoryDao" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
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
    CategoryDao categoryDao = new CategoryDao();
    ResultSet rs = categoryDao.categorySelectFirst();
    List<Category> categoryList = new ArrayList<>();
    while (rs.next()) {
        Category c = new Category();
        try {
            c.setCategoryId(rs.getString("categoryId"));
            c.setCategoryName(rs.getString("categoryName"));
            c.setUpId(rs.getString("upId"));
            categoryList.add(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
%>
<form method="post" action="${pageContext.request.contextPath}/CategoryUpdateFatherServlet">
    <table border="1" bordercolor="blue" align="center">
        <tr>
            <td>类别号：<input name="categoryId" type="text" size="16" value="<%=category.getCategoryId()%>"
                           readonly="true">
            </td>
        </tr>
        <tr>
            <td>类别名：<input name="categoryName" type="text" size="16" value="<%=category.getCategoryName()%>"
                           readonly="true"></td>
        </tr>
        <tr>
            <td>上级名：
                <select name="upId">
                    <% for (Category c : categoryList) { %>
                    <option value="<%= c.getCategoryId() %>"><%= c.getCategoryName() %>
                    </option>
                    <% } %>
                </select>
            </td>
        </tr>
        <tr>
            <td><input type=submit value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>

