package com.sdhery.module.tree.service.impl;


import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.core.service.impl.BaseService;
import com.sdhery.module.tree.dao.ISysTreeDao;
import com.sdhery.module.tree.domain.SysTree;
import com.sdhery.module.tree.service.ISysTreeService;
import com.sdhery.module.tree.vo.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sdhery
 * @Title:实现业务操作类
 * @Description: 系统树
 * @Date:2013-06-22 14:58:20
 */
@Service
public class SysTreeService extends BaseService<SysTree, Integer> implements ISysTreeService {
    @Autowired
    ISysTreeDao sysTreeDao;

    protected EntityDao<SysTree, Integer> getEntityDao() {
        return sysTreeDao;
    }

    public List<SysTree> getSysTreeListByParentId(int parentId) {
        return sysTreeDao.getSysTreeListByParentId(parentId);
    }

    public List<Node<?>> getNodeListByParentId(int parentId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}