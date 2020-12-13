package com.wm.idq.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-25
 */
public class FundProjectVo {

    /**
     * 项目ID
     */
    private String projectId;

    /**
     * 项目名称
     */
    private String projectName;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("projectId", projectId)
                .append("projectName", projectName)
                .toString();
    }
}
