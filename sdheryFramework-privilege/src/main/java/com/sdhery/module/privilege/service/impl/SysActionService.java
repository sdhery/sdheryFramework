package com.sdhery.module.privilege.service.impl;


import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.core.service.impl.BaseService;
import com.sdhery.module.privilege.dao.ISysActionDao;
import com.sdhery.module.privilege.domain.SysAction;
import com.sdhery.module.privilege.service.ISysActionService;

/**
 * @Title:实现业务操作类
 * @Description: sdhery
 * @author sdhery
 * @Date:2013-07-27 11:31:49
 */
public class SysActionService extends BaseService<SysAction, Integer> implements ISysActionService {
    ISysActionDao sysActionDao;

    public void setSysActionDao(ISysActionDao sysActionDao) {
        this.sysActionDao = sysActionDao;
    }

    protected EntityDao<SysAction, Integer> getEntityDao() {
        return sysActionDao;
    }
}