package com.sdhery.module.privilege.service.impl;


import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.core.service.impl.BaseService;
import com.sdhery.module.privilege.dao.ISysResourceDao;
import com.sdhery.module.privilege.domain.SysResource;
import com.sdhery.module.privilege.service.ISysResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @Title:实现业务操作类
* @Description: 权限资源
* @author hqq
* @Date:2013-09-17 15:22:30
*/
@Service
public class SysResourceService extends BaseService<SysResource, Integer> implements ISysResourceService {
    @Autowired
    ISysResourceDao sysResourceDao;

    protected EntityDao<SysResource, Integer> getEntityDao() {
        return sysResourceDao;
    }

    public List<SysResource> searchPermissionResource() {
        return sysResourceDao.searchPermissionResource();
    }

    public List<SysResource> getSysMenuResource() {
        return sysResourceDao.getSysMenuResource();
    }
}