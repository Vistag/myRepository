<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/5/1
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>首页</title>
    <style type="text/css">
        body {
            background: url(images/index.jpg) no-repeat;
            width: 100%;
            height: 100%;
            background-size: cover;
            overflow: hidden;
        }

        #table0 {
            background-color: black;
            padding: 5px 10px;
            border: 1px;
            border-bottom-color: aqua;
            collapse: 2px;
            font-size: large;
            color: aliceblue;
        }

        a {
            color: aliceblue;
            text-decoration: none;
        }

        .div0 {
            display: flex;
            justify-content: center;
        }

    </style>
</head>
<body>

<div align="center">
    <table id="table0">
        <tr>
            <td>
                <a href="index.jsp">
                    <img src="images/logo.jpg" width="100px">
                </a>
            </td>
            <td>
                <a href="weapon-guide?type=weapon-index">装备大全</a>
            </td>
            <td width="100px"></td>
            <td>
                <a href="views/sun-season.jsp">黎明赛季</a>
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
            <td><a href="manager-guide?type=manager-login-jsp">管理员登录</a></td>
        </tr>
    </table>
</div>


<br/><br/>

<div class="div0">
    <div>
        <a href="weapon-guide?type=weapon-index">
            <img src="images/index-left.jpg" width="350px" title="装备大全"/>
        </a>
    </div>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <div>
        <a href="index.jsp">
            <img src="images/index-right.jpg" width="370px" height="480px" title="每周快讯"/>
        </a>
    </div>
</div>


</body>
</html>