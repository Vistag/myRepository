<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/5/5
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>showstock</title>
</head>
<body>
<h1>甜品售卖</h1>
<h1><a href="desert-guide?type=desert-index">返回首页</a></h1>
<table width="100%" cellpadding="1">
    <tr>
        <td>甜品序号</td>
        <td>甜品名称</td>
        <td>甜品库存</td>
        <td>售卖</td>
    </tr>
    <c:forEach items="${list}" var="i">
        <tr>
            <td>${i.id}</td>
            <td>${i.name}</td>
            <td>${i.number}</td>
            <td><a href="sellStockAction?sid=${i.sid}">售卖</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
