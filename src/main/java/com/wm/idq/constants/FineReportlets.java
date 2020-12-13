package com.wm.idq.constants;

/**
 *  帆软报表
 *
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-01-23
 */
public class FineReportlets {

    /**
     * 基金捐赠人员配置-PC
     */
    public static final String PC_MEMBER_CONFIG = "/WebReport/ReportServer?reportlet=account%2Fpc%2Ffund_member_config.cpt&op=write&__cutpage__=v";

    /**
     * 基金支出项目配置-PC
     */
    public static final String PC_PROJECT_CONFIG = "/WebReport/ReportServer?reportlet=account%2Fpc%2Ffund_project_config.cpt&op=write&__cutpage__=v";

    /**
     * 基金收入录入-PC
     */
    public static final String PC_FUND_INCOME_INPUT = "/WebReport/ReportServer?reportlet=account%2Fpc%2Ffund_income_input.cpt&op=write&__cutpage__=v";

    /**
     * 基金支出录入-PC
     */
    public static final String PC_FUND_EXPENSE_INPUT = "/WebReport/ReportServer?reportlet=account%2Fpc%2Ffund_expense_input.cpt&op=write&__cutpage__=v";

    /**
     * 基金收支查询-PC
     */
    public static final String PC_FUND_BOOK_VIEW = "/WebReport/ReportServer?reportlet=account%2Fpc%2Ffund_book_view.cpt";

    /**
     * 基金捐赠人员分析-PC
     */
    public static final String PC_MEMBER_ANALYZE = "/WebReport/ReportServer?reportlet=account%2Fpc%2Ffund_member_analyze.cpt&op=write&__cutpage__=v";

    /**
     * 基金收入查询-WAP
     */
    public static final String WAP_FUND_INCOME_VIEW = "/WebReport/ReportServer?reportlet=account%2Fwap%2Ffund_income_view.cpt&op=h5&__cache__=true";

    /**
     * 基金支出查询-WAP
     */
    public static final String WAP_FUND_EXPENSE_VIEW = "/WebReport/ReportServer?reportlet=account%2Fwap%2Ffund_expense_view.cpt&op=h5&__cache__=true";

}
