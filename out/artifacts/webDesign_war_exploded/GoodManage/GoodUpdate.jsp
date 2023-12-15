<%@ page import="main.bean.Good" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    ArrayList goodList = (ArrayList) session.getAttribute("goodList");
    String n1 = request.getParameter("n");
    int n2 = Integer.parseInt(n1);
    Good good = (Good) goodList.get(n2);
%>

<form method="post" action="${pageContext.request.contextPath}/GoodUpdateServlet">
    <table border="1" bordercolor="blue" align="center">
        <tr>
            <td>商品号：<input name="gId" type="text" size="16" value="<%=good.getGoodId()%>" readonly="true"></td>
        </tr>
        <tr>
            <td>商家号：<input name="cId" type="text" size="16" value="<%=good.getCustomerId()%>" readonly="true"></td>
        </tr>
        <tr>
            <td>商品名：<input name="gName" type="text" size="16" value="<%=good.getGoodName()%>"></td>
        </tr>
        <tr>
            <td>商品描述：<input name="description" type="text" value="<%=good.getDescription()%>"></td>
        </tr>
        <tr>
            <td>商品价格：<input name="price" type="text" size="16" value="<%=good.getPrice()%>"></td>
        </tr>
        <tr>
            <td>商品分类：<input name="category" type="text" size="18" value="<%=good.getCategory()%>"></td>
        </tr>
        <tr>
            <td><input type=submit value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>

