<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/5/5
  Time: 9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录</title>

    <style type="text/css">
        body {
            background: url(images/index.jpg);
            width: 100%;
            height: 100%;
            background-size: cover;
            overflow: hidden;
        }

        form {
            font-size: large;
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

        p {
            font-family: 隶书;
            font-size: medium;
            color: aliceblue;
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
<br/><br/><br/><br/>

<div align="center">
    <form name="manager-login" action="manager-guide?type=manager-login" method="post">
        用户名：
        <input type="text" name="m_id" placeholder="id"/><br/>
        密&nbsp;&nbsp;码：
        <input type="text" name="m_password" placeholder="password"/><br/>
        <button id="sub1" type="submit">登录</button>
    </form>

    <p>
        还没有账号？
        <a class="a1" href="manager-guide?type=manager-insert-jsp">点击注册。。</a>
    </p>
</div>


</body>
</html>
