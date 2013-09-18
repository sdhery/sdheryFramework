package com.sdhery.module.info.service.impl;


import com.sdhery.module.core.commons.Condition;
import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.core.service.impl.BaseService;
import com.sdhery.module.info.dao.IInfoArticleDao;
import com.sdhery.module.info.domain.InfoArticle;
import com.sdhery.module.info.service.IInfoArticleService;

import java.util.Date;
import java.util.List;

/**
* @Title:实现业务操作类
* @Description: 信息
* @author sdhery
* @Date:2013-07-09 10:41:16
*/
public class InfoArticleService extends BaseService<InfoArticle, Integer> implements IInfoArticleService {
    IInfoArticleDao infoArticleDao;

    public void setInfoArticleDao(IInfoArticleDao infoArticleDao) {
        this.infoArticleDao = infoArticleDao;
    }

    protected EntityDao<InfoArticle, Integer> getEntityDao() {
        return infoArticleDao;
    }

    public int addInfoArticle(InfoArticle infoArticle) throws Exception {
        infoArticle.setInfoArticleId(getIdGenerator().getId("inf_article"));
        infoArticle.setCreateTime(new Date());
        return infoArticleDao.insert(infoArticle);
    }
}