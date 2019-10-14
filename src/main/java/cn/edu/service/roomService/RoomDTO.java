
package cn.edu.service.roomService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>roomDTO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="roomDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{org.apache.openmeetings.room.type}type" minOccurs="0"/&gt;
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="appointment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="confno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPublic" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="demo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="closed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="demoTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redirectUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moderated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="allowUserQuestions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="allowRecording" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="waitForRecording" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="audioOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hiddenElements" type="{org.apache.openmeetings.room.element}roomElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="files" type="{http://webservice.openmeetings.apache.org/}roomFileDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roomDTO", propOrder = {
    "id",
    "name",
    "comment",
    "type",
    "capacity",
    "appointment",
    "confno",
    "isPublic",
    "demo",
    "closed",
    "demoTime",
    "externalId",
    "externalType",
    "redirectUrl",
    "moderated",
    "allowUserQuestions",
    "allowRecording",
    "waitForRecording",
    "audioOnly",
    "hiddenElements",
    "files"
})
public class RoomDTO {

    protected Long id;
    protected String name;
    protected String comment;
    @XmlSchemaType(name = "string")
    protected Type2 type;
    protected Long capacity;
    protected boolean appointment;
    protected String confno;
    protected boolean isPublic;
    protected boolean demo;
    protected boolean closed;
    protected Integer demoTime;
    protected String externalId;
    protected String externalType;
    protected String redirectUrl;
    protected boolean moderated;
    protected boolean allowUserQuestions;
    protected boolean allowRecording;
    protected boolean waitForRecording;
    protected boolean audioOnly;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected List<RoomElement> hiddenElements;
    @XmlElement(nillable = true)
    protected List<RoomFileDTO> files;

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡcomment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * ����comment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Type2 }
     *     
     */
    public Type2 getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Type2 }
     *     
     */
    public void setType(Type2 value) {
        this.type = value;
    }

    /**
     * ��ȡcapacity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapacity() {
        return capacity;
    }

    /**
     * ����capacity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapacity(Long value) {
        this.capacity = value;
    }

    /**
     * ��ȡappointment���Ե�ֵ��
     * 
     */
    public boolean isAppointment() {
        return appointment;
    }

    /**
     * ����appointment���Ե�ֵ��
     * 
     */
    public void setAppointment(boolean value) {
        this.appointment = value;
    }

    /**
     * ��ȡconfno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfno() {
        return confno;
    }

    /**
     * ����confno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfno(String value) {
        this.confno = value;
    }

    /**
     * ��ȡisPublic���Ե�ֵ��
     * 
     */
    public boolean isIsPublic() {
        return isPublic;
    }

    /**
     * ����isPublic���Ե�ֵ��
     * 
     */
    public void setIsPublic(boolean value) {
        this.isPublic = value;
    }

    /**
     * ��ȡdemo���Ե�ֵ��
     * 
     */
    public boolean isDemo() {
        return demo;
    }

    /**
     * ����demo���Ե�ֵ��
     * 
     */
    public void setDemo(boolean value) {
        this.demo = value;
    }

    /**
     * ��ȡclosed���Ե�ֵ��
     * 
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * ����closed���Ե�ֵ��
     * 
     */
    public void setClosed(boolean value) {
        this.closed = value;
    }

    /**
     * ��ȡdemoTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDemoTime() {
        return demoTime;
    }

    /**
     * ����demoTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDemoTime(Integer value) {
        this.demoTime = value;
    }

    /**
     * ��ȡexternalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * ����externalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * ��ȡexternalType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalType() {
        return externalType;
    }

    /**
     * ����externalType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalType(String value) {
        this.externalType = value;
    }

    /**
     * ��ȡredirectUrl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * ����redirectUrl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectUrl(String value) {
        this.redirectUrl = value;
    }

    /**
     * ��ȡmoderated���Ե�ֵ��
     * 
     */
    public boolean isModerated() {
        return moderated;
    }

    /**
     * ����moderated���Ե�ֵ��
     * 
     */
    public void setModerated(boolean value) {
        this.moderated = value;
    }

    /**
     * ��ȡallowUserQuestions���Ե�ֵ��
     * 
     */
    public boolean isAllowUserQuestions() {
        return allowUserQuestions;
    }

    /**
     * ����allowUserQuestions���Ե�ֵ��
     * 
     */
    public void setAllowUserQuestions(boolean value) {
        this.allowUserQuestions = value;
    }

    /**
     * ��ȡallowRecording���Ե�ֵ��
     * 
     */
    public boolean isAllowRecording() {
        return allowRecording;
    }

    /**
     * ����allowRecording���Ե�ֵ��
     * 
     */
    public void setAllowRecording(boolean value) {
        this.allowRecording = value;
    }

    /**
     * ��ȡwaitForRecording���Ե�ֵ��
     * 
     */
    public boolean isWaitForRecording() {
        return waitForRecording;
    }

    /**
     * ����waitForRecording���Ե�ֵ��
     * 
     */
    public void setWaitForRecording(boolean value) {
        this.waitForRecording = value;
    }

    /**
     * ��ȡaudioOnly���Ե�ֵ��
     * 
     */
    public boolean isAudioOnly() {
        return audioOnly;
    }

    /**
     * ����audioOnly���Ե�ֵ��
     * 
     */
    public void setAudioOnly(boolean value) {
        this.audioOnly = value;
    }

    /**
     * Gets the value of the hiddenElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hiddenElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHiddenElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomElement }
     * 
     * 
     */
    public List<RoomElement> getHiddenElements() {
        if (hiddenElements == null) {
            hiddenElements = new ArrayList<RoomElement>();
        }
        return this.hiddenElements;
    }

    /**
     * Gets the value of the files property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the files property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomFileDTO }
     * 
     * 
     */
    public List<RoomFileDTO> getFiles() {
        if (files == null) {
            files = new ArrayList<RoomFileDTO>();
        }
        return this.files;
    }

}
