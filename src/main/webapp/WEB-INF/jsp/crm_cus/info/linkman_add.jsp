<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>客户开发计划</title>
<link href="../../css/stylesheet.css" rel="stylesheet" type="text/css" />
<link href="../../css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../../js/javascript.js"></script>
</head>

<body>
<div style="padding:5px;">
  <div class="txt" style="padding-top:3px;" >当前位置：客户开发计划&nbsp;&gt;&nbsp;客户信息管理&nbsp;&gt;&nbsp;<a href="list.html">客户信息</a>&nbsp;&gt;&nbsp;联系人&nbsp;&gt;&nbsp;新建联系人
    <hr class="hr1" />
  </div>
  <div class="operation_button">
  	<a href="#" title="返回" onclick="back()">返回</a>
    <a href="#" title="保存" onclick="save('新建联系人','linkman.html')">保存</a>
  </div>
  <table border="0" cellpadding="0" cellspacing="0" class="table_show txt">
        <tr>
          <td width="100" align="center">客户编号：</td>
          <td width="200">KH071202001</td>
          <td width="100" align="center">客户名称：</td>
          <td width="200">聪海信息科技有限公司</td>
        </tr>
  </table>
  <div class="out_bg">
    <div class="in_bg">
      <table border="0" cellpadding="0" cellspacing="0" class="table_input txt">
        <tr>
          <td width="126">姓名</td>
          <td width="411"><input type="text" value="" /></td>
          <td width="126">性别</td>
          <td width="442"><input type="radio" name="gander" checked="checked" id="radio" />男<input type="radio" name="gander" id="radio" />女
</td>
        </tr>
        <tr>
          <td>职位</td>
          <td><input type="text" value="" /></td>
          <td>办公电话</td>
          <td><input type="text" value="" /></td>
        </tr>
        <tr>
          <td>手机</td>
          <td><input type="text" value="" /></td>
          <td>备注</td>
          <td><input type="text" value="" /></td>
        </tr>
      </table>
    </div>
  </div>
</div>
</body>
</html>
