<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/EmployeeInsertServlet">
    <table border="1" bordercolor="blue" align="center">

        <tr>
            <td>员工名：<input name="EmpName" type="text" size="16"></td>
        </tr>
        <tr>
            <td>性别：<input name="Gender" type="text" size="16"></td>
        </tr>
        <tr>
            <td>密码：<input name="password" type="text" size="16"></td>
        </tr>
        <tr>
            <td>角色名：
                <select name="roleName">
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

