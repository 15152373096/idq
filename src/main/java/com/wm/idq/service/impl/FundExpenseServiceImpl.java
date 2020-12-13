package com.wm.idq.service.impl;

import com.wm.idq.constants.NumberConstants;
import com.wm.idq.entity.FundExpenseEntity;
import com.wm.idq.mapper.FundExpenseMapper;
import com.wm.idq.service.FundExpenseService;
import com.wm.idq.util.UUIDGenerator;
import com.wm.idq.vo.FundExpenseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-04
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FundExpenseServiceImpl implements FundExpenseService {

    @Autowired
    FundExpenseMapper fundExpenseMapper;

    public boolean insertFundExpense(FundExpenseVo expenseVo) {
        FundExpenseEntity fundExpenseEntity = new FundExpenseEntity();
        BeanUtils.copyProperties(expenseVo, fundExpenseEntity);
        fundExpenseEntity.setId(UUIDGenerator.get32UUID());
        int result = fundExpenseMapper.insertFundExpense(fundExpenseEntity);
        return NumberConstants.ZERO < result;
    }
}
