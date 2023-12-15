<%@ page import="main.bean.Address" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="CCCFFF">

<br> <br> <br> <br> <br>
<%
    List<Address> addressList = (List<Address>) session.getAttribute("addressList");
%>

<table border="2" bgcolor="CCCEEE" width="100%" align="center">
    <tr bgcolor="CCCCCC" align="center">
        <th>地址号</th>
        <th>用户号</th>
        <th>地址</th>
        <th colspan="2">操作</th>
    </tr>
    <%
        for (Address address : addressList) {%>
    <tr>
        <td><%=address.getAddressId()%>
        </td>
        <td><%=address.getCustomerId()%>
        </td>
        <td><%=address.getAddress()%>
        </td>
        <td>
            <a href="${pageContext.request.contextPath}/OrderAddressServlet?addressId=<%=address.getAddressId()%>&orderId=<%=session.getAttribute("orderId")%>">选择</a>
        </td>
    </tr>
    <%
        }%>
</table>
</body>
</html>
