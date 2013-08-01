package com.sdhery.module.info.web.admin;

import com.sdhery.module.core.commons.Condition;
import com.sdhery.module.core.web.BaseController;
import com.sdhery.module.helper.ServiceManager;
import com.sdhery.module.info.domain.InfoArticle;
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

    @RequestMapping(value = "/addOk")
    String addOk(InfoArticle infoArticle) throws Exception {
        ServiceManager.infoArticleService.addInfoArticle(infoArticle);
        return "redirect:/admin/info/list";
    }

    @RequestMapping(value = "/list")
    String list(ModelMap modelMap) throws Exception {
        Condition condition = new Condition();
        List<InfoArticle> list = ServiceManager.infoArticleService.search(condition);
        modelMap.put("list",list);
        return "admin/module/info/list";
    }
}
