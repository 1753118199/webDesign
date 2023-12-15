<%@ page import="main.bean.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList userList = (ArrayList) session.getAttribute("userList");
    String n1 = request.getParameter("n");
    int n2 = Integer.parseInt(n1);
    User user = (User) userList.get(n2);
%>

<form method="post" action="${pageContext.request.contextPath}/UserUpdateServlet">
    <table border="1" bordercolor="blue" align="center">
        <tr>
            <td>用户号：<input name="uId" type="text" size="16" value="<%=user.getUserId()%>" readonly="true"></td>
        </tr>
        <tr>
            <td>用户名：<input name="uName" type="text" size="16" value="<%=user.getUserName()%>" readonly="true"></td>
        </tr>
<%--        <tr>--%>
<%--            <td>密码：<input name="password" type="text" size="16" value="<%=user.getPassword()%>" readonly="true"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>角色：<input name="role" type="text" size="16" value="<%=user.getRole()%>"></td>--%>
<%--        </tr>--%>

        <td>角色：
            <select name="role">
                <option value="normal">普通用户</option>
                <option value="admin">管理员</option>
                <option value="service">客服</option>
                <!-- 根据需要添加更多角色 -->
            </select>
        </td>




        <tr>
            <td>电话号：<input name="uPhone" type="text" size="16" value="<%=user.getUserPhone()%>"readonly="true"></td>
        </tr>
        <tr>
            <td><input type=submit value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>

