package cn.edu.service.roomService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2019-10-08T16:19:11.125+08:00
 * Generated source version: 3.3.0
 *
 */
@WebService(targetNamespace = "http://webservice.openmeetings.apache.org/", name = "RoomWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface RoomWebService {

    @WebMethod
    @RequestWrapper(localName = "add", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.AddResponse")
    @WebResult(name = "return", targetNamespace = "")
    public RoomDTO add(
            @WebParam(name = "sid", targetNamespace = "")
                    String sid,
            @WebParam(name = "room", targetNamespace = "")
                    RoomDTO room
    );

    @WebMethod
    @RequestWrapper(localName = "cleanWb", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.CleanWb")
    @ResponseWrapper(localName = "cleanWbResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.CleanWbResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ServiceResult cleanWb(
            @WebParam(name = "sid", targetNamespace = "")
                    String sid,
            @WebParam(name = "id", targetNamespace = "")
                    long id
    );

    @WebMethod
    @RequestWrapper(localName = "getPublic", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.GetPublic")
    @ResponseWrapper(localName = "getPublicResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.GetPublicResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<RoomDTO> getPublic(
            @WebParam(name = "sid", targetNamespace = "")
                    String sid,
            @WebParam(name = "type", targetNamespace = "")
                    String type
    );

    @WebMethod
    @RequestWrapper(localName = "count", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.Count")
    @ResponseWrapper(localName = "countResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.CountResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ServiceResult count(
            @WebParam(name = "sid", targetNamespace = "")
                    String sid,
            @WebParam(name = "roomid", targetNamespace = "")
                    Long roomid
    );

    @WebMethod
    @RequestWrapper(localName = "users", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.Users")
    @ResponseWrapper(localName = "usersResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.UsersResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<UserDTO> users(
            @WebParam(name = "sid", targetNamespace = "")
                    String sid,
            @WebParam(name = "roomid", targetNamespace = "")
                    Long roomid
    );

    @WebMethod
    @RequestWrapper(localName = "delete", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.DeleteResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ServiceResult delete(
            @WebParam(name = "sid", targetNamespace = "")
                    String sid,
            @WebParam(name = "id", targetNamespace = "")
                    long id
    );

    @WebMethod
    @RequestWrapper(localName = "getExternal", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.GetExternal")
    @ResponseWrapper(localName = "getExternalResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.GetExternalResponse")
    @WebResult(name = "return", targetNamespace = "")
    public RoomDTO getExternal(
            @WebParam(name = "sid", targetNamespace = "")
                    String sid,
            @WebParam(name = "type", targetNamespace = "")
                    String type,
            @WebParam(name = "externaltype", targetNamespace = "")
                    String externaltype,
            @WebParam(name = "externalid", targetNamespace = "")
                    String externalid,
            @WebParam(name = "room", targetNamespace = "")
                    RoomDTO room
    );

    @WebMethod
    @RequestWrapper(localName = "kickAll", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.KickAll")
    @ResponseWrapper(localName = "kickAllResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.KickAllResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ServiceResult kickAll(
            @WebParam(name = "sid", targetNamespace = "")
                    String sid,
            @WebParam(name = "id", targetNamespace = "")
                    long id
    );

    @WebMethod
    @RequestWrapper(localName = "kick", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.Kick")
    @ResponseWrapper(localName = "kickResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.KickResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ServiceResult kick(
            @WebParam(name = "sid", targetNamespace = "")
                    String sid,
            @WebParam(name = "id", targetNamespace = "")
                    long id,
            @WebParam(name = "externalType", targetNamespace = "")
                    String externalType,
            @WebParam(name = "externalId", targetNamespace = "")
                    String externalId
    );

    @WebMethod
    @RequestWrapper(localName = "getRoomById", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.GetRoomById")
    @ResponseWrapper(localName = "getRoomByIdResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.GetRoomByIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public RoomDTO getRoomById(
            @WebParam(name = "sid", targetNamespace = "")
                    String sid,
            @WebParam(name = "id", targetNamespace = "")
                    Long id
    );

    @WebMethod
    @RequestWrapper(localName = "hash", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.Hash")
    @ResponseWrapper(localName = "hashResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.HashResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ServiceResult hash(
            @WebParam(name = "sid", targetNamespace = "")
                    String sid,
            @WebParam(name = "invite", targetNamespace = "")
                    InvitationDTO invite,
            @WebParam(name = "sendmail", targetNamespace = "")
                    boolean sendmail
    );

    @WebMethod
    @RequestWrapper(localName = "open", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.Open")
    @ResponseWrapper(localName = "openResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.OpenResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ServiceResult open(
            @WebParam(name = "sid", targetNamespace = "")
                    String sid,
            @WebParam(name = "id", targetNamespace = "")
                    long id
    );

    @WebMethod
    @RequestWrapper(localName = "close", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.Close")
    @ResponseWrapper(localName = "closeResponse", targetNamespace = "http://webservice.openmeetings.apache.org/", className = "cn.edu.service.roomService.CloseResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ServiceResult close(
            @WebParam(name = "sid", targetNamespace = "")
                    String sid,
            @WebParam(name = "id", targetNamespace = "")
                    long id
    );
}
