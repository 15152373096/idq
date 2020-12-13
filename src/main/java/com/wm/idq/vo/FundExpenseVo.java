package com.wm.idq.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 基金收入VO
 *
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-04
 */
public class FundExpenseVo {

    /**
     * 支出年月
     */
    private String fundDate;

    /**
     * 支出项目ID
     */
    private String projectId;

    /**
     * 支出金额
     */
    private String expenseAmount;

    /**
     * 支出描述
     */
    private String description;

    /**
     * 支出备注
     */
    private String comment;

    public String getFundDate() {
        return fundDate;
    }

    public void setFundDate(String fundDate) {
        this.fundDate = fundDate;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(String expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
                .append("projectId", projectId)
                .append("expenseAmount", expenseAmount)
                .append("description", description)
                .append("comment", comment)
                .toString();
    }
}
