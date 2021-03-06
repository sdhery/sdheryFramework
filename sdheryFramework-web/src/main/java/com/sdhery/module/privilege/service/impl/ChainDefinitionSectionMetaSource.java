package com.sdhery.module.privilege.service.impl;

import com.sdhery.module.privilege.domain.SysResource;
import com.sdhery.module.privilege.service.ISysResourceService;
import org.apache.shiro.config.Ini;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
    @Autowired
    private ISysResourceService sysResourceService;

    public Ini.Section getObject() throws Exception {
        Ini ini = new Ini();
        //加载默认的url
        ini.load(filterChainDefinitions);
        Ini.Section section = ini.getSection(Ini.DEFAULT_SECTION_NAME);
        List<SysResource> sysResources = sysResourceService.searchPermissionResource();
        for(SysResource sysResource : sysResources){
            String resourceUrl = sysResource.getResourceUrl();
            String permission = sysResource.getPermission();
            section.put(resourceUrl,permission);
        }
        return section;
    }

    public void setFilterChainDefinitions(String filterChainDefinitions) {
        this.filterChainDefinitions = filterChainDefinitions;
    }

    public Class<?> getObjectType() {
        return this.getClass();
    }

    public boolean isSingleton() {
        return false;
    }
}
