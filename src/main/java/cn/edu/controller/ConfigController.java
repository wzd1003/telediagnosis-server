package cn.edu.controller;

import cn.edu.bean.Admin;
import cn.edu.bean.Menu;
import cn.edu.common.AdminUtils;
import cn.edu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 这是一个只要登录就能访问的Controller
 * 主要用来获取一些配置信息
 */
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    MenuService menuService;
    @RequestMapping("/sysmenu")
    public List<Menu> sysmenu() {
        return menuService.getMenusByAdminId();
    }

    @RequestMapping("/hr")
    public Admin currentUser() {
        return AdminUtils.getCurrentAdmin();
    }
}
