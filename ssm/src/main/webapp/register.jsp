<%--
  Created by IntelliJ IDEA.
  User: fulia
  Date: 2019/3/25
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="commons/basePath.jsp"%>
    <title>用户注册</title>
</head>
<body>
    <form>
        <p>用户名<input name="username" id="username">
        <span id="msg"></span>
        </p>
        <p>密码<input type="password" name="pwd"></p>
    </form>
    <hr>
    <p>用户编号:<input id="userid">
        <input type="button" value="查询" id="btn1">
    </p>
    <form>
        <p>用户名<input id="username1"></p>
    </form>
    <script>
        $(()=>{
            $("#username").blur(()=>{
                $.ajax({
                    url:"users/checkname",
                    data:{username:$("#username").val()},
                    success:function(data){
                        $("#msg").text(data)
                    }
                })
            })

            $("#btn1").click(()=>{
                $.ajax({
                    url:"users/findById",
                    data:{userid:$("#userid").val()},
                    dataType:"json",
                    success:(data)=>{
                        $("#username1").val(data.username)
                    }
                })
            })

        })
    </script>
</body>
</html>
