package com.sdhery.module.user.web.admin;

import com.sdhery.module.core.web.BaseController;
import com.sdhery.module.helper.MessageSourceManager;
import com.sdhery.module.helper.ServiceManager;
import com.sdhery.module.privilege.token.AdminUserToken;
import com.sdhery.module.user.domain.SysUser;
import com.sdhery.module.user.service.ISysUserService;
import com.sdhery.module.user.util.SysUserCookieUtil;
import com.sdhery.module.user.vo.SysUserVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-6-6
 * Time: 下午5:34
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AdminLogin extends BaseController {
    @Autowired
    ISysUserService sysUserService;
    @RequestMapping(value = "/admin/loginOK")
    public @ResponseBody ModelMap loginOk(SysUserVo sysUserVo,HttpServletRequest request,HttpServletResponse response) {
        ModelMap modelMap = new ModelMap();
        try {
            int result = sysUserService.loginResult(sysUserVo.getLoginId(), sysUserVo.getPassword(), ISysUserService.TARGET_SYSTEM);
            if(result==ISysUserService.LOGIN_SUCCESSFUL){
                setSuccess(modelMap);
                SysUser sysUser = sysUserService.getSysUserByKey(sysUserVo.getLoginId());
                SysUserCookieUtil.addAdminCookie(sysUser, request, response);
                AdminUserToken adminUserToken = new AdminUserToken(sysUserVo.getLoginId(),sysUserVo.getPassword());
                SecurityUtils.getSubject().login(adminUserToken);
            }else{
                modelMap.put("result", MessageSourceManager.getMessage("login.error." + result, request));
                setFailure(modelMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelMap;
    }

    @RequestMapping(value = "/admin/loginOut")
    public String loginOut(HttpServletRequest request,HttpServletResponse response) throws Exception {
        Subject admin = SecurityUtils.getSubject();
        admin.logout();
        SysUserCookieUtil.removeCookie(request, response, SysUserCookieUtil.adminLoginKey);
        return "redirect:/admin/login.jsp";
    }
}
