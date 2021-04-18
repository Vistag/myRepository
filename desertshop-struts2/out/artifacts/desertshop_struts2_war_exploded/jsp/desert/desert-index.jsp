<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/5/5
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>甜品首页</title>
</head>
<body>
<h2>
    <a href="desert-guide?type=desert-insert-jsp">添加甜品信息</a>
</h2>
<h2>
    <a href="showStockAction">售卖甜品</a>
</h2>
<span style="font-size: 20px">
        <form name="desert-query" action="desert-guide?type=desert-query" method="post">
            请输入甜品编号或名称：<br/>
            <input type="text" name="d_id" placeholder="id"/><br/>
            <input type="text" name="d_name" placeholder="name"/><br/>
            <button type="submit">搜索</button>
        </form>
    </span>
<table cellspacing="2" border="1" align="center">
    <thead>
    <tr>
        <th width="100px">甜品序号</th>
        <th width="100px">甜品名称</th>
        <th width="100px">甜品单价</th>
        <th width="100px">甜品库存</th>
        <th width="50px">操作1</th>
        <th width="50px">操作2</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="d" items="${desertList}">
        <tr>
            <td>${d.d_id}</td>
            <td>${d.d_name}</td>
            <td>${d.d_price}</td>
            <td>${d.d_number}</td>
            <td>
                <a href="desert-guide?type=desert-delete&id=${d.d_id}">删除</a>
            </td>
            <td>
                <a href="desert-guide?type=desert-update-jsp&id=${d.d_id}">修改</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
