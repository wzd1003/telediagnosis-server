package cn.edu.common;

import cn.edu.bean.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author Devin
 * @description 获得当前用户工具
 * @create 2019/10/7
 */
public class UserUtils {
    public static Admin getCurrentUser() {
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
