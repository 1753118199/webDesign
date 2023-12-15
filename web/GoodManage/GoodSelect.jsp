<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/GoodSelectLikeServlet" method="post">
    <select id="select1" name="select1">
        <option value="goodId">商品号</option>
        <option value="customerId">商家号</option>
        <option value="goodName">商品名</option>
        <option value="description">商品描述</option>
        <option value="price">商品单价</option>
        <option value="category">商品分类</option>
    </select>
    <input type="text" name="text1">
    <input type="radio" id="and" name="relationship" value="AND">
    <label for="and">与</label>
    <input type="radio" id="or" name="relationship" value="OR" checked>
    <label for="or">或</label>
    <select id="select2" name="select2">
        <option value="goodId">商品号</option>
        <option value="customerId">商家号</option>
        <option value="goodName">商品名</option>
        <option value="description">商品描述</option>
        <option value="price">商品单价</option>
        <option value="category">商品分类</option>
    </select>
    <input type="text" name="text2">
    <input type="submit" value="提交">
</form>
</body>

</html>
