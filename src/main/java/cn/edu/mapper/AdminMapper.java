package cn.edu.mapper;

import org.apache.ibatis.annotations.Param;
import cn.edu.bean.Admin;
import cn.edu.bean.Role;

import java.util.List;

/**
 * Created by sang on 2017/12/28.
 */
public interface AdminMapper {
    Admin loadUserByUsername(String username);

    List<Role> getRolesByAdminId(Long id);

    int adminReg(@Param("username") String username, @Param("password") String password);

    List<Admin> getAdminsByKeywords(@Param("keywords") String keywords);

    int updateAdmin(Admin admin);

    int deleteRoleByAdminId(Long adminId);

    int addRolesForAdmin(@Param("adminId") Long adminId, @Param("rids") Long[] rids);

    Admin getAdminById(Long adminId);

    int deleteAdmin(Long adminId);

    List<Admin> getAllAdmin(@Param("currentId") Long currentId);
}
