<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/5/10
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>每周快讯</title>
    <style type="text/css">
        body {
            background: url(../images/week-index1.jpg);
            width: 100%;
            height: 100%;
            background-size: cover;
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

        .div0 {
            display: flex;
            justify-content: center;
        }

        p {
            font-size: large;
            color: darksalmon;
        }
    </style>
</head>
<body>
<div align="center">
    <table class="table0">
        <tr>
            <td>
                <a href="../index.jsp">
                    <img src="../images/logo.jpg" width="100px">
                </a>
            </td>
            <td>
                <a class="a0" id="" href="../weapon-guide?type=weapon-index">装备大全</a>
            </td>
            <td width="100px"></td>
            <td>
                <a class="a0" href="../views/sun-season.jsp">黎明赛季</a>
            </td>
            <td width="100px"></td>
            <td>
                <a class="a0" href="../views/week-news.jsp">每周快讯</a>
            </td>
            <td width="300px">
                <audio src="../images/main.mp3" controls="controls" autoplay="autoplay" loop="loop">
                    您的浏览器不支持
                </audio>
            </td>
            </td>
            <td><a class="a0" href="../manager-guide?type=manager-login-jsp">管理员登录</a></td>
        </tr>
    </table>
</div>

<div class="div0">
    <div>
        <p align="center">5月9日周报</p>
        <img src="../images/week-news.jpg" align="center" title="周报" width="400px"/>
    </div>
    &nbsp;&nbsp;
    <div>
        <p align="center">老九情报</p>
        <img src="../images/zuer.jpg" align="center" title="老九" width="800px"/>
    </div>

</div>

</body>
</html>
