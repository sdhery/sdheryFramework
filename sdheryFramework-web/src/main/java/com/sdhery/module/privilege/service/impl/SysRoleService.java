package com.sdhery.module.privilege.service.impl;

import com.sdhery.module.core.base.ConcurrentHashMapExt;
import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.core.service.impl.BaseService;
import com.sdhery.module.privilege.dao.ISysRoleDao;
import com.sdhery.module.privilege.domain.SysRole;
import com.sdhery.module.privilege.service.ISysResourceService;
import com.sdhery.module.privilege.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-10-30
 * Time: 下午3:39
 * 权限角色
 */
@Service
public class SysRoleService extends BaseService<SysRole, Integer> implements ISysRoleService {
    @Autowired
    ISysRoleDao sysRoleDao;
    @Autowired
    ISysResourceService sysResourceService;

    protected EntityDao<SysRole, Integer> getEntityDao() {
        return sysRoleDao;
    }

    public void addSysSysRole(SysRole sysRole, Integer[] sysResourceIds) throws Exception {
        if (sysRole == null) {
            throw new Exception("角色为空");
        }
        if (sysResourceIds == null) {
            throw new Exception("角色授权为空");
        }
        int result = sysRoleDao.insert(sysRole);
        if (result == 0) {
            throw new Exception("角色增加不成功");
        }
        sysResourceService.allot(sysRole.getSysRoleId(), sysResourceIds);
    }

    public boolean countRoleResource(int sysRoleId, int sysResourceId) {
        ConcurrentHashMapExt model = new ConcurrentHashMapExt();
        model.put("sysRoleId", sysRoleId);
        model.put("sysResourceId", sysResourceId);
        return sysRoleDao.countRoleResource(model) == 0 ? false : true;
    }

    public void updateSysSysRole(SysRole sysRole, Integer[] sysResourceIds) throws Exception {
        if (sysRole == null || sysRole.getSysRoleId() == null) {
            throw new Exception("角色为空");
        }
        if (sysResourceIds == null) {
            throw new Exception("角色授权为空");
        }
        int result = sysRoleDao.update(sysRole);
        if (result == 0) {
            throw new Exception("角色修改不成功");
        }
        //先删除所有角色授权关联
        deleteRoleResource(sysRole.getSysRoleId());
        //再增加角色授权
        sysResourceService.allot(sysRole.getSysRoleId(), sysResourceIds);
    }

    public int deleteRoleResource(Integer sysRoleId) {
        return sysRoleDao.deleteRoleResource(sysRoleId);
    }

    public List<Integer> searchRoleSysResource(Integer sysRoleId) {
        return sysRoleDao.searchRoleSysResource(sysRoleId);
    }
}
