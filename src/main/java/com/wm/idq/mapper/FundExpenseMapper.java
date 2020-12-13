package com.wm.idq.mapper;

import com.wm.idq.entity.FundExpenseEntity;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-04
 */
public interface FundExpenseMapper {
    /**
     * 插入基金支出数据
     *
     * @param fundExpenseEntity FundExpenseEntity
     * @return int
     */
    int insertFundExpense(FundExpenseEntity fundExpenseEntity);
}
