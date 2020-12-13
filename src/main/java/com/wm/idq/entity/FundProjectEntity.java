package com.wm.idq.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.sql.Timestamp;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-25
 */
public class FundProjectEntity {

    /**
     * id
     */
    private String id;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目描述
     */
    private String description;

    /**
     * 备注
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                .append("name", name)
                .append("description", description)
                .append("comment", comment)
                .append("createTime", createTime)
                .append("updateTime", updateTime)
                .toString();
    }
}
