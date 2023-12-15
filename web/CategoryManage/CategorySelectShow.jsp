<%@ page import="main.bean.CategorySelect" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body bgcolor="CCCFFF">
<br> <br> <br> <br> <br>
<%
    List<CategorySelect> categorySelectList = (List<CategorySelect>) session.getAttribute("categorySelectList");
%>

<table border="2" bgcolor="CCCEEE" width="100%" align="center">
    <tr bgcolor="CCCCCC" align="center">
        <th>类别号</th>
        <th>类别名</th>
        <th>上级号</th>
        <th>上级名</th>
        <th colspan="4">操作</th>
    </tr>
    <%
        int i = 0;
        for (CategorySelect c : categorySelectList) {%>
    <tr>
        <td><%=c.getCategoryId()%>
        </td>
        <td><%=c.getCategoryName()%>
        </td>
        <td><%=c.getUpId()%>
        </td>
        <td><%=c.getUpName()%>
        </td>
        <td><a href="CategoryUpdate.jsp?n=<%=i%>">编辑</a></td>
        <td><a href="CategoryUpdateFather.jsp?n=<%=i%>">编辑父类</a></td>
        <td><a href="CategoryInsertChild.jsp?n=<%=i%>">添加子类</a></td>
        <td><a href="${pageContext.request.contextPath}/CategoryDeleteServlet?categoryId=<%=c.getCategoryId()%>">删除</a>
        </td>
    </tr>
    <%
            i++;
        }%>
    <td><a href="CategoryInsert.jsp">添加大类</a></td>
</table>
</body>
</html>
