package com.sdhery.module.privilege.domain;

import com.sdhery.module.core.domain.BaseEntity;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-10-29
 * Time: 下午5:32
 * 权限角色
 */
public class SysRole extends BaseEntity {
    private Integer sysRoleId;
    private String sysRoleName;

    public Integer getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(Integer sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    public String getSysRoleName() {
        return sysRoleName;
    }

    public void setSysRoleName(String sysRoleName) {
        this.sysRoleName = sysRoleName;
    }
}
