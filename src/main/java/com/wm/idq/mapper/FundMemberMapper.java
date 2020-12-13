package com.wm.idq.mapper;

import com.wm.idq.entity.FundMemberEntity;

import java.util.List;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-03
 */
public interface FundMemberMapper {

    /**
     * 查询所有基金成员
     *
     * @return List<FundMemberEntity>
     */
    List<FundMemberEntity> queryAllFundMember();

    /**
     * 插入基金成员
     *
     * @param fundMemberEntity FundMemberEntity
     * @return int
     */
    int insertFundMember(FundMemberEntity fundMemberEntity);
}
