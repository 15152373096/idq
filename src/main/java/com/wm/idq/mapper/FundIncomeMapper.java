package com.wm.idq.mapper;

import com.wm.idq.entity.FundIncomeEntity;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-04
 */
public interface FundIncomeMapper {

    /**
     * 插入基金收入数据
     *
     * @param fundIncomeEntity FundIncomeEntity
     * @return int
     */
    int insertFundIncome(FundIncomeEntity fundIncomeEntity);
}
