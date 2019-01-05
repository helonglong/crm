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

  <%--layui框架js--%>
  <script type="text/javascript" src="/static/layui/layui.js"></script>
  <%--bootstrap框架js--%>
  <%--<script type="text/javascript" src="/static/bootstrap/js/bootstrap.min.js"></script>--%>

</head>
<body style="overflow-x:hidden">
<!-- /头部导航 -->
<%--首页/ 营销管理/ 营销机会管理/ 营销机会--%>
<header class="larry-personal-tit">
    <span class="layui-breadcrumb">
        <a class="href" href="/content" target="content">首页</a>
        <a><cite>客户开发计划</cite></a>
        <a><cite>客户流失管理</cite></a>
        <a><cite>流失信息</cite></a>
    </span>
  <style>
    .con1 {
      margin-top: 20px;
    }

    .content {
      margin-left: 20px;
      width: 96%;
    }
    .layui-table-cell .layui-form-checkbox[lay-skin="primary"] {
      top: 50%;
      transform: translateY(-50%);
    }
  </style>
</header>
<form class="layui-form layui-form-item con1">
  <div class="layui-inline">
    <label class="layui-form-label">客户名称：</label>
    <div class="layui-input-inline" style="width: 120px;">
      <input type="text" name="lstCustName" placeholder="客户名称" autocomplete="off" class="layui-input">
    </div>
  </div>

  <div class="layui-inline" style="margin-left: -30px">
    <label class="layui-form-label">客户经理：</label>
    <div class="layui-input-inline" style="width: 100px;">
      <select id="manager_select" name="lstCustManagerId" class="layui-input" lay-verify="">
        <option value="0">全部</option>
      </select>
    </div>
  </div>

  <div class="layui-inline" style="margin-left: -30px">
    <label class="layui-form-label">状态：</label>
    <div class="layui-input-inline" style="width: 100px;">
      <select id="state_select" name="lstStatus" class="layui-input" lay-verify="">
        <option value="0">全部</option>
      </select>
    </div>
  </div>


  <div class="layui-inline" style="width: 50px;float: right;margin-right: 38px">
    <button class="layui-btn" lay-submit lay-filter="select">查询</button>
  </div>
  <div class="layui-inline" style="width: 50px;float: right;margin-right: 20px">
    <button type="reset" class="layui-btn">重置</button>
  </div>
</form>

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
    var users_khjl;//客户经理
    var type_1;
    var type_2;
    var type_3;
    var type_4;
    $(function () {


        layui.use(['layer', 'form', 'laypage', 'element', 'laydate', 'table', 'laytpl'], function () {
            form = layui.form,
                element = layui.element,
                layer = layui.layer,
                laypage = layui.laypage,
                laydate = layui.laydate,
                table = layui.table,
                laytpl = layui.laytpl;


          /*异步加载所有客户经理*/
            var url1 = "/user/selectUser1";
            $.post(
                url1,
                function (data) {
                    users_khjl = data;
                  /*开始渲染select*/
                    for (var i = 0; i < data.length; i++) {
                        var option = '<option value="' + data[i].usrId + '">' + data[i].usrName + '</option>'
                        $("#manager_select").append(option);
                    }
                  /*重新渲染*/
                    form.render('select'); //刷新select选择框渲染
                }
            );
            /////////////////////////////////////////////////////////////////////
          /*异步加载客户流失状态*/
            var url1 = "/basDict/selectType";
            $.post(
                url1,
                {
                    'name': '客户流失状态'
                },
                function (data) {
                    type_2 = data;
                  /*开始渲染select*/
                    for (var i = 0; i < data.length; i++) {
                        var option = '<option value="' + data[i].dictValue + '">' + data[i].dictItem + '</option>'
                        $("#state_select").append(option);
                    }
                  /*重新渲染*/
                    form.render('select'); //刷新select选择框渲染
                }
            );



          /*监听按钮点击*/
            table.on('tool(list_table)', function (obj) { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
                // lay-filter="对应的值"
                var data = obj.data; // 获得当前行数据
                var layEvent = obj.event; // 获得 lay-event 对应的值findmanager（也可以是表头的 event 参数对应的值）
                var tr = obj.tr; // 获得当前行 tr 的DOM对象
              /*编辑*/
                if (layEvent == 1) {

                    layer.msg("暂缓流失");
                }

                if (layEvent == 2) {

                    layer.msg("确认流失");
                }



            });


            //监听查询按钮
            form.on('submit(select)', function (data) {
                tableIns.reload({
                    where: { //设定异步数据接口的额外参数，任意设
                        lstCustName: data.field.lstCustName,
                        lstCustManagerId: data.field.lstCustManagerId,
                        lstStatus: data.field.lstStatus
                    }
                    , page: {
                        curr: 1 //重新从第 1 页开始
                        , limit: 5    //每页显示数据条数
                        , layout: ['prev', 'page', 'next', 'limit', 'count', 'skip', 'refresh']
                        , limits: [5, 6, 7, 8, 9, 10]    //显示数据条数
                        , first: '首页'
                        , prev: '上一页'
                        , next: '下一页'
                        , groups: 5       //连续页码个数
                    }
                });
                return false;
            });


          /*数据表格*/
            //第一个实例
            tableIns = table.render({
                elem: '#list_table',
                url: '/cstLost/selectAll' //数据接口
                ,
                method: "POST",
                page: {
                    limit: 5    //每页显示数据条数
                    , layout: ['prev', 'page', 'next', 'limit', 'count', 'skip', 'refresh']
                    , limits: [5, 6, 7, 8, 9, 10]    //显示数据条数
                    , first: '首页'
                    , prev: '上一页'
                    , next: '下一页'
                    , groups: 5       //连续页码个数
                }
                ,
                title: "销售机会管理",
                id: "empId",
                limit: 5,
                cols: [
                    [ //表头

                        {
                            type: 'checkbox',
                            fixed: 'left'
                        },{
                        field: 'lstId',
                        sort: true,
                        width: 80,
                        title: '编号',
                        align: 'center'
                    }, {
                        field: 'lstCustName',
                        title: '客户名称',
                        edit: 'text',
                    }, {
                        field: 'lstCustManagerName',
                        title: '客户经理',
                        width: 80,
                        align: 'center'
                    }, {
                        field: 'lstLastOrderDate',
                        title: '上次下单时间',
                        align: 'center'
                    }, {
                        field: 'lstLostDate',
                        title: '确认流失时间',
                        align: 'center',
                    }, {
                        field: 'lstDelay',
                        title: '流失原因'
                    }, {
                        field: 'lstReason',
                        title: '暂缓措施'
                    },{
                        title: '状态',
                        templet: function (d) {
                            for(var i=0;i<type_2.length;i++){
                                if(d.lstStatus==type_2[i].dictValue){
                                    return type_2[i].dictItem;
                                }
                            }
                            return "预警";
                        }
                    },{
                        title: '操作',
                        align: 'center',
                        templet: function (d) {
                            if (d.lstStatus==1){

                                return '<span title="暂缓流失" style="cursor: pointer;color: #FFB800"> ' +
                                    '<i lay-event="1" class="iconfont icon-jiedianguanli"></i> ' +
                                    '</span> '+
                                    '<span title="确认流失" style="cursor: pointer;color: #FF5722"> ' +
                                    '<i lay-event="2" class="iconfont icon-jinggao"></i> ' +
                                    '</span> ';

                            }else if(d.lstStatus==2){
                                return '<span title="确认流失" style="cursor: pointer;color: #FF5722"> ' +
                                    '<i lay-event="2" class="iconfont icon-jinggao"></i> ' +
                                    '</span>';
                            }else{
                                return "";
                            }
                        }
                    }
                    ]
                ],
                even: true,
                toolbar: true,
                defaultToolbar: ['filter', 'print', 'exports'],
                done: function (res, curr, count) {
                    //如果是异步请求数据方式，res即为你接口返回的信息。
                    //如果是直接赋值的方式，res即为：{data: [], count: 99} data为当前页数据、count为数据总长度


                    table.on('edit(list_table)', function(obj){ //注：edit是固定事件名，test是table原始容器的属性 lay-filter="对应的值"
                        layer.msg(obj.value+obj.field); //得到修改后的值
                        return false;
                        console.log(obj.data); //所在行的所有相关数据
                    });
                }
            });





          /*刷新当前页*/
            function shuaxin(index) {
                tableIns.reload({
                    where: { //设定异步数据接口的额外参数，任意设
                    }
                    , page: {
                        curr: index //重新从第 1 页开始
                        , limit: 5    //每页显示数据条数
                        , layout: ['prev', 'page', 'next', 'limit', 'count', 'skip', 'refresh']
                        , limits: [5, 6, 7, 8, 9, 10]    //显示数据条数
                        , first: '首页'
                        , prev: '上一页'
                        , next: '下一页'
                        , groups: 5       //连续页码个数
                    }
                });
            }


        });

    });
</script>
</body>
</html>
