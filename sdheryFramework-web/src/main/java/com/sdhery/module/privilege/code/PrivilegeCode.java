package com.sdhery.module.privilege.code;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-10-7
 * Time: 下午4:00
 * To change this template use File | Settings | File Templates.
 */
public enum PrivilegeCode{
    SUPERLOGINID("root");

    private String code;

    private PrivilegeCode(String code) {
        this.code = code;
    }

    public String getCode(){
        return code;
    }
}
