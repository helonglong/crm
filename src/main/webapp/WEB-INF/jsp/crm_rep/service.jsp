<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>xx</title>
  <%--jquery2.1--%>
  <script type="text/javascript" src="/static/js/jquery.min.js"></script>
  <%--layui框架css--%>
  <link rel="stylesheet" type="text/css" href="/static/layui/css/layui.css" media="all">
  <%--阿里巴巴icon图标库--%>
  <link rel="stylesheet" type="text/css" href="/static/css/font-icon.css" media="all">
  <link rel="stylesheet" type="text/css" href="/static/css/conn.css" media="all">

  <%--layui框架js--%>
  <script type="text/javascript" src="/static/layui/layui.js"></script>

</head>
<body style="overflow-x:hidden">
<!-- /头部导航 -->
<%--营销管理 > 客户开发计划 > 开发计划--%>
<header class="larry-personal-tit" >
    <span class="layui-breadcrumb">
        <a class="href" href="/content" target="content">首页</a>
        <a><cite>统计报表</cite></a>
        <a><cite>客户服务分析</cite></a>
    </span>
  <style>
    .con1{
      margin-top: 20px;
    }
    .content{
      margin-left: 20px;
      width: 96%;
    }
  </style>
</header>
<div class="layui-form-item con1">

  <div class="layui-inline">
    <label class="layui-form-label">年份：</label>
    <div class="layui-input-inline" style="width: 100px;">
      <select name="state" class="layui-input" lay-verify="">
        <option value="n">全部</option>
        <option value="n">2018</option>
        <option value="n">2017</option>
      </select>
    </div>
  </div>


  <div class="layui-inline" style="width: 50px;float: right;right: 30px">
    <button class="layui-btn">查询</button>
  </div>
</div>

<div class="content">
  <table class="layui-table" lay-even lay-skin="line">
    <tr>
      <td>编号</td>
      <td>条目</td>
      <td>服务数量</td>
    </tr>

    <tr>
      <td>1</td>
      <td>咨询</td>
      <td>323</td>
    </tr>
    <tr>
      <td>2</td>
      <td>建议</td>
      <td>23</td>
    </tr>

    <tr>
      <td>3</td>
      <td>投诉</td>
      <td>323</td>
    </tr>

  </table>

  <div id="page"></div>
</div>
<script type="text/javascript">
    $(function () {
        var form;
        var layer;
        var element;
        var laypage;
        var laydate;
        layui.use(['layer','form','laypage','element','laydate'],function(){
            form = layui.form,
                element=layui.element,
                layer=layui.layer,
                laypage=layui.laypage,
                laydate=layui.laydate;


          /*时间选择器*/
            laydate.render({
                elem: '#date_time'
                , type: 'date'
            });
            //执行一个laypage实例
            laypage.render({
                elem: 'page' //注意，这里的 test1 是 ID，不用加 # 号
                , limit: 5    //每页显示数据条数
                , count: 100
                , layout: ['prev', 'page', 'next', 'limit' , 'count' , 'skip' , 'refresh']
                , limits: [4, 5, 6, 7, 8, 9, 10]    //显示数据条数
                , first: '首页'
                , jump: function (obj, first) {

                }
            });
        });
        $(".cz1").hover(function(){
            layer.tips('明细',this);
        },function(){
            layer.close(layer.index);
        });

    })

</script>
</body>
</html>