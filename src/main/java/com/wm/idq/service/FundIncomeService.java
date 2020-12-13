package com.wm.idq.service;

import com.wm.idq.vo.FundIncomeVo;

/**
 * 基金收入service
 *
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-04
 */
public interface FundIncomeService {

    /**
     * 录入基金收入
     *
     * @param incomeVo FundIncomeVo
     * @return 成功标识
     */
    boolean insertFundIncome(FundIncomeVo incomeVo);
}
