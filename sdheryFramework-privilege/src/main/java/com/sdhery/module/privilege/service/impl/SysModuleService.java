package com.sdhery.module.privilege.service.impl;


import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.core.service.impl.BaseService;
import com.sdhery.module.privilege.dao.ISysModuleDao;
import com.sdhery.module.privilege.domain.SysModule;
import com.sdhery.module.privilege.service.ISysModuleService;

/**
* @Title:实现业务操作类
* @Description: sdhery
* @author sdhery
* @Date:2013-07-27 11:15:03
*/
public class SysModuleService extends BaseService<SysModule, Integer> implements ISysModuleService {
    ISysModuleDao sysModuleDao;

    public void setSysModuleDao(ISysModuleDao sysModuleDao) {
        this.sysModuleDao = sysModuleDao;
    }

    protected EntityDao<SysModule, Integer> getEntityDao() {
        return sysModuleDao;
    }
}