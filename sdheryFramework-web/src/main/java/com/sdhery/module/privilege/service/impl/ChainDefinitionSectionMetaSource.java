package com.sdhery.module.privilege.service.impl;

import org.apache.shiro.config.Ini;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-9-22
 * Time: 下午4:58
 * 借助spring {@link FactoryBean} 对apache shiro的premission进行动态创建
 */
public class ChainDefinitionSectionMetaSource implements FactoryBean<Ini.Section> {
    //shiro默认的链接定义
    private String filterChainDefinitions;

    public Ini.Section getObject() throws Exception {
        Ini ini = new Ini();
        //加载默认的url
        ini.load(filterChainDefinitions);
        Ini.Section section = ini.getSection(Ini.DEFAULT_SECTION_NAME);
        return section;
    }

    public Class<?> getObjectType() {
        return this.getClass();
    }

    public boolean isSingleton() {
        return false;
    }
}
