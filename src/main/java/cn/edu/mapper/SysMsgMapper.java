package cn.edu.mapper;

import cn.edu.bean.Admin;
import cn.edu.bean.MsgContent;
import cn.edu.bean.SysMsg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by sang on 2018/2/2.
 */
public interface SysMsgMapper {

    int sendMsg(MsgContent msg);

    int addMsg2AllAdmin(@Param("admins") List<Admin> admins, @Param("mid") Long mid);

    List<SysMsg> getSysMsg(@Param("start") int start, @Param("size") Integer size,@Param("adminid") Long adminid);

    int markRead(@Param("flag") Long flag, @Param("adminid") Long adminid);
}
