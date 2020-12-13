<!DOCTYPE html>
<#import "/spring.ftl" as spring/>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="shortcut icon" href="<@spring.url '/resources/common/images/favicon.ico'/>" type="image/x-icon">

    <title>${title}</title>

    <!-- JS引入 -->
    <script src="<@spring.url '/resources/common/js/jquery.min.js'/>" type="text/javascript"></script>

</head>
<body style="margin:0;">
<#if reportlets?? && "" != reportlets>
    <iframe id="reportFrame" src="${reportlets}" width=100% height=100% frameborder="0"></iframe>
</#if>

<script>
    $(document).ready(function () {
        // iframe全屏显示
        $reportFrame = document.getElementById('reportFrame');
        if (null != $reportFrame) {
            $("#reportFrame").css("height", $(window).height() + "px");
            $("#reportFrame").css("width", $(window).width() + "px");
        }
    })
</script>
</body>
</html>
