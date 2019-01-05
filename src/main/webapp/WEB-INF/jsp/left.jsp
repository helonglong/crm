<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>后台管理系统</title>
    <script src="/static/js/jquery.min.js"></script>
    <script src="/static/layui/layui.js"></script>
    <link rel="stylesheet" type="text/css" href="/static/layui/css/layui.css"/>
    <link href="/static/css/font-icon.css" rel="stylesheet" type="text/css">
    <style>
        body {
            margin: 0;
            padding: 0;
            background-color: #393D49;
        }

        ul {
            width: 200px;
        }
    </style>
</head>
<body>

<c:set var="menu" value="${sessionScope.menu}"/>


<ul class="layui-nav layui-nav-tree layui-nav-tree" lay-filter="test">
    <!-- 侧边导航: <ul class="layui-nav layui-nav-tree layui-nav-side"> -->
    <li class="layui-nav-item"><a href="/content" target="content">
        <i class="iconfont icon-daohangshouye"></i>
        后台首页</a></li>
    <li class="layui-nav-item">
        <a href="javascript:;">
            <i class="iconfont icon-icon_zhanghao"></i>
            我的面板
        </a>
        <dl class="layui-nav-child">
            <dd>
                <a href="/crm_person/personInfo" target="content">&nbsp;&nbsp;&nbsp;&nbsp;
                    <i class="iconfont icon-gerenxinxi1"></i>
                    个人信息
                </a>
            </dd>
            <dd>
                <a href="/crm_person/changepwd" target="content">&nbsp;&nbsp;&nbsp;&nbsp;
                    <i class="iconfont icon-xiugaimima"></i>
                    修改密码</a>
            </dd>
        </dl>
    </li>


    <c:forEach var="m" items="${menu}">


        <li class="layui-nav-item">
            <a href="javascript:;">
                <i class="iconfont ${m.aMenu.icon}"></i>
                    ${m.aMenu.name}
            </a>
            <dl class="layui-nav-child">
                <c:forEach var="m2" items="${m.bMenu}">
                    <dd>
                        <a href="${m2.path}" target="content">&nbsp;&nbsp;&nbsp;&nbsp;
                        <i class="iconfont ${m2.icon}"></i>
                        ${m2.name}</a>
                    </dd>
                </c:forEach>
            </dl>
        </li>
    </c:forEach>



    <%--&lt;%&ndash;营销管理&ndash;%&gt;--%>
    <%--<li class="layui-nav-item">--%>
        <%--<a href="javascript:;">--%>
            <%--<i class="iconfont icon-guanlizhongxin"></i>--%>
            <%--营销管理--%>
        <%--</a>--%>
        <%--<dl class="layui-nav-child">--%>
            <%--<dd><a href="/crm_sale/opp/list" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-guanliyuan4"></i>--%>
                <%--销售机会管理</a></dd>--%>
            <%--<dd><a href="/crm_sale/dev/list" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-guanliyuan4"></i>--%>
                <%--客户开发计划</a></dd>--%>
        <%--</dl>--%>
    <%--</li>--%>



    <%--&lt;%&ndash;客户开发计划&ndash;%&gt;--%>


    <%--<li class="layui-nav-item">--%>
        <%--<a href="javascript:;">--%>
            <%--<i class="iconfont icon-guanli4"></i>--%>
            <%--客户开发计划</a>--%>
        <%--<dl class="layui-nav-child">--%>
            <%--<dd><a href="/crm_cus/info/list" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-tubiaozhizuomobanyihuifu-"></i>--%>
                <%--客户信息管理</a></dd>--%>
            <%--<dd><a href="/crm_cus/lose/list" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-tubiaozhizuomobanyihuifu-"></i>--%>
                <%--客户流失计划管理</a></dd>--%>
        <%--</dl>--%>
    <%--</li>--%>
    <%--&lt;%&ndash;服务管理&ndash;%&gt;--%>
    <%--<li class="layui-nav-item">--%>
        <%--<a href="javascript:;" target="content">--%>
            <%--<i class="iconfont icon-chanpinfuwuguanli"></i>--%>
            <%--服务管理</a>--%>
        <%--<dl class="layui-nav-child" target="content">--%>
            <%--<dd><a href="/crm_service/add" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-zixunguanlizixunfuwuguanli"></i>--%>
                <%--服务创建</a></dd>--%>
            <%--<dd><a href="/crm_service/dispatch" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-zixunguanlizixunfuwuguanli"></i>--%>
                <%--服务分配</a></dd>--%>
            <%--<dd><a href="/crm_service/deal_list" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-zixunguanlizixunfuwuguanli"></i>--%>
                <%--服务处理</a></dd>--%>
            <%--<dd><a href="/crm_service/feedback_list" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-zixunguanlizixunfuwuguanli"></i>--%>
                <%--服务反馈</a></dd>--%>
            <%--<dd><a href="/crm_service/file_list" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-zixunguanlizixunfuwuguanli"></i>--%>
                <%--服务归档</a></dd>--%>
        <%--</dl>--%>
    <%--</li>--%>
    <%--&lt;%&ndash;统计报表&ndash;%&gt;--%>
    <%--<li class="layui-nav-item">--%>
        <%--<a href="javascript:;">--%>
            <%--<i class="iconfont icon-shuju2"></i>--%>
            <%--统计报表</a>--%>
        <%--<dl class="layui-nav-child">--%>
            <%--<dd><a href="/crm_rep/contribution" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-weibiaoti1"></i>--%>
                <%--客户贡献度分析</a></dd>--%>
            <%--<dd><a href="/crm_rep/constitute" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-weibiaoti1"></i>--%>
                <%--客户构成分析</a></dd>--%>
            <%--<dd><a href="/crm_rep/service" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-weibiaoti1"></i>--%>
                <%--客户服务分析</a></dd>--%>
            <%--<dd><a href="/crm_rep/lose" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-weibiaoti1"></i>--%>
                <%--客户流失分析</a></dd>--%>
        <%--</dl>--%>
    <%--</li>--%>


    <%--&lt;%&ndash;基础数据&ndash;%&gt;--%>
    <%--<li class="layui-nav-item">--%>
        <%--<a href="javascript:;">--%>
            <%--<i class="iconfont icon-shuju"></i>--%>
            <%--基础数据</a>--%>
        <%--<dl class="layui-nav-child">--%>
            <%--<dd><a href="/crm_base/dict" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-shuju1"></i>--%>
                <%--数据字典管理</a></dd>--%>
            <%--<dd><a href="/crm_base/product" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-shuju1"></i>--%>
                <%--查询产品信息</a></dd>--%>
            <%--<dd><a href="/crm_base/stock" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-shuju1"></i>--%>
                <%--查询库存</a></dd>--%>
        <%--</dl>--%>
    <%--</li>--%>


    <%--&lt;%&ndash;系统管理&ndash;%&gt;--%>
    <%--<li class="layui-nav-item">--%>
        <%--<a href="javascript:;">--%>
            <%--<i class="iconfont icon-guanli9"></i>--%>
            <%--系统管理</a>--%>
        <%--<dl class="layui-nav-child">--%>
            <%--<dd><a href="/crm_sys/list" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-guanli8"></i>--%>
                <%--权限分配</a></dd>--%>
            <%--<dd><a href="/crm_sys/edit1" target="content">&nbsp;&nbsp;&nbsp;&nbsp;--%>
                <%--<i class="iconfont icon-guanli8"></i>--%>
                <%--角色权限管理</a></dd>--%>
        <%--</dl>--%>
    <%--</li>--%>



</ul>
</body>
<script>
    //注意：导航 依赖 element 模块，否则无法进行功能性操作
    layui.use('element', function () {
        var element = layui.element;
    });
</script>
</html>