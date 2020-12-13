package com.wm.idq.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.sql.Timestamp;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-04
 */
public class FundIncomeEntity {

    /**
     * id
     */
    private String id;

    /**
     * 捐赠年月
     */
    private String fundDate;

    /**
     * 捐赠成员ID
     */
    private String memberId;

    /**
     * 捐赠数额
     */
    private String donateAmount;

    /**
     * 捐赠备注
     */
    private String comment;

    /**
     * 创建时间
     */
    private Timestamp createTime;

    /**
     * 更新时间
     */
    private Timestamp updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFundDate() {
        return fundDate;
    }

    public void setFundDate(String fundDate) {
        this.fundDate = fundDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getDonateAmount() {
        return donateAmount;
    }

    public void setDonateAmount(String donateAmount) {
        this.donateAmount = donateAmount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("fundDate", fundDate)
                .append("memberId", memberId)
                .append("donateAmount", donateAmount)
                .append("comment", comment)
                .append("createTime", createTime)
                .append("updateTime", updateTime)
                .toString();
    }
}
