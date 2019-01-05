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
        <a><cite>数据字典管理</cite></a>
        <a><cite>数据字典列表</cite></a>
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
    </style>
</header>
<div class="layui-form layui-form-item con1">
    <div class="layui-inline">
        <label class="layui-form-label">类别：</label>
        <div class="layui-input-inline" style="width: 150px;">
            <input type="text" name="type" id="type"  placeholder="类别" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-inline">
        <label class="layui-form-label">条目：</label>
        <div class="layui-input-inline" style="width: 150px;">
            <input type="text" id="entry" name="entry" placeholder="条目" autocomplete="off" class="layui-input">
        </div>
    </div>


    <div class="layui-inline">
        <label class="layui-form-label">值：</label>
        <div class="layui-input-inline" style="width: 150px;">
            <input type="text" id="value" name="value" placeholder="值" class="layui-input">
        </div>
    </div>

    <div class="layui-inline" style="width: 50px;float: right;right: 30px">
        <button class="layui-btn" id="chaxun" >查询</button>
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
    <div class="layui-inline" style="width: 50px;float: right;right: 10px">
        <button id="insert"  class="layui-btn">新建</button>
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


                if(layEvent=="edit"){
                    /*开始加载编辑弹出框*/
                    layer.open({
                        type: 1,
                        title: '信息编辑',
                        area: ['400px', '340px'],//宽高
                        resize: false,//是或允许拉伸
                        content: '<form class="layui-form" id="bianji2">' +
                            /*编号*/
                        '<div class="layui-form-item"> ' +
                        '<label class="layui-form-label">编号</label> ' +
                        '<div class="layui-input-inline"> ' +
                        '<input type="text" name="dictId" disabled value="'+data.dictId+'" autocomplete="off" class="layui-input"> ' +
                        '</div> ' +
                        '</div>'+
                            /*类别*/
                        '<div class="layui-form-item"> ' +
                        '<label class="layui-form-label">类别</label> ' +
                        '<div class="layui-input-inline"> ' +
                        '<input type="text" name="dictType" lay-verify="required"  value="'+data.dictType+'" autocomplete="off" class="layui-input"> ' +
                        '</div> ' +
                        '</div>'+
                        /*条目*/
                        '<div class="layui-form-item"> ' +
                        '<label class="layui-form-label">条目</label> ' +
                        '<div class="layui-input-inline"> ' +
                        '<input type="text" name="dictItem" lay-verify="required"  value="'+data.dictItem+'" autocomplete="off" class="layui-input"> ' +
                        '</div> ' +
                        '</div>'+
                        /*值*/
                        '<div class="layui-form-item"> ' +
                        '<label class="layui-form-label">值</label> ' +
                        '<div class="layui-input-inline"> ' +
                        '<input type="text" name="dictValue" lay-verify="required"  value="'+data.dictValue+'" autocomplete="off" class="layui-input"> ' +
                        '</div> ' +
                        '</div>'+
                        '<button lay-submit class="layui-btn" lay-filter="bj_tj">提交</button>'+
                        '</form>' //这里content是一个普通的String
                    });

                }



                /*删除*/
                if(layEvent=="delete"){
                    var id=data.dictId;
                    layer.confirm('确认删除id为'+id+'的数据?', {icon: 3, title:'提示'}, function(index){
                        layer.close(index);
                        /*开始异步删除*/
                        var url="/basDict/delete";
                        $.post(
                            url,
                            {
                                'id':id
                            },
                            function (data) {
                                var page_index = $(".layui-laypage-skip").find("input").val(); //当前页码值
                                layer.msg("删除成功！");
                                table_cz(page_index);
                            }
                        );


                    });
                }

            });




            //监听提交修改
            form.on('submit(bj_tj)', function(d){
                layer.close(layer.index);
                console.log(d.field) //当前容器的全部表单字段，名值对形式：{name: value}
                var url="/basDict/update";
                $.post(
                    url,
                    d.field,
                    function () {
                        var page_index = $(".layui-laypage-skip").find("input").val(); //当前页码值
                        layer.msg("修改成功！");
                        table_cz(page_index);
                    }
                );
                return false;
            });

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
                url: '/basDict/selectAll' //数据接口
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
                            field: 'dictId',
                            width: 60,
                            title: '编号',
                            align: 'center'
                        }, {
                        field: 'dictType',
                        title: '类别',
                    }, {
                        field: 'dictItem',
                        title: '条目',
                    }, {
                        field: 'dictValue',
                        title: '值',
                        width: 150,
                        align: 'center'
                    }, {
                        title: '是否可以编辑',
                        width: 120,
                        templet: '#bianji',
                        align: 'center'
                    }, {
                        title: '操作',
                        templet: '#caozuo',
                        width: 80,
                        align: 'center'
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
                var type = $("#type").val();
                var entry =$("#entry").val();
                var value = $("#value").val();

                tableIns.reload({
                    where: { //设定异步数据接口的额外参数，任意设
                        type: type,
                        item:entry,
                        value:value
                    }
                    , page: {
                        curr: 1 //重新从第 1 页开始
                    }
                });


            });



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

<%--操作模板--%>
<script type="text/html" id="caozuo">
    {{#  if(d.dictIsEditable == 0){ }}
    <span></span>
    {{#  } else { }}
    <%--编辑--%>

    <span lay-event="edit" title="编辑" class="list_bianji" style="cursor: pointer;color: #5FB878">
        <i class="iconfont icon-guanli1"></i>
    </span>

    <%--删除--%>
        <span  lay-event="delete" title="删除" class="delete" style="cursor: pointer;color: #FF5722">
            <i class="iconfont icon-shanchu"></i>
        </span>
    {{#  } }}
</script>

<%--是否可以编辑模板--%>
<script type="text/html" id="bianji">
    {{#  if(d.dictIsEditable == 0){ }}
    <span style="color: #d43f3a">否</span>
    {{#  } else { }}
    <span style="color: #00F7DE">是</span>
    {{#  } }}
</script>


</body>
</html>
