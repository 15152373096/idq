package com.wm.idq.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-01-05
 * @description 说明 : TODO
 */
public class ImageItemVo {
    /**
     * 图片id
     */
    private String id;

    /**
     * 主标题
     */
    private String title;

    /**
     * 副标题
     */
    private String subTitle;

    /**
     * 描述
     */
    private String description;

    /**
     * 链接
     */
    private String linkUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("title", title)
                .append("subTitle", subTitle)
                .append("description", description)
                .append("linkUrl", linkUrl)
                .toString();
    }
}
