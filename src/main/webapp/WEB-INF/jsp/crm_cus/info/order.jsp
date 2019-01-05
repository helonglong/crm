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
      <button class="layui-btn" id="return"  >返回</button>
    </a>
  </div>
  <blockquote class="layui-elem-quote layui-quote-nm" style="text-align: center;color: #393D49">
    <h3>客户名称：<sapn  id="kehu_name"></sapn></h3>
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
        var url="/cstCustomer/selectId";
        $.post(
            url,
            {
                'id':CST_CUSTOMER_ID
            },
            function (data) {
                CST_CUSTOMER = data;
                $("#kehu_name").html(CST_CUSTOMER.custName);
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


            table.on('tool(list_table)', function(obj) {
                // lay-filter="对应的值"
                var data = obj.data; // 获得当前行数据
                var layEvent = obj.event; // 获得 lay-event 对应的值findmanager（也可以是表头的 event 参数对应的值）
                var tr = obj.tr; // 获得当前行 tr 的DOM对象

            })



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
                url: '/orders/selectAll' //数据接口
                ,
                method: "POST",
                where: {id: CST_CUSTOMER_ID},
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
                        title: '编号',
                        field: 'odrId',
                        width: 80,
                        align: 'center'
                    },{
                        field: 'odrDate',
                        title: '订单时间',
                        align: 'center'
                    }, {
                        field: 'odrAddr',
                        title: '送货地点',
                        align: 'center'
                    }, {
                        field: 'odrStatus',
                        title: '状态',
                        align: 'center',
                        templet: function (d) {
                            if(d.odrStatus=='a'){
                                return "已完成";
                            }else{
                                return "未付款";
                            }
                        }
                    },{
                        title: '操作',
                        width: 80,
                        align: 'center',
                        templet: function (d) {
                            return '<span lay-event="order_list" title="订单详细" class="list_bianji" style="cursor: pointer;color: #5FB878"> ' +
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
                }

            });

            /*监听按钮点击*/
            table.on('tool(list_table)', function (obj) { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
                // lay-filter="对应的值"
                var data = obj.data; // 获得当前行数据
                var layEvent = obj.event; // 获得 lay-event 对应的值findmanager（也可以是表头的 event 参数对应的值）
                var tr = obj.tr; // 获得当前行 tr 的DOM对象

                /*订单详细*/
                if(layEvent=='order_list'){
                    window.location.href = '../../ordersLine/list?id=' + data.odrId;
                }

            });




          /*模糊搜索*/




          /*插入数据*/
            $("#insert").on("click",function () {
              /*弹出插入框*/
                layer.open({
                    type: 1,
                    title: '增加信息',
                    area: ['400px', '360px'],//宽高
                    resize: false,//是或允许拉伸
                    content: '<form class="layui-form" id="bianji3">' +
                    /*类别*/
                    '<div class="layui-form-item"> ' +
                    '<label class="layui-form-label">类别</label> ' +
                    '<div class="layui-input-inline"> ' +
                    '<input type="text" name="dictType" lay-verify="required" placeholder="类别"  value="" autocomplete="off" class="layui-input"> ' +
                    '</div> ' +
                    '</div>'+
                    /*条目*/
                    '<div class="layui-form-item"> ' +
                    '<label class="layui-form-label">条目</label> ' +
                    '<div class="layui-input-inline"> ' +
                    '<input type="text" name="dictItem" lay-verify="required" placeholder="条目"  value="" autocomplete="off" class="layui-input"> ' +
                    '</div> ' +
                    '</div>'+
                    /*值*/
                    '<div class="layui-form-item"> ' +
                    '<label class="layui-form-label">值</label> ' +
                    '<div class="layui-input-inline"> ' +
                    '<input type="text" name="dictValue" lay-verify="required" placeholder="值"  value="" autocomplete="off" class="layui-input"> ' +
                    '</div> ' +
                    '</div>'+
                    /*是否可编辑*/
                    '<div class="layui-form-item"> ' +
                    '<label class="layui-form-label">是否可以编辑</label> ' +
                    '<div class="layui-input-inline"> ' +
                    '<select name="dictIsEditable">' +
                    '<option value="1">是</option> ' +
                    '<option value="0">否</option>' +
                    '</select>' +
                    '</div> ' +
                    '</div>'+
                    '<button lay-submit class="layui-btn" lay-filter="zj_tj">提交</button>'+
                    '</form>' //这里content是一个普通的String
                });
                form.render(); //更新全部



                //监听提交
                form.on('submit(zj_tj)', function(data){
                    layer.close(layer.index);//关闭弹窗
                  /*异步提交插入*/
                    var url='/basDict/insert';
                    $.post(
                        url,
                        data.field,
                        function () {
                            layer.msg("插入成功！");
                          /*重载表格到第一页*/
                            table_cz(1);
                        }
                    );
                    return false;
                });
            });




            ////////////////////////////////////////////////////////////////////////
        });








    });


</script>


</body>
</html>
