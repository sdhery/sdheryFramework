package com.sdhery.module.privilege.dao;

import com.sdhery.module.core.base.ConcurrentHashMapExt;
import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.privilege.domain.SysRole;

import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-10-30
 * Time: 下午3:18
 * 权限角色
 */
public interface ISysRoleDao extends EntityDao<SysRole,Integer> {
    int addRoleSysResource(ConcurrentHashMapExt hashMap);

    int countRoleResource(ConcurrentHashMapExt hashMap);

    int deleteRoleResource(Integer sysRoleId);

    List<Integer> searchRoleSysResource(Integer sysRoleId);

    List<Integer> getRoleIdByObjId(ConcurrentHashMapExt hashMap);

    int deleteRoleDispatcher(ConcurrentHashMapExt hashMap);

    int addRoleDispatcher(ConcurrentHashMapExt hashMap);
}
