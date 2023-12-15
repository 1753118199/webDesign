<%@ page import="main.bean.Customer" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="CCCFFF">

<br> <br> <br> <br> <br>
<%
    List<Customer> customerList = (List<Customer>) session.getAttribute("customerList");
%>

<table border="2" bgcolor="CCCEEE" width="100%" align="center">
    <tr bgcolor="CCCCCC" align="center">
        <th>用户号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>电话号</th>
        <th colspan="2">操作</th>
    </tr>
    <%
        for (Customer customer : customerList) {%>
    <tr>
        <td><%=customer.getCustomerId()%>
        </td>
        <td><%=customer.getCustomerName()%>
        </td>
        <td><%=customer.getPassword()%>
        </td>
        <td><%=customer.getCustomerPhone()%>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/CustomerWarningServlet?customerId=<%=customer.getCustomerId()%>">警告该账户</a>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/CustomerWarningOutServlet?customerId=<%=customer.getCustomerId()%>">解除警告</a>
        </td>
    </tr>
    <%
        }%>
</table>
</body>
</html>
