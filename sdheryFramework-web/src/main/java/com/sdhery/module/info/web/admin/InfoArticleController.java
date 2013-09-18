package com.sdhery.module.info.web.admin;

import com.sdhery.module.core.commons.Condition;
import com.sdhery.module.core.web.BaseController;
import com.sdhery.module.helper.ServiceManager;
import com.sdhery.module.info.domain.InfoArticle;
import com.sdhery.module.info.service.IInfoArticleService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-7-9
 * Time: 上午10:57
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/admin/info")
public class InfoArticleController extends BaseController {
    @Autowired
    IInfoArticleService infoArticleService;

    @RequestMapping(value = "/addOk")
    String addOk(InfoArticle infoArticle) throws Exception {
        infoArticleService.addInfoArticle(infoArticle);
        return "redirect:/admin/info/list";
    }

    @RequestMapping(value = "/list")
    String list(ModelMap modelMap) throws Exception {
        Condition condition = new Condition();
        condition.setOrderByClause("CREATE_TIME desc");
        List<InfoArticle> list = infoArticleService.search(condition);
        modelMap.put("list",list);
        return "admin/module/info/list";
    }

    @RequestMapping(value = "/update")
    String list(ModelMap modelMap,Integer infoArticleId) throws Exception {
        InfoArticle infoArticle = infoArticleService.getById(infoArticleId);
        modelMap.put("infoArticle",infoArticle);
        return "admin/module/info/update";
    }

    @RequestMapping(value = "/updateOK")
    String updateOK(InfoArticle infoArticle) throws Exception {
        infoArticleService.update(infoArticle);
        return "redirect:/admin/info/list";
    }
}
