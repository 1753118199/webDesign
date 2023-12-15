<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>二手交易平台</title>
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
        }

        .form input[type="text"] {
            margin: 10px 10px; /* 为输入框添加上下间距 */
        }

        .form input[type="password"] {
            margin: 10px 10px; /* 为输入框添加上下间距 */
        }

        .form input[type="submit"] {
            margin: 10px 20px; /* 为输入框添加上下间距 */
        }

        h3 {
            font-size: 24px; /* 调整标题大小 */
            text-align: center; /* 让标题居中显示 */
        }
    </style>
</head>
<body>
<div class="container">
    <form class="form" method="post" action="${pageContext.request.contextPath}/LoginServlet">
        <!-- 调整标题大小和居中显示 -->
        账号：<input type="text" name="customerId" placeholder="请输入你的账号"><br>
        密码：<input type="password" name="password" placeholder="请输入你的密码"><br>
        <input type="radio" name="role" value="admin"> 管理员
        <input type="radio" name="role" value="service"> 客服
        <input type="radio" name="role" value="customer" checked> 用户<br>
        <a href="LoginManage/ForgetPassword.jsp">忘记密码</a><br>
        <input type="submit" value="登录" size="16">
        <input type="submit" value="注册" formaction="LoginManage/Register.jsp" size="16">
    </form>
</div>
</body>
</html>
