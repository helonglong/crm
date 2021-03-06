<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>xx</title>
    <%--jquery2.1--%>
    <script type="text/javascript" src="<c:url value="/static/js/jquery.min.js"/>"></script>
    <%--layui框架css--%>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/layui/css/layui.css"/>" media="all">
    <%--阿里巴巴icon图标库--%>
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/font-icon.css"/>" media="all">
    <link rel="stylesheet" type="text/css" href="<c:url value="/static/css/conn.css"/>" media="all">

    <%--layui框架js--%>
    <script type="text/javascript" src="<c:url value="/static/layui/layui.js"/>"></script>

</head>
<body style="overflow-x:hidden">
<!-- /头部导航 -->
<%--营销管理 > 客户开发计划 > 开发计划--%>
<header class="larry-personal-tit">
    <span class="layui-breadcrumb">
        <a class="href" href="<c:url value="/content"/>" target="content">首页</a>
        <a><cite>统计报表</cite></a>
        <a><cite>客户流失分析</cite></a>
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
<div class=" layui-form layui-form-item con1">


    <div class="layui-inline">
        <label class="layui-form-label">图表类别：</label>
        <div class="layui-input-inline" style="width: 100px;">
            <label>
                <select lay-filter="chartCategory" name="state" lay-verify="">
                    <option value="n1">饼图</option>
                    <option value="n2">直方图</option>
                </select>
            </label>
        </div>
    </div>

</div>

<div class="content">
    <div id="main" style="width: 800px;height:400px;margin: auto"></div>
</div>
<%--echarts图表js--%>
<script type="text/javascript" src="<c:url value="/static/js/echarts.min.js"/>"></script>
<script type="text/javascript">

    var form;
    var layer;
    var element;
    var DATA_LIST;//异步请求的图表数据
    var graphType = 1;


    $(function () {
        /*加载layui组件*/
        layui.use(['layer', 'form', 'laypage', 'element', 'laydate'], function () {
            element = layui.element;
            layer = layui.layer;
            form = layui.form;


            /*重复调用的代码块*/
            function mm() {
                if (graphType === 1) {
                    pieChart(DATA_LIST.list, DATA_LIST.title, DATA_LIST.point);
                } else if (graphType === 2) {
                    histogram(DATA_LIST.list, DATA_LIST.title, DATA_LIST.point);
                }
            }

            /*初始化加载客户贡献*/
            function customerLevel() {
                var url = "/echarts/status";
                $.post(
                    url,
                    function (data) {
                        DATA_LIST = data;
                        mm();
                    }
                );
            }

            customerLevel();


            /*图表方式监听*/
            form.on('select(chartCategory)', function (data) {
                var value = data.value;
                if (value === 'n1') {
                    graphType = 1;
                    pieChart(DATA_LIST.list, DATA_LIST.title, DATA_LIST.point);
                }
                if (value === 'n2') {
                    graphType = 2;
                    histogram(DATA_LIST.list, DATA_LIST.title, DATA_LIST.point);
                }
            });

        });


    });

    /**
     * 饼图
     * @param list 数据
     * @param title 标题
     * @param point 提示语
     */
    function pieChart(list, title, point) {
        //配置id 准备渲染图表
        var myChart = echarts.init(document.getElementById('main'));

        // 指定图表的配置项和数据
        var option = {
            aria: {
                show: true
            },
            title: {
                text: title,
                x: 'center'
            }, tooltip: {
                trigger: 'item',
                formatter: "{a} <br/>{b} : {d}%"
            },
            legend: {
                show: list
            },
            series: [
                {
                    name: point,
                    type: 'pie',
                    radius: '75%',   //大小
                    data: list
                }
            ],
            itemStyle: {
                emphasis: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    }


    /**
     * 直方图
     * @param list 数据
     * @param title 标题
     * @param point 提示语
     */
    function histogram(list, title, point) {
        //配置id 准备渲染图表
        var myChart = echarts.init(document.getElementById('main'));

        //拆解数据
        var name = [];
        var value = [];
        for (var i = 0; i < list.length; i++) {
            name[i] = list[i].name;
            value[i] = list[i].value;
        }

        // 指定图表的配置项和数据
        var option = {
            title: {
                text: title
            },
            tooltip: {},
            legend: {
                data: [point]
            },
            xAxis: {
                data: name
            },
            yAxis: {
                type: 'value',
                formatter: "{value} (元)"
            },
            series: [{
                name: point,
                type: 'bar',
                data: value
            }],
            itemStyle: {
                emphasis: {//阴影
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    }

</script>
</body>
</html>
