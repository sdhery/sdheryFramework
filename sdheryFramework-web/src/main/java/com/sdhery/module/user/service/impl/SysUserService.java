package com.sdhery.module.user.service.impl;


import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.core.domain.SysObjectKey;
import com.sdhery.module.core.security.DigestUtil;
import com.sdhery.module.core.service.ISysObjectKeyService;
import com.sdhery.module.core.service.impl.BaseService;
import com.sdhery.module.helper.ServiceManager;
import com.sdhery.module.user.dao.ISysUserDao;
import com.sdhery.module.user.domain.SysUser;
import com.sdhery.module.user.service.ISysUserService;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-5-15
 * Time: 下午5:48
 * To change this template use File | Settings | File Templates.
 */
@Service
public class SysUserService extends BaseService<SysUser, Integer> implements ISysUserService {

    @Autowired
    ISysUserDao sysUserDao;
    @Autowired
    ISysObjectKeyService sysObjectKeyService;

    protected EntityDao<SysUser, Integer> getEntityDao() {
        return sysUserDao;
    }

    public SysUser getSysUserByLoginId(String loginId) {
        return sysUserDao.getSysUserByLoginId(loginId);
    }

    public String getRealLoginKey(String fieldValue) {
        return "sysUserLoginKey_" + fieldValue;
    }

    public SysUser getSysUserByKey(String key) {
        SysUser sysUser = null;
        try {
            key = getRealLoginKey(key);
            SysObjectKey sysObjectKey = sysObjectKeyService.getById(key);
            if (sysObjectKey != null) {
                int sysUserId = NumberUtils.toInt(sysObjectKey.getSysObjectKeyValue());
                sysUser = getSysUserBySysUserId(sysUserId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sysUser;
    }

    public SysUser getSysUserBySysUserId(int sysUserId) {
        return sysUserDao.getById(sysUserId);
    }

    public int loginResult(String key, String password, int target) throws Exception {
        SysUser user = getSysUserByKey(key);
        if (user == null) {
            return ISysUserService.NOT_USER;
        }
        return findUser(user, password, target);
    }

    public List<SysUser> getAdminList() {
        return sysUserDao.getAdminList();
    }

    public int addAdmin(SysUser sysUser) throws Exception{
        sysUser.setIsAdmin(ISysUserService.USERTYPE_ISADMIN_YES);
        String ran = String.valueOf(Math.random());
        String passwordRan = sysUser.getPasswordHash() + ran;
        String passwordHash = DigestUtil.digestString(passwordRan, "SHA");
        sysUser.setRandom(ran);
        sysUser.setPasswordHash(passwordHash);
        sysUser.setState(ISysUserService.USER_ENABLE_YES);
        return sysUserDao.insert(sysUser);
    }

    protected int findUser(SysUser sysUser, String password, int target) throws NoSuchAlgorithmException {
        int isAdmin = sysUser.getIsAdmin();
        if (target == ISysUserService.TARGET_SYSTEM) {
            if (isAdmin != ISysUserService.USERTYPE_ISADMIN_YES) {
                return ISysUserService.NOT_SYSTEM_ADMIN;
            }
        }
        if (target == ISysUserService.TARGET_MEMBER) {
            if (isAdmin != ISysUserService.USERTYPE_ISADMIN_NO) {
                return ISysUserService.NOT_MEMBER;
            }
        }
        int isEnable = sysUser.getState();
        if (isEnable == ISysUserService.USER_ENABLE_NO) {
            return ISysUserService.DISABLE_NOT_USER;
        }
        String random = sysUser.getRandom();

        if (StringUtils.isBlank(random)) {
            return ISysUserService.NOT_USER_RANDOM;
        }
        String passwordHash = sysUser.getPasswordHash();
        if (StringUtils.isBlank(passwordHash)) {
            return ISysUserService.NOT_USER_PASSWORDHASH;
        }
        //验证密码
        String passRan = password + random;
        String passwordSha = DigestUtil.digestString(passRan, "SHA");
        if (!passwordSha.equals(passwordHash)) {
            return ISysUserService.INPUT_USER_PASSWORD_ERROR;
        }
        return ISysUserService.LOGIN_SUCCESSFUL;
    }
}
