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
        <a><cite>修改密码</cite></a>
    </span>
</header>
<section class="layui-larry-box">
	<div class="larry-personal">
		<div class="larry-personal-body clearfix changepwd">
			<form class="layui-form col-lg-4" method="post" action="">
			 	<div class="layui-form-item">
					<label class="layui-form-label">用户名</label>
					<div class="layui-input-block">  
					  	<input type="text" name="title"  autocomplete="off"  class="layui-input layui-disabled" value="admin" disabled="disabled" >
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">旧密码</label>
					<div class="layui-input-block">  
					  	<input type="password" name="title"  autocomplete="off"  class="layui-input" value="" placeholder="请输入旧密码">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">新密码</label>
					<div class="layui-input-block">  
					  	<input type="password" name="title"  autocomplete="off"  class="layui-input" value="" placeholder="请输入新密码">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">确认密码</label>
					<div class="layui-input-block">  
					  	<input type="password" name="title"  autocomplete="off"  class="layui-input" value="" placeholder="请输入确认新密码">
					</div>
				</div>
				<div class="layui-form-item change-submit">
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
	layui.use(['form','upload','element'],function(){
         window.form = layui.form(),
			 window.element=layui.element();
	});
</script>
</body>
</html>