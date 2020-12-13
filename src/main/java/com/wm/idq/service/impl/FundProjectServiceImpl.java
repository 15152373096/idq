package com.wm.idq.service.impl;

import com.wm.idq.constants.NumberConstants;
import com.wm.idq.entity.FundProjectEntity;
import com.wm.idq.mapper.FundProjectMapper;
import com.wm.idq.service.FundProjectService;
import com.wm.idq.vo.FundProjectVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-25
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FundProjectServiceImpl implements FundProjectService {

    /**
     * LOGGER
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[NumberConstants.ONE].getClassName());

    @Autowired
    FundProjectMapper fundProjectMapper;

    public List<FundProjectVo> queryAllFundProject() {
        // 查询数据库
        List<FundProjectEntity> fundProjectEntityList = fundProjectMapper.queryAllFundProject();
        // 构建页面VO
        return initFundProjectVoList(fundProjectEntityList);
    }

    /**
     * 构建VO，数据分离
     *
     * @param fundProjectEntityList List<FundProjectEntity>
     * @return List<FundProjectVo>
     */
    private List<FundProjectVo> initFundProjectVoList(List<FundProjectEntity> fundProjectEntityList) {
        // 当前方法
        final String method = Thread.currentThread().getStackTrace()[NumberConstants.ONE].getMethodName();
        // 日志
        LOGGER.info(method + ": fundProjectEntityList=" + fundProjectEntityList);
        // 遍历构建
        List<FundProjectVo> fundProjectVoList = new ArrayList<FundProjectVo>();
        for (FundProjectEntity fundProjectEntity: fundProjectEntityList) {
            FundProjectVo fundProjectVo = new FundProjectVo();
            fundProjectVo.setProjectId(fundProjectEntity.getId());
            fundProjectVo.setProjectName(fundProjectEntity.getName());
            fundProjectVoList.add(fundProjectVo);
        }
        return  fundProjectVoList;
    }
}
