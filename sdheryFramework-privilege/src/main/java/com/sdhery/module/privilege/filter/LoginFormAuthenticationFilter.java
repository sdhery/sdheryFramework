package com.sdhery.module.privilege.filter;

import com.sdhery.module.privilege.token.AdminUserToken;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-7-23
 * Time: 下午4:24
 * To change this template use File | Settings | File Templates.
 */
public class LoginFormAuthenticationFilter extends FormAuthenticationFilter {
    private static final Logger log = LoggerFactory.getLogger(FormAuthenticationFilter.class);
    public static final String LOGIN_ID = "loginId";


    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
        log.info("i going LoginFormAuthenticationFilter createToken");
        String loginId = WebUtils.getCleanParam(request, LOGIN_ID);
        String password = getPassword(request);
        return new AdminUserToken(loginId,password);
    }


    protected boolean onLoginFailure(AuthenticationToken token,AuthenticationException e, ServletRequest request,ServletResponse response) {
        log.info("i going LoginFormAuthenticationFilter onLoginFailure");
        return true;
    }
}
