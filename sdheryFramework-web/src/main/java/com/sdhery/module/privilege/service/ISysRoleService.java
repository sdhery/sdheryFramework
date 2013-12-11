package com.sdhery.module.privilege.service;

import com.sdhery.module.core.service.IBaseService;
import com.sdhery.module.privilege.domain.SysRole;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-10-30
 * Time: 下午3:38
 * 权限角色
 */
public interface ISysRoleService extends IBaseService<SysRole, Integer> {
    /**
     * 增加角色同时授权
     * @param sysRole
     * @param sysResourceIds
     */
    void addSysSysRole(SysRole sysRole,Integer[] sysResourceIds) throws Exception;

    boolean countRoleResource(int sysRoleId,int sysResourceId);

    void updateSysSysRole(SysRole sysRole, Integer[] sysResourceIds) throws Exception;

    int deleteRoleResource(Integer sysRoleId);

    List<Integer> searchRoleSysResource(Integer sysRoleId);

    List<Integer> getRoleIdByObjId(Integer objId,Integer objType);

    void roleDispatcher(Integer[] sysRoleIds,Integer objId,Integer objType) throws Exception;
}
