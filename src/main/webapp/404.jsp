<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="u" value="${pageContext.request.contextPath}"/>
<c:set var="url" value="${u}/jsp"/>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title></title>
	<meta name="renderer" content="webkit">	
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">	
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">	
	<meta name="apple-mobile-web-app-status-bar-style" content="black">	
	<meta name="apple-mobile-web-app-capable" content="yes">	
	<meta name="format-detection" content="telephone=no">	
	<link rel="stylesheet" type="text/css" href="${u}/static/layui/css/layui.css" media="all">
	<link rel="stylesheet" type="text/css" href="${u}/static/bootstrap/css/bootstrap.css" media="all">
	<link rel="stylesheet" type="text/css" href="${u}/static/css/global.css" media="all">
	<style>
		body{
			height: 530px;
			overflow: hidden;
		}
	</style>
</head>
<body class="childrenBody">
	<div style="text-align: center; padding:7% 0;">
		<i class="layui-icon" style="line-height:26rem; font-size:26rem; color: #393D50;"></i>
		<p style="font-size: 20px; font-weight: 300; color: #999;">我勒个去，页面被外星人挟持了!</p>
		<a href="javascript:history.back(-1);" class="layui-btn">返回上一页</a>
	</div>
</body>
</html>