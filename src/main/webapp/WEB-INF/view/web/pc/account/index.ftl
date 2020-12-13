<!DOCTYPE html>
<#import "/spring.ftl" as spring/>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="shortcut icon" href="<@spring.url '/resources/common/images/favicon.ico'/>" type="image/x-icon">

    <title>DQ专属账本</title>

    <!-- CSS引入 -->
    <link href="<@spring.url '/resources/pc/account/css/index.css'/>" rel="stylesheet" type="text/css">

    <!-- JS引入 -->
    <script src="<@spring.url '/resources/common/js/jquery.min.js'/>" type="text/javascript"></script>
    <script src="<@spring.url '/resources/pc/account/js/index.js'/>" type="text/javascript"></script>

</head>
<body>

<!-- 右侧主页面 -->
<div class="wrap" id="main-wrap">
<#include "main-wrap.ftl">
</div>

<!-- 左侧导航栏 -->
<#include "side-bar.ftl">
</body>
</html>
