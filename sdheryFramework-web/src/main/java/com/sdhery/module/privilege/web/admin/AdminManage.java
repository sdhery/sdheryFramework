package com.sdhery.module.privilege.web.admin;

import com.sdhery.module.core.web.BaseController;
import com.sdhery.module.privilege.code.PrivilegeCode;
import com.sdhery.module.privilege.domain.SysRole;
import com.sdhery.module.privilege.service.ISysRoleService;
import com.sdhery.module.user.domain.SysUser;
import com.sdhery.module.user.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-12-4
 * Time: 上午10:12
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/admin/admin")
public class AdminManage extends BaseController {
    @Autowired
    ISysUserService sysUserService;
    @Autowired
    ISysRoleService sysRoleService;

    @RequestMapping(value = "list")
    String adminList(ModelMap map) throws Exception {
        List<SysUser> userList = sysUserService.getAdminList();
        map.put("userList", userList);
        return "admin/module/admin/list";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    String adminAdd() throws Exception {
        return "admin/module/admin/form";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    String adminAdd(SysUser sysUser) throws Exception {
        sysUserService.addAdmin(sysUser);
        return "redirect:/admin/admin/list";
    }

    @RequestMapping(value = "modifyRole", method = RequestMethod.GET)
    String modifyRole(Integer sysUserId, ModelMap map) throws Exception {
        if (sysUserId != null) {
            SysUser sysUser = sysUserService.getSysUserBySysUserId(sysUserId);
            List<SysRole> sysRoles = sysRoleService.search(null);
            int objType =  PrivilegeCode.ROLE_DISPATCHER_OBJTYPE_ADMIN.toIntegerCode();
            map.put("sysUser", sysUser);
            map.put("objType", objType);
            map.put("sysRoles", sysRoles);
            map.put("existSysRoleIds", sysRoleService.getRoleIdByObjId(sysUserId, objType));
        }
        return "admin/module/admin/modifyRole";
    }

    @RequestMapping(value = "modifyRole", method = RequestMethod.POST)
    String modifyRole(Integer[] sysRoleIds, Integer objId, Integer objType) {
        try {
            sysRoleService.roleDispatcher(sysRoleIds, objId, objType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/admin/admin/list";
    }
}
