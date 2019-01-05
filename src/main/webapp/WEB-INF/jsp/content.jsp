<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>LarryBlogCMS-Home</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" type="text/css" href="/static/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="/static/bootstrap/css/bootstrap.css" media="all">
    <link rel="stylesheet" type="text/css" href="/static/css/global.css">
    <link rel="stylesheet" type="text/css" href="/static/css/main.css" media="all">
    <link href="/static/css/font-icon.css" rel="stylesheet" type="text/css">
</head>
<style>
    section{
        transition: height 1s;
    }
    .pull-right{
        z-index: 999;
    }
</style>
<body>
<section class="larry-wrapper">
    <!-- overview -->
    <div class="row state-overview">
        <div class="col-lg-3 col-sm-6 layui-anim layui-anim-up">
            <section class="panel">
                <div class="symbol userblue layui-anim layui-anim-rotate"> <i class="iconfont  icon-yonhu"></i>
                </div>
                <div class="value">
                    <a href="#">
                        <h1 id="count1">10</h1>
                    </a>
                    <p>用户总量</p>
                </div>
            </section>
        </div>
        <div class="col-lg-3 col-sm-6 layui-anim layui-anim-up">
            <section class="panel">
                <div class="symbol commred layui-anim layui-anim-rotate"> <i class="iconfont icon-yonghuguanli"></i>
                </div>
                <div class="value">
                    <a href="#">
                        <h1 id="count2">1</h1>
                    </a>
                    <p>今日注册用户</p>
                </div>
            </section>
        </div>
        <div class="col-lg-3 col-sm-6 layui-anim layui-anim-up">
            <section class="panel">
                <div class="symbol articlegreen layui-anim layui-anim-rotate">
                    <i class="iconfont icon-wenzhang-copy"></i>
                </div>
                <div class="value">
                    <a href="#">
                        <h1 id="count3">50</h1>
                    </a>
                    <p>文章总数</p>
                </div>
            </section>
        </div>
        <div class="col-lg-3 col-sm-6 layui-anim layui-anim-up">
            <section class="panel">
                <div class="symbol rsswet layui-anim layui-anim-rotate">
                    <i class="iconfont icon-shenhe"></i>
                </div>
                <div class="value">
                    <a href="#">
                        <h1 id="count4">0</h1>
                    </a>
                    <p>待审文章总数</p>
                </div>
            </section>
        </div>
    </div>
    <!-- overview end -->
    <div class="row">
        <div class="col-lg-6">
            <section class="panel" style="overflow: hidden;">
                <header class="panel-heading bm0">
                    <span class='span-title'>系统概览</span>
                    <span class="tools pull-right">
                        <a href="javascript:;" class="telescopic">
                            <i class="iconfont icon-xiangxiazhanhang"></i>
                        </a>
                    </span>
                </header>
                <div class="panel-body" >
                    <table class="table table-hover personal-task">
                        <tbody>

                        <tr>
                            <td>
                                <strong>服务器IP</strong>：127.0.0.1
                            </td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>
                                <strong>服务器环境</strong>：tomcat 7.0.47
                            </td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>
                                <strong>数据库版本</strong>： oracle 11g

                            </td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>
                                <strong>最大上传限制</strong>： 20M

                            </td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>
                                <strong>当前登录用户</strong>：
                                <span class="current_user">
                                    <shiro:principal property="usrName"/>
                                </span>

                            </td>
                            <td></td>
                        </tr>

                        <tr>
                            <td>
                                <strong>用户角色</strong>：
                                <span class="current_user">
                                    ${pageContext.session.getAttribute("user").role.roleName}
                                </span>

                            </td>
                            <td></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </section>
            <!-- 网站信息统计｛SEO数据统计｝ -->
            <section class="panel" style="overflow: hidden;">
                <header class="panel-heading bm0">
                    <span class='span-title'>网站信息统计｛SEO数据统计｝</span>
                    <span class="tools pull-right">
                        <a href="javascript:;" class="telescopic">
                            <i class="iconfont icon-xiangxiazhanhang"></i>
                        </a>
                    </span>
                </header>
                <div class="panel-body laery-seo-box">
                    <div class="larry-seo-stats" id="larry-seo-stats"></div>
                </div>
            </section>
        </div>
        <div class="col-lg-6">
            <!-- 系统公告 -->
            <section class="panel" style="overflow: hidden;">
                <header class="panel-heading bm0">
                    <span class='span-title'>系统公告</span>
                    <span class="tools pull-right">
                        <a href="javascript:;" class="telescopic">
                            <i class="iconfont icon-xiangxiazhanhang"></i>
                        </a>
                    </span>
                </header>
                <div class="panel-body">
                    <table class="table table-hover personal-task shortcut">
                        <tr>
                            <td>
                                <div class="c1">1</div>
                                <div class="c2">2</div>
                                <br>
                            </td>
                        </tr>
                    </table>
                </div>
            </section>

        </div>
    </div>

</section>

<script type="text/javascript" src="/static/layui/layui.js"></script>
<script type="text/javascript">

    layui.use(['jquery','layer','element'],function(){
        window.jQuery = window.$ = layui.jquery;
        window.layer = layui.layer;
        window.element = layui.element();

        $('.panel .tools .iconpx-chevron-down').click(function(){
            var el = $(this).parents(".panel").children(".panel-body");
            if($(this).hasClass("icon-xiangxiazhanhang")){
                $(this).removeClass("icon-xiangxiazhanhang").addClass("icon-xiangshangzhanhang");
                el.slideUp(200);
            }else{
                $(this).removeClass("icon-xiangshangzhanhang").addClass("icon-xiangxiazhanhang");
                el.slideDown(200);
            }
        })

    });
</script>
<script type="text/javascript" src="/static/js/echarts.min.js"></script>
<script type="text/javascript" src="/static/js/main.js"></script>
</body>
</html>