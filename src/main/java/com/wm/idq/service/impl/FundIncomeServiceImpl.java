package com.wm.idq.service.impl;

import com.wm.idq.constants.NumberConstants;
import com.wm.idq.entity.FundIncomeEntity;
import com.wm.idq.mapper.FundIncomeMapper;
import com.wm.idq.service.FundIncomeService;
import com.wm.idq.util.UUIDGenerator;
import com.wm.idq.vo.FundIncomeVo;
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
public class FundIncomeServiceImpl implements FundIncomeService {

    @Autowired
    FundIncomeMapper fundIncomeMapper;

    public boolean insertFundIncome(FundIncomeVo incomeVo) {
        FundIncomeEntity fundIncomeEntity = new FundIncomeEntity();
        BeanUtils.copyProperties(incomeVo, fundIncomeEntity);
        fundIncomeEntity.setId(UUIDGenerator.get32UUID());
        return NumberConstants.ZERO < fundIncomeMapper.insertFundIncome(fundIncomeEntity);
    }
}
