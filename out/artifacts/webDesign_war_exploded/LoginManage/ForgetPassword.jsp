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
        }

        .form input[type="text"],
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
    <script>
        function submitForm() {
            const account = document.getElementById("account").value;
            const phone = document.getElementById("phone").value;

            // 可以在这里进行账号和电话号码的验证

            if (account !== "" && phone !== "") {
                alert("将核对身份，验证成功密码重置为111");
            } else {
                alert("请填写完整的账号和电话号码");
            }
        }
    </script>

</head>
<body>
<div class="container">
    <form class="form" method="post" action="${pageContext.request.contextPath}/CustomerForgetPasswordServlet">
        账号：<input type="text" id="account" name="customerId" placeholder="请输入你的账号"><br>
        电话：<input type="text" id="phone" name="customerPhone" placeholder="请输入你的电话"><br>
        <input type="submit" value="提交" onclick="submitForm()" size="16">
    </form>
</div>
</body>
</html>
