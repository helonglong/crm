<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>服务管理</title>
<link href="../css/stylesheet.css" rel="stylesheet" type="text/css" />
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/javascript.js"></script>
</head>

<body>
<div style="padding:5px;">
  <div class="txt" style="padding-top:3px;" >当前位置：客户服务管理&nbsp;&gt;&nbsp;<a href="feedback_list.html">服务反馈列表</a>&nbsp;&gt;&nbsp;服务反馈
    <hr class="hr1" />
  </div>
  <div class="operation_button">
  	<a href="#" title="返回" onclick="back()">返回</a>
    <a href="#" title="保存" onclick="save('保存','feedback_list.html');">保存</a>
  </div>
  <div class="out_bg">
    <div class="in_bg">
      <table border="0" cellpadding="0" cellspacing="0" class="table_input txt">
        <tr>
          <td width="126">编号</td>
          <td width="411">123</td>
          <td width="126">服务类型</td>
          <td width="442">咨询</td>
        </tr>
        <tr>
          <td>概要</td>
          <td colspan="3">询问公司倒闭时间</td>
        </tr>
        <tr>
          <td>客户</td>
          <td>太阳药业</td>
          <td>状态</td>
          <td>已分配</td>
        </tr>
        <tr>
          <td>服务请求</td>
          <td colspan="3">收音机订单运费如何承担？</td>
        </tr>
        <tr>
          <td>创建人</td>
          <td>小明</td>
          <td>创建时间</td>
          <td>2012-12-12</td>
        </tr>
        <tr>
          <td>分配给</td>
          <td>旺财</td>
          <td>分配时间</td>
          <td>2012-12-13</td>
        </tr>
        <tr>
          <td valign="top">服务处理</td>
          <td colspan="3">根据相关制度，7元/吨·公里以内由我们负责，之外由客户承担。</td>
        </tr>
        <tr>
          <td>处理人</td>
          <td><input type="text" value="旺财" disabled="disabled"/></td>
          <td>处理时间</td>
          <td><input type="text" value="2012-12-14" disabled="disabled"/></td>
        </tr>
        <tr>
          <td>处理结果</td>
          <td><input type="text" value="" /></td>
          <td>满意度</td>
          <td><select>
				<option>请选择...</option>
				<option>☆☆☆☆☆</option>
				<option>☆☆☆☆</option>
				<option>☆☆☆</option>
				<option>☆☆</option>
				<option>☆</option>
			</select></td>
        </tr>
      </table>
    </div>
  </div>
</div>
</body>
</html>
