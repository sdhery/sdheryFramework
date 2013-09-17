package com.sdhery.module.privilege.service.impl;


import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.core.service.impl.BaseService;
import com.sdhery.module.privilege.dao.ISysResourceDao;
import com.sdhery.module.privilege.domain.SysResource;
import com.sdhery.module.privilege.service.ISysResourceService;

/**
* @Title:实现业务操作类
* @Description: 权限资源
* @author hqq
* @Date:2013-09-17 15:22:30
*/
public class SysResourceService extends BaseService<SysResource, Integer> implements ISysResourceService {
    ISysResourceDao sysResourceDao;

    public void setSysResourceDao(ISysResourceDao sysResourceDao) {
        this.sysResourceDao = sysResourceDao;
    }

    protected EntityDao<SysResource, Integer> getEntityDao() {
        return sysResourceDao;
    }
}