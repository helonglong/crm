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
</head>
<body style="overflow-x:hidden">
<!-- /头部导航 -->
<%--营销管理 > 客户开发计划 > 开发计划--%>
<header class="larry-personal-tit">
    <span class="layui-breadcrumb">
        <a class="href" href="/content" target="content">首页</a>
        <a><cite>基础数据</cite></a>
        <a><cite> 查询库存</cite></a>
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
    <label class="layui-form-label">产品：</label>
    <div class="layui-input-inline" style="width: 150px;">
      <input type="text" id="prodName" name="prodName" placeholder="产品" autocomplete="off" class="layui-input">
    </div>
  </div>

  <div style="margin-left: -10px" class="layui-inline">
    <label class="layui-form-label">仓库：</label>
    <div class="layui-input-inline" style="width: 150px;">
      <input type="text" id="stkWarehouse" name="stkWarehouse" placeholder="仓库" autocomplete="off" class="layui-input">
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
                url: '/storage/selectAll' //数据接口
                ,
                method: "POST",
                page: {
                      limit: 5    //每页显示数据条数
                    , layout: ['prev', 'page', 'next', 'limit' , 'count' , 'skip' , 'refresh']
                    , limits: [5, 6, 7, 8, 9, 10]    //显示数据条数
                    , first: '首页'
                    , prev: '上一页'
                    , next: '下一页'
                    , groups: 5       //连续页码个数
                }
                ,
                title: "用户信息",
                id: "empId",
                cols: [
                    [ //表头
                        {
                            field: 'stkId',
                            sort: true,
                            width: 80,
                            title: 'ID',
                            align: 'center'
                        }, {
                        title: '商品名称',
                        width: 300,
                        templet: function(d){
                            return d.product.prodName+' '+d.product.prodType+' '+d.product.prodBatch;
                        }
                    }, {
                        field: 'stkWarehouse',
                        title: '仓库',
                    }, {
                        field: 'stkWare',
                        title: '货位',
                        align: 'center'
                    }, {
                        field: 'stkCount',
                        width: 80,
                        title: '件数',
                        sort: true,
                        align: 'center'
                    }, {
                        field: 'stkMemo',
                        title: '备注'
                    }
                    ]
                ],
                even: true,
                toolbar: true,
                defaultToolbar: ['filter', 'print', 'exports']
            });



          /*模糊搜索*/
            $("#chaxun").on("click", function () {
                var prodName = $("#prodName").val();
                var stkWarehouse =$("#stkWarehouse").val();

                tableIns.reload({
                    where: { //设定异步数据接口的额外参数，任意设
                        prodName: prodName,
                        stkWarehouse:stkWarehouse
                    }
                    , page: {
                        curr: 1 //重新从第 1 页开始
                        , limit: 5    //每页显示数据条数
                        , layout: ['prev', 'page', 'next', 'limit' , 'count' , 'skip' , 'refresh']
                        , limits: [5, 6, 7, 8, 9, 10]    //显示数据条数
                        , first: '首页'
                        , prev: '上一页'
                        , next: '下一页'
                        , groups: 5       //连续页码个数
                    }
                });


            });


        });
    });
</script>
</body>
</html>