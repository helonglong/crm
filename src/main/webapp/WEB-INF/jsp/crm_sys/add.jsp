
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <%--jquery2.1--%>
    <script type="text/javascript" src="/static/js/jquery.min.js"></script>
    <%--layui框架css--%>
    <link rel="stylesheet" type="text/css" href="/static/layui/css/layui.css" media="all">
    <%--layui框架js--%>
    <script type="text/javascript" src="/static/layui/layui.js"></script>
</head>
<body>
<form style="padding: 20px" class="layui-form layui-form-pane" action="">
    <div class="layui-form-item">
        <label class="layui-form-label">用户名</label>
        <div class="layui-input-inline">
            <input type="text" name="username"
                   lay-verify="username|required"
                   placeholder="请输入用户名" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">密码</label>
        <div class="layui-input-inline">
            <input type="password" id="pass" name="pass"
                   lay-verify="required|pass"
                   placeholder="请输入密码"  class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">重复密码</label>
            <div class="layui-input-block">
                <input type="password" name="pass2"
                       lay-verify="required|pass2"
                       placeholder="请重复密码"  class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item" style="text-align: right">
        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        <button class="layui-btn" lay-submit="sss" lay-filter="demo2">提交</button>
    </div>
</form>
<script>
    layui.use(['form', 'layer'], function(){
        var form = layui.form
            ,layer = layui.layer;


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
        form.on('submit(demo1)', function(data){
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            return false;
        });
        


    });
</script>
</body>
</html>
