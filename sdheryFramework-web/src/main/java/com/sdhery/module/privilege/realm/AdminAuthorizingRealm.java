package com.sdhery.module.privilege.realm;


import com.sdhery.module.privilege.code.PrivilegeCode;
import com.sdhery.module.privilege.token.AdminUserToken;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-7-19
 * Time: 下午3:12
 * 后台安全认证实现类
 */
public class AdminAuthorizingRealm extends AuthorizingRealm {
    private Logger log = LoggerFactory.getLogger(getClass());


    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        log.info("doGetAuthenticationInfo....");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        return new SimpleAuthenticationInfo(token.getUsername(), token.getPassword(), getName());
    }


    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String loginId = (String) getAvailablePrincipal(principals);
        System.out.println("loginId--" + loginId);
        return null;
    }

    /**
     * 查找有无相应权限
     */
    public boolean isPermitted(PrincipalCollection principals, String permission) {
        String loginId = (String) principals.getPrimaryPrincipal();
        if (loginId.equals(PrivilegeCode.SUPERLOGINID.getCode())) {
            return true;
        }
        Permission p = getPermissionResolver().resolvePermission(permission);
        return isPermitted(principals, p);
    }
}
