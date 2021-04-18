<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/5/4
  Time: 18:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>装备查询页面</title>
    <style type="text/css">
        body {
            background: url(images/query-index.jpg);
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
            color: black;
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
            text-decoration: none;
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

<div align="center">
    <table id="table1">
        <caption>查询结果</caption>
        <thead>
        <tr>
            <th>编号</th>
            <th>图片</th>
            <th>名称</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td align="center" style="color: crimson; width: 100px;">${weapon.w_id}</td>
            <td>
                <img src="images/weapon/${weapon.w_img}.png" title="武器图片" width="150px"/>
            </td>
            <td width="200px">${weapon.w_name}</td>
            <td>
                <a class="a1" href="views/weapon/show.jsp?html=${weapon.w_html}">详情</a>
            </td>
        </tr>
        </tbody>
    </table>
</div>

</body>
</html>
