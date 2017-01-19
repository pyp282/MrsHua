<%--
  Created by IntelliJ IDEA.
  User: pei
  Date: 2016/5/30
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<form method="post">
<table border="1">
    <caption>ALL USERS</caption>
    <tr>
        <td colspan="2"><a href="#" onclick="deleteMore()">delete checked</a></td>
        <td colspan="4" align="right">
            <a href="/user/toinsert">to insert</a>
        </td>
    </tr>
    <tr>
        <td>ID</td>
        <td>CHECK</td>
        <td>USERNAME</td>
        <td>PASSWORD</td>
        <td>PRODUCT_ID</td>
        <td>OPTIONS</td>
    </tr>
    <c:forEach var="user" items="${users}" varStatus="vs">
        <tr>
            <td>${user.id}</td>
            <td><input type="checkbox" name="ids" value="${user.id}"></td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.productId}</td>
            <td>
                <a href="/wh/user/toupdate?id=${user.id}">update</a>
                <a href="/wh/user/delete?id=${user.id}">delete</a>
                <a href="/wh/user/userinfo?id=${user.id}">EDIT INFO</a>
            </td>
        </tr>
    </c:forEach>
</table>
</form>
<script>
    function deleteMore(){
       document.forms[0].action="/user/deleteMore";
        document.forms[0].submit();
    }

</script>
</body>
</html>
