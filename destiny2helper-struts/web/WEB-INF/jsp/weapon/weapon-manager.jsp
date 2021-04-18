<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/5/3
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>武器列表</title>
    <style type="text/css">
        body {
            background: url(images/weapon-manager.jpg);
            width: 100%;
            height: 100%;
            background-size: cover;
        }

        #table1 thead th {
            background-color: rgb(128, 102, 160);
            color: #ffffff;
            border-bottom-width: 0;
        }

        #table1 td {
            color: red;
        }

        #table1 tr, #table1 th {
            border-width: 1px;
            border-style: solid;
            border-color: rgb(128, 102, 160);
        }

        #table1 td, #table1 th {
            padding: 5px 10px;
            font-size: large;
            font-family: 幼圆;
            font-weight: bolder;
        }

        .table0 {
            background-color: black;
            border: 1px;
            border-bottom-color: aqua;
            collapse: 2px;
            font-size: large;
            color: aliceblue;
        }

        .a0 {
            color: aliceblue;
            text-decoration: none;
        }

        .a1 {
            color: crimson;
            font-size: large;
            text-decoration: none;
        }

        .div0 {
            display: flex;
            justify-content: center;
        }

        form {
            font-size: small;
            font-family: 幼圆;
            color: aliceblue;
        }

        input {
            font-family: 幼圆;
            font-size: larger;
        }

        button {
            background-color: #4CAF50;
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            font-size: 16px;
            cursor: pointer;
        }
    </style>
</head>
<body>
<div align="center">
    <table class="table0">
        <tr>
            <td>
                <a href="index.jsp">
                    <img src="images/logo.jpg" width="100px">
                </a>
            </td>
            <td>
                <a class="a0" id="" href="weapon-guide?type=weapon-index">装备大全</a>
            </td>
            <td width="100px"></td>
            <td>
                <a class="a0" href="views/sun-season.jsp">黎明赛季</a>
            </td>
            <td width="100px"></td>
            <td>
                <a class="a0" href="views/week-news.jsp">每周快讯</a>
            </td>
            <td width="300px">
                <audio src="images/main.mp3" controls="controls" autoplay="autoplay" loop="loop">
                    您的浏览器不支持
                </audio>
            </td>
            </td>
            <td><a class="a0" href="manager-guide?type=manager-login-jsp">管理员登录</a></td>
        </tr>
    </table>
</div>

<div class="div0">

    <div>
        <ul>
            <li>
                <a class="a1" href="weapon-guide?type=weapon-insert-jsp">添加装备</a>
            </li>
            <li>
                <form name="query-id" action="weapon-guide?type=weapon-query" method="post">
                    <font style="font-size: large;color: crimson">
                        查询装备
                    </font>
                    <br/>
                    <font style="font-size: small;color: crimson">
                        请输入id或名称
                    </font>
                    <br/>
                    <input type="text" name="w_id" placeholder="id"/><br/>
                    <input type="text" name="w_name" placeholder="name"/><br/>
                    <button type="submit">搜索</button>
                </form>
            </li>
        </ul>
    </div>

    <div>
        <table id="table1">
            <caption>destiny2装备列表</caption>
            <thead>
            <tr>
                <th>编号</th>
                <th>武器名称</th>
                <th>武器页面地址</th>
                <th>武器图片地址</th>
                <th>操作1</th>
                <th>操作2</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="w" items="${weaponList}">
                <tr>
                    <td>${w.w_id}</td>
                    <td>${w.w_name}</td>
                    <td>${w.w_html}</td>
                    <td>${w.w_img}</td>
                    <td><a href="weapon-guide?type=weapon-delete&id=${w.w_id}">删除</a></td>
                    <td><a href="weapon-guide?type=weapon-update-jsp&id=${w.w_id}">更新</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>


</body>
</html>
