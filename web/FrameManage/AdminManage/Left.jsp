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
        <a href="${pageContext.request.contextPath}/CustomerSelectAllServlet?" target="a-center">查看所有消费者</a>
        <a href="${pageContext.request.contextPath}/EmployeeSelectAllServlet" target="a-center">查看所有员工</a>
        <a href="${pageContext.request.contextPath}/ERSelectServlet" target="a-center">查看角色表</a>
    </div>
</div>
<div style="width: 20px; background-color: #f1f1f1"></div> <!-- 增加的空白元素 -->

<div class="dropdown">
    <button class="dropbtn">商品管理</button>
    <div class="dropdown-content">
        <a href="../../GoodManage/GoodSelect.jsp" target="a-center">查看所有商品</a>
    </div>
</div>
</body>
</html>
