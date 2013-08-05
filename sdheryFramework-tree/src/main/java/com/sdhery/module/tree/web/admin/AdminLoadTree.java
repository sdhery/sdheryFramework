package com.sdhery.module.tree.web.admin;

import com.sdhery.module.core.web.BaseController;
import com.sdhery.module.helper.ServiceManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-7-1
 * Time: 下午5:19
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AdminLoadTree extends BaseController {
    @RequestMapping(value = "/admin/loadMainLeftTree")
    String loadMainLeftTree(ModelMap modelMap,Integer parentId) {
        List result = ServiceManager.sysTreeService.getNodeListByParentId(parentId);
        modelMap.put("result",result);
        return "admin/module/core/loadLeft";
    }
}
