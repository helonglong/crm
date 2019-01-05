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
<%--营销管理 > 客户开发计划 > 开发计划--%>
<header class="larry-personal-tit">
    <span class="layui-breadcrumb">
        <a class="href" href="/content" target="content">首页</a>
        <a><cite>营销管理</cite></a>
        <a><cite>客户开发计划</cite></a>
        <a><cite>开发计划</cite></a>
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



<form class="layui-form layui-form-item con1">
    <div class="layui-inline">
        <label class="layui-form-label">客户名称：</label>
        <div class="layui-input-inline" style="width: 200px;">
            <input type="text" name="chcCustName" placeholder="客户名称" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div style="margin-left: -30px" class="layui-inline">
        <label class="layui-form-label">联系人：</label>
        <div class="layui-input-inline" style="width: 200px;">
            <input type="text" name="chcLinkman" placeholder="联系人" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div></div>
    <div  class="layui-inline">
        <label class="layui-form-label">分配时间：</label>
        <div class="layui-input-inline" style="width: 200px;">
            <input  type="text" id="d1" name="d1"  placeholder="起始时间" class="layui-input">
        </div>
        <div class="layui-form-mid">-</div>
        <div class="layui-input-inline" style="width: 200px;">
            <input  type="text" id="d2" name="d2"  placeholder="截止时间" class="layui-input">
        </div>
    </div>
    <div style="margin-left: -30px" class="layui-inline">
        <label class="layui-form-label">状态：</label>
        <div class="layui-input-inline" style="width: 150px;">
            <select name="chcStatus">
                <option value="0">请选择</option>
                <option value="2">未开发</option>
                <option value="3">开发中</option>
                <option value="4">开发成功</option>
                <option value="5">开发失败</option>
            </select>
        </div>
    </div>

    <div class="layui-inline" style="width: 150px;float: right;right: 0px">
        <button type="reset" class="layui-btn">重置</button>
        <button style="margin-left: -3px" class="layui-btn" lay-submit lay-filter="chaxun">查询</button>
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
    var users;
    var user_moban;
    $(function () {
        /*异步加载所有客户经理*/



        layui.use(['layer', 'form', 'laypage', 'element', 'laydate', 'table', 'laytpl'], function () {
            form = layui.form,
                element = layui.element,
                layer = layui.layer,
                laypage = layui.laypage,
                laydate = layui.laydate,
                table = layui.table,
                laytpl = layui.laytpl;

            /*监听按钮点击*/
            table.on('tool(list_table)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
                // lay-filter="对应的值"
                var data = obj.data; // 获得当前行数据
                var layEvent = obj.event; // 获得 lay-event 对应的值findmanager（也可以是表头的 event 参数对应的值）
                var tr = obj.tr; // 获得当前行 tr 的DOM对象
                /*制定计划*/
                if(layEvent=="formulate"){
                    layer.open({
                        type: 1,
                        title: ['制订计划', 'font-size:18px;'],
                        area: ['400px', '300px'],//宽高
                        resize: false,//是或允许拉伸
                        content: '<div style="margin: 20px;width: 360px">' +
                        '<h2>详细计划内容</h2>'+
                        '<form style="margin-top: 20px" class="layui-form">' +
                        '<input type="hidden" name="id" value="'+data.chcId+'" >'+
                        '<textarea name="text" required lay-verify="required" placeholder="请输入" class="layui-textarea"></textarea>' +
                        '<button  style="float: right;margin-top: 20px;" class="layui-inline layui-btn" lay-submit lay-filter="tj">立即提交</button>'+
                        '<button style="float: right;margin-top: 20px;margin-right: 2px" type="reset" class="layui-inline layui-btn">重置</button>'+
                        '</form>'+
                        '</div>'
                    });



                }

                /*执行计划*/
                if(layEvent=="implement"){
                    layer.open({
                        type: 1,
                        title: ['执行计划', 'font-size:18px;'],
                        area: ['400px', '360px'],//宽高
                        resize: false,//是或允许拉伸
                        content: '<div style="margin: 20px;width: 360px">' +
                        '<form style="margin-top: 20px" class="layui-form">' +
                        '<h2 style="display: block;margin-bottom: 10px">状态</h2>'+
                        '<select  style="margin-top: 10px" name="sates" lay-verify="required">' +
                        '<option value="4">开发成功</option>' +
                        '<option value="5">开发失败</option>' +
                        '</select>'+
                        '<h2 style="margin-top: 20px;display: block;margin-bottom: 10px">计划结果</h2>'+
                        '<input type="hidden" name="id" value="'+data.chcId+'" >'+
                        '<textarea  name="text" required lay-verify="required" placeholder="请输入" class="layui-textarea"></textarea>' +
                        '<button  style="float: right;margin-top: 20px;" class="layui-inline layui-btn" lay-submit lay-filter="tj2">立即提交</button>'+
                        '<button style="float: right;margin-top: 20px;margin-right: 2px" type="reset" class="layui-inline layui-btn">重置</button>'+
                        '</form>'+
                        '</div>'
                    });
                    form.render('select'); //刷新select选择框渲染
                }


                /*开发成功*/
                if(layEvent=="success"){
                    window.location.href="/salPlan/dev?id="+data.chcId;
                }


                /*开发失败*/
                if(layEvent=="fail"){
                    window.location.href="/salPlan/dev?id="+data.chcId;
                }


            });



            //监听提交
            form.on('submit(tj)', function(data){
                /*开始异步提交数据*/
                layer.close(layer.index);
                var url="/salPlan/insert";
                $.post(
                    url,
                    {
                        'id':data.field.id,   //机会表id
                        'text':data.field.text //制订计划的内容
                    },
                    function (data) {
                        layer.msg("制订成功");
                        var page_index = $(".layui-laypage-skip").find("input").val(); //当前页码值
                        shuaxin(page_index);
                    }
                );

                return false;
            });


            //监听提交
            form.on('submit(tj2)', function(data){
                /*开始异步提交数据*/
                layer.close(layer.index);
                var url="/salPlan/update";
                $.post(
                    url,
                    {
                        'id':data.field.id,   //机会表id
                        'text':data.field.text, //制订计划的结果
                        'sate':data.field.sates
                    },
                    function (data) {
                        layer.msg('提交成功!');
                        var page_index = $(".layui-laypage-skip").find("input").val(); //当前页码值
                        shuaxin(page_index);
                    }
                );

                return false;
            });




            //执行一个laydate实例
            laydate.render({
                elem: '#d1' //指定元素
                ,type: 'datetime'
            });
            laydate.render({
                elem: '#d2' //指定元素
                ,type: 'datetime'
            });

            /*数据表格*/
            //第一个实例
            tableIns = table.render({
                elem: '#list_table',
                url: '/salChance/development' //数据接口
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
                title: "销售机会管理",
                id: "empId",
                limit: 5,
                cols: [
                    [ //表头
                        {
                            field: 'chcId',
                            sort: true,
                            width: 80,
                            title: 'ID',
                            align: 'center'
                        }, {
                            field: 'chcDueTo',
                            title: '客户经理',
                            width: 90,
                            align: 'center'
                        },{
                        field: 'chcCustName',
                        title: '客户名称',
                    }, {
                        field: 'chcTitle',
                        title: '概要',
                    }, {
                        field: 'chcLinkman',
                        title: '联系人',
                        width: 90,
                        align: 'center'
                    }, {
                        field: 'chcTel',
                        minWidth: 100,
                        title: '联系电话',
                        align: 'center'
                    }, {
                        field: 'chcDueDate',
                        sort: true,
                        title: '分配时间',
                        align: 'center',
                        minWidth: 160,
                    }, {
                        field: 'chcStatus',
                        title: '状态: 1 未指派 2 已指派(或开发中) 3 开发成功 4 开发失败',
                        hide: true
                    },{
                        title: '状态',
                        width: 90,
                        align: 'center',
                        templet: function(d){
                            if(d.chcStatus==2){
                                return "未开发";
                            }else if(d.chcStatus==3){
                                return "开发中";
                            }else if(d.chcStatus==4){
                                return "发开成功";
                            }else if(d.chcStatus==5){
                                return "开发失败";
                            }
                        }
                    }, {
                        title:'操作',
                        align: 'center',
                        width: 60,
                        templet: function(d){
                            if(d.chcStatus==2){
                                return '<span lay-event="formulate" title="制订计划" class="cz1" style="cursor: pointer;color: #F8AF03"> ' +
                                '<i class="iconfont icon-bianjisekuai"></i> ' +
                                '</span>';
                            }else if(d.chcStatus==3){
                                return '<span lay-event="implement" title="执行计划" class="cz2" style="cursor: pointer;color: #5FB878"> ' +
                                    '<i class="iconfont icon-icon_fabu"></i> ' +
                                    '</span>';
                            }else if(d.chcStatus==4){
                                return '<span lay-event="success" title="开发成功" class="cz3" style="cursor: pointer;color: #5FB878"> ' +
                                    '<i class="iconfont icon-duigou"></i> ' +
                                    '</span>';
                            }else if(d.chcStatus==5){
                                return '<span lay-event="fail" title="开发失败" class="cz4" style="cursor: pointer;color: #FF5722"> ' +
                                    '<i class="iconfont icon-guanbi1"></i> ' +
                                    '</span>';
                            }
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

                }
            });
            /*开始渲染下拉列表框*/





            //监听提交
            form.on('submit(chaxun)', function(data){
                tableIns.reload({
                    where: { //设定异步数据接口的额外参数，任意设
                        chcCustName: data.field.chcCustName,
                        chcLinkman: data.field.chcLinkman,
                        d1: data.field.d1,
                        d2: data.field.d2,
                        chcStatus:data.field.chcStatus
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

                return false;
            });







            function shuaxin(index) {
                tableIns.reload({
                    where: { //设定异步数据接口的额外参数，任意设
                    }
                    , page: {
                        curr: index //重新从第 1 页开始
                        , limit: 5    //每页显示数据条数
                        , layout: ['prev', 'page', 'next', 'limit' , 'count' , 'skip' , 'refresh']
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
