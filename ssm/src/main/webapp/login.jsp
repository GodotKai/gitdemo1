
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="commons/basePath.jsp"%>
    <title>Title</title>
</head>
<body>
    <h2>用户登录</h2>
    <form method="post" action="users/login">
        <p>用户名:<input name="username"></p>
        <p>密码:<input type="password" name="pwd"></p>
        <p><input type="submit" value="登录"></p>
        <p style="color: red">${msg}</p>
    </form>
</body>
</html>
