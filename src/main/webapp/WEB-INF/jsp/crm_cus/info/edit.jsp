<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>客户开发计划</title>
<link href="../../css/stylesheet.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../../js/javascript.js"></script>
<style>
	body{ margin:0;
		  padding:0}
	.role{  margin:0px 30px 0px 0px; 
			float:left; }
	.right{
		display:none;
		}		
	.overflow{
		padding-left:30px;
		display:block;}	
</style>
<script type="text/javascript">
	function rightChange(id){
			var div = document.getElementById(id);
			div.className = "overflow";
		}
</script>
</head>

<body style="width:1366px">
<div style="padding:5px;">
  <div class="txt" style="padding-top:3px;" >当前位置：客户开发计划&nbsp;&gt;&nbsp;客户信息管理&nbsp;&gt;&nbsp;<a href="list.html">客户信息</a>&nbsp;&gt;&nbsp;编辑客户信息
    <hr class="hr1" />
  </div>
  <div class="operation_button"> <a href="#" title="返回" onclick="back()">返回</a> </div>
  <div class="out_bg">
    <div class="in_bg" style=" height:470px;">
     <div style="margin:100px 0px 0px 300px">
     	 <form method="post" action="">
         	<table border="0" cellpadding="0" cellspacing="0" class="table_input txt">
                <tr>
                  <td width="50" height="50">角色：</td>
                  <td>
                        <select name="role">
                            <option>--请选择--</option>
                            <option>BOSS</option>
                            <option>销售主管</option>
                            <option>客户经理</option>
                            <option>普通员工</option>
                            <option>客户信息管理员</option>
                        </select>
                  </td>
                </tr>
                <tr>
                  <td width="50" valign="top">权限:</td>
                  <td>
                        <div class="role">
                            <input name="parent" type="checkbox" value="营销管理" onclick="rightChange('sale')"/>营销管理
                            <div id="sale" class="right">
                                <input name="sal" type="checkbox" value="营销管理"/>销售机会管理<br />
                                <input name="sal" type="checkbox" value="营销管理"/>客户开发计划<br />                    
                            </div>
                        </div>
                        <div class="role">
                            <input name="parent" type="checkbox" value="营销管理" onclick="rightChange('cust')"/>客户管理
                            <div id="cust" class="right">
                                <input name="customer" type="checkbox" value="营销管理"/>客户信息管理<br />
                                <input name="customer" type="checkbox" value="营销管理"/>客户流失管理<br />
                            </div>
                        </div>
                        <div class="role">
                            <input name="parent" type="checkbox" value="营销管理"  onclick="rightChange('service')"/>服务管理
                            <div id="service" class="right">
                                <input name="services" type="checkbox" value="营销管理"/>服务创建<br />
                                <input name="services" type="checkbox" value="营销管理"/>服务分配<br />
                                <input name="services" type="checkbox" value="营销管理"/>服务处理<br />
                                <input name="services" type="checkbox" value="营销管理"/>服务反馈<br />
                                <input name="services" type="checkbox" value="营销管理"/>服务归档<br />
                            </div>
                        </div>
                        <div class="role">
                            <input name="parent" type="checkbox" value="营销管理"  onclick="rightChange('chart')"/>统计报表
                            <div id="chart" class="right">
                                <input name="charts" type="checkbox" value="营销管理"/>客户贡献分析<br />
                                <input name="charts" type="checkbox" value="营销管理"/>客户构成分析<br />
                                <input name="charts" type="checkbox" value="营销管理"/>客户服务分析<br />
                                <input name="charts" type="checkbox" value="营销管理"/>客户流失分析<br />
                            </div>
                        </div>
                        <div class="role">
                            <input name="parent" type="checkbox" value="营销管理"  onclick="rightChange('base')"/>基础数据
                            <div id="base" class="right">
                                <input name="bases" type="checkbox" value="营销管理"/>数据字典管理<br />
                                <input name="bases" type="checkbox" value="营销管理"/>查询产品信息<br />
                                <input name="bases" type="checkbox" value="营销管理"/>查询库存<br />
                            </div>
                        </div>
                        <div class="role">
                            <input name="parent" type="checkbox" value="营销管理"  onclick="rightChange('sys')"/>系统设置
                            <div id="sys" class="right">
                                <input name="system" type="checkbox" value="营销管理"/>权限管理<br />
                                <input name="system" type="checkbox" value="营销管理"/>日志管理<br />
                                <input name="system" type="checkbox" value="营销管理"/>用户信息管理<br />
                            </div>
                        </div>
                  </td>
                </tr>
          </table>
         </form>
     </div>
    </div>
  </div>
</div>
</body>
</html>
