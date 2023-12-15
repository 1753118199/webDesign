<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加商品</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            text-align: center;
        }

        label {
            display: block;
            margin-top: 10px;
        }

        input[type="text"] {
            padding: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: inset 0 1px 2px rgba(0, 0, 0, .1);
            font-size: 14px;
            color: #333;
        }

        input[type="submit"] {
            padding: 10px;
            border: none;
            border-radius: 5px;
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #0069d9;
        }

        .sidebar {
            background-color: #f7f7f7;
            border: 1px solid #ccc;
            border-radius: 5px;
            padding: 10px;
            margin-left: 20px;
            width: 200px;
            height: 200px;
            overflow-y: auto;
        }

        .sidebar h3 {
            margin-top: 0;
        }

        .sidebar p {
            margin-bottom: 5px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>添加商品</h1>
    <form action="${pageContext.request.contextPath}/GoodInsertServlet" method="post">
        <label>顾客ID:
            <input type="text" name="customerId" value="<%=session.getAttribute("customerId")%>" readonly>
        </label>
        <label>商品名称:
            <input type="text" name="goodName" required>
        </label>
        <label>商品描述:
            <input type="text" name="description" required>
        </label>
        <label>商品价格:
            <input type="text" name="price" required>
        </label>
        <label>商品类别:
            <input type="text" name="category" required>
        </label>
        <br>
        <input type="submit" value="添加商品">
    </form>
</div>
<div class="sidebar">
    <h3>添加商品规则</h3>
    <p>1. 商品名称、描述、价格和类别均为必填项。</p>
    <p>2. 请确保填写的信息准确无误。</p>
    <p>3. 添加商品后将无法修改，请谨慎操作。</p>
    <p>4. 请不要添加违规产品。</p>
    <p>以下是分类号，请严格填写：</p>
    <p>1服装 2日用品 3数码产品 4图书 5上装 6手机</p>
    <p>7玩具 8手办 9平板 10运动器材 11家居用品 12内衣</p>
    <p>13女性用品 14化妆品 15裤子 17食品 18黑子玩具</p>
</div>
</body>
</html>
