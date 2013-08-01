package com.sdhery.module.tree.dao.impl;

import com.sdhery.module.core.dao.impl.BaseMybatisDao;
import com.sdhery.module.tree.dao.ISysTreeDao;
import com.sdhery.module.tree.domain.SysTree;

import java.util.List;

/**
* @Title:数据库操作实现类
* @Description: 系统树
* @author sdhery
* @Date:2013-06-22 14:58:20
*/
public class SysTreeDao extends BaseMybatisDao<SysTree, Integer> implements ISysTreeDao{
    public List<SysTree> getSysTreeListByParentId(int parentId) {
        return getSqlSession().selectList(SysTreeDao.class.getName() + ".getSysTreeListByParentId", parentId);
    }
}
