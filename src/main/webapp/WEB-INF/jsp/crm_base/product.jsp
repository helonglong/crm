<%@ page contentType="text/html;charset=UTF-8" language="java" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <html>
  <head>
    <title>xx</title>
    <%--jquery2.1--%>
    <script type="text/javascript" src="/static/js/jquery.min.js"></script>
    <%--layui框架css--%>
    <link rel="stylesheet" type="text/css" href="/static/layui/css/layui.css" media="all">
    <%--bootstrap框架css--%>
    <%--<link rel="stylesheet" type="text/css" href="/static/bootstrap/css/bootstrap.css" media="all">--%>
    <%--阿里巴巴icon图标库--%>
    <link rel="stylesheet" type="text/css" href="/static/css/font-icon.css" media="all">
    <link rel="stylesheet" type="text/css" href="/static/css/conn.css" media="all">


    <%--bootstrap框架js--%>
    <%--<script type="text/javascript" src="/static/bootstrap/js/bootstrap.min.js"></script>--%>

  </head>
<body style="overflow-x:hidden">
<!-- /头部导航 -->
<%--营销管理 > 客户开发计划 > 开发计划--%>
<header class="larry-personal-tit">
    <span class="layui-breadcrumb">
        <a class="href" href="/content" target="content">首页</a>
        <a><cite>基础数据</cite></a>
        <a><cite>查询产品信息</cite></a>
    </span>
  <style>
    .con1 {
      margin-top: 20px;
    }

    .content {
      margin-left: 20px;
      width: 96%;
    }
  </style>
</header>
<div class="layui-form-item con1">
  <div class="layui-inline">
    <label class="layui-form-label">名称：</label>
    <div class="layui-input-inline" style="width: 150px;">
      <input type="text" id="prodName" name="prodName" placeholder="名称" autocomplete="off" class="layui-input">
    </div>
  </div>

  <div class="layui-inline">
    <label class="layui-form-label">型号：</label>
    <div class="layui-input-inline" style="width: 150px;">
      <input type="text" id="prodType" name="prodType" placeholder="型号" autocomplete="off" class="layui-input">
    </div>
  </div>


  <div class="layui-inline">
    <label class="layui-form-label">批次：</label>
    <div class="layui-input-inline" style="width: 150px;">
      <input type="text" id="prodBatch" name="prodBatch" placeholder="批次" class="layui-input">
    </div>
  </div>

  <div class="layui-inline" style="width: 50px;float: right;right: 30px">
    <button id="chaxun" class="layui-btn">查询</button>
  </div>
  <div class="layui-inline" style="width: 50px;float: right;margin-right: 50px">
    <button id="reset" onclick="chongzhi()"  class="layui-btn">重置</button>
    <script>
        function chongzhi() {
            var inputs=$("input");
            inputs.each(function(){
                $(this).val(""); //遍历得到的每一个jquery对象
            });
        }
    </script>
  </div>
</div>

<div class="content">

  <table id="list_table" lay-filter="list_table"></table>

</div>


<%--layui框架js--%>
<script type="text/javascript" src="/static/layui/layui.js"></script>
<script type="text/javascript">
    var form;
    var layer;
    var element;
    var laypage;
    var laydate;
    var table;
    var laytpl;
    var tableIns;//表格实例
    $(function () {
      layui.use(['layer', 'form', 'laypage', 'element', 'laydate', 'table', 'laytpl'], function () {
          form = layui.form,
              element = layui.element,
              layer = layui.layer,
              laypage = layui.laypage,
              laydate = layui.laydate,
              table = layui.table,
              laytpl = layui.laytpl;

        /*数据表格*/
          //第一个实例
          tableIns = table.render({
              elem: '#list_table',
              url: '/product/selectAll' //数据接口
              ,
              method: "POST",
              page: true
              ,
              title: "用户信息",
              id: "empId",
              limit: 5,
              cols: [
                  [ //表头
                      {
                          field: 'prodId',
                          sort: true,
                          width: 80,
                          title: 'ID',
                          align: 'center'
                      }, {
                      field: 'prodName',
                      title: '商品名称',
                  }, {
                      field: 'prodType',
                      title: '商品型号',
                  }, {
                      field: 'prodBatch',
                      title: '商品批次',
                      align: 'center'
                  }, {
                      field: 'prodUnit',
                      width: 80,
                      title: '单位',
                      align: 'center'
                  }, {
                      field: 'prodPrice',
                      sort: true,
                      title: '单价',
                      width: 120,
                      align: 'center'
                  }, {
                      field: 'prodMemo',
                      title: '备注'
                  }
                  ]
              ],
              even: true,
              page: {
                  limits: [5, 6, 7, 8, 9, 10]//分页条目
              },
              toolbar: true,
              defaultToolbar: ['filter', 'print', 'exports']
          });



        /*模糊搜索*/
          $("#chaxun").on("click", function () {
              var prodName = $("#prodName").val();
              var prodType =$("#prodType").val();
              var prodBatch = $("#prodBatch").val();

              tableIns.reload({
                  where: { //设定异步数据接口的额外参数，任意设
                      prodName: prodName,
                      prodType:prodType,
                      prodBatch:prodBatch
                  }
                  , page: {
                      curr: 1 //重新从第 1 页开始
                  }
              });


          });


      });
    });
</script>
</body>
</html>