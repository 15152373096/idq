package com.wm.idq.mapper;

import com.wm.idq.entity.FundProjectEntity;

import java.util.List;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-25
 */
public interface FundProjectMapper {
    /**
     * 查询所有基金项目
     *
     * @return List<FundProjectEntity>
     */
    List<FundProjectEntity> queryAllFundProject();
}
