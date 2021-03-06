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
<%--首页/ 营销管理/ 营销机会管理/ 营销机会--%>
<header class="larry-personal-tit" id="navigation">
        <span class="layui-breadcrumb">
            <a class="href" href="/content" target="content">首页</a>
            <a><cite>营销管理</cite></a>
            <a class="href" href="/crm_sale/opp/list" target="content">营销机会管理</a>
            <a><cite>新建</cite></a>
        </span>
</header>
<div class="content">
    <blockquote class="layui-elem-quote">创建人:BOSS</blockquote>

    <form class="layui-form" id="cst2">
        <input type="hidden" name="chcCreateId" value="0">
        <input type="hidden" name="chcCreateBy" value="BOSS">
        <table class="layui-table">
            <tr>
                <td>编号</td>
                <td>
                    <input type="text" style="width: 346px;"
                           value="系统自动生成编号"
                           lay-verify="required" class="layui-input" disabled>
                </td>

                <td>创建时间</td>
                <td>
                    <input type="text" style="width: 346px;" disabled value="<%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format( Calendar.getInstance().getTime())%>"
                           class="layui-input" id="svr_create_date">
                </td>

            </tr>

            <tr>
                <td>机会来源</td>
                <td>
                    <input type="text" style="width: 346px;"
                           placeholder="机会来源" name="chcSource"
                           lay-verify="required" class="layui-input">
                </td>

                <td>成功几率</td>
                <td>
                    <div style="width: 346px" id="slideTest1"></div>
                    <input type="hidden" id="jilv" name="chcRate" value="1">
                </td>
            </tr>

            <tr>
                <td>客户名称</td>
                <td>
                    <input type="text" style="width: 346px;"
                           placeholder="客户名称" name="chcCustName"
                           lay-verify="required" class="layui-input" >
                </td>
                <td>概要</td>
                <td>
                    <input type="text" style="width: 346px;"
                           lay-verify="required"
                           value="" placeholder="概要"
                           class="layui-input"  name="chcTitle">
                </td>
            </tr>
            <tr>
                <td>联系人</td>
                <td>
                    <input type="text" style="width: 346px;"
                           lay-verify="required"
                           placeholder="联系人" name="chcLinkman"
                           lay-verify="required" class="layui-input" >
                </td>
                <td>联系人电话</td>
                <td>
                    <input lay-verify="required|phone"
                           type="text" style="width: 346px;"
                           value="" placeholder="联系人电话"
                           class="layui-input" id="" name="chcTel">
                </td>
            </tr>



            <tr>
                <td>机会描述</td>
                <td colspan="3">
             <textarea type="text" placeholder="请输入详细的描述(必填)"
                       lay-verify="required"
                       class="layui-textarea" cols="10" rows="5"
                       id="svr_request" name=chcDesc></textarea>
                </td>
            </tr>


        </table>
        <div align="center">
            <button class="layui-btn" lay-submit lay-filter="tj" id="demo1">立即提交</button>
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
        var slider;
        var event;
        layui.use(['layer','form','laypage','element','laydate','slider'],function(){
            form = layui.form,
                slider=layui.slider,
                element=layui.element,
                layer=layui.layer,
                laypage=layui.laypage,
                laydate=layui.laydate;

            //滑块渲染
            slider.render({
                elem: '#slideTest1'  //绑定元素
                ,change: function(value){
                $("#jilv").val(value);
            }
            });

            form.on('submit(tj)', function(data){
                console.log(data.elem) //被执行事件的元素DOM对象，一般为button对象
                console.log(data.form) //被执行提交的form对象，一般在存在form标签时才会返回
                console.log(data.field) //当前容器的全部表单字段，名值对形式：{name: value}

                var url="/salChance/add";
                $.post(
                    url,
                    data.field,
                    function (data) {
                        window.location.href="/crm_sale/opp/list";
                    }
                );




                return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
            });





        });


    })

</script>




</html>