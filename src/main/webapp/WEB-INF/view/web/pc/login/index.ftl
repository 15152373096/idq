<!DOCTYPE html>
<#import "/spring.ftl" as spring/>
<html lang="en" class="no-js">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="<@spring.url '/resources/common/images/favicon.ico'/>" type="image/x-icon">
    <title>DQ专属登录</title>
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/pc/login/css/normalize.css'/>"/>
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/pc/login/css/demo.css'/>"/>
    <!--必要样式-->
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/pc/login/css/component.css'/>"/>
    <!--[if IE]>
    <script src="<@spring.url '/resources/pc/login/js/html5.js'/>"></script>
    <![endif]-->
</head>
<body>
<div class="container demo-1">
    <div class="content">
        <div id="large-header" class="large-header">
            <canvas id="demo-canvas"></canvas>
            <div class="logo_box">
                <h3>DQ专属，欢迎您</h3>
                <form action="/idq/login<#if targetUrl ?? && '' != targetUrl>?targetUrl=${targetUrl}</#if>" id="loginform" name="loginform" method="post">
                    <div class="input_outer">
                        <span class="u_user"></span>
                        <input name="username" class="text" style="color: #FFFFFF !important" type="text"
                               placeholder="请输入账户">
                    </div>
                    <div class="input_outer">
                        <span class="us_uer"></span>
                        <input name="password" class="text"
                               style="color: #FFFFFF !important; position:absolute; z-index:100;" value=""
                               type="password" placeholder="请输入密码">
                    </div>
                    <div class="mb2"><a class="act-but submit" style="color: #FFFFFF">登录</a></div>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- /container -->
<script src="<@spring.url '/resources/common/js/jquery.min.js'/>"></script>
<script src="<@spring.url '/resources/pc/login/js/TweenLite.min.js'/>"></script>
<script src="<@spring.url '/resources/pc/login/js/TweenLite.min.js'/>"></script>
<script src="<@spring.url '/resources/pc/login/js/EasePack.min.js'/>"></script>
<script src="<@spring.url '/resources/pc/login/js/rAF.js'/>"></script>
<script src="<@spring.url '/resources/pc/login/js/demo-1.js'/>"></script>
<script>
    $(".submit").click(function () {
        $("#loginform").submit();
    });
    //添加回车事件
    $(document).keydown(function (e) {
        if(13 == e.keyCode) {
            $("#loginform").submit();
        }
    });
</script>
</body>
</html>