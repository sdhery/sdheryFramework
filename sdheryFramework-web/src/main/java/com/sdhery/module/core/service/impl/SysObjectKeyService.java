package com.sdhery.module.core.service.impl;

import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.core.dao.ISysObjectKeyDao;
import com.sdhery.module.core.domain.SysObjectKey;
import com.sdhery.module.core.service.ISysObjectKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-5-25
 * Time: 下午5:02
 * To change this template use File | Settings | File Templates.
 */

@Service
public class SysObjectKeyService extends BaseService<SysObjectKey,String> implements ISysObjectKeyService {
    @Autowired
    private ISysObjectKeyDao sysObjectKeyDao;

    protected EntityDao<SysObjectKey, String> getEntityDao() {
        return sysObjectKeyDao;
    }
}
