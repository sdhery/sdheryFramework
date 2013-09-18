package com.sdhery.module.tree.service.impl;


import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.core.service.impl.BaseService;
import com.sdhery.module.helper.ServiceManager;
import com.sdhery.module.privilege.domain.SysAction;
import com.sdhery.module.privilege.domain.SysModule;
import com.sdhery.module.privilege.service.ISysActionService;
import com.sdhery.module.privilege.service.ISysModuleService;
import com.sdhery.module.tree.dao.ISysTreeDao;
import com.sdhery.module.tree.domain.SysTree;
import com.sdhery.module.tree.service.ISysTreeService;
import com.sdhery.module.tree.vo.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sdhery
 * @Title:实现业务操作类
 * @Description: 系统树
 * @Date:2013-06-22 14:58:20
 */
public class SysTreeService extends BaseService<SysTree, Integer> implements ISysTreeService {
    ISysTreeDao sysTreeDao;
    ISysModuleService sysModuleService;
    ISysActionService sysActionService;

    public void setSysTreeDao(ISysTreeDao sysTreeDao) {
        this.sysTreeDao = sysTreeDao;
    }

    protected EntityDao<SysTree, Integer> getEntityDao() {
        return sysTreeDao;
    }

    public void setSysModuleService(ISysModuleService sysModuleService) {
        this.sysModuleService = sysModuleService;
    }

    public void setSysActionService(ISysActionService sysActionService) {
        this.sysActionService = sysActionService;
    }

    public List<SysTree> getSysTreeListByParentId(int parentId) {
        return sysTreeDao.getSysTreeListByParentId(parentId);
    }

    public List<Node<?>> getNodeListByParentId(int parentId) {
        List<SysTree> children = getSysTreeListByParentId(parentId);
        List nodes = new ArrayList();
        for(SysTree sysTree : children){
            Node node = convert(sysTree);
            nodes.add(node);
        }
        return nodes;
    }

    Node<?> convert(SysTree sysTreeNode) {
        Node node = new Node();
        node.setId(sysTreeNode.getSysTreeId());
        node.setName(sysTreeNode.getSysTreeName());
        node.setParentId(sysTreeNode.getParentId());
        List children = getSysTreeListByParentId(sysTreeNode.getSysTreeId());
        node.setIsParent(children.size()>0);
        SysModule sysModule = sysModuleService.getSysModuleBySysModuleId(sysTreeNode.getSysModuleId());
        SysAction sysAction = sysActionService.getSysActionBySysActionId(sysModule.getDefaultActionId());
        node.setObject(sysAction);
        return node;
    }
}