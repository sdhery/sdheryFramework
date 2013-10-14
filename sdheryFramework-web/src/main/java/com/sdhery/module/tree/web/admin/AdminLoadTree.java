package com.sdhery.module.tree.web.admin;

import com.sdhery.module.core.web.BaseController;
import com.sdhery.module.helper.ServiceManager;
import com.sdhery.module.privilege.dao.ISysResourceDao;
import com.sdhery.module.privilege.domain.SysResource;
import com.sdhery.module.privilege.service.ISysResourceService;
import com.sdhery.module.tree.service.ISysTreeService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    ISysResourceService sysResourceService;

    @RequestMapping(value = "/admin/loadMainLeftTree")
    String loadMainLeftTree(ModelMap modelMap,Integer parentId) {
        SysResource sysResource = sysResourceService.getSysResourceBySysResourceId(parentId);
        List<SysResource> children = sysResourceService.getSysResourceByParentId(parentId);
        modelMap.put("children",children);
        modelMap.put("sysResource",sysResource);
        return "admin/module/core/loadLeft";
    }
}
