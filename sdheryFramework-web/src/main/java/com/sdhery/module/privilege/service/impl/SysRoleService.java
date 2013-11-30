package com.sdhery.module.privilege.service.impl;

import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.core.service.impl.BaseService;
import com.sdhery.module.privilege.dao.ISysRoleDao;
import com.sdhery.module.privilege.domain.SysRole;
import com.sdhery.module.privilege.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-10-30
 * Time: 下午3:39
 * 权限角色
 */
@Service
public class SysRoleService extends BaseService<SysRole, Integer> implements ISysRoleService{
    @Autowired
    ISysRoleDao sysRoleDao;

    protected EntityDao<SysRole, Integer> getEntityDao() {
        return sysRoleDao;
    }

    public void addSysSysRole(SysRole sysRole, Integer[] sysResourceIds) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
