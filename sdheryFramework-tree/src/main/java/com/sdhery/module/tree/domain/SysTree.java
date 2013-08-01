package com.sdhery.module.tree.domain;

import com.sdhery.module.core.domain.BaseEntity;

/**
* @Title:实体类
* @Description: 系统树
* @author sdhery
* @Date:2013-06-22 14:58:20
*/

public class SysTree extends BaseEntity {

    Integer sysTreeId;//系统树主键
    Integer parentId;//树的父ID
    Integer pos;//排序
    String sysTreeName;//树名称

    public Integer getSysTreeId() {
        return sysTreeId;
    }

    public void setSysTreeId(Integer sysTreeId) {
        this.sysTreeId = sysTreeId;
    }
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }
    public String getSysTreeName() {
        return sysTreeName;
    }

    public void setSysTreeName(String sysTreeName) {
        this.sysTreeName = sysTreeName;
    }
}