<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .container {
            background-image: url("https://img2.baidu.com/it/u=2781766662,2036499380&fm=253&fmt=auto&app=120&f=JPEG?w=1280&h=800");
            background-size: cover;
            width: 100%;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .form {
            background-color: rgba(255, 255, 255, 0.7);
            padding: 20px;
            text-align: center; /* 让表单内内容居中显示 */
            width: 300px; /* 调整表单宽度 */
        }

        .form-row {
            display: flex;
            align-items: center;
            margin-bottom: 10px; /* 调整行之间的下边距 */
        }

        .form-label {
            width: 80px; /* 调整提示文字的宽度 */
            text-align: right; /* 让提示文字右对齐 */
            margin-right: 10px; /* 调整提示文字和输入框之间的右边距 */
        }

        .form-input {
            flex: 1; /* 让输入框填充剩余空间 */
            padding: 5px; /* 调整输入框的内边距 */
            width: 100%; /* 填充父容器的宽度 */
        }

        h3 {
            font-size: 24px; /* 调整标题大小 */
            text-align: center; /* 让标题居中显示 */
        }
    </style>
</head>
<body>
<div class="container">
    <form class="form" method="post" action="${pageContext.request.contextPath}/RegisterServlet">
        <!-- 调整标题大小和居中显示 -->

        <div class="form-row">
            <label for="uName" class="form-label">昵称：</label>
            <input type="text" name="customerName" class="form-input" id="uName" placeholder="请输入你的昵称">
        </div>
        <div class="form-row">
            <label for="password" class="form-label">密码：</label>
            <input type="password" name="password" class="form-input" id="password" placeholder="请输入你的密码">
        </div>
        <div class="form-row">
            <label for="address" class="form-label">地址：</label>
            <input type="text" name="address" class="form-input" id="address" placeholder="请输入你的地址">
        </div>
        <div class="form-row">
            <label for="uPhone" class="form-label">手机号：</label>
            <input type="text" name="customerPhone" class="form-input" id="uPhone" placeholder="请输入你的手机号">
        </div>
        <input type="submit" value="注册" size="16">
    </form>
</div>
</body>
</html>
