package com.sdhery.module.tree.dao;

import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.tree.domain.SysTree;

import java.util.List;

/**
* @Title:数据库操作类接口
* @Description: 系统树
* @author sdhery
* @Date:2013-06-22 14:58:20
*/
public interface ISysTreeDao extends EntityDao<SysTree,Integer> {
    /**
     * 通过父ID取得下面的子ID
     * @param parentId
     * @return
     */
    List<SysTree> getSysTreeListByParentId(int parentId);
}
