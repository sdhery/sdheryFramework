package com.sdhery.module.privilege.web.admin;

import com.sdhery.module.core.commons.Condition;
import com.sdhery.module.privilege.domain.SysRole;
import com.sdhery.module.privilege.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-11-6
 * Time: 下午4:37
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/admin/role")
public class AdminRole {
    @Autowired
    ISysRoleService sysRoleService;

    @RequestMapping(value = "/list")
    String list(ModelMap modelMap) throws Exception {
        List<SysRole> list = sysRoleService.search(null);
        modelMap.put("list",list);
        return "admin/module/role/list";
    }

}
