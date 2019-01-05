<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>营销管理</title>
<link href="../../css/stylesheet.css" rel="stylesheet" type="text/css" />
<link href="../../css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../../js/javascript.js"></script>
</head>

<body>
<div style="padding:5px;">
  <div class="txt" style="padding-top:3px;" >当前位置：营销管理&nbsp;&gt;&nbsp;销售机会管理&nbsp;&gt;&nbsp;<a href="list.html">销售机会</a>&nbsp;&gt;&nbsp;指派销售机会
    <hr class="hr1" />
  </div>
  <div class="operation_button">
  	<a href="#" title="返回" onclick="back()">返回</a>
    <a href="#" title="保存" onclick="save('list.html');">保存</a>
  </div>
  <div class="out_bg">
    <div class="in_bg">
      <table border="0" cellpadding="0" cellspacing="0" class="table_input txt">
        <tr>
          <td width="126" height="50">编号</td>
          <td width="411">1</td>
          <td width="126">机会来源</td>
          <td width="442">路上碰见</td>
        </tr>
        <tr>
          <td height="50">客户名称</td>
          <td>睿智数码</td>
          <td>成功几率</td>
          <td>80%</td>
        </tr>
        <tr>
          <td height="50">概要</td>
          <td>这个客户很重要！</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td height="50">联系人</td>
          <td>时先生</td>
          <td>联系人电话</td>
          <td>15037715979</td>
        </tr>
        <tr style="padding:0px;">
          <td valign="top">机会描述</td>
          <td>三天内拿下！</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td height="50">创建人</td>
          <td>Mr.Shi</td>
          <td>创建时间</td>
          <td>2013-9-25</td>
        </tr>
        <tr>
          <td height="50">指派给</td>
          <td>
          	<select style="width:311px;height:30px;">
				<option>请选择...</option>
				<option>小明</option>
				<option>旺财</option>
				<option>球球</option>
				<option>孙小美</option>
				<option>周洁轮</option>
			</select>
           </td>
          <td>指派时间</td>
          <td><input type="text" disabled="disabled"/></td>
        </tr>
      </table>
    </div>
  </div>
</div>
</body>
</html>
