<!DOCTYPE html>
<#import "/spring.ftl" as spring/>
<html>

<head>
    <meta charset="UTF-8">
    <link rel="shortcut icon" href="<@spring.url '/resources/common/images/favicon.ico'/>" type="image/x-icon">
    <title>基金收入录入</title>
    <meta content="yes" name="apple-mobile-web-app-capable">
    <meta content="yes" name="apple-touch-fullscreen">
    <meta content="telephone=no,email=no" name="format-detection">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
    <!-- 引入项目css资源文件,并配置构建地址演示 -->
    <link rel="stylesheet" href="<@spring.url '/resources/common/css/jquery-ui.min.css'/>">
    <link rel="stylesheet" href="<@spring.url '/resources/wap/fund/css/fundInput.css'/>">
</head>

<body>
<div class="nav">
    <a href="javascript:window.history.back();" class="return"><i></i></a>
    <p class="title">基金收入录入</p>
</div>
<div class="service-detail-modify clearfix">
    <div class="service-time-box clearfix">
        <span class="service-time-title">捐赠年月<i>*</i></span>
        <select id="fundDate" name="fundDate" class="service-time-content type-select">
            <#list recentMonths as month>
                <option value="${month}" <#if .now?string("yyyy年MM月") == month>selected</#if> class="type-option">${month}</option>
            </#list>
        </select>
        <i class="edit-servie-tip"></i>
    </div>

    <div class="member-box clearfix">
        <span class="member-title">捐赠人员<i>*</i></span>
        <input type="text" id="memberName" name="memberName" class="member-content" placeholder="请关联捐赠人员">
        <input type="hidden" id="memberId" name="memberId" class="member-content">
    </div>

    <div class="money-box clearfix">
        <span class="tel-title">捐赠金额<i>*</i></span>
        <input id="donateAmount" name="donateAmount" type="text" class="money-content" placeholder="请输入捐款金额" onkeyup="value=value.replace(/[^0-9,.]/g,'')">
    </div>

    <div class="problem-description">
        <p class="remark-title">捐赠备注：</p>
        <textarea id="comment" name="comment" class="description-content" maxlength="256" placeholder="按需输入备注"></textarea>
        <div class="number-control number-1"><i class="count">0</i>/256</div>
    </div>

</div>
<div class="service-btn">
    <button id="submit" class="confirm-btn">确认录入</button>
</div>
<!-- 引入项目js资源文件,并配置构建地址演示 -->
<script src="<@spring.url '/resources/common/js/jquery.min.js'/>"></script>
<script src="<@spring.url '/resources/common/js/jquery-ui.min.js'/>"></script>
<script src="<@spring.url '/resources/wap/common/js/wap_alertBox.js'/>"></script>
<script src="<@spring.url '/resources/wap/fund/js/inputIncome.js'/>"></script>
</body>

</html>
