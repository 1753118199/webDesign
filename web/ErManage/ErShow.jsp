<%@ page import="main.bean.Er" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="CCCFFF">

<br> <br> <br> <br> <br>
<%
    List<Er> erList = (List<Er>) session.getAttribute("erList");
%>

<table border="2" bgcolor="CCCEEE" width="100%" align="center">
    <tr bgcolor="CCCCCC" align="center">
        <th>员工名</th>
        <th>角色</th>
    </tr>
    <%
        for (Er er : erList) {%>
    <tr>

        <td><%=er.getEmpName()%>
        </td>
        <td><%=er.getRoleDescription()%>
        </td>

    </tr>
    <%
        }%>
</table>
</body>
</html>
