package com.sdhery.module.privilege.domain;

import com.sdhery.module.core.domain.BaseEntity;

/**
* @Title:实体类
* @Description: sdhery
* @author sdhery
* @Date:2013-07-27 11:15:03
*/

public class SysModule extends BaseEntity {

    Integer sysModuleId;
    String moduleName;
    Integer defaultActionId;

    public Integer getSysModuleId() {
        return sysModuleId;
    }

    public void setSysModuleId(Integer sysModuleId) {
        this.sysModuleId = sysModuleId;
    }
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public Integer getDefaultActionId() {
        return defaultActionId;
    }

    public void setDefaultActionId(Integer defaultActionId) {
        this.defaultActionId = defaultActionId;
    }
}