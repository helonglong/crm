<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>个人信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" type="text/css" href="/static/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="/static/bootstrap/css/bootstrap.css" media="all">
    <link rel="stylesheet" type="text/css" href="/static/css/global.css" media="all">
    <link rel="stylesheet" type="text/css" href="/static/css/personal.css" media="all">
</head>
<body>
<!-- /header -->
<header class="larry-personal-tit" >
    <span class="layui-breadcrumb">
        <a href="/content" target="content">首页</a>
        <a><cite>个人信息</cite></a>
    </span>
</header>
<section class="layui-larry-box">
    <div class="larry-personal">
        <div class="larry-personal-body clearfix">
            <form class="layui-form col-lg-5" action="" method="post">
                <div class="layui-form-item">
                    <label class="layui-form-label">用户名</label>
                    <div class="layui-input-block">
                        <input type="text" name="title" autocomplete="off" class="layui-input layui-disabled"
                               value="admin" disabled="disabled">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">所属角色</label>
                    <div class="layui-input-block">
                        <input type="text" name="username" autocomplete="off" class="layui-input layui-disabled"
                               value="超级管理员" disabled="disabled">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">真实姓名</label>
                    <div class="layui-input-block">
                        <input type="text" name="username" autocomplete="off" class="layui-input" value="何龙笼">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">手机号码</label>
                    <div class="layui-input-block">
                        <input type="text" name="username" autocomplete="off" class="layui-input" placeholder="输入手机号码">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">性别</label>
                    <div class="layui-input-block">
                        <input type="radio" name="sex" value="男" title="男" checked="">
                        <div class="layui-unselect layui-form-radio layui-form-radioed"><i
                                class="layui-anim layui-icon"></i><span>男</span></div>
                        <input type="radio" name="sex" value="女" title="女">
                        <div class="layui-unselect layui-form-radio"><i
                                class="layui-anim layui-icon"></i><span>女</span></div>
                    </div>
                </div>
                <%--<div class="layui-form-item">--%>
                <%--<label class="layui-form-label">修改头像</label>--%>
                <%--<div class="layui-input-block">--%>
                <%--<input type="file" name="file" class="layui-upload-file">--%>
                <%--</div>--%>
                <%--</div>--%>

                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">座右铭</label>
                    <div class="layui-input-block">
                        <textarea placeholder="既然选择了远方，便只顾风雨兼程；路漫漫其修远兮，吾将上下而求索" value=""
                                  class="layui-textarea"></textarea>
                    </div>
                </div>

                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</section>
<script type="text/javascript" src="/static/layui/layui.js"></script>
<script type="text/javascript">
//注意：导航 依赖 element 模块，否则无法进行功能性操作
    layui.use('element', function(){
        var element = layui.element;
    });
</script>
</body>
</html>