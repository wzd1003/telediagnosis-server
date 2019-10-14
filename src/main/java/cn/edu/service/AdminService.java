package cn.edu.service;

import cn.edu.bean.Admin;
import cn.edu.common.AdminUtils;
import cn.edu.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sang on 2017/12/28.
 */
@Service
@Transactional
public class AdminService implements UserDetailsService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Admin admin = adminMapper.loadUserByUsername(s);
        if (admin == null) {
            throw new UsernameNotFoundException("用户名不对");
        }
        return admin;
    }

    public int adminReg(String username, String password) {
        //如果用户名存在，返回错误
        if (adminMapper.loadUserByUsername(username) != null) {
            return -1;
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encode = encoder.encode(password);
        return adminMapper.adminReg(username, encode);
    }

    public List<Admin> getAdminsByKeywords(String keywords) {
        return adminMapper.getAdminsByKeywords(keywords);
    }

    public int updateAdmin(Admin admin) {
        return adminMapper.updateAdmin(admin);
    }

    public int updateAdminRoles(Long adminId, Long[] rids) {
        int i = adminMapper.deleteRoleByAdminId(adminId);
        return adminMapper.addRolesForAdmin(adminId, rids);
    }

    public Admin getAdminById(Long adminId) {
        return adminMapper.getAdminById(adminId);
    }

    public int deleteAdmin(Long adminId) {
        return adminMapper.deleteAdmin(adminId);
    }

    public List<Admin> getAllAdminExceptAdmin() {
        return adminMapper.getAllAdmin(AdminUtils.getCurrentAdmin().getId());
    }
    public List<Admin> getAllAdmin() {
        return adminMapper.getAllAdmin(null);
    }
}
