package com.wm.idq.service.impl;

import com.wm.idq.constants.NumberConstants;
import com.wm.idq.entity.FundMemberEntity;
import com.wm.idq.mapper.FundMemberMapper;
import com.wm.idq.service.FundMemberService;
import com.wm.idq.util.UUIDGenerator;
import com.wm.idq.vo.FundMemberVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-03
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FundMemberServiceImpl implements FundMemberService {

    /**
     * LOGGER
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[NumberConstants.ONE].getClassName());

    @Autowired
    FundMemberMapper fundMemberMapper;

    public List<FundMemberVo> queryAllFundMember() {
        // 查询数据库
        List<FundMemberEntity> fundMemberEntityList = fundMemberMapper.queryAllFundMember();
        // 构建页面VO
        return initFundMemberVoList(fundMemberEntityList);
    }

    /**
     * 构建VO，数据分离
     *
     * @param fundMemberEntityList List<FundMemberEntity>
     * @return List<FundMemberVo>
     */
    private List<FundMemberVo> initFundMemberVoList(List<FundMemberEntity> fundMemberEntityList) {
        // 当前方法
        final String method = Thread.currentThread().getStackTrace()[NumberConstants.ONE].getMethodName();
        // 日志
        LOGGER.info(method + ": fundMemberEntityList=" + fundMemberEntityList);
        // 遍历构建
        List<FundMemberVo> fundMemberVoList = new ArrayList<FundMemberVo>();
        for (FundMemberEntity fundMemberEntity : fundMemberEntityList) {
            FundMemberVo fundMemberVo = new FundMemberVo();
            fundMemberVo.setMemberId(fundMemberEntity.getId());
            fundMemberVo.setMemberName(fundMemberEntity.getName());
            fundMemberVoList.add(fundMemberVo);
        }
        return fundMemberVoList;
    }

    /**
     * 插入基金成员
     *
     * @param fundMemberVo FundMemberVo
     * @return boolean
     */
    public boolean insertFundMember(FundMemberVo fundMemberVo) {
        FundMemberEntity fundMemberEntity = new FundMemberEntity();
        BeanUtils.copyProperties(fundMemberVo, fundMemberEntity);
        fundMemberEntity.setName(fundMemberVo.getMemberName());
        fundMemberEntity.setId(UUIDGenerator.get32UUID());
        return NumberConstants.ZERO < fundMemberMapper.insertFundMember(fundMemberEntity);
    }
}
