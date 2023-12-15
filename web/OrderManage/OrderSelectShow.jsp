<%@ page import="main.bean.Order" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单查询显示</title>
</head>
<body bgcolor="CCCFFF">

<%
    List<Order> OrderList = (List<Order>) session.getAttribute("OrderList");
%>
<table border="2" bgcolor="CCCEEE" width="100%" align="center" style="margin: fill">
    <tr bgcolor="CCCCCC" align="center">
        <th>订单号</th>
        <th>地址</th>
        <th>用户名</th>
        <th>卖家名</th>
        <th>总价</th>
        <th colspan="3">操作</th>
    </tr>
    <%
        for (Order order : OrderList) {%>
    <tr>
        <td><%=order.getOrderId()%>
        </td>
        <td><%=order.getAddress()%>
        </td>
        <td><%=order.getBuy_customer()%>
        </td>
        <td><%=order.getSell_customer()%>
        </td>
        <td><%=order.getTotal()%>
        </td>
        <td><a href="${pageContext.request.contextPath}/OrderDeleteServlet?orderId=<%=order.getOrderId()%>">删除</a></td>
        <td>
            <a href="${pageContext.request.contextPath}/AddressOrderServlet?orderId=<%=order.getOrderId()%>&customerId=<%=session.getAttribute("customerId")%>">修改地址</a>
        </td>
        <td><a href="${pageContext.request.contextPath}/DetailSelectServlet?orderId=<%=order.getOrderId()%>">查看详细内容</a>
        </td>
    </tr>
    <%
        }%>
</table>
</body>
</html>
