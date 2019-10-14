
package cn.edu.service.roomService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>hash complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡsid���Ե�ֵ��
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
     * ����sid���Ե�ֵ��
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
     * ��ȡinvite���Ե�ֵ��
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
     * ����invite���Ե�ֵ��
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
     * ��ȡsendmail���Ե�ֵ��
     * 
     */
    public boolean isSendmail() {
        return sendmail;
    }

    /**
     * ����sendmail���Ե�ֵ��
     * 
     */
    public void setSendmail(boolean value) {
        this.sendmail = value;
    }

}
