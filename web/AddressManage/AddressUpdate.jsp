<%@ page import="main.bean.Address" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList addressList = (ArrayList) session.getAttribute("addressList");
    String n1 = request.getParameter("n");
    int n2 = Integer.parseInt(n1);
    Address address = (Address) addressList.get(n2);
%>
<form method="post" action="${pageContext.request.contextPath}/AddressUpdateServlet">
    <table border="1" bordercolor="blue" align="center">
        <tr>
            <td>地址号：<input name="aId" type="text" size="16" value="<%=address.getAddressId()%>" readonly="true">
            </td>
        </tr>
        <tr>
            <td>用户号：<input name="cId" type="text" size="16" value="<%=address.getCustomerId()%>" readonly="true"></td>
        </tr>
        <tr>
            <td>地址：<input name="address" type="text" size="16" value="<%=address.getAddress()%>"></td>
        </tr>
        <tr>
            <td><input type=submit value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>

