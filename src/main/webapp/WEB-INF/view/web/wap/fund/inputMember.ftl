<!DOCTYPE html>
<#import "/spring.ftl" as spring/>
<html>

<head>
    <meta charset="UTF-8">
    <link rel="shortcut icon" href="<@spring.url '/resources/common/images/favicon.ico'/>" type="image/x-icon">
    <title>基金人员录入</title>
    <meta content="yes" name="apple-mobile-web-app-capable">
    <meta content="yes" name="apple-touch-fullscreen">
    <meta content="telephone=no,email=no" name="format-detection">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
    <!-- 引入项目css资源文件,并配置构建地址演示 -->
    <link rel="stylesheet" href="<@spring.url '/resources/wap/fund/css/fundInput.css'/>">
</head>

<body>
<div class="nav">
    <a href="javascript:window.history.back();" class="return"><i></i></a>
    <p class="title">基金人员录入</p>
</div>
<div class="service-detail-modify clearfix">

    <div class="member-box clearfix">
        <span class="member-title">人员姓名<i>*</i></span>
        <input type="text" id="memberName" name="memberName" class="member-content" placeholder="请输入人员姓名">
    </div>

    <div class="money-box clearfix">
        <span class="tel-title">联系电话</span>
        <input id="phone" name="phone" type="text" class="money-content" placeholder="请输入联系电话" onkeyup="value=value.replace(/[^0-9,.]/g,'')">
    </div>

    <div class="problem-description">
        <p class="remark-title">人员备注：</p>
        <textarea id="comment" name="comment" class="description-content" maxlength="256" placeholder="按需输入备注"></textarea>
        <div class="number-control number-1"><i class="count">0</i>/256</div>
    </div>

</div>
<div class="service-btn">
    <button id="submit" class="confirm-btn">确认录入</button>
</div>
<!-- 引入项目js资源文件,并配置构建地址演示 -->
<script src="<@spring.url '/resources/common/js/jquery.min.js'/>"></script>
<script src="<@spring.url '/resources/wap/common/js/wap_alertBox.js'/>"></script>
<script src="<@spring.url '/resources/wap/fund/js/inputMember.js'/>"></script>
</body>

</html>
