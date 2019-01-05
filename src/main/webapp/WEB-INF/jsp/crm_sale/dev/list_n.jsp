<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<%--首页/ 营销管理/ 客户开发计划--%>
<header class="larry-personal-tit" id="navigation">
        <span class="layui-breadcrumb">
            <a class="href" href="/content" target="content">首页</a>
            <a><cite>营销管理</cite></a>
            <a class="href" href="/crm_sale/dev/list" target="content">客户开发计划</a>
            <a><cite>归档查看</cite></a>
        </span>
</header>
<div class="content">
    <blockquote class="layui-elem-quote">创建人:${requestScope.list.salChance.chcCreateBy}</blockquote>

    <form class="layui-form" id="cst2">
        <input type="hidden" name="chcCreateId" value="0">
        <input type="hidden" name="chcCreateBy" value="BOSS">
        <table class="layui-table">
            <tr>
                <td>编号</td>
                <td>
                    <input type="text"
                           value="${requestScope.list.salChance.chcId}"
                            class="layui-input" disabled>
                </td>

                <td>创建时间</td>
                <td>
                    <input type="text"  disabled
                           value="<fmt:formatDate
                           value="${requestScope.list.salChance.chcCreateDate}"
                           pattern="yyyy-MM-dd HH:mm:ss"/>"
                           class="layui-input" id="svr_create_date">
                </td>

            </tr>

            <tr>
                <td>机会来源</td>
                <td>
                    <input type="text"  disabled
                           value="${requestScope.list.salChance.chcDesc}" name="chcSource"
                           class="layui-input">
                </td>

                <td>成功几率</td>
                <td>
                    <input type="text"  name="chcRate" disabled
                           class="layui-input"
                           value="${requestScope.list.salChance.chcRate}%">
                </td>
            </tr>

            <tr>
                <td>客户名称</td>
                <td>
                    <input type="text"  disabled
                           value="${requestScope.list.salChance.chcCustName}"
                           lay-verify="required" class="layui-input" >
                </td>
                <td>概要</td>
                <td>
                    <input type="text" disabled
                           value="${requestScope.list.salChance.chcTitle}"
                           class="layui-input"  name="chcTitle">
                </td>
            </tr>
            <tr>
                <td>联系人</td>
                <td>
                    <input type="text"  disabled
                           value="${requestScope.list.salChance.chcLinkman}"
                           placeholder="联系人" name="chcLinkman"
                           lay-verify="required" class="layui-input" >
                </td>
                <td>联系人电话</td>
                <td>
                    <input lay-verify="required|phone" disabled
                           value="${requestScope.list.salChance.chcTel}"
                           value="" placeholder="联系人电话"
                           class="layui-input" id="" name="chcTel">
                </td>
            </tr>



            <tr>
                <td>机会描述</td>
                <td>
                    <input type="text" disabled
                           value="${requestScope.list.salChance.chcDesc}"
                           class="layui-input">

                </td>
                <td>执行时间</td>
                <td>
                    <input type="text" disabled
                           value="<fmt:formatDate value="${requestScope.list.plaDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"
                           class="layui-input">

                </td>

            </tr>

            <tr>
                <td>执行内容</td>
                <td>
                    <input type="text" disabled
                           value="${requestScope.list.plaTodo}"
                           class="layui-input">

                </td>
                <td>执行结果</td>
                <td>
                    <input type="text" disabled
                           value="${requestScope.list.plaResult}"
                           class="layui-input">

                </td>

            </tr>


        </table>
        <div align="center">
            <a href="../crm_sale/dev/list">
                <button type="button" class="layui-btn" id="demo1">返回</button>
            </a>
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