<%--
  Created by IntelliJ IDEA.
  User: zk
  Date: 2019-3-23
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<h2>用户登录</h2>
<form method="post" action="">
    <p>用户名:<input name="username"></p>
    <p>密码:<input type="password" name="pwd"></p>
    <p><input type="submit" value="登录"></p>
    <p style color=:red/>${msg}</p>
</form>
</body>
</html>
