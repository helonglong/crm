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
<style>
	.con1{
		margin-top: 20px;
	}
	.content{
		margin-left: 20px;
		width: 96%;
	}
</style>

<header class="larry-personal-tit" >
	<span class="layui-breadcrumb">
        <a class="href" href="/content" target="content">首页</a>
        <a><cite>营销管理</cite></a>
        <a><cite>营销机会管理</cite></a>
        <a><cite>营销机会</cite></a>
    </span>
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
		<label class="layui-form-label">创建时间：</label>
		<div class="layui-input-inline" style="width: 200px;">
			<input  type="text" id="d1" name="d1"  placeholder="起始时间" class="layui-input">
		</div>
		<div class="layui-form-mid">-</div>
		<div class="layui-input-inline" style="width: 200px;">
			<input  type="text" id="d2" name="d2"  placeholder="截止时间" class="layui-input">
		</div>
	</div>

	<div class="layui-inline" style="width: 150px;float: right;right: 30px">
		<button type="reset" class="layui-btn">重置</button>
		<button style="margin-left: -3px" class="layui-btn" lay-submit lay-filter="chaxun">查询</button>
	</div>
	<div class="layui-inline" style="width: 50px;float: right;right: 35px">
		<a href="add">
			<button  type="button" class="layui-btn">新建</button>
		</a>
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



        var user_url="/user/selectUser1";
        $.post(
            user_url,
			function (data) {
				users=data;


				var div=$("<div>").css({"width": "150px"});
				var div1=$("<div>").addClass("layui-col-md7");
				var select=$("<select>").prop({"name":"fepei"}).attr({"lay-ignore":''}).css("height","26px").addClass("u_n layui-select");
				var option1=$("<option>").attr("value","-1").html("分配给...");
				select.append(option1);
				for (var i=0;i<users.length;i++){
				    var option=$("<option>").prop("value",users[i].usrId).html(users[i].usrName);
                    select.append(option);
				}
				div1.append(select);
				var div2='<div class="layui-col-md5">' +
					'<button lay-event="fenpei_n" style="height: 26px;line-height: 26px" class="fenpei_n layui-btn">分配</button>' +
					'</div>';
                user_moban = div.append(div1).append(div2);

            }
		);




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
                if(layEvent=="fenpei_n"){
                    var id=data.chcId;
                    //客户经理id
                    var value=tr.find("option:selected").val();
                    if(value==-1){
                        layer.msg("请选择一个人再进行分配");
                        return false;
					}
                    //客户经理姓名
					var name=tr.find("option:selected").text();
                    layer.confirm('确认分配给客户经理:'+name, {icon: 3, title:'提示'}, function(index){
                        /*开始异步分配*/
                        var fen_url="/salChance/feipei";
                        $.post(
                            fen_url,
							{
							    'chcId':id,				//数据id
							    'chcDueId':value,	//经理id
								'chcDueTo':name, 	//经理姓名
								'chcStatus':2			//2：状态更改为已分配
							},
							function (data) {
								layer.msg("分配成功!");
								shuaxin(1);
                            }
						);
                    });
                }
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
                url: '/salChance/selectAll' //数据接口
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
                            width: 80,
                            title: 'ID',
                            align: 'center'
                        }, {
                        field: 'chcCustName',
                        title: '客户名称',
                    }, {
                        field: 'chcTitle',
                        title: '概要',
                    }, {
                        field: 'chcLinkman',
                        title: '联系人',
                        align: 'center'
                    }, {
                        field: 'chcTel',
                        minWidth: 100,
                        title: '联系电话',
                        align: 'center'
                    }, {
                        field: 'chcCreateDate',
                        title: '创建时间',
                        align: 'center',
                        minWidth: 200,
                    }, {
                        field: 'chcStatus',
                        title: '状态: 1 未指派 2 已指派(或开发中) 3 开发成功 4 开发失败',
                        hide: true
                    }, {
                        title:'操作',
                        width: 200,
                        align: 'center',
                        templet: function(d){
                            if(d.chcStatus==1){
                                return "<div class='select_user'></div>";
							}else if(d.chcStatus==2){
                                return "已分配";
                            }else if(d.chcStatus==4){
                                return "开发成功";
                            }else if(d.chcStatus==5){
                                return "发开失败";
                            }else if(d.chcStatus==3){
                                return "未开发";
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
                    $(".select_user").append(user_moban);
                    form.render('select'); //刷新select选择框渲染

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
                        d2: data.field.d2
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

			/*模糊搜索*/
            $("#chaxun").on("click", function () {
                var prodName = $("#prodName").val();
                var prodType =$("#prodType").val();
                var prodBatch = $("#prodBatch").val();

                tableIns.reload({
                    where: { //设定异步数据接口的额外参数，任意设
                        prodName: prodName,
                        prodType:prodType,
                        prodBatch:prodBatch
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
