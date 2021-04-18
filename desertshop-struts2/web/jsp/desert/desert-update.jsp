<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/5/5
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form name="desert-insert" action="desert-guide?type=desert-update" method="post">
    <input type="hidden" name="d_id" value="${desert.d_id}"/>
    甜品名称：
    <input type="text" name="d_name" value="${desert.d_name}"/><br/>
    甜品单价：
    <input type="text" name="d_price" value="${desert.d_price}"/><br/>
    甜品库存：
    <input type="text" name="d_number" value="${desert.d_number}"/><br/>
    <button type="submit">提交</button>
</form>
</body>
</html>
