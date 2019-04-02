
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>
        员工列表
    </h2>
    <ul>
        <c:forEach items="${list}" var="emp">
            <li>${emp.ename}----${emp.dept.dname}</li>
        </c:forEach>
    </ul>
</body>
</html>
