package com.sdhery.module.privilege.web.admin;

import com.sdhery.module.core.commons.Condition;
import com.sdhery.module.core.web.BaseController;
import com.sdhery.module.privilege.code.PrivilegeCode;
import com.sdhery.module.privilege.domain.SysResource;
import com.sdhery.module.privilege.domain.SysRole;
import com.sdhery.module.privilege.service.ISysResourceService;
import com.sdhery.module.privilege.service.ISysRoleService;
import com.sdhery.module.tree.vo.Node;
import com.sdhery.module.user.domain.SysUser;
import com.sdhery.module.user.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
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
public class AdminRole extends BaseController {
    @Autowired
    ISysRoleService sysRoleService;
    @Autowired
    ISysResourceService sysResourceService;


    @RequestMapping(value = "list")
    String list(ModelMap modelMap) throws Exception {
        List<SysRole> list = sysRoleService.search(null);
        modelMap.put("list", list);
        return "admin/module/role/list";
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    String add(SysRole sysRole,Integer[] sysResourceIds) throws Exception {
        sysRoleService.addSysSysRole(sysRole,sysResourceIds);
        return "redirect:/admin/role/list";
    }

    @RequestMapping(value = "add",method = RequestMethod.GET)
    String add() throws Exception {
        return "admin/module/role/roleForm";
    }


    @RequestMapping(value = "update", method = RequestMethod.GET)
    String update(Integer sysRoleId, ModelMap map) throws Exception {
        if (sysRoleId != null) {
            SysRole sysRole = sysRoleService.getById(sysRoleId);
            map.put("sysRole", sysRole);
            map.put("sysRoleSysResource", sysRoleService.searchRoleSysResource(sysRole.getSysRoleId()));
        }
        return "admin/module/role/roleForm";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    String update(SysRole sysRole,Integer[] sysResourceIds) throws Exception {
        if (sysRole.getSysRoleId() != null) {
            sysRoleService.updateSysSysRole(sysRole,sysResourceIds);
        }
        return "redirect:/admin/role/list";
    }

    @RequestMapping(value = "roleDispatcher",method = RequestMethod.GET)
    String roleDispatcher() throws Exception {
        return "admin/module/role/roleDispatcher";
    }

    @RequestMapping(value = "loadSysResource")
    @ResponseBody
    Object getSysResource(Integer parentId) {
        if (parentId == null) {
            SysResource sysResource = sysResourceService.getSysResourceBySysResourceId(PrivilegeCode.SYSRESOURCEROOD.toIntegerCode());
            Node node = new Node();
            node.setName(sysResource.getResourceTitle());
            node.setId(sysResource.getSysResourceId());
            node.setIsParent(true);
            return node;
        } else {
            return getSysResourceNode(parentId);
        }
    }

    List<Node> getSysResourceNode(Integer parentId) {
        List<SysResource> sysResourceList = sysResourceService.getSysResourceByParentId(parentId);
        List<Node> nodes = new ArrayList<Node>();
        for (SysResource sysResource : sysResourceList) {
            Node node = new Node();
            node.setName(sysResource.getResourceTitle());
            node.setId(sysResource.getSysResourceId());
            int count = sysResourceService.getSysResourceByParentIdCount(sysResource.getSysResourceId());
            if (count > 0) {
                node.setIsParent(true);
            }
            nodes.add(node);
        }
        return nodes;
    }
}
