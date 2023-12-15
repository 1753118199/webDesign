<%@ page import="main.bean.Detail" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>详单查询显示</title>
</head>
<body bgcolor="CCCFFF">
<%
    List<Detail> detailList = (List<Detail>) session.getAttribute("detailList");
%>
<table border="2" bgcolor="CCCEEE" width="100%" align="center" style="margin: fill">
    <tr bgcolor="CCCCCC" align="center">
        <th>详单名</th>
        <th>商品名</th>
        <th>商品描述</th>
        <th>数量</th>
        <th>单价</th>
        <th>总价</th>
        <th colspan="2">操作</th>
    </tr>
    <%
        for (Detail detail : detailList) {%>
    <tr>
        <td><%=detail.getDetailId()%>
        </td>
        <td><%=detail.getGoodName()%>
        </td>
        <td><%=detail.getDescription()%>
        </td>
        <td><%=detail.getAmount()%>
        </td>
        <td><%=detail.getPrice()%>
        </td>
        <td><%=detail.getTotal()%>
        </td>
        <td><a href="#">确认收货</a></td>
    </tr>
    <%
        }%>
</table>
</body>
</html>
