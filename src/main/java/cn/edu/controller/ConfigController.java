package cn.edu.controller;

import cn.edu.bean.Admin;
import cn.edu.bean.Menu;
import cn.edu.common.UserUtils;
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

    //当前用户显示的菜单
    @RequestMapping("/sysmenu")
    public List<Menu> sysmenu() {
        return menuService.getMenusByUserId();
    }

    //获得当前登录的用户
    @RequestMapping("/currentUser")
    public Admin currentUser() {
        return UserUtils.getCurrentUser();
    }
}
