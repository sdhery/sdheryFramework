package com.sdhery.module.user.dao;

import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.user.domain.SysUser;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-5-20
 * Time: 上午9:46
 * To change this template use File | Settings | File Templates.
 */
public interface ISysUserDao extends EntityDao<SysUser,Integer> {
    SysUser getSysUserByLoginId(String loginId);

    List<SysUser> getAdminList();
}
