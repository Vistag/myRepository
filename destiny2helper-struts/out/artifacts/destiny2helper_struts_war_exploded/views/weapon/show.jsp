<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/5/5
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
    <style type="text/css">
        body {
            background: url(../../images/show-index.jpg) no-repeat;
            width: 100%;
            height: 100%;
            background-size: cover;
            overflow: hidden;
        }

        #table0 {
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

    </style>
</head>
<body>
<%
    String id = request.getParameter("html");
    System.out.println(id);
%>

<div align="center">
    <table id="table0">
        <tr>
            <td>
                <a href="index.jsp">
                    <img src="../../images/logo.jpg" width="100px">
                </a>
            </td>
            <td>
                <a class="a0" id="" href="../../weapon-guide?type=weapon-index">装备大全</a>
            </td>
            <td width="100px"></td>
            <td>
                <a class="a0" href="../../views/sun-season.jsp">黎明赛季</a>
            </td>
            <td width="100px"></td>
            <td>
                <a class="a0" href="../../views/week-news.jsp">每周快讯</a>
            </td>
            <td width="300px">
                <audio src="images/main.mp3" controls="controls" autoplay="autoplay" loop="loop">
                    您的浏览器不支持
                </audio>
            </td>
            <td>
                <a class="a0" href="../../manager-guide?type=manager-login-jsp">管理员登录</a>
            </td>
        </tr>
    </table>
</div>


<div align="center">
    <div>
        <img src="../../images/weapon/<%=id%>.png" title="装备图片" width="175x"/>
    </div>
    <div>
        <img src="../../images/weapon/<%=id%>-d.png" title="详情图片" width="400px"/>
    </div>
</div>


</body>
</html>
