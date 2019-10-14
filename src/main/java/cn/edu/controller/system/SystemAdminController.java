package cn.edu.controller.system;

import cn.edu.bean.Admin;
import cn.edu.bean.RespBean;
import cn.edu.bean.Role;
import cn.edu.service.AdminService;
import cn.edu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sang on 2018/1/2.
 */
@RestController
@RequestMapping("/system/hr")
public class SystemAdminController {
    @Autowired
    AdminService adminService;
    @Autowired
    RoleService roleService;

    @RequestMapping("/id/{hrId}")
    public Admin getHrById(@PathVariable Long hrId) {
        return adminService.getAdminById(hrId);
    }

    @RequestMapping(value = "/{hrId}", method = RequestMethod.DELETE)
    public RespBean deleteHr(@PathVariable Long hrId) {
        if (adminService.deleteAdmin(hrId) == 1) {
            return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败!");
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public RespBean updateHr(Admin hr) {
        if (adminService.updateAdmin(hr) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

    @RequestMapping(value = "/roles", method = RequestMethod.PUT)
    public RespBean updateHrRoles(Long hrId, Long[] rids) {
        if (adminService.updateAdminRoles(hrId, rids) == rids.length) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

    @RequestMapping("/{keywords}")
    public List<Admin> getHrsByKeywords(@PathVariable(required = false) String keywords) {
        List<Admin> hrs = adminService.getAdminsByKeywords(keywords);
        return hrs;
    }

    @RequestMapping(value = "/roles",method = RequestMethod.GET)
    public List<Role> allRoles() {
        return roleService.roles();
    }

    @RequestMapping(value = "/hr/reg", method = RequestMethod.POST)
    public RespBean hrReg(String username, String password) {
        int i = adminService.adminReg(username, password);
        if (i == 1) {
            return RespBean.ok("注册成功!");
        } else if (i == -1) {
            return RespBean.error("用户名重复，注册失败!");
        }
        return RespBean.error("注册失败!");
    }

}
