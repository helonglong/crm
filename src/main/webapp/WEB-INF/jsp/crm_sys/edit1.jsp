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

    <style>
        .con1{
            margin-top: 20px;
        }
        .content{
            margin-top: 20px;
            margin-left: 20px;
            width: 96.5%;
        }
    </style>
</head>
<body style="overflow-x:hidden">
<!-- /头部导航 -->
<%--营销管理 > 客户开发计划 > 开发计划--%>
<header class="larry-personal-tit" >
    <span class="layui-breadcrumb">
        <a class="href" href="/content" target="content">首页</a>
        <a><cite>系统管理</cite></a>
        <a><cite>角色权限管理</cite></a>
    </span>
</header>

<div class="content">
    <fieldset class="layui-elem-field">
        <legend>角色权限管理</legend>
        <div class="layui-field-box">
           <%--内容区域--%>
            <form id="qx_form" class="layui-form layui-form-pane" lay-filter="form_filter">
                <div class="layui-form-item" style="width: 300px">
                    <label class="layui-form-label">角色:</label>
                    <div class="layui-input-block">
                        <label>
                            <select lay-filter="select_filter" id="role" name="role" lay-verify="required">
                                <option value="-1">请选择</option>
                                <option value="0">BOSS</option>
                            </select>
                        </label>
                    </div>
                </div>
                <blockquote class="layui-elem-quote">权限分配</blockquote>

                <div id="test"></div>


                <%--提交--%>
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>

            </form>
        </div>
    </fieldset>



</div>




</body>
</html>

<script type="text/javascript">
        $(function () {
            var form;
            var layer;
            var element;
            var laypage;
            var laytpl;
            layui.use(['layer','form','laypage','element','laytpl'],function(){
                form = layui.form;
                element = layui.element;
                layer = layui.layer;
                laypage = layui.laypage;
                laytpl = layui.laytpl;


                /*异步加载所有角色*/
                var url1='/sysRole/getAdmin2';
                $.post(
                    url1,
                    function (r) {
                        tpl('role',r,roles);
                    }
                );


                /*异步加载管理员权限*/
                var url='/roleRight/getAdmin';
                $.post(
                    url,
                    function (date) {
                        tpl('test',date,demo);
                    }
                );



                /**
                 * 模板渲染
                 * @author 何龙
                 * @param id 容器id  为字符串
                 * @param data 数据源
                 * @param demo 模板名字
                 */
                function tpl(id,data,demo){
                    var getTpl = demo.innerHTML
                        ,view = document.getElementById(id);

                    laytpl(getTpl).render(data, function(html){
                        $("#"+id).append(html);
                        form.render(); //更新全部
                    });
                }

                /*监听select框*/

                form.on('select(select_filter)', function(data){

                    /*清除上一次选中状态*/
                    $('.checkbox').removeAttr('checked');
                    form.render();

                    var value=data.value;
                    if (value!=='-1'){
                        /*开始异步请求指定角色id的权限列表*/
                        var url='/roleRight/getRoleRight';
                        var date={};
                        $.post(
                            url,
                            {'rid':value},
                            function (p) {
                                layui.each(p,function (i, obj) {
                                    date[obj.name]=true;
                                });
                                /*将对应权限选中*/
                                form.val("form_filter", date);
                            }
                        );

                    }
                });

                /*监听提交按钮*/
                form.on('submit(formDemo)', function(data){
                    var d=data.field;

                    var list=[];
                    for(var key in d){
                        if (key !== 'role') {
                            var n={};
                            n['name']=key;
                            list.push(n)
                        }
                    }

                    var p={
                        'role':d.role,
                        'list':list
                    };


                    if (d.role==='-1'){
                        layer.msg("请选择一个角色再提交",{icon:2});
                        return false;
                    }
                    var url='/roleRight/update';

                    $.ajax({
                        type: 'post',
                        dataType: 'json',
                        url: url,
                        data: JSON.stringify(p),
                        contentType:"application/json",
                        success: function (result) {
                            layer.msg("操作成功!",{icon:1});

                        },
                        error: function(data){
                            layer.msg("操作异常!",{icon:2});
                        }
                    });
                    return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。

                });

            });

        })
</script>

<%--视图模板->角色--%>

<script id="roles" type="text/html">
    {{# layui.each(d, function(i,obj){ }}
    <option value="{{obj.roleId}}">{{obj.roleName}}</option>
    {{# }); }}
</script>

<%--视图模板->权限--%>
<script id="demo" type="text/html">
    <%--<form  class="layui-form">--%>
        {{# layui.each(d, function(i,obj){ }}
        <div class="layui-form-item" pane style="height: 38px;">
            <label class="layui-form-label">{{ obj.aMenu.name }}</label>

            {{# layui.each(obj.roleRights, function(i,l){ }}
            <div class="layui-input-inline" {{# if(i>0){ }}  style="margin-left: -70px"  {{# } }} >
                <input class="checkbox" type="checkbox" title="{{ l.name }}" name="{{ l.value }}" lay-skin="primary">
            </div>
            {{# }); }}

        </div>
        {{# }); }}
    <%--</form>--%>
</script>
