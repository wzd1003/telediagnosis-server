
package cn.edu.service.roomService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>roomDTO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取id属性的值。
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
     * 设置id属性的值。
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
     * 获取name属性的值。
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
     * 设置name属性的值。
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
     * 获取comment属性的值。
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
     * 设置comment属性的值。
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
     * 获取type属性的值。
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
     * 设置type属性的值。
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
     * 获取capacity属性的值。
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
     * 设置capacity属性的值。
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
     * 获取appointment属性的值。
     * 
     */
    public boolean isAppointment() {
        return appointment;
    }

    /**
     * 设置appointment属性的值。
     * 
     */
    public void setAppointment(boolean value) {
        this.appointment = value;
    }

    /**
     * 获取confno属性的值。
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
     * 设置confno属性的值。
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
     * 获取isPublic属性的值。
     * 
     */
    public boolean isIsPublic() {
        return isPublic;
    }

    /**
     * 设置isPublic属性的值。
     * 
     */
    public void setIsPublic(boolean value) {
        this.isPublic = value;
    }

    /**
     * 获取demo属性的值。
     * 
     */
    public boolean isDemo() {
        return demo;
    }

    /**
     * 设置demo属性的值。
     * 
     */
    public void setDemo(boolean value) {
        this.demo = value;
    }

    /**
     * 获取closed属性的值。
     * 
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * 设置closed属性的值。
     * 
     */
    public void setClosed(boolean value) {
        this.closed = value;
    }

    /**
     * 获取demoTime属性的值。
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
     * 设置demoTime属性的值。
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
     * 获取externalId属性的值。
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
     * 设置externalId属性的值。
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
     * 获取externalType属性的值。
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
     * 设置externalType属性的值。
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
     * 获取redirectUrl属性的值。
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
     * 设置redirectUrl属性的值。
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
     * 获取moderated属性的值。
     * 
     */
    public boolean isModerated() {
        return moderated;
    }

    /**
     * 设置moderated属性的值。
     * 
     */
    public void setModerated(boolean value) {
        this.moderated = value;
    }

    /**
     * 获取allowUserQuestions属性的值。
     * 
     */
    public boolean isAllowUserQuestions() {
        return allowUserQuestions;
    }

    /**
     * 设置allowUserQuestions属性的值。
     * 
     */
    public void setAllowUserQuestions(boolean value) {
        this.allowUserQuestions = value;
    }

    /**
     * 获取allowRecording属性的值。
     * 
     */
    public boolean isAllowRecording() {
        return allowRecording;
    }

    /**
     * 设置allowRecording属性的值。
     * 
     */
    public void setAllowRecording(boolean value) {
        this.allowRecording = value;
    }

    /**
     * 获取waitForRecording属性的值。
     * 
     */
    public boolean isWaitForRecording() {
        return waitForRecording;
    }

    /**
     * 设置waitForRecording属性的值。
     * 
     */
    public void setWaitForRecording(boolean value) {
        this.waitForRecording = value;
    }

    /**
     * 获取audioOnly属性的值。
     * 
     */
    public boolean isAudioOnly() {
        return audioOnly;
    }

    /**
     * 设置audioOnly属性的值。
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
