<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="/static/js/jquery.min.js"></script>
    <link rel="stylesheet" href="/static/layui/css/layui.css" media="all">
    <script src="/static/layui/layui.js"></script>
    <style>
        body {
            overflow-x: hidden;
        }

        .content {
            margin-left: 20px;
            width: 96%;
            padding-top: 10px;
            padding-right: 20px;
        }
        #navigation{
            background-color: #F1F2F7;
            height: 50px;
            line-height: 50px;
            padding-left: 20px;
        }
    </style>
</head>
<body>
<header class="larry-personal-tit" id="navigation">
        <span class="layui-breadcrumb">
            <a class="href" href="/content" target="content">首页</a>
            <a><cite>客户服务管理</cite></a>
            <a><cite> 服务创建</cite></a>
        </span>
</header>
<div class="content">

    <form class="layui-form" id="cst2">
        <table class="layui-table">
            <tr>
                <td>编号</td>
                <td>
                    <input type="text" style="width: 346px;"
                           value="系统自动生成编号"
                           lay-verify="required" class="layui-input" disabled>
                </td>
                <td>状态</td>
                <td>新创建</td>
            </tr>

            <tr>
                <td>创建人</td>
                <td>
                    <input type="hidden" id="svr_create_id" name="svr_create_id">
                    <input type="text" style="width: 346px;" value="何龙"
                           lay-verify="required" class="layui-input" id="svr_create_by" name="svr_create_by" disabled>
                </td>
                <td>创建时间</td>
                <td>
                    <input type="text" style="width: 346px;" disabled value="<%=new SimpleDateFormat("yyyy-MM-dd").format( Calendar.getInstance().getTime())%>"
                           class="layui-input" id="svr_create_date" name="svr_create_date">
                </td>
            </tr>


            <tr>
                <td>概要</td>
                <td colspan="3">
                    <input type="text" placeholder="请输入概要(必填项)"
                           lay-verify="required" class="layui-input"
                           id="svr_title" name=svr_title>
                </td>
            </tr>

            <tr>
                <td>客户</td>
                <td>
                        <input type="text" style="width: 346px;" placeholder="客户名称"
                               lay-verify="required" class="layui-input" id="svr_cust_no" name="svr_cust_no">
                </td>

                <td>服务类型</td>
                <td>
                    <select lay-verify="required" id="svr_type" name="svr_type">
                        <option value="">请选择</option>
                        <option v-for="item in listleve" :value="item.dict_item">{{item.dict_value}}</option>
                    </select>
                </td>
            </tr>

            <tr>
                <td>服务请求</td>
                <td colspan="3">
             <textarea type="text" placeholder="请输入服务请求"
                       class="layui-textarea" cols="80" rows="5"
                       id="svr_request" name=svr_request></textarea>
                </td>
            </tr>


        </table>
        <div align="center">
            <button class="layui-btn" id="demo1">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </form>
</div>
</body>

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
                , type: 'datetime'
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
            layer.tips('删除',this);
        },function(){
            layer.close(layer.index);
        });

    })

</script>




</html>