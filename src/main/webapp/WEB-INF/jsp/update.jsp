<%--
  Created by IntelliJ IDEA.
  User: pei
  Date: 2016/5/31
  Time: 8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<form action="/wh/user/update" method="post">
    <input type="hidden" name="id" value="${user.id}">
    <input type="text" name="username" value="${user.username}"><br>
    <input type="text" name="password" value="${user.password}"><br>
    <input type="text" name="productId" value="${user.productId}"><br>
    <input type="submit" value="update this user">
</form>
</body>
</html>
