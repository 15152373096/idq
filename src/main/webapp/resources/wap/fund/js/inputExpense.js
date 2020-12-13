/**
 * 捐赠人员初始化
 */
function projectInit() {
    $.ajax({
        url: "/idq/fundProject/getAll",
        type: "post",
        dataType: "json",
        contentType: 'application/json;charset=utf-8',
        cache: true,
        success: function (data) {
            var projectList = data.fundProjectList;
            var sourceData = $.map(projectList, function (item) {
                return {
                    label: item.projectName,
                    value: item.projectId
                }
            });
            projectAutoComplete(sourceData);
        }
    });
}

/**
 * 捐赠人员自动关联
 */
function projectAutoComplete(sourceData) {
    $("#projectName").autocomplete({
        source: sourceData,
        focus: function (event, ui) {
            $("#projectName").val(ui.item.label);
            $("#projectId").val(ui.item.value);
            return false;
        },
        select: function (event, ui) {
            $("#projectName").val(ui.item.label);
            $("#projectId").val(ui.item.value);
            return false;
        }
    });
}

/**
 * 捐赠备注字数限制
 */
function wordCountLimit() {
    // 支出描述
    $(document).on("propertychange input",".expense-description .description-content", function () {
        var $this = $(this);
        var value = "" + $this.val();
        value = value.replace(/[<>%$*^]/g, "");
        if (value.length > 512) {
            $this.val(value.substring(0, 512));
            $('.expense-description .number-control .count').text(512);
        } else {
            $('.expense-description .number-control .count').text(value.length);
        }
    });
    // 支出备注
    $(document).on("propertychange input",".expense-remark .description-content", function () {
        var $this = $(this);
        var value = "" + $this.val();
        value = value.replace(/[<>%$*^]/g, "");
        if (value.length > 256) {
            $this.val(value.substring(0, 256));
            $('.expense-remark .number-control .count').text(256);
        } else {
            $('.expense-remark .number-control .count').text(value.length);
        }
    });
}

/**
 * 提交事件绑定
 */
function bindSubmit() {
    var $submit = $("#submit");
    $submit.removeClass("disable-btn").addClass("confirm-btn");
    $submit.click(function () {
        if (checkSubmit()) {
            unbindSubmit();
            submitFundExpense();
        }
    });
}

/**
 * 提交事件解绑
 */
function unbindSubmit() {
    var $submit = $("#submit");
    $submit.unbind("click");
    $submit.removeClass("confirm-btn").addClass("disable-btn");
}

/**
 * 基金支出提交
 */
function submitFundExpense() {
    var data = {
        'fundDate': $("#fundDate").val(),
        'projectId': $("#projectId").val(),
        'expenseAmount': $("#expenseAmount").val(),
        'description': $("#description").val(),
        'comment': $("#comment").val()
    };
    $.ajax({
        url: "/idq/wap/fundExpense/submit",
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
    $("#projectName").val("");
    $("#projectId").val("");
    $("#donateAmount").val("");
    $("#description").val("");
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
    if ("" === $("#projectId").val() || "" === $("#projectName").val()) {
        alertError("请通过点击选择正确关联支出项目");
        return false;
    }
    if ("" === $(".money-content").val()) {
        alertError("请输入支出金额");
        return false;
    }
    return true;
}

/**
 * 入口
 */
$(function () {
    projectInit();
    wordCountLimit();
    bindSubmit();
});
