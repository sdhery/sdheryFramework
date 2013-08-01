package com.sdhery.module.tree.service;


import com.sdhery.module.core.service.IBaseService;
import com.sdhery.module.tree.domain.SysTree;
import com.sdhery.module.tree.vo.Node;

import java.util.List;

/**
* @Title:业务操作类接口
* @Description: 系统树
* @author sdhery
* @Date:2013-06-22 14:58:20
*/
public interface ISysTreeService extends IBaseService<SysTree, Integer> {
    /**
     * 通过父ID取得下面的子ID
     * @param parentId
     * @return
     */
    List<SysTree> getSysTreeListByParentId(int parentId);

    List<Node<?>> getNodeListByParentId(int parentId);
}
