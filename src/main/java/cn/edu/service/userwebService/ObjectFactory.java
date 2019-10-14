
package cn.edu.service.userwebService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.edu.service.userwebService package. 
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

    private final static QName _LoginResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "loginResponse");
    private final static QName _ServiceResult_QNAME = new QName("http://webservice.openmeetings.apache.org/", "serviceResult");
    private final static QName _Add_QNAME = new QName("http://webservice.openmeetings.apache.org/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "addResponse");
    private final static QName _GetResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getResponse");
    private final static QName _DeleteExternalResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "deleteExternalResponse");
    private final static QName _RoomOptionsDTO_QNAME = new QName("http://webservice.openmeetings.apache.org/", "roomOptionsDTO");
    private final static QName _ExternalUserDTO_QNAME = new QName("http://webservice.openmeetings.apache.org/", "externalUserDTO");
    private final static QName _UserDTO_QNAME = new QName("http://webservice.openmeetings.apache.org/", "userDTO");
    private final static QName _Delete_QNAME = new QName("http://webservice.openmeetings.apache.org/", "delete");
    private final static QName _DeleteExternal_QNAME = new QName("http://webservice.openmeetings.apache.org/", "deleteExternal");
    private final static QName _Login_QNAME = new QName("http://webservice.openmeetings.apache.org/", "login");
    private final static QName _Get_QNAME = new QName("http://webservice.openmeetings.apache.org/", "get");
    private final static QName _DeleteResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "deleteResponse");
    private final static QName _GetRoomHash_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getRoomHash");
    private final static QName _GetRoomHashResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getRoomHashResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.edu.service.userwebService
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
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ServiceResult }
     * 
     */
    public ServiceResult createServiceResult() {
        return new ServiceResult();
    }

    /**
     * Create an instance of {@link DeleteExternalResponse }
     * 
     */
    public DeleteExternalResponse createDeleteExternalResponse() {
        return new DeleteExternalResponse();
    }

    /**
     * Create an instance of {@link RoomOptionsDTO }
     * 
     */
    public RoomOptionsDTO createRoomOptionsDTO() {
        return new RoomOptionsDTO();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link ExternalUserDTO }
     * 
     */
    public ExternalUserDTO createExternalUserDTO() {
        return new ExternalUserDTO();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteExternal }
     * 
     */
    public DeleteExternal createDeleteExternal() {
        return new DeleteExternal();
    }

    /**
     * Create an instance of {@link UserDTO }
     * 
     */
    public UserDTO createUserDTO() {
        return new UserDTO();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link GetRoomHash }
     * 
     */
    public GetRoomHash createGetRoomHash() {
        return new GetRoomHash();
    }

    /**
     * Create an instance of {@link GetRoomHashResponse }
     * 
     */
    public GetRoomHashResponse createGetRoomHashResponse() {
        return new GetRoomHashResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "serviceResult")
    public JAXBElement<ServiceResult> createServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_ServiceResult_QNAME, ServiceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getResponse")
    public JAXBElement<GetResponse> createGetResponse(GetResponse value) {
        return new JAXBElement<GetResponse>(_GetResponse_QNAME, GetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteExternalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "deleteExternalResponse")
    public JAXBElement<DeleteExternalResponse> createDeleteExternalResponse(DeleteExternalResponse value) {
        return new JAXBElement<DeleteExternalResponse>(_DeleteExternalResponse_QNAME, DeleteExternalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomOptionsDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "roomOptionsDTO")
    public JAXBElement<RoomOptionsDTO> createRoomOptionsDTO(RoomOptionsDTO value) {
        return new JAXBElement<RoomOptionsDTO>(_RoomOptionsDTO_QNAME, RoomOptionsDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalUserDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "externalUserDTO")
    public JAXBElement<ExternalUserDTO> createExternalUserDTO(ExternalUserDTO value) {
        return new JAXBElement<ExternalUserDTO>(_ExternalUserDTO_QNAME, ExternalUserDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "userDTO")
    public JAXBElement<UserDTO> createUserDTO(UserDTO value) {
        return new JAXBElement<UserDTO>(_UserDTO_QNAME, UserDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteExternal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "deleteExternal")
    public JAXBElement<DeleteExternal> createDeleteExternal(DeleteExternal value) {
        return new JAXBElement<DeleteExternal>(_DeleteExternal_QNAME, DeleteExternal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Get }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "get")
    public JAXBElement<Get> createGet(Get value) {
        return new JAXBElement<Get>(_Get_QNAME, Get.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomHash }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getRoomHash")
    public JAXBElement<GetRoomHash> createGetRoomHash(GetRoomHash value) {
        return new JAXBElement<GetRoomHash>(_GetRoomHash_QNAME, GetRoomHash.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomHashResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getRoomHashResponse")
    public JAXBElement<GetRoomHashResponse> createGetRoomHashResponse(GetRoomHashResponse value) {
        return new JAXBElement<GetRoomHashResponse>(_GetRoomHashResponse_QNAME, GetRoomHashResponse.class, null, value);
    }

}
