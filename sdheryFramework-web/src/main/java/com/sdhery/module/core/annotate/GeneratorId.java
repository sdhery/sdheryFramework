package com.sdhery.module.core.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-9-17
 * Time: 下午4:15
 * 主键Id生成类
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
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
