package com.sdhery.module.core.dao.impl;

import com.sdhery.module.core.dao.ISysObjectKeyDao;
import com.sdhery.module.core.domain.SysObjectKey;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-5-24
 * Time: 下午4:26
 * To change this template use File | Settings | File Templates.
 */

@Service
public class SysObjectKeyDao extends BaseMybatisDao<SysObjectKey,String> implements ISysObjectKeyDao {
}
