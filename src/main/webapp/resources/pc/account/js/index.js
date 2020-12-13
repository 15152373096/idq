/**
 * 鼠标移除
 */
function thisMouseOut() {
    $('.nav-slide').removeClass('hover');
}

/**
 * 侧边栏动画
 */
function initSideBar() {
    var thisTime;
    $('.nav-ul li').mouseleave(function (even) {
        thisTime = setTimeout(thisMouseOut, 1000);
    })

    $('.nav-ul li').mouseenter(function () {
        clearTimeout(thisTime);
        var thisUB = $('.nav-ul li').index($(this));
        if ($.trim($('.nav-slide-o').eq(thisUB).html()) != "") {
            $('.nav-slide').addClass('hover');
            $('.nav-slide-o').hide();
            $('.nav-slide-o').eq(thisUB).show();
        }
        else {
            $('.nav-slide').removeClass('hover');
        }
    })

    $('.nav-slide').mouseenter(function () {
        clearTimeout(thisTime);
        $('.nav-slide').addClass('hover');
    })
    $('.nav-slide').mouseleave(function () {
        $('.nav-slide').removeClass('hover');
    })
}

/**
 * 跳转配置模版
 * @param reportletsName
 */
function goReportlets(reportlets) {
    $.ajax({
        type: "GET",
        url: "/idq/pc/account/goReportlets",
        data: {reportlets: reportlets},
        dataType: "html",
        contentType: "application/html;charset=utf-8",
        success : function (data) {
            $("#main-wrap").html(data);
        },
        error : function () {
            alert("err");
        }
    });
}

/**
 * 入口
 */
$(document).ready(function () {
    initSideBar()
});


