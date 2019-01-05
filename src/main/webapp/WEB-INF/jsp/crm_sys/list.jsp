<%@ page contentType="text/html;charset=UTF-8"%>
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
        <a><cite>系统管理</cite></a>
        <a><cite>权限分配</cite></a>
    </span>
</header>
<form class="layui-form layui-form-item con1">
  <div class="layui-inline">
    <label class="layui-form-label">工号：</label>
    <div class="layui-input-inline" style="width: 120px;">
      <input type="text" id="usrId" name="usrId" placeholder="工号" autocomplete="off" class="layui-input">
    </div>
  </div>

  <div class="layui-inline">
    <label class="layui-form-label">员工姓名：</label>
    <div class="layui-input-inline" style="width: 120px;">
      <input type="text" id="usrName" name="usrName" placeholder="员工姓名" autocomplete="off" class="layui-input">
    </div>
  </div>


  <div class="layui-inline" style="width: 50px;float: right;right: 30px">
    <button type="button" id="chaxun" class="layui-btn">查询</button>
  </div>
  <div class="layui-inline" style="width: 50px;float: right;right: 40px">
    <button type="reset" class="layui-btn">重置</button>
  </div>

  <div class="layui-inline" style="width: 50px;float: right;right: 50px">
    <button type="button" id="add" class="layui-btn">新建</button>
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


        /*异步加载所有角色*/
        var user_url="/sysRole/getAdmin";
        $.post(
            user_url,
            function (data) {
                users=data;

                var div=$("<div>").css({"width": "150px"});
                var div1=$("<div>").addClass("layui-col-md7");
                var select=$("<select>").prop({"name":"fepei"}).attr({"lay-ignore":''}).css("height","26px").addClass("u_n layui-select");
                var option1=$("<option>").attr("value","-1").html("分配角色");
                select.append(option1);
                for (var i=0;i<users.length;i++){
                    if(users[i].roleId!=999){
                        var option=$("<option>").prop("value",users[i].roleId).html(users[i].roleName);
                        select.append(option);
                    }
                }
                div1.append(select);
                var div2='<div class="layui-col-md5">' +
                    '<button lay-event="fenpei_n" style="height: 26px;line-height: 26px" class="fenpei_n layui-btn">分配</button>' +
                    '</div>';
                user_moban = div.append(div1).append(div2);

            }
        );




        layui.use(['layer', 'form', 'laypage', 'element', 'laydate', 'table', 'laytpl'], function () {
            form = layui.form;
            element = layui.element;
            layer = layui.layer;
            laypage = layui.laypage;
            laydate = layui.laydate;
            table = layui.table;
            laytpl = layui.laytpl;


            form.on('switch(test)', function(data){
                var checked=data.elem.checked;//选中状态
                var id=$(this).parent().parent().parent().children().eq(0).children().html();//该行id
                var code=0;//状态码
                if (checked === true) {
                    code=1;
                }
                var url='/user/setCode';
                $.post(
                    url,
                    {
                        'id':id,
                        'code':code
                    },
                    function () {
                        layer.msg("修改成功!",{icon:1});
                        var index=$(".layui-laypage-skip").find("input").val();
                        shuaxin(index);//刷新当前页
                    }
                );
            });


          /*监听按钮点击*/
            table.on('tool(list_table)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
                // lay-filter="对应的值"
                var data = obj.data; // 获得当前行数据
                var layEvent = obj.event; // 获得 lay-event 对应的值findmanager（也可以是表头的 event 参数对应的值）
                var tr = obj.tr; // 获得当前行 tr 的DOM对象





                if(layEvent==="fenpei_n"){
                    var id=data.usrId;

                    var value=tr.find("option:selected").val();
                    if(value==='-1'){
                        layer.msg("请选择一角色再进行分配");
                        return false;
                    }
                    //客户经理姓名
                    var name=tr.find("option:selected").text();
                    layer.confirm('确认分配为'+name+"吗?", {icon: 3, title:'提示'}, function(index){
                      /*开始异步分配*/
                        var fen_url="/sysRole/updateRole";
                        $.post(
                            fen_url,
                            {
                                'usrId':id,				//数据id
                                'usrRoleId':value	//角色id
                            },
                            function (data) {
                                layer.msg("分配成功!");
                                shuaxin(1);
                            }
                        );
                    });
                }
            });




          /*数据表格*/
            //第一个实例
            tableIns = table.render({
                elem: '#list_table',
                url: '/user/getUsers' //数据接口
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
                title: "用户表",
                id: "empId",
                cols: [
                    [ //表头
                        {
                            field: 'usrId',
                            width: 80,
                            title: 'ID',
                            align: 'center'
                        }, {
                        field: 'usrName',
                        title: '用户名',
                        align: 'center'
                    }, {
                        title: '密码',
                        align: 'center',
                        templet: function () {return "***********"}
                    }, {
                        field: 'usrRoleId',
                        title: '角色',
                        align: 'center',
                        templet: function (d) {
                            return d.role.roleName;
                        }
                    },{
                        field: 'usrFlag',
                        minWidth: 100,
                        title: '账户状态',
                        align: 'center',
                        templet: function (d) {
                            if (d.usrFlag==0){
                                return '<span style="color: #d43f3a">锁定，无法登陆</span>';
                            }else if (d.usrFlag==1){
                                return '<span style="color: #4cae4c">正常，可以登录</span>';
                            }
                        }
                    },{
                        title: '账户锁定',
                        align: 'center',
                        templet: function (d) {
                            if (d.usrFlag==0){
                                return '<input lay-filter="test" type="checkbox" name="usrFlag" lay-skin="switch" lay-text="正常|锁定">';
                            }else if (d.usrFlag==1){
                                // language=HTML
                                return '<input lay-filter="test" type="checkbox" name="usrFlag" lay-skin="switch" lay-text="正常|锁定" checked=true>';
                            }
                        }
                    },{
                        title:'操作',
                        width: 200,
                        align: 'center',
                        templet: function(d){
                            if(d.usrRoleId==0||d.usrRoleId==1){
                                return '<span style="color: #761c19">禁止修改</span>';
                            }else {
                                return "<div class='select_user'></div>";
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

            $("#add").on('click',function () {
                /*如果是iframe层*/
                layer.open({
                    type: 1,
                    title: '增加用户',
                    area: ['400px', '300px'],
                    content: '<form style="padding: 20px" class="layui-form layui-form-pane" action="">' +
                        '    <div class="layui-form-item">' +
                        '        <label class="layui-form-label">用户名</label>' +
                        '        <div class="layui-input-block">' +
                        '            <input type="text" name="userName"' +
                        '                   lay-verify="username|required"' +
                        '                   placeholder="请输入用户名" class="layui-input">' +
                        '        </div>' +
                        '    </div>' +
                        '    <div class="layui-form-item">' +
                        '        <label class="layui-form-label">密码</label>' +
                        '        <div class="layui-input-block">' +
                        '            <input type="password" id="pass" name="pass"' +
                        '                   lay-verify="required|pass"' +
                        '                   placeholder="请输入密码"  class="layui-input">' +
                        '        </div>' +
                        '    </div>' +
                        '    <div class="layui-form-item">' +
                        '        <label class="layui-form-label">确认密码</label>' +
                        '        <div class="layui-input-block">' +
                        '            <input type="password" id="pass2"' +
                        '                   lay-verify="required|pass2"' +
                        '                   placeholder="重复密码"  class="layui-input">' +
                        '        </div>' +
                        '    </div>'
                        +'    <div class="layui-form-item" style="text-align: right">' +
                        '        <button type="reset" class="layui-btn layui-btn-primary">重置</button>' +
                        '        <button class="layui-btn" lay-submit="sss" lay-filter="demo2">提交</button>' +
                        '    </div>' +
                        '</form>'
                });
            });



            //自定义验证规则
            form.verify({
                username: function(value){
                    if(value.length < 3){
                        return '用户名至少得3个字符';
                    }
                }
                ,pass: [
                    /^[\S]{6,12}$/
                    ,'密码必须6到12位，且不能出现空格'
                ]
                ,pass2: function(value){
                    if(value!==$("#pass").val()){
                        return '两次密码不一致';
                    }
                }
            });


            //监听提交
            form.on('submit(demo2)', function(data){

                var url='/user/insertUser';
                $.post(
                    url,
                    data.field,
                    function (d) {
                        if (d.code == 0){
                            layer.closeAll(); //疯狂模式，关闭所有层
                            layer.msg("增加成功!",{icon:1});
                            shuaxin(1);
                        }else{
                            layer.msg(d.msg,{icon:2});
                        }
                    }
                );
                return false;
            });

          /*模糊搜索*/
            $("#chaxun").on("click", function () {
                var usrId = $("#usrId").val();
                var usrName =$("#usrName").val();
                tableIns.reload({
                    where: { //设定异步数据接口的额外参数，任意设
                        usrId: usrId,
                        usrName:usrName
                    }, page: {
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
