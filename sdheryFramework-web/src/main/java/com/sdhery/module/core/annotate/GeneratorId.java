package com.sdhery.module.core.annotate;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-9-17
 * Time: 下午4:15
 * 主键Id生成类
 */
public @interface GeneratorId {
    /**
     * 主键生成器Bean的名字
     * @return
     */
    public String beanName();

    /**
     * 表名字
     * @return
     */
    public String tableName();


    /**
     * 属性名字
     * @return
     */
    public String filedName();
}
