package com.sdhery.module.privilege.code;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-10-7
 * Time: 下午4:00
 * To change this template use File | Settings | File Templates.
 */
public enum PrivilegeCode{
    /**
     * 超级管理管员登录名
     */
    SUPERLOGINID("root"),
    /**
     * 超级管理员角色ID
     */
    SYSRESOURCEROOD(1),
    /**
     * 管理员类类型
     */
    ROLE_DISPATCHER_OBJTYPE_ADMIN(1)
    ;

    private String code;

    private Integer intCode;

    private PrivilegeCode(String code) {
        this.code = code;
    }

    private PrivilegeCode(int code) {
        this.intCode = code;
    }

    public String getCode(){
        return code;
    }

    public Integer toIntegerCode(){
        return intCode;
    }
}
