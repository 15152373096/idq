package com.wm.idq.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-03
 */
public class FundMemberVo {

    /**
     * 成员ID
     */
    private String memberId;

    /**
     * 成员名称
     */
    private String memberName;

    /**
     * 电话
     */
    private String phone;

    /**
     * 备注
     */
    private String comment;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("memberId", memberId)
                .append("memberName", memberName)
                .append("phone", phone)
                .append("comment", comment)
                .toString();
    }
}
