package com.sdhery.module.helper;

import com.sdhery.module.core.service.ISysObjectKeyService;
import com.sdhery.module.info.service.IInfoArticleService;
import com.sdhery.module.tree.service.ISysTreeService;
import com.sdhery.module.user.service.ISysUserService;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-6-8
 * Time: 下午2:59
 * To change this template use File | Settings | File Templates.
 */
public class ServiceManager {
    public static ISysObjectKeyService sysObjectKeyService;
    public static ISysUserService sysUserService;
    public static ISysTreeService sysTreeService;
    public static IInfoArticleService infoArticleService;

    public void setSysUserService(ISysUserService sysUserService) {
        ServiceManager.sysUserService = sysUserService;
    }

    public void setSysObjectKeyService(ISysObjectKeyService sysObjectKeyService) {
        ServiceManager.sysObjectKeyService = sysObjectKeyService;
    }

    public void setSysTreeService(ISysTreeService sysTreeService) {
        ServiceManager.sysTreeService = sysTreeService;
    }

    public void setInfoArticleService(IInfoArticleService infoArticleService) {
        ServiceManager.infoArticleService = infoArticleService;
    }
}
