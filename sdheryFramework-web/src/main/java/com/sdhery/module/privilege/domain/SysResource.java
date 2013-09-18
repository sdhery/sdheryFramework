package com.sdhery.module.privilege.domain;

import com.sdhery.module.core.domain.BaseEntity;

/**
* @Title:实体类
* @Description: 权限资源
* @author hqq
* @Date:2013-09-17 15:22:30
*/

public class SysResource extends BaseEntity {

    Integer sysResourceId;
    String resourceTitle;
    String resourceUrl;
    String permission;
    Integer pos;
    Integer parentId;

    public Integer getSysResourceId() {
        return sysResourceId;
    }

    public void setSysResourceId(Integer sysResourceId) {
        this.sysResourceId = sysResourceId;
    }
    public String getResourceTitle() {
        return resourceTitle;
    }

    public void setResourceTitle(String resourceTitle) {
        this.resourceTitle = resourceTitle;
    }
    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}