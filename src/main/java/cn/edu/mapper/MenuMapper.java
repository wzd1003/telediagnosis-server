package cn.edu.mapper;

import cn.edu.bean.Menu;

import java.util.List;

/**
 * Created by sang on 2017/12/28.
 */
public interface MenuMapper {
    List<Menu> getAllMenu();

    List<Menu> getMenusByAdminId(Long adminId);

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);
}
