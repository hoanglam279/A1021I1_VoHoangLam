<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Brand</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Date Release</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="p" items="${products}">
        <tr>
        <td>${p.name}</td>
        <td>${p.brand}</td>
        <td>${p.price}</td>
        <td>${p.quantity}</td>
        <td>01/01/2002</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
