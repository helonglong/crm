<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>----</title>
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
<%--客户开发计划 > 客户信息管理 > 客户信息 > 交往记录--%>
<header class="larry-personal-tit">
    <span class="layui-breadcrumb">
        <a class="href" href="/content" target="content">首页</a>
        <a><cite>客户开发计划</cite></a>
        <a class="href" href="/crm_cus/info/list" target="content">客户信息管理</a>
        <a><cite>客户信息</cite></a>
        <a><cite>历史订单</cite></a>
    </span>
  <style>
    .con1 {
      margin-top: 20px;
    }

    .content {
      margin-left: 20px;
      width: 96%;
    }
    #bianji2{
      width: 400px;
      margin-top: 20px;
    }
    #bianji2 button{
      margin-left: 230px;
    }
    #bianji3 button{
      margin-left: 230px;
    }

    #bianji3{
      width: 400px;
      margin-top: 20px;
    }
    .layui-table-cell .layui-form-checkbox[lay-skin="primary"] {
      top: 50%;
      transform: translateY(-50%);
    }
  </style>
</header>
<div class=" con1" style="height: 60px;padding-left: 20px;padding-right: 23px">

  <div class="layui-inline" style="width: 50px;float: right;right: 30px;margin-top: 7px">
    <a href="/crm_cus/info/list">
      <button class="layui-btn" id="return">返回</button>
    </a>
  </div>
  <blockquote class="layui-elem-quote layui-quote-nm" style="color: #393D49">
    <h3><sapn  id="kehu_name"></sapn></h3>
  </blockquote>
</div>

<div class="content">

  <table id="list_table" lay-filter="list_table"></table>

</div>


<%--layui框架js--%>
<script type="text/javascript" src="/static/layui/layui.js"></script>
<script type="text/javascript">
    var CST_CUSTOMER_ID="${requestScope.id}";
    var CST_CUSTOMER;
    var form;
    var layer;
    var element;
    var laypage;
    var laydate;
    var table;
    var laytpl;
    var tableIns;//表格实例
    $(function () {
        var url="/orders/selectOne";
        $.post(
            url,
            {
                'id':CST_CUSTOMER_ID
            },
            function (data) {
                $("#kehu_name").html('编号:'+data.odrId+
                    '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+
                    '时间:'+data.odrDate+'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+
                    '送货地址:'+data.odrAddr+'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;' +
                    '总价钱:<span id="zongjia"></span>');
            }
        );

        layui.use(['layer', 'form', 'laypage', 'element', 'laydate', 'table','laytpl'], function () {
            form = layui.form,
                element = layui.element,
                layer = layui.layer,
                laypage = layui.laypage,
                laydate = layui.laydate,
                table = layui.table,
                laytpl = layui.laytpl;





          /*表格重载*/
            function table_cz(index) {
                tableIns.reload({
                    where: { //设定异步数据接口的额外参数，任意设
                    }
                    , page: {
                        curr: index
                    }
                });
            }


          /*数据表格*/
            //第一个实例
            tableIns = table.render({
                elem: '#list_table',
                url: '/ordersLine/selectAll' //数据接口
                ,
                method: "POST",
                where: {id: CST_CUSTOMER_ID},
                totalRow: true,//开启合计行
                page: {
                    limit: 5    //每页显示数据条数
                    , layout: ['prev', 'page', 'next', 'limit' , 'count' , 'skip' , 'refresh']
                    , limits: [5, 6, 7, 8, 9, 10]    //显示数据条数
                    , first: '首页'
                    , prev: '上一页'
                    , next: '下一页'
                    , groups: 5       //连续页码个数
                },
                title: "用户信息",
                id: "empId",
                cols: [
                    [ //表头
                        {
                            type: 'checkbox',
                            fixed: 'left'
                        },{
                            field:'ordersListId',
                            title:'ID',
                            width:80,
                            fixed: 'left',
                            unresize: true,
                            sort: true,
                            totalRowText: '合计'
                        },{
                            field: 'ordersListName',
                            title: '商品名称',
                            align: 'center'
                        }, {
                            field: 'ordersListPrice',
                            title: '单价',
                            align: 'center',
                            totalRow: true
                        },{
                            field: 'ordersListCompany',
                            title: '单位',
                            align: 'center'
                        },{
                            field: 'ordersListNumber',
                            title: '数量',
                            align: 'center',
                            totalRow: true
                        },{
                            field: 'ordersListTotalPrice',
                            title: '总价(元)',
                            align: 'center',
                            totalRow: true
                        },{
                        title: '操作',
                        width: 80,
                        align: 'center',
                            templet: function (d) {
                                return '<span lay-event="order_list" title="编辑" class="list_bianji" style="cursor: pointer;color: #5FB878"> ' +
                                    '<i class="iconfont icon-guanli1"></i> ' +
                                    '</span>' +
                                    '<span  lay-event="delete" title="删除" class="delete" style="cursor: pointer;color: #FF5722"> ' +
                                    '<i class="iconfont icon-shanchu"></i> ' +
                                    '</span>';
                        }
                    }
                    ]
                ],
                even: true,
                toolbar: true,
                defaultToolbar: ['filter', 'print', 'exports'],
                done: function(res, curr, count){
                    //如果是异步请求数据方式，res即为你接口返回的信息。
                    //如果是直接赋值的方式，res即为：{data: [], count: 99} data为当前页数据、count为数据总长度
                    console.log(res);
                    form.render(); //更新全部
                    $("#zongjia").html("￥"+parseInt(res.map.amountOfMoney));
                }

            });
          /*监听按钮点击*/
            table.on('tool(list_table)', function (obj) { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
                // lay-filter="对应的值"
                var data = obj.data; // 获得当前行数据
                var layEvent = obj.event; // 获得 lay-event 对应的值findmanager（也可以是表头的 event 参数对应的值）
                var tr = obj.tr; // 获得当前行 tr 的DOM对象

            });













            ////////////////////////////////////////////////////////////////////////
        });








    });


</script>


</body>
</html>
