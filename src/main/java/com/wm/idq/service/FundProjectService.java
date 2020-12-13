package com.wm.idq.service;

import com.wm.idq.vo.FundProjectVo;

import java.util.List;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-25
 */
public interface FundProjectService {
    /**
     * 查询所有基金成员
     *
     * @return List<FundMemberVo>
     */
    List<FundProjectVo> queryAllFundProject();
}
