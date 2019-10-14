
package cn.edu.service.userwebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getRoomHash complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getRoomHash">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user" type="{http://webservice.openmeetings.apache.org/}externalUserDTO" minOccurs="0"/>
 *         &lt;element name="options" type="{http://webservice.openmeetings.apache.org/}roomOptionsDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoomHash", propOrder = {
    "sid",
    "user",
    "options"
})
public class GetRoomHash {

    protected String sid;
    protected ExternalUserDTO user;
    protected RoomOptionsDTO options;

    /**
     * 获取sid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSid() {
        return sid;
    }

    /**
     * 设置sid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSid(String value) {
        this.sid = value;
    }

    /**
     * 获取user属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExternalUserDTO }
     *     
     */
    public ExternalUserDTO getUser() {
        return user;
    }

    /**
     * 设置user属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalUserDTO }
     *     
     */
    public void setUser(ExternalUserDTO value) {
        this.user = value;
    }

    /**
     * 获取options属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomOptionsDTO }
     *     
     */
    public RoomOptionsDTO getOptions() {
        return options;
    }

    /**
     * 设置options属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomOptionsDTO }
     *     
     */
    public void setOptions(RoomOptionsDTO value) {
        this.options = value;
    }

}
