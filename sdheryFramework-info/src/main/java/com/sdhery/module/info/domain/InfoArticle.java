package com.sdhery.module.info.domain;

import com.sdhery.module.core.domain.BaseEntity;
import java.util.Date;

/**
* @Title:实体类
* @Description: 信息
* @author sdhery
* @Date:2013-07-09 10:41:16
*/

public class InfoArticle extends BaseEntity {

    Integer infoArticleId;//主键
    String title;//标题
    String content;//内容
    Date createTime;//创建时间

    public Integer getInfoArticleId() {
        return infoArticleId;
    }

    public void setInfoArticleId(Integer infoArticleId) {
        this.infoArticleId = infoArticleId;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}