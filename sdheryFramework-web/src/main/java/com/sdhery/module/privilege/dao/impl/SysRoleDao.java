package com.sdhery.module.privilege.dao.impl;

import com.sdhery.module.core.base.ConcurrentHashMapExt;
import com.sdhery.module.core.dao.impl.BaseMybatisDao;
import com.sdhery.module.privilege.dao.ISysRoleDao;
import com.sdhery.module.privilege.domain.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-10-30
 * Time: 下午3:19
 * 权限角色
 */
@Service
public class SysRoleDao extends BaseMybatisDao<SysRole, Integer> implements ISysRoleDao {

    public int addRoleSysResource(ConcurrentHashMapExt hashMap) {
        return getSqlSession().insert(getDaoNameSpace(".addRoleSysResource"),hashMap);
    }

    public int countRoleResource(ConcurrentHashMapExt hashMap) {
        return (Integer)getSqlSession().selectOne(getDaoNameSpace(".countRoleResource"),hashMap);
    }

    public int deleteRoleResource(Integer sysRoleId) {
        return getSqlSession().delete(getDaoNameSpace(".deleteRoleResource"),sysRoleId);
    }

    public List<Integer> searchRoleSysResource(Integer sysRoleId) {
        return getSqlSession().selectList(getDaoNameSpace(".searchRoleSysResource"),sysRoleId);
    }

    public List<Integer> getRoleIdByObjId(ConcurrentHashMapExt hashMap) {
        return getSqlSession().selectList(getDaoNameSpace(".getRoleIdByObjId"),hashMap);
    }

    public int deleteRoleDispatcher(ConcurrentHashMapExt hashMap) {
        return getSqlSession().delete(getDaoNameSpace(".deleteRoleDispatcher"),hashMap);
    }

    public int addRoleDispatcher(ConcurrentHashMapExt hashMap) {
        return getSqlSession().insert(getDaoNameSpace(".addRoleDispatcher"),hashMap);
    }
}
