package cn.edu.service;

import cn.edu.bean.Admin;
import cn.edu.bean.MsgContent;
import cn.edu.bean.SysMsg;
import cn.edu.common.UserUtils;
import cn.edu.mapper.SysMsgMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sang on 2018/2/2.
 */
@Service
@Transactional
public class SysMsgService {
    private Logger logger = LoggerFactory.getLogger(SysMsgMapper.class);
    @Autowired
    SysMsgMapper sysMsgMapper;
    @Autowired
    AdminService adminService;

    @PreAuthorize("hasRole('ROLE_admin')")//只有管理员可以发送系统消息
    public boolean sendMsg(MsgContent msg) {
        int result = sysMsgMapper.sendMsg(msg);
        List<Admin> allAdmin = adminService.getAllAdmin();
        int result2 = sysMsgMapper.addMsg2AllAdmin(allAdmin, msg.getId());
        return result2==allAdmin.size();
    }

    public List<SysMsg> getSysMsgByPage(Integer page, Integer size) {
        int start = (page - 1) * size;
        return sysMsgMapper.getSysMsg(start,size, UserUtils.getCurrentUser().getId());
    }

    public boolean markRead(Long flag) {
        if (flag != -1) {
            return sysMsgMapper.markRead(flag,UserUtils.getCurrentUser().getId())==1;
        }
        sysMsgMapper.markRead(flag,UserUtils.getCurrentUser().getId());
        return true;
    }
}
