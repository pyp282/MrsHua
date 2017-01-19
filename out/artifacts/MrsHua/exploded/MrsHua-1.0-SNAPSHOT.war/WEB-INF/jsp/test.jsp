<%--
  Created by IntelliJ IDEA.
  User: pei
  Date: 2016/5/31
  Time: 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<h1>test</h1>
<table border="1">
    <c:forEach items="${users}" var="user" varStatus="vs">

        <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <td>${user.product.pid}</td>
        <td>${user.product.brand}</td>
        <td>${user.product.price}</td>
        <%--<td>${user.books}</td>--%>

        <c:forEach items="${user.books}" var="book" varStatus="vsBook">

                <td>${book.bid}</td>
                <td>${book.bookname}</td>
                <td>${book.bookauthor}</td>

        </c:forEach>

        </tr>

    </c:forEach>
</table>
</body>
</html>
