<%@ page import="main.bean.CartSelect" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="CCCFFF">

<br> <br> <br> <br> <br>
<%
    List<CartSelect> cartList = (List<CartSelect>) session.getAttribute("cartList");
%>
<table border="2" bgcolor="CCCEEE" width="100%" align="center">
    <tr bgcolor="CCCCCC" align="center">
        <th>商品名</th>
        <th>商品描述</th>
        <th>商品单价</th>
        <th>商品分类</th>
        <th colspan="2">操作</th>
    </tr>
    <%
        for (CartSelect cart : cartList) {%>
    <tr>
        <td><%=cart.getGoodName()%>
        </td>
        <td><%=cart.getDescription()%>
        </td>
        <td><%=cart.getPrice()%>
        </td>
        <td><%=cart.getCategory()%>
        </td>
        <td><a href="${pageContext.request.contextPath}/CartDeleteServlet?cartId=<%=cart.getCartId()%>">删除</a></td>

        <td>
            <a href="${pageContext.request.contextPath}/OrderInsertServlet?goodId=<%=cart.getGoodId()%>&customerId=<%=session.getAttribute("customerId")%>&cartId=<%=cart.getCartId()%>">结算</a>
        </td>
    </tr>

    <%
        }%>
</table>
</body>
</html>
