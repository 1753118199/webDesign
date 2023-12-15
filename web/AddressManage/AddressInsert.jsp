<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加地址</title>
    <style>
        form {
            margin: 20px;
            width: 600px;
        }

        label {
            display: block;
            margin-bottom: 10px;
        }

        input[type="text"] {
            width: 100%;
            padding: 5px;
            margin-bottom: 10px;
        }

        select {
            width: 100%;
            padding: 5px;
            margin-bottom: 10px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
        }
    </style>
</head>
<body>
<h1>添加地址</h1>
<form action="${pageContext.request.contextPath}/AddressInsertServlet" method="post">
    <label for="province">省份：</label>
    <select id="province" name="province" required>
        <option value="">请选择省份</option>
        <option value="江苏省">江苏省</option>
        <option value="浙江省">浙江省</option>
        <option value="广东省">广东省</option>
        <option value="福建省">福建省</option>
    </select>

    <label for="city">城市：</label>
    <select id="city" name="city" required>
        <option value="">请选择城市</option>
        <option value="南京市">南京市</option>
        <option value="苏州市">苏州市</option>
        <option value="杭州市">杭州市</option>
        <option value="广州市">广州市</option>
        <option value="深圳市">深圳市</option>
        <option value="福州市">福州市</option>
    </select>

    <label for="district">区县：</label>
    <select id="district" name="district" required>
        <option value="">请选择区县</option>
        <option value="玄武区">玄武区</option>
        <option value="秦淮区">秦淮区</option>
        <option value="姑苏区">姑苏区</option>
        <option value="拱墅区">拱墅区</option>
        <option value="上城区">上城区</option>
        <option value="下城区">下城区</option>
        <option value="荔湾区">荔湾区</option>
        <option value="越秀区">越秀区</option>
        <option value="海珠区">海珠区</option>
        <option value="福清市">福清市</option>
        <option value="福州市中区">福州市中区</option>
    </select>
    <input type="hidden" name="customerId" value="<%=session.getAttribute("customerId")%>">
    <label for="address">详细地址：</label>
    <input type="text" id="address" name="address" required>
    <input type="submit" value="提交">

</form>
</body>
</html>
