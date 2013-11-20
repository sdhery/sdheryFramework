package com.sdhery.module.privilege.web.admin;

import com.sdhery.module.core.commons.Condition;
import com.sdhery.module.privilege.domain.SysResource;
import com.sdhery.module.privilege.domain.SysRole;
import com.sdhery.module.privilege.service.ISysResourceService;
import com.sdhery.module.privilege.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @Autowired
    ISysResourceService sysResourceService;

    @RequestMapping(value = "list")
    String list(ModelMap modelMap) throws Exception {
        List<SysRole> list = sysRoleService.search(null);
        modelMap.put("list",list);
        return "admin/module/role/list";
    }

    @RequestMapping(value = "add")
    String add(SysRole sysRole) throws Exception {
        sysRoleService.insert(sysRole);
        return "redirect:/admin/role/list";
    }

    @RequestMapping(value = "update",method = RequestMethod.GET)
    String update(Integer sysRoleId,ModelMap map) throws Exception {
        if(sysRoleId!=null){
            SysRole sysRole = sysRoleService.getById(sysRoleId);
            map.put("sysRole",sysRole);
        }
        return "admin/module/role/update";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    String update(SysRole sysRole,ModelMap map) throws Exception {
        if(sysRole.getSysRoleId()!=null){
            sysRoleService.update(sysRole);
        }
        return "redirect:/admin/role/list";
    }

    @RequestMapping(value = "allot")
    /**
     * 分配权限
     */
    String allot(Integer sysRoleId) throws Exception {
        return "admin/module/role/allot";
    }

    @RequestMapping(value = "loadSysResource")
    @ResponseBody
    ModelMap getSysResource(Integer parentId){
        ModelMap map = new ModelMap();
        if(parentId==null){

        }
        List<SysResource> sysResourceList = sysResourceService.getSysResourceByParentId(parentId);
        map.addAllAttributes(sysResourceList);
        return map;
    }
}
