package com.wm.idq.controller.wap;

import com.alibaba.fastjson.JSON;
import com.wm.idq.constants.AccountContants;
import com.wm.idq.constants.CommonConstants;
import com.wm.idq.constants.FineReportlets;
import com.wm.idq.constants.NumberConstants;
import com.wm.idq.service.FundExpenseService;
import com.wm.idq.util.CommonUtils;
import com.wm.idq.util.DateUtils;
import com.wm.idq.vo.FundExpenseVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-23
 */

@Controller
@RequestMapping(value = "/wap/fundExpense")
public class WapFundExpenseController {

    /**
     * LOGGER
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[NumberConstants.ONE].getClassName());

    /**
     * 账单主页
     */
    private static final String FTL_FUND_INPUT = "/web/wap/fund/inputExpense";

    @Autowired
    FundExpenseService fundExpenseService;

    /**
     * 基金支出录入
     *
     * @return String
     */
    @RequestMapping(value = "/input")
    public String inputIncome(Model model) {
        // 构建月份
        List<String> recentMonths = CommonUtils.initRecentMonths(DateUtils.FORMAT_YYYY_MM_CHINESE);
        // 构建model
        model.addAttribute(AccountContants.RECENT_MONTHS, recentMonths);
        // 跳转
        return FTL_FUND_INPUT;
    }

    /**
     * 基金收入录入提交
     *
     * @param fundExpenseVo FundIncomeVo
     * @param response     HttpServletResponse
     * @throws IOException IOException
     */
    @RequestMapping(value = "/submit")
    public void submit(FundExpenseVo fundExpenseVo, HttpServletResponse response) throws IOException {
        // 当前方法
        final String method = Thread.currentThread().getStackTrace()[NumberConstants.ONE].getMethodName();
        // 定义返回map
        Map<String, Object> map = new HashMap<String, Object>(NumberConstants.SIXTEEN);
        // 服务调用
        boolean insertSuccess = fundExpenseService.insertFundExpense(fundExpenseVo);
        // 日志记录
        LOGGER.info(method + ": insertFundIncome return " + insertSuccess);
        // 构建map
        if (insertSuccess) {
            map.put(CommonConstants.CODE, CommonConstants.YES);
        } else {
            map.put(CommonConstants.CODE, CommonConstants.NO);
        }
        // 相应消息
        response.getWriter().write(JSON.toJSONString(map));
    }

    /**
     * 查询基金支出
     *
     * @param model Model
     * @return String
     */
    @RequestMapping(value = "/view")
    public String view(Model model) {
        // 标题
        model.addAttribute(AccountContants.TITLE, AccountContants.TITLE_FUND_EXPENSE_VIEW);
        // 报表属性
        model.addAttribute(AccountContants.REPORTLETS, FineReportlets.WAP_FUND_EXPENSE_VIEW);
        // 返回
        return AccountContants.WAP_ACCOUNT_CPT_INDEX;
    }
}
