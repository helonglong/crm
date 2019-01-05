<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 何龙
  Date: 2018/12/16
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ZH-cn">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
    <script src="/static/js/jquery.min.js"></script>
    <link rel="stylesheet" href="/static/layui/css/layui.css">
    <link rel="stylesheet" href="<c:url value="/static/css/login.css"/>">
</head>

<body>
<div class="kit-login">
    <div class="kit-login-bg"></div>
    <div class="kit-login-wapper">
        <h2 class="kit-login-slogan" style="color: #666888">欢迎使用 <br> CRM 1.0 后台管理模板</h2>
        <div class="kit-login-form">
            <h4 class="kit-login-title">登录</h4>
            <form class="layui-form" style="width: 240px">
                <div class="kit-login-row">
                    <div class="kit-login-col">
                        <i class="layui-icon">&#xe612;</i>
                        <span class="kit-login-input">
                            <input type="text" name="userName" lay-verify="required" placeholder="用户名" />
                        </span>
                    </div>
                    <div class="kit-login-col"></div>
                </div>
                <div class="kit-login-row">
                    <div class="kit-login-col">
                        <i class="layui-icon">&#xe64c;</i>
                        <span class="kit-login-input">
                            <input type="password" name="password" lay-verify="required" placeholder="密码" />
                        </span>
                    </div>
                    <div class="kit-login-col">
                    </div>
                </div>

                <div class="kit-login-row">
                    <div class="kit-login-col">
                        <i class="layui-icon">&#xe679;</i>
                        <span class="kit-login-input" style="width: 55%">
                            <input type="text" name="code" lay-verify="required" placeholder="图形验证码" />
                        </span>
                        <img src="<c:url value="/getCode"/>" id="getCode" width="100" height="30" style="cursor: pointer;z-index: 999">
                    </div>
                    <div class="kit-login-col"></div>
                </div>


                <div class="kit-login-row">
                    <div class="kit-login-col">
                        <input type="checkbox" name="rememberMe" value="true" title="记住帐号" lay-skin="primary">
                        <span id="errMsg" style="color: #d43f3a"></span>
                    </div>
                </div>
                <div class="kit-login-row">
                    <button class="layui-btn kit-login-btn" lay-submit="submit" lay-filter="login_hash">登录</button>
                </div>
            </form>
        </div>
    </div>
</div>

<script src="/static/js/polyfill.min.js"></script>
<script src="<c:url value="/static/layui/layui.js"/>"></script>
<script>
    $(function () {
        $("#getCode").on('click',function () {
            var d=new Date();
            var v=$(this).attr('src','/getCode?d='+d);
        });
    });
    layui.use(['layer', 'form'], function() {
        var form = layui.form,
            $ = layui.jquery;

        //监听提交
        form.on('submit(login_hash)', function(data) {

            var layIndex = layer.load(2, {
                shade: [0.1, '#393D49']
            });
            console.log(data.field);
            var url="/shiro/login";
            $.post(
                url,
                {
                    'name':data.field.userName,
                    'password':data.field.password,
                    'verificationCode':data.field.code
                },
                function (data) {
                    if(data.code==1){//验证成功
                        location.href = '/index.jsp';
                    }else if(data.code==0){//验证失败
                        layer.close(layer.index);//关闭遮罩层
                        /*显示错误信息*/
                        $("#errMsg").html(data.msg);
                        /*刷新验证码*/
                        var d=new Date();
                        $("#getCode").attr('src','/getCode?d='+d);
                    }
                }
            );
            return false;
        });
    });

</script>
</body>

</html>
