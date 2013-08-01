package com.sdhery.module.info.service;


import com.sdhery.module.core.commons.Condition;
import com.sdhery.module.core.service.IBaseService;
import com.sdhery.module.info.domain.InfoArticle;

import java.util.List;

/**
* @Title:业务操作类接口
* @Description: 信息
* @author sdhery
* @Date:2013-07-09 10:41:16
*/
public interface IInfoArticleService extends IBaseService<InfoArticle, Integer> {
    int addInfoArticle(InfoArticle infoArticle) throws Exception;
}
