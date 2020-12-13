<#if reportlets?? && "" != reportlets>
    <iframe id="reportFrame" src="${reportlets}" width=100% height=100% frameborder="0"></iframe>
<#else>

    <div class="logo">
        <h1>
            <a href="/idq/dqmz" target="_blank"><img src="<@spring.url '/resources/pc/dqmz/images/gallery/16.jpg'/>"></a>
        </h1>
    </div>
<p>鼠标移入侧边栏，二级菜单3D展开</br>
    鼠标hover背景变色 </br>
    不要点击上面图片
</p>
<div style="text-align:center;margin:50px 0; font-size:20px; color:#ffffff;">

</div>

</#if>

<script>
    $(document).ready(function () {
        $reportFrame = document.getElementById('reportFrame');
        //如果加载的是报表
        if(null != $reportFrame) {
            $("#main-wrap").css("background-color", "#FFFFFF");
            var contentPane = document.getElementById('reportFrame').contentWindow.contentPane;
            contentPane.on("afterload", function () {
                $("#reportFrame")[0].contentWindow.$(".sheet-container").css("width", "100%");
                $("#reportFrame")[0].contentWindow.$(".sheet-container").css("height", "100%");
                $("#reportFrame")[0].contentWindow.$(".x-table").parent().css("width", "100%");
                $("#reportFrame")[0].contentWindow.$(".x-table").parent().css("height", "100%");
            });
        }
    })
</script>
