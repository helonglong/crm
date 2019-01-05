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
<body>
<div class="layui-fluid" style="margin-top: 70px">
	<div class="layui-row">
		<div class="layui-col-xs12">
			<div class="layui-row">
				<div class="layui-col-md4">&nbsp;</div>
				<div class="layui-col-md4">
					<div class="kit-exception">
						<i class="layui-icon kit-exception-icon"
						   style="line-height:26rem; font-size:26rem; color: #393D50;">&#xe69c;</i>
						<h3 class="kit-exception-title">403 抱歉，你无权访问该页面.</h3>
						<a href="javascript:history.back(-1);"
						   style="margin-top: 10px;margin-left: 80px"
						   class="layui-btn">返回上一页</a>
					</div>
				</div>
				<div class="layui-col-md4">&nbsp;</div>
			</div>
		</div>
	</div>
</div>
<script>
</script>
<style scoped>

</style>
</body>
</html>