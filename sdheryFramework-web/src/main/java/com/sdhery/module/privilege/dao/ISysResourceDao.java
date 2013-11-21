package com.sdhery.module.privilege.dao;

import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.privilege.domain.SysResource;

import java.util.List;

/**
* @Title:数据库操作类接口
* @Description: 权限资源
* @author hqq
* @Date:2013-09-17 15:22:30
*/
public interface ISysResourceDao extends EntityDao<SysResource,Integer> {
    List<SysResource> searchPermissionResource();

    List<SysResource> getSysMenuResource();

    List<SysResource> getSysResourceByParentId(int parentId);

    Integer getSysResourceByParentIdCount(int parentId);
}
