<%--
  Created by IntelliJ IDEA.
  User: pei
  Date: 2016/5/31
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>PERSONAL-INFO</title>
</head>
<body>
<table border="1" width="50%">
    <caption>${user.username}'s INFOMATION</caption>
    <tr>
        <td>ID</td>
        <td>USERNAME</td>
        <td>PASSWORD</td>
        <td>PRODUCT_ID</td>
        <td>PRODUCT_BRAND</td>
        <td>PRODUCT_PRICE</td>
        <td>USER_BOOKS</td>
    </tr>
    <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <td>${user.product.pid}</td>
        <td>${user.product.brand}</td>
        <td>${user.product.price}</td>
        <%--<td>${user.books}</td>--%>
        <td>
            <table border="1">
                <c:forEach items="${user.books}" var="book" varStatus="vsBook">
                    <tr>
                        <td>${book.bid}</td>
                        <td>${book.bookname}</td>
                        <td>${book.bookauthor}</td>
                    </tr>
                </c:forEach>
            </table>
        </td>
    </tr>
</table>
<h1>aaaaaaaaaaaaaaaaaa</h1>
</body>
</html>
