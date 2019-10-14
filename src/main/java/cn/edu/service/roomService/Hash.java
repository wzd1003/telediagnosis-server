
package cn.edu.service.roomService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>hash complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="hash"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invite" type="{http://webservice.openmeetings.apache.org/}invitationDTO" minOccurs="0"/&gt;
 *         &lt;element name="sendmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hash", propOrder = {
    "sid",
    "invite",
    "sendmail"
})
public class Hash {

    protected String sid;
    protected InvitationDTO invite;
    protected boolean sendmail;

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
     * 获取invite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InvitationDTO }
     *     
     */
    public InvitationDTO getInvite() {
        return invite;
    }

    /**
     * 设置invite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InvitationDTO }
     *     
     */
    public void setInvite(InvitationDTO value) {
        this.invite = value;
    }

    /**
     * 获取sendmail属性的值。
     * 
     */
    public boolean isSendmail() {
        return sendmail;
    }

    /**
     * 设置sendmail属性的值。
     * 
     */
    public void setSendmail(boolean value) {
        this.sendmail = value;
    }

}
