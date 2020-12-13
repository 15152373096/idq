package com.wm.idq.service;

import com.wm.idq.vo.FundMemberVo;

import java.util.List;

/**
 * 基金成员Service
 *
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-03
 */
public interface FundMemberService {

    /**
     * 查询所有基金成员
     *
     * @return List<FundMemberVo>
     */
    List<FundMemberVo> queryAllFundMember();

    /**
     * 插入基金成员
     *
     * @param fundMemberVo FundMemberVo
     * @return boolean
     */
    boolean insertFundMember(FundMemberVo fundMemberVo);
}
