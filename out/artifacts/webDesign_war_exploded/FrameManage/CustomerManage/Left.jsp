<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        .dropdown {
            position: relative;
            display: inline-block;
            margin-right: 20px; /* 增加了右边距 */
            margin-top: 8px;
        }

        .dropbtn {
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            font-size: 16px;
            border: none;
            cursor: pointer;
        }

        .dropdown-content {
            display: none;
            position: absolute;
            background-color: #f9f9f9;
            min-width: 160px;
            box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
            z-index: 1;
        }

        .dropdown-content a {
            color: black;
            padding: 12px 16px;
            text-decoration: none;
            display: block;
        }

        .dropdown-content a:hover {
            background-color: #f1f1f1;
        }

        .dropdown:hover .dropdown-content {
            display: block;
        }

        /* 新增的样式 */
        .dropdown2-content {
            display: none;
            position: absolute;
            background-color: #f9f9f9;
            min-width: 160px;
            box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
            z-index: 1;
        }

        .dropdown2-content a {
            color: black;
            padding: 12px 16px;
            text-decoration: none;
            display: block;
        }

        .dropdown2-content a:hover {
            background-color: #f1f1f1;
        }

        .dropdown2:hover .dropdown2-content {
            display: block;
        }
    </style>
</head>
<body>
<div class="dropdown">
    <button class="dropbtn">信息管理</button>
    <div class="dropdown-content">
        <a href="${pageContext.request.contextPath}/CustomerSelectServlet?customerId=<%=session.getAttribute("customerId")%>"
           target="c-center">修改个人信息</a>
        <a href="${pageContext.request.contextPath}/AddressSelectServlet?customerId=<%= session.getAttribute("customerId") %>"
           target="c-center">地址管理</a>
    </div>
</div>

<div style="width: 20px; background-color: #f1f1f1"></div> <!-- 增加的空白元素 -->

<div class="dropdown">
    <button class="dropbtn">商品管理</button>
    <div class="dropdown-content">
        <a href="../../GoodManage/GoodAdd.jsp" target="c-center">添加商品</a>
        <a href="../../GoodManage/GoodSelect.jsp" target="c-center">查看商品</a>
        <a href="${pageContext.request.contextPath}/GoodSelectSelfServlet?select1=customerId&text1=<%=session.getAttribute("customerId")%>&relationship=AND&select2=customerId&text2=<%=session.getAttribute("customerId")%>"
           target="c-center">查看个人商品</a>
        <a href="${pageContext.request.contextPath}/CartSelectServlet?customerId=<%= session.getAttribute("customerId") %>"
           target="c-center">购物车</a>
    </div>
</div>

<div style="width: 20px; background-color: #f1f1f1"></div> <!-- 再次增加的空白元素 -->

<div class="dropdown">
    <button class="dropbtn">订单管理</button>
    <div class="dropdown-content">
        <a href="${pageContext.request.contextPath}/OrderSelectServlet?customerId=<%= session.getAttribute("customerId") %>"
           target="c-center">查看订单</a>
        <a href="${pageContext.request.contextPath}/DetailPayServlet?orderId=%25" target="c-center">查看个人订单</a>
    </div>
</div>
</body>
</html>
