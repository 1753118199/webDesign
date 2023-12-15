<%@ page import="main.bean.Employee" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Employee> employeeList = (List<Employee>) session.getAttribute("employeeList");
    String n1 = request.getParameter("n");
    int n2 = Integer.parseInt(n1);
    Employee employee = employeeList.get(n2);
%>

<form method="post" action="${pageContext.request.contextPath}/EmployeeUpdateServlet">
    <table border="1" bordercolor="blue" align="center">
        <tr>
            <td>员工号：<input name="employeeId" type="text" size="16" value="<%=employee.getEmpId()%>" readonly="true">
            </td>
        </tr>
        <tr>
            <td>员工名：<input name="EmpName" type="text" size="16" value="<%=employee.getEmpName()%>"></td>
        </tr>
        <tr>
            <td>性别：<input name="Gender" type="text" size="16" value="<%=employee.getEmpGender()%>"></td>
        </tr>
        <tr>
            <td>角色id：<input name="roleId" type="text" size="16" value="<%=employee.getRoleId()%>" readonly></td>
        </tr>
        <tr>
            <td>密码：<input name="password" type="text" size="16" value="<%=employee.getEmpPassword()%>"></td>
        </tr>
        <tr>
            <td>角色名：
                <select name="rolename">
                    <option value="admin">管理员</option>
                    <option value="service">客服</option>
                </select>
            </td>
        </tr>

        <tr>
            <td><input type=submit value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>

