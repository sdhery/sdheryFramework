package com.sdhery.module.privilege.dao.impl;

import com.sdhery.module.core.dao.impl.BaseMybatisDao;
import com.sdhery.module.privilege.dao.ISysRoleDao;
import com.sdhery.module.privilege.domain.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-10-30
 * Time: 下午3:19
 * 权限角色
 */
@Service
public class SysRoleDao extends BaseMybatisDao<SysRole, Integer> implements ISysRoleDao {

}
