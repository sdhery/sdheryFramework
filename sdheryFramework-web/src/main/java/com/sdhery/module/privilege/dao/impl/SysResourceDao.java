package com.sdhery.module.privilege.dao.impl;

import com.sdhery.module.core.dao.impl.BaseMybatisDao;
import com.sdhery.module.privilege.dao.ISysResourceDao;
import com.sdhery.module.privilege.domain.SysResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @Title:数据库操作实现类
* @Description: 权限资源
* @author hqq
* @Date:2013-09-17 15:22:30
*/
@Service
public class SysResourceDao extends BaseMybatisDao<SysResource, Integer> implements ISysResourceDao{
    public List<SysResource> searchPermissionResource() {
        return getSqlSession().selectList(getDaoNameSpace(".searchPermissionResource"));
    }
}
