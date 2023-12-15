<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        img {
            display: block;
            margin: auto;
        }

        button {
            text-align: center;
            display: block;
            margin: auto;
        }
    </style>
</head>

<body>
<form method="post" action="${pageContext.request.contextPath}/DetailDeleteServlet">
    <%
        String orderId = request.getParameter("orderId");
        String detailId = request.getParameter("detailId");
        session.setAttribute("orderId", orderId);
        session.setAttribute("detailId", detailId);
        session.setAttribute("uName", session.getAttribute("customer"));
    %>
    <img src="./pay.png" alt="your image" width="500" height="300">
    <input type="hidden" name="orderId" value="<%=session.getAttribute("orderId")%>">
    <input type="hidden" name="detailId" value="<%=session.getAttribute("detailId")%>">
    <input type="submit" name="uName" value="确认支付"
           style="text-align: center; display: block; margin: auto; margin-top: 5px">

</form>
</body>
</html>
