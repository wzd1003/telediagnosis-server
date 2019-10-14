package cn.edu.controller;

import cn.edu.service.roomService.OrgApacheOpenmeetingsWebserviceRoomWebService;
import cn.edu.service.roomService.RoomWebService;
import cn.edu.service.userwebService.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Devin
 * @description
 * @create 2019/10/8
 */
//@RestController("/room")
public class SysmenuController {

    private static RoomWebService roomService;
    private static UserWebService userService;
    private static Map<Long, Integer> roomCountersMap = new LinkedHashMap<>();

    static {
        OrgApacheOpenmeetingsWebserviceRoomWebService orgRoom = new OrgApacheOpenmeetingsWebserviceRoomWebService();
        OrgApacheOpenmeetingsWebserviceUserWebService orgUser = new OrgApacheOpenmeetingsWebserviceUserWebService();
        userService = orgUser.getUserService();
        roomService = orgRoom.getRoomWebServicePort();
    }

    @ApiOperation(value = "加入公共房间")
    @RequestMapping(value = "/addToRoom", method = RequestMethod.GET)
    public ServiceResult createRoom(String id, String fname, String lname, Long roomId) throws Exception {

        String sid = getSid("admin", "Admin@123");
        // 创建外部人员访问信息
        ExternalUserDTO user = new ExternalUserDTO();

        user.setEmail("zda@dwa.com");
        user.setExternalId(id);
        user.setExternalType("Teacher");
        user.setFirstname(fname);
        user.setLastname(lname);
        user.setLogin("T" + id);

        RoomOptionsDTO options = new RoomOptionsDTO();
        options.setRoomId(roomId);
        options.setShowAudioVideoTest(true);
        options.setModerator(true);

        ServiceResult serviceRs = userService.getRoomHash(sid, user, options);
        //System.out.println(serviceRs.getMessage());
        System.err.println(serviceRs.getMessage());

        roomCountersMap.putIfAbsent(roomId, 1);

        return serviceRs;
    }
    /**
     * 得到某个登录用户的sid
     */
    private String getSid(String name, String pwd) {
        ServiceResult rs = userService.login(name, pwd);
        return rs.getMessage();
    }

}
