package com.sdhery.module.privilege.token;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-7-19
 * Time: 下午4:41
 * 后台登录用户和密码（包含验证码）令牌类
 */
public class AdminUserToken extends UsernamePasswordToken {

    public AdminUserToken(String loginId,String password) {
        super(loginId, password);
    }
}
