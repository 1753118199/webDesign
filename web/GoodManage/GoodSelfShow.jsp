<%@ page import="main.bean.Good" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品查询显示</title>
</head>
<body bgcolor="CCCFFF">
<%
    List<Good> goodsList = (List<Good>) session.getAttribute("goodList");
%>
<table border="2" bgcolor="CCCEEE" width="100%" align="center" style="margin: fill">
    <tr bgcolor="CCCCCC" align="center">
        <th>商品号</th>
        <th>商家号</th>
        <th>商品名</th>
        <th>描述</th>
        <th>单价</th>
        <th>分类</th>
        <th>状态</th>
        <th colspan="2">操作</th>
    </tr>
    <%
        int i = 0;
        for (Good good : goodsList) {%>
    <tr>
        <td><%=good.getGoodId()%>
        </td>
        <td><%=good.getCustomerId()%>
        </td>
        <td><%=good.getGoodName()%>
        </td>
        <td><%=good.getDescription()%>
        </td>
        <td><%=good.getPrice()%>
        </td>
        <td><%=good.getCategory()%>
        </td>
        <%if (good.getGoodDelete().equals("2")) {%>
        <td>商品已屏蔽
        </td>
        <%} else {%>
        <td>正常
        </td>
        <%}%>
        <td><a href="GoodUpdate.jsp?n=<%=i%>">修改</a></td>
    </tr>
    <%
            i++;
        }%>
</table>
</body>
</html>
