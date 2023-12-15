<%@ page import="main.bean.Customer" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList customerList = (ArrayList) session.getAttribute("customerList");
    String n1 = request.getParameter("n");
    int n2 = Integer.parseInt(n1);
    Customer customer = (Customer) customerList.get(n2);
%>

<form method="post" action="${pageContext.request.contextPath}/CustomerUpdateServlet">
    <table border="1" bordercolor="blue" align="center">
        <tr>
            <td>用户号：<input name="customerId" type="text" size="16" value="<%=customer.getCustomerId()%>"
                           readonly="true"></td>
        </tr>
        <tr>
            <td>用户名：<input name="customerName" type="text" size="16" value="<%=customer.getCustomerName()%>"></td>
        </tr>
        <tr>
            <td>密码：<input name="password" type="text" size="16" value="<%=customer.getPassword()%>"></td>
        </tr>
        <tr>
            <td>电话号：<input name="customerPhone" type="text" size="16" value="<%=customer.getCustomerPhone()%>"></td>
        </tr>
        <tr>
            <td><input type=submit value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>

