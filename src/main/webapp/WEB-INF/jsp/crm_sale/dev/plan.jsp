<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>新建销售机会</title>
<link href="../../css/stylesheet.css" rel="stylesheet" type="text/css" />
<link href="../../css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../../js/javascript.js"></script>
</head>

<body>
<div style="padding:5px;">
  <div class="txt" style="padding-top:3px;" >当前位置：<a href="#">客户开发计划</a>&nbsp;&gt;&nbsp;<a href="#">制定计划</a>
    <hr class="hr1" />
  </div>
  <div class="operation_button">
  	<a href="#" title="返回" onclick="back()">返回</a>
    <a href="#" title="执行计划" onclick="add('opp_list.html');">执行计划</a>
  </div>
  <div class="out_bg">
    <div class="in_bg">
      <table border="0" cellpadding="0" cellspacing="0" class="table_input txt">
        <tr>
          <td width="126" height="50">编号</td>
          <td width="411"><input type="text" disabled="disabled" /></td>
          <td width="126">机会来源</td>
          <td width="442"><input type="text" /></td>
        </tr>
        <tr>
          <td height="50">客户名称</td>
          <td><input type="text" /></td>
          <td>成功几率</td>
          <td><input type="text" /></td>
        </tr>
        <tr>
          <td height="50">概要</td>
          <td><input type="text" /></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td height="50">联系人</td>
          <td><input type="text" /></td>
          <td>联系人电话</td>
          <td><input type="text" /></td>
        </tr>
        <tr style="padding:0px;">
          <td valign="top">机会描述</td>
          <td><textarea rows="6" cols="36" /></textarea></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td height="50">创建人</td>
          <td><input type="text" /></td>
          <td>创建时间</td>
          <td><input type="text" /></td>
        </tr>
        <tr>
          <td height="50">指派给</td>
          <td>
          	<select style="width:311px;height:30px;" disabled="disabled">
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
