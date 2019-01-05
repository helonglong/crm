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
  <div class="txt" style="padding-top:3px;" >当前位置：客户开发计划&nbsp;&gt;&nbsp;客户流失管理&nbsp;&gt;&nbsp;<a href="list.html">流失信息</a>&nbsp;&gt;&nbsp;暂缓流失
    <hr class="hr1" />
  </div>
  <div class="operation_button">
  	<a href="#" title="返回" onclick="back()">返回</a>
    <a href="#" title="确认流失" onclick="to('sure.html')">确认流失</a>
    <a href="#" title="保存" onclick="save('保存','list.html');">保存</a>
  </div>
  <div class="out_bg">
    <div class="in_bg">
      <table border="0" cellpadding="0" cellspacing="0" class="table_input txt">
        <tr>
          <td width="126">编号</td>
          <td width="411">1</td>
          <td width="126">客户</td>
          <td width="442">阳光实业</td>
        </tr>
        <tr>
          <td>客户经理</td>
          <td>球球</td>
          <td>上次下单时间</td>
          <td>2013-12-12</td>
        </tr>
        <tr>
          <td>暂缓措施</td>
          <td colspan="3">打电话给客户了解不再购买本公司产品的原因。
 发送新产品目录给客户。</td>
        </tr>
        <tr>
          <td valign="top">追加暂缓措施</td>
          <td><textarea rows="6" cols="36" /></textarea></td>
          <td></td>
          <td></td>
        </tr>
      </table>
    </div>
  </div>
</div>
</body>
</html>
