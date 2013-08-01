package com.sdhery.module.privilege.domain;

import com.sdhery.module.core.domain.BaseEntity;

/**
* @Title:实体类
* @Description: sdhery
* @author sdhery
* @Date:2013-07-27 11:31:49
*/

public class SysAction extends BaseEntity {

    Integer sysActionId;
    String actionName;
    String actionUrl;

    public Integer getSysActionId() {
        return sysActionId;
    }

    public void setSysActionId(Integer sysActionId) {
        this.sysActionId = sysActionId;
    }
    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }
    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }
}