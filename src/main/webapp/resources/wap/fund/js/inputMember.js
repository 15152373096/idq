
/**
 * 捐赠备注字数限制
 */
function wordCountLimit() {
    $(document).on("propertychange input",".problem-description .description-content", function () {
        var $this = $(this);
        var value = "" + $this.val();
        value = value.replace(/[<>%$*^]/g, "");
        if (value.length > 256) {
            $this.val(value.substring(0, 256));
            $('.number-control .count').text(256);
        } else {
            $('.number-control .count').text(value.length);
        }
    });
}

/**
 * 提交事件绑定
 */
function bindSubmit() {
    $("#submit").removeClass("disable-btn").addClass("confirm-btn");
    $("#submit").click(function () {
        if (checkSubmit()) {
            unbindSubmit();
            submitFundIncome();
        }
    });
}

/**
 * 提交事件解绑
 */
function unbindSubmit() {
    $("#submit").unbind("click");
    $("#submit").removeClass("confirm-btn").addClass("disable-btn");
}

/**
 * 基金收入提交
 */
function submitFundIncome() {
    var data = {
        'memberName': $("#memberName").val(),
        'phone': $("#phone").val(),
        'comment': $("#comment").val()
    };
    $.ajax({
        url: "/idq/wap/fundMember/submit",
        type: "post",
        data: data,
        dataType: "json",
        contentType: 'application/x-www-form-urlencoded',
        success: function (data) {
            var code = data.code;
            if('yes' === code) {
                alertOption("录入成功", "继续录入", "确认退出", continueInput, null, back, null)
            }else {
                alertError("录入失败")
            }
        }
    })
}

/**
 * 继续录入相应操作
 */
function continueInput() {
    // 清空数据
    $("#memberName").val("");
    $("#memberId").val("");
    $("#donateAmount").val("");
    $("#comment").val("");
    // 绑定提交
    bindSubmit();
}

/**
 * 后退
 */
function back() {
    window.history.back();
}

/**
 * 提交前验证
 */
function checkSubmit() {
    if ("" === $("#name").val() || "" === $("#name").val()) {
        alertError("请输入人员姓名");
        return false;
    }
    return true;
}

/**
 * 入口
 */
$(function () {
    wordCountLimit();
    bindSubmit();
});
