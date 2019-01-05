<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>后台管理系统</title>
    <link href="/static/css/font-icon.css" rel="stylesheet" type="text/css">
    <script src="/static/js/jquery.min.js"></script>
    <style>
        a{
            text-decoration:none;
            color: #BDBEC1;
        }
        body{
            margin: 0;
            padding: 0;
        }
        #top{
            margin: 0;
            padding: 0;
            background-color: #23262E;
            height: 50px;
            color: #ffffff;
            line-height: 50px;
        }
        #t1{
            font-size: 22px;
            margin-left: 20px;
            color: #BDBEC1;
        }
        #signOut{
            cursor: pointer;
            position: absolute;
            right: 40px;
            color: #999999;
        }
        #signOut a{
            color: #999999;
        }

        #signOut:hover{
            color: #fffbcc;
        }
        #signOut a:hover{
            color: #fffbcc;
        }

        #time1 {
            position: absolute;
            right: 190px;
            color: #BDBEC1;
        }
        #time2 {

        }
        #user1 {
            position: absolute;
            left: 540px;
            font-size: 18px;
            color: #BDBEC1;
        }
        #user2{

        }

    </style>
</head>
<body>
<div id="top">
    <span id="t1"><a href="/content" target="content">CRM客户关系管理系统</a></span>
    <span id="user1">账户名:
        <span id="user2">
            <shiro:principal property="usrName" />
        </span>
    </span>
<%--    <span id="time1">上次登录时间:
        <span id="time2">2018/11/25 22:30:00</span>
    </span>--%>

    <span id="signOut" title="退出登录">
        <i class="iconfont icon-tuichu"></i>&nbsp;退出
    </span>
</div>
<script>
    $("#signOut").on('click',function () {
        var url='/shiro/logout';
        $.get(
            url,
            function () {
                window.parent.open('/login.jsp','_self');
            }
        );
    });
</script>
</body>
</html>
