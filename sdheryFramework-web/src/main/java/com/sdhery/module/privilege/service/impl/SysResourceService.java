package com.sdhery.module.privilege.service.impl;


import com.sdhery.module.core.base.ConcurrentHashMapExt;
import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.core.service.impl.BaseService;
import com.sdhery.module.privilege.dao.ISysResourceDao;
import com.sdhery.module.privilege.dao.ISysRoleDao;
import com.sdhery.module.privilege.domain.SysResource;
import com.sdhery.module.privilege.service.ISysResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hqq
 * @Title:实现业务操作类
 * @Description: 权限资源
 * @Date:2013-09-17 15:22:30
 */
@Service
public class SysResourceService extends BaseService<SysResource, Integer> implements ISysResourceService {
    @Autowired
    ISysResourceDao sysResourceDao;
    @Autowired
    ISysRoleDao sysRoleDao;

    protected EntityDao<SysResource, Integer> getEntityDao() {
        return sysResourceDao;
    }

    public List<SysResource> searchPermissionResource() {
        return sysResourceDao.searchPermissionResource();
    }

    public List<SysResource> getSysMenuResource() {
        return sysResourceDao.getSysMenuResource();
    }

    public SysResource getSysResourceBySysResourceId(int sysResourceId) {
        return sysResourceDao.getById(sysResourceId);
    }

    public List<SysResource> getSysResourceByParentId(int parentId) {
        return sysResourceDao.getSysResourceByParentId(parentId);
    }

    public Integer getSysResourceByParentIdCount(int parentId) {
        return sysResourceDao.getSysResourceByParentIdCount(parentId);
    }

    public void allot(Integer sysRoleId, Integer[] sysResourceIds) throws Exception {
        if(sysRoleId==null){
            throw new Exception("角色ID为空");
        }
        if(sysResourceIds==null){
            throw new Exception("资源ID为空");
        }
        ConcurrentHashMapExt model = new ConcurrentHashMapExt();
        for (Integer sysResourceId : sysResourceIds) {
            model.put("sysRoleId", sysRoleId);
            model.put("sysResourceId", sysResourceId);
            sysRoleDao.addRoleSysResource(model);
        }
    }
}