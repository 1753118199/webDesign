<%@ page import="main.bean.Employee" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="CCCFFF">

<br> <br> <br> <br> <br>
<%
    List<Employee> employeeList = (List<Employee>) session.getAttribute("employeeList");
%>

<table border="2" bgcolor="CCCEEE" width="100%" align="center">
    <tr bgcolor="CCCCCC" align="center">
        <th>员工号</th>
        <th>员工名</th>
        <th>性别</th>
        <th>密码</th>
        <th>角色名</th>
        <th>角色描述</th>
        <th colspan="3">操作</th>
    </tr>
    <%
        int i = 0;
        for (Employee employee : employeeList) {%>
    <tr>
        <td><%=employee.getEmpId()%>
        </td>
        <td><%=employee.getEmpName()%>
        </td>
        <td><%=employee.getEmpGender()%>
        </td>
        <td><%=employee.getEmpPassword()%>
        </td>
        <td><%=employee.getRoleName()%>
        </td>
        <td><%=employee.getRoleDescription()%>
        </td>

        <td><a href="EmployeeUpdate.jsp?n=<%=i%>">修改信息</a></td>
    </tr>
    <%
            i++;
        }%>
    <td><a href="./EmployeeInsert.jsp">添加员工</a></td>
</table>
</body>
</html>
