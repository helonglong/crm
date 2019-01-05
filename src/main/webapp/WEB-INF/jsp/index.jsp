<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="u" value="${pageContext.request.contextPath}"/>
<c:set var="url" value="${u}/admin"/>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>后台管理系统</title>
<style>
    html{
        margin: 0;
        padding: 0;
    }
</style>
</head>
<frameset name="FrmAll" rows="50,*" frameborder="YES" border="0" framespacing="0">
    <frame src="/top" name="Title2" scrolling="NO" noresize>
    <frameset cols="200,*" name="Fset1" frameborder="YES" border="0" framespacing="0">
        <frame name="Menu1" scrolling="NO" src="/left" noresize>
        <frameset rows="*,40" name="Fset1" frameborder="YES" border="0" framespacing="0">
            <frame scrolling="YES" src="/content" name="content" noresize>
            <frame scrolling="NO" src="/tab-title" name="tab-title" noresize>
        </frameset>
    </frameset>
</frameset>
</html>