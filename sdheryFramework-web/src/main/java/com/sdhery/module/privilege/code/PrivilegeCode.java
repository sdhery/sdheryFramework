package com.sdhery.module.privilege.code;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-10-7
 * Time: 下午4:00
 * To change this template use File | Settings | File Templates.
 */
public enum PrivilegeCode{
    SUPERLOGINID("root"),
    SYSRESOURCEROOD(1);

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
