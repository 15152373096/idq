package com.wm.idq.service;

import com.wm.idq.vo.FundExpenseVo;

/**
 * 基金收入service
 *
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-04
 */
public interface FundExpenseService {

    /**
     * 录入基金支出
     *
     * @param expenseVo FundExpenseVo
     * @return 成功标识
     */
    boolean insertFundExpense(FundExpenseVo expenseVo);
}
