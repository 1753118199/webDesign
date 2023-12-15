<%@ page import="main.bean.GoodCategory" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品查询显示</title>
</head>
<body bgcolor="CCCFFF">

<%
    List<GoodCategory> goodsList = (List<GoodCategory>) session.getAttribute("goodList");
%>
<table border="2" bgcolor="CCCEEE" width="100%" align="center" style="margin: fill">
    <tr bgcolor="CCCCCC" align="center">
        <th>商品号</th>
        <th>商家号</th>
        <th>商品名</th>
        <th>描述</th>
        <th>单价</th>
        <th>分类</th>
        <th>分类</th>
        <th colspan="2">操作</th>
    </tr>
    <%
        for (GoodCategory good : goodsList) {%>
    <tr>
        <td><%=good.getGoodId()%>
        </td>
        <td><%=good.getCustomerId()%>
        </td>
        <td><%=good.getGoodName()%>
        </td>
        <td><%=good.getDescription()%>
        </td>
        <td><%=good.getPrice()%>
        </td>
        <td><%=good.getCategoryName()%>
        </td>
        <td><%=good.getUpCategoryName()%>
        </td>
        <%
            String role = (String) session.getAttribute("role");
            if (role.equals("customer")) {
        %>
        <td>
            <a href="${pageContext.request.contextPath}/CartInsertServlet?goodId=<%=good.getGoodId()%>&customerId=<%=(String)session.getAttribute("customerId")%>">加入购物车</a>
        </td>
        <%} else {%>
        <td><a href="${pageContext.request.contextPath}/GoodDeleteServlet?goodId=<%=good.getGoodId()%>">屏蔽</a></td>
        <%}%>
    </tr>
    <%
        }%>
</table>
</body>
</html>
