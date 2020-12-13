/**
 * 捐赠人员初始化
 */
function memberInit() {
    $.ajax({
        url: "/idq/fundMember/getAll",
        type: "post",
        dataType: "json",
        contentType: 'application/json;charset=utf-8',
        cache: true,
        success: function (data) {
            var memberList = data.fundMemberList;
            var sourceData = $.map(memberList, function (item) {
                return {
                    label: item.memberName,
                    value: item.memberId
                }
            });
            memberAutoComplete(sourceData);
        }
    });
}

/**
 * 捐赠人员自动关联
 */
function memberAutoComplete(sourceData) {
    $("#memberName").autocomplete({
        source: sourceData,
        focus: function (event, ui) {
            $("#memberName").val(ui.item.label);
            $("#memberId").val(ui.item.value);
            return false;
        },
        select: function (event, ui) {
            $("#memberName").val(ui.item.label);
            $("#memberId").val(ui.item.value);
            return false;
        }
    });
}

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
        'fundDate': $("#fundDate").val(),
        'memberId': $("#memberId").val(),
        'donateAmount': $("#donateAmount").val(),
        'comment': $("#comment").val()
    };
    $.ajax({
        url: "/idq/wap/fundIncome/submit",
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
    if ("" === $("#memberId").val() || "" === $("#memberName").val()) {
        alertError("请通过点击选择正确关联捐赠人员");
        return false;
    }
    if ("" === $(".money-content").val()) {
        alertError("请输入捐赠金额");
        return false;
    }
    return true;
}

/**
 * 入口
 */
$(function () {
    memberInit();
    wordCountLimit();
    bindSubmit();
});
