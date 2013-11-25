package com.sdhery.module.user.dao.impl;

import com.sdhery.module.core.dao.impl.BaseMybatisDao;
import com.sdhery.module.user.dao.ISysUserDao;
import com.sdhery.module.user.domain.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-5-15
 * Time: 下午5:20
 * To change this template use File | Settings | File Templates.
 */

@Service
public class SysUserDao  extends BaseMybatisDao<SysUser, Integer> implements ISysUserDao{
    public SysUser getSysUserByLoginId(String loginId){
        return getSqlSession().selectOne(getDaoNameSpace(".getSysUserByLoginId"), loginId);
    }

    public List<SysUser> getAdminList() {
        return getSqlSession().selectList(getDaoNameSpace(".getAdminList"));
    }
}
