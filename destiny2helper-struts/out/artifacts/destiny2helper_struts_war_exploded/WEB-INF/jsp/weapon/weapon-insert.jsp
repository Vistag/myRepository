<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/5/3
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加装备信息</title>
    <style type="text/css">
        body {
            background: url(images/weapon-manager.jpg) no-repeat;
            width: 100%;
            height: 100%;
            background-size: cover;
            overflow: hidden;
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

        form {
            font-size: large;
            font-family: 幼圆;
            color: slateblue;
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

<br/><br/>

<div align="center">
    <form action="weapon-guide?type=weapon-insert" method="post">
        装备名称：
        <input type="text" name="w_name" placeholder="请输入装备名称"/><br/>
        装备页面：
        <input type="text" name="w_html" placeholder="请输入详情页地址"/><br/>
        装备图片地址：
        <input type="text" name="w_img" placeholder="请输入装备图片地址"/><br/>

        <button type="submit">提交</button>
    </form>
</div>

</body>
</html>
