<!doctype html>
<#import "/spring.ftl" as spring/>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width"/>
    <meta name="viewport" content="initial-scale=1.0,user-scalable=no"/>
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <link rel="shortcut icon" href="<@spring.url '/resources/common/images/favicon.ico'/>" type="image/x-icon">
    <title>嗲琼专属管理页</title>

    <!-- CSS引入 -->
    <link rel="stylesheet" type="text/css" href="<@spring.url '/resources/wap/account/css/index.css'/>">
</head>

<body>
<!--top开始-->

<div class="banner"><img src="<@spring.url '/resources/wap/account/images/banner_dqzs.jpg'/>"></div>
<!--top结束-->
<div class="main">
    <ul>
        <li class="border">
            <a href="/idq/wap/fundIncome/input">
                <P><img src="<@spring.url '/resources/wap/account/images/icon_1_13.png'/>"/><span>基金收入录入</span></P>
            </a>
        </li>
        <li class="border">
            <a href="/idq/wap/fundExpense/input">
                <P><img src="<@spring.url '/resources/wap/account/images/icon_1_15.png'/>"/><span>基金支出录入</span></P>
            </a>
        </li>
        <li class="border_bottom">
            <a href="/idq/wap/fundMember/input">
                <P><img src="<@spring.url '/resources/wap/account/images/icon_1_17.png'/>"/><span>基金人员录入</span></P>
            </a>
        </li>
        <li class="border_right">
            <a href="/idq/wap/fundIncome/view">
                <P><img src="<@spring.url '/resources/wap/account/images/icon_1_05.png'/>"/><span>基金收入查询</span></P>
            </a>
        </li>
        <li class="border_right">
            <a href="/idq/wap/fundExpense/view">
                <P><img src="<@spring.url '/resources/wap/account/images/icon_1_03.png'/>"/><span>基金支出查询</span></P>
            </a>
        </li>
        <li>
            <a href="">
                <P><img src="<@spring.url '/resources/wap/account/images/icon_1_07.png'/>"/><span>建设中</span></P>
            </a>
        </li>
    </ul>
</div>

<div class="foot"><p>技术支持：一个小正经</p></div>
</body>
</html>
