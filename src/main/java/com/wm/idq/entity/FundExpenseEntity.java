package com.wm.idq.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.sql.Timestamp;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-04
 */
public class FundExpenseEntity {

    /**
     * id
     */
    private String id;

    /**
     * 捐赠年月
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
                .append("projectId", projectId)
                .append("expenseAmount", expenseAmount)
                .append("description", description)
                .append("comment", comment)
                .append("createTime", createTime)
                .append("updateTime", updateTime)
                .toString();
    }
}
