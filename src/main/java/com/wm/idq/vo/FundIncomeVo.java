package com.wm.idq.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 基金收入VO
 *
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-04
 */
public class FundIncomeVo {

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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("fundDate", fundDate)
                .append("memberId", memberId)
                .append("donateAmount", donateAmount)
                .append("comment", comment)
                .toString();
    }
}
