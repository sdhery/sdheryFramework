package com.sdhery.module.privilege.service;


import com.sdhery.module.core.service.IBaseService;
import com.sdhery.module.privilege.domain.SysResource;

import java.util.List;

/**
* @Title:业务操作类接口
* @Description: 权限资源
* @author hqq
* @Date:2013-09-17 15:22:30
*/
public interface ISysResourceService extends IBaseService<SysResource, Integer> {
    List<SysResource> searchPermissionResource();

    List<SysResource> getSysMenuResource();

    SysResource getSysResourceBySysResourceId(int sysResourceId);

    List<SysResource> getSysResourceByParentId(int parentId);

    Integer getSysResourceByParentIdCount(int parentId);

    void allot(Integer sysRoleId,Integer[] sysResourceIds) throws Exception;
}
