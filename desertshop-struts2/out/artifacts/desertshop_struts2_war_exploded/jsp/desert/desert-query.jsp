<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/5/5
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询结果</title>
</head>
<body>
<table cellspacing="2" border="1" align="center">
    <thead>
    <tr>
        <th width="100px">甜品序号</th>
        <th width="100px">甜品名称</th>
        <th width="100px">甜品单价</th>
        <th width="100px">甜品库存</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${desert.d_id}</td>
        <td>${desert.d_name}</td>
        <td>${desert.d_price}</td>
        <td>${desert.d_number}</td>
    </tr>
    </tbody>
</table>
</body>
</body>
</html>
