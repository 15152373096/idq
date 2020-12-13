package com.wm.idq.controller.pc;

import com.wm.idq.constants.AccountContants;
import com.wm.idq.constants.FineReportlets;
import com.wm.idq.constants.NumberConstants;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-01-22
 */

@Controller
@RequestMapping(value = "/pc/account")
public class PcAccountController {

    /**
     * LOGGER
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[NumberConstants.ONE].getClassName());

    /**
     * 账单主页
     */
    private static final String FTL_ACCOUNT_INDEX = "/web/pc/account/index";

    /**
     * FR加载页面
     */
    private static final String FTL_FR_WRAP = "/web/pc/account/main-wrap";


    @RequestMapping(value = "/index")
    public String index() {
        return FTL_ACCOUNT_INDEX;
    }

    @RequestMapping(value = "/goReportlets")
    public String goReportlets(HttpServletRequest request, Model model) {
        // 当前方法
        final String method = Thread.currentThread().getStackTrace()[NumberConstants.ONE].getMethodName();
        // 请求表单
        String requestReport = request.getParameter(AccountContants.REPORTLETS);
        // log
        LOGGER.info(method + ": report_lets");
        if (StringUtils.equals(AccountContants.FUND_MEMBER_CONFIG, requestReport)) {
            // 成员配置
            model.addAttribute(AccountContants.REPORTLETS, FineReportlets.PC_MEMBER_CONFIG);
        } else if (StringUtils.equals(AccountContants.FUND_PROJECT_CONFIG, requestReport)) {
            // 项目配置
            model.addAttribute(AccountContants.REPORTLETS, FineReportlets.PC_PROJECT_CONFIG);
        } else if (StringUtils.equals(AccountContants.FUND_INCOME_INPUT, requestReport)) {
            // 基金收入录入
            model.addAttribute(AccountContants.REPORTLETS, FineReportlets.PC_FUND_INCOME_INPUT);
        } else if (StringUtils.equals(AccountContants.FUND_EXPENSE_INPUT, requestReport)) {
            // 基金支出录入
            model.addAttribute(AccountContants.REPORTLETS, FineReportlets.PC_FUND_EXPENSE_INPUT);
        } else if (StringUtils.equals(AccountContants.FUND_BOOK_VIEW, requestReport)) {
            // 基金收支查询（基金账单预览）
            model.addAttribute(AccountContants.REPORTLETS, FineReportlets.PC_FUND_BOOK_VIEW);
        }
        if (StringUtils.equals(AccountContants.FUND_MEMBER_ANALYZE, requestReport)) {
            // 成员分析
            model.addAttribute(AccountContants.REPORTLETS, FineReportlets.PC_MEMBER_ANALYZE);
        }
        // 返回页面
        return FTL_FR_WRAP;
    }
}
