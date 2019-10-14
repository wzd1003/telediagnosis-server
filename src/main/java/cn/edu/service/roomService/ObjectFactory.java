
package cn.edu.service.roomService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.edu.service.roomService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Add_QNAME = new QName("http://webservice.openmeetings.apache.org/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "addResponse");
    private final static QName _CleanWb_QNAME = new QName("http://webservice.openmeetings.apache.org/", "cleanWb");
    private final static QName _CleanWbResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "cleanWbResponse");
    private final static QName _Close_QNAME = new QName("http://webservice.openmeetings.apache.org/", "close");
    private final static QName _CloseResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "closeResponse");
    private final static QName _Count_QNAME = new QName("http://webservice.openmeetings.apache.org/", "count");
    private final static QName _CountResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "countResponse");
    private final static QName _Delete_QNAME = new QName("http://webservice.openmeetings.apache.org/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "deleteResponse");
    private final static QName _GetExternal_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getExternal");
    private final static QName _GetExternalResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getExternalResponse");
    private final static QName _GetPublic_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getPublic");
    private final static QName _GetPublicResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getPublicResponse");
    private final static QName _GetRoomById_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getRoomById");
    private final static QName _GetRoomByIdResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getRoomByIdResponse");
    private final static QName _Hash_QNAME = new QName("http://webservice.openmeetings.apache.org/", "hash");
    private final static QName _HashResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "hashResponse");
    private final static QName _InvitationDTO_QNAME = new QName("http://webservice.openmeetings.apache.org/", "invitationDTO");
    private final static QName _Kick_QNAME = new QName("http://webservice.openmeetings.apache.org/", "kick");
    private final static QName _KickAll_QNAME = new QName("http://webservice.openmeetings.apache.org/", "kickAll");
    private final static QName _KickAllResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "kickAllResponse");
    private final static QName _KickResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "kickResponse");
    private final static QName _Open_QNAME = new QName("http://webservice.openmeetings.apache.org/", "open");
    private final static QName _OpenResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "openResponse");
    private final static QName _RoomDTO_QNAME = new QName("http://webservice.openmeetings.apache.org/", "roomDTO");
    private final static QName _RoomFileDTO_QNAME = new QName("http://webservice.openmeetings.apache.org/", "roomFileDTO");
    private final static QName _ServiceResult_QNAME = new QName("http://webservice.openmeetings.apache.org/", "serviceResult");
    private final static QName _UserDTO_QNAME = new QName("http://webservice.openmeetings.apache.org/", "userDTO");
    private final static QName _Users_QNAME = new QName("http://webservice.openmeetings.apache.org/", "users");
    private final static QName _UsersResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "usersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.edu.service.roomService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link CleanWb }
     * 
     */
    public CleanWb createCleanWb() {
        return new CleanWb();
    }

    /**
     * Create an instance of {@link CleanWbResponse }
     * 
     */
    public CleanWbResponse createCleanWbResponse() {
        return new CleanWbResponse();
    }

    /**
     * Create an instance of {@link Close }
     * 
     */
    public Close createClose() {
        return new Close();
    }

    /**
     * Create an instance of {@link CloseResponse }
     * 
     */
    public CloseResponse createCloseResponse() {
        return new CloseResponse();
    }

    /**
     * Create an instance of {@link Count }
     * 
     */
    public Count createCount() {
        return new Count();
    }

    /**
     * Create an instance of {@link CountResponse }
     * 
     */
    public CountResponse createCountResponse() {
        return new CountResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link GetExternal }
     * 
     */
    public GetExternal createGetExternal() {
        return new GetExternal();
    }

    /**
     * Create an instance of {@link GetExternalResponse }
     * 
     */
    public GetExternalResponse createGetExternalResponse() {
        return new GetExternalResponse();
    }

    /**
     * Create an instance of {@link GetPublic }
     * 
     */
    public GetPublic createGetPublic() {
        return new GetPublic();
    }

    /**
     * Create an instance of {@link GetPublicResponse }
     * 
     */
    public GetPublicResponse createGetPublicResponse() {
        return new GetPublicResponse();
    }

    /**
     * Create an instance of {@link GetRoomById }
     * 
     */
    public GetRoomById createGetRoomById() {
        return new GetRoomById();
    }

    /**
     * Create an instance of {@link GetRoomByIdResponse }
     * 
     */
    public GetRoomByIdResponse createGetRoomByIdResponse() {
        return new GetRoomByIdResponse();
    }

    /**
     * Create an instance of {@link Hash }
     * 
     */
    public Hash createHash() {
        return new Hash();
    }

    /**
     * Create an instance of {@link HashResponse }
     * 
     */
    public HashResponse createHashResponse() {
        return new HashResponse();
    }

    /**
     * Create an instance of {@link InvitationDTO }
     * 
     */
    public InvitationDTO createInvitationDTO() {
        return new InvitationDTO();
    }

    /**
     * Create an instance of {@link Kick }
     * 
     */
    public Kick createKick() {
        return new Kick();
    }

    /**
     * Create an instance of {@link KickAll }
     * 
     */
    public KickAll createKickAll() {
        return new KickAll();
    }

    /**
     * Create an instance of {@link KickAllResponse }
     * 
     */
    public KickAllResponse createKickAllResponse() {
        return new KickAllResponse();
    }

    /**
     * Create an instance of {@link KickResponse }
     * 
     */
    public KickResponse createKickResponse() {
        return new KickResponse();
    }

    /**
     * Create an instance of {@link Open }
     * 
     */
    public Open createOpen() {
        return new Open();
    }

    /**
     * Create an instance of {@link OpenResponse }
     * 
     */
    public OpenResponse createOpenResponse() {
        return new OpenResponse();
    }

    /**
     * Create an instance of {@link RoomDTO }
     * 
     */
    public RoomDTO createRoomDTO() {
        return new RoomDTO();
    }

    /**
     * Create an instance of {@link RoomFileDTO }
     * 
     */
    public RoomFileDTO createRoomFileDTO() {
        return new RoomFileDTO();
    }

    /**
     * Create an instance of {@link ServiceResult }
     * 
     */
    public ServiceResult createServiceResult() {
        return new ServiceResult();
    }

    /**
     * Create an instance of {@link UserDTO }
     * 
     */
    public UserDTO createUserDTO() {
        return new UserDTO();
    }

    /**
     * Create an instance of {@link Users }
     * 
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link UsersResponse }
     * 
     */
    public UsersResponse createUsersResponse() {
        return new UsersResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CleanWb }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CleanWb }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "cleanWb")
    public JAXBElement<CleanWb> createCleanWb(CleanWb value) {
        return new JAXBElement<CleanWb>(_CleanWb_QNAME, CleanWb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CleanWbResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CleanWbResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "cleanWbResponse")
    public JAXBElement<CleanWbResponse> createCleanWbResponse(CleanWbResponse value) {
        return new JAXBElement<CleanWbResponse>(_CleanWbResponse_QNAME, CleanWbResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Close }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Close }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "close")
    public JAXBElement<Close> createClose(Close value) {
        return new JAXBElement<Close>(_Close_QNAME, Close.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CloseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "closeResponse")
    public JAXBElement<CloseResponse> createCloseResponse(CloseResponse value) {
        return new JAXBElement<CloseResponse>(_CloseResponse_QNAME, CloseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Count }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExternal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetExternal }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getExternal")
    public JAXBElement<GetExternal> createGetExternal(GetExternal value) {
        return new JAXBElement<GetExternal>(_GetExternal_QNAME, GetExternal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExternalResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetExternalResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getExternalResponse")
    public JAXBElement<GetExternalResponse> createGetExternalResponse(GetExternalResponse value) {
        return new JAXBElement<GetExternalResponse>(_GetExternalResponse_QNAME, GetExternalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPublic }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getPublic")
    public JAXBElement<GetPublic> createGetPublic(GetPublic value) {
        return new JAXBElement<GetPublic>(_GetPublic_QNAME, GetPublic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublicResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPublicResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getPublicResponse")
    public JAXBElement<GetPublicResponse> createGetPublicResponse(GetPublicResponse value) {
        return new JAXBElement<GetPublicResponse>(_GetPublicResponse_QNAME, GetPublicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRoomById }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getRoomById")
    public JAXBElement<GetRoomById> createGetRoomById(GetRoomById value) {
        return new JAXBElement<GetRoomById>(_GetRoomById_QNAME, GetRoomById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRoomByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getRoomByIdResponse")
    public JAXBElement<GetRoomByIdResponse> createGetRoomByIdResponse(GetRoomByIdResponse value) {
        return new JAXBElement<GetRoomByIdResponse>(_GetRoomByIdResponse_QNAME, GetRoomByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hash }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hash }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "hash")
    public JAXBElement<Hash> createHash(Hash value) {
        return new JAXBElement<Hash>(_Hash_QNAME, Hash.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HashResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HashResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "hashResponse")
    public JAXBElement<HashResponse> createHashResponse(HashResponse value) {
        return new JAXBElement<HashResponse>(_HashResponse_QNAME, HashResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvitationDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvitationDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "invitationDTO")
    public JAXBElement<InvitationDTO> createInvitationDTO(InvitationDTO value) {
        return new JAXBElement<InvitationDTO>(_InvitationDTO_QNAME, InvitationDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Kick }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Kick }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "kick")
    public JAXBElement<Kick> createKick(Kick value) {
        return new JAXBElement<Kick>(_Kick_QNAME, Kick.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KickAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KickAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "kickAll")
    public JAXBElement<KickAll> createKickAll(KickAll value) {
        return new JAXBElement<KickAll>(_KickAll_QNAME, KickAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KickAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KickAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "kickAllResponse")
    public JAXBElement<KickAllResponse> createKickAllResponse(KickAllResponse value) {
        return new JAXBElement<KickAllResponse>(_KickAllResponse_QNAME, KickAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KickResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KickResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "kickResponse")
    public JAXBElement<KickResponse> createKickResponse(KickResponse value) {
        return new JAXBElement<KickResponse>(_KickResponse_QNAME, KickResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Open }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Open }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "open")
    public JAXBElement<Open> createOpen(Open value) {
        return new JAXBElement<Open>(_Open_QNAME, Open.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "openResponse")
    public JAXBElement<OpenResponse> createOpenResponse(OpenResponse value) {
        return new JAXBElement<OpenResponse>(_OpenResponse_QNAME, OpenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoomDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "roomDTO")
    public JAXBElement<RoomDTO> createRoomDTO(RoomDTO value) {
        return new JAXBElement<RoomDTO>(_RoomDTO_QNAME, RoomDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomFileDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoomFileDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "roomFileDTO")
    public JAXBElement<RoomFileDTO> createRoomFileDTO(RoomFileDTO value) {
        return new JAXBElement<RoomFileDTO>(_RoomFileDTO_QNAME, RoomFileDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "serviceResult")
    public JAXBElement<ServiceResult> createServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_ServiceResult_QNAME, ServiceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "userDTO")
    public JAXBElement<UserDTO> createUserDTO(UserDTO value) {
        return new JAXBElement<UserDTO>(_UserDTO_QNAME, UserDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Users }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Users }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "users")
    public JAXBElement<Users> createUsers(Users value) {
        return new JAXBElement<Users>(_Users_QNAME, Users.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "usersResponse")
    public JAXBElement<UsersResponse> createUsersResponse(UsersResponse value) {
        return new JAXBElement<UsersResponse>(_UsersResponse_QNAME, UsersResponse.class, null, value);
    }

}
