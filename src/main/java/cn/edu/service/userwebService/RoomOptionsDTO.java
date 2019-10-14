
package cn.edu.service.userwebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>roomOptionsDTO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="roomOptionsDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="recordingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="moderator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="showAudioVideoTest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowSameURLMultipleTimes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowRecording" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roomOptionsDTO", propOrder = {
    "roomId",
    "recordingId",
    "moderator",
    "showAudioVideoTest",
    "allowSameURLMultipleTimes",
    "allowRecording"
})
public class RoomOptionsDTO {

    protected Long roomId;
    protected Long recordingId;
    protected boolean moderator;
    protected boolean showAudioVideoTest;
    protected boolean allowSameURLMultipleTimes;
    protected boolean allowRecording;

    /**
     * ��ȡroomId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * ����roomId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoomId(Long value) {
        this.roomId = value;
    }

    /**
     * ��ȡrecordingId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordingId() {
        return recordingId;
    }

    /**
     * ����recordingId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordingId(Long value) {
        this.recordingId = value;
    }

    /**
     * ��ȡmoderator���Ե�ֵ��
     * 
     */
    public boolean isModerator() {
        return moderator;
    }

    /**
     * ����moderator���Ե�ֵ��
     * 
     */
    public void setModerator(boolean value) {
        this.moderator = value;
    }

    /**
     * ��ȡshowAudioVideoTest���Ե�ֵ��
     * 
     */
    public boolean isShowAudioVideoTest() {
        return showAudioVideoTest;
    }

    /**
     * ����showAudioVideoTest���Ե�ֵ��
     * 
     */
    public void setShowAudioVideoTest(boolean value) {
        this.showAudioVideoTest = value;
    }

    /**
     * ��ȡallowSameURLMultipleTimes���Ե�ֵ��
     * 
     */
    public boolean isAllowSameURLMultipleTimes() {
        return allowSameURLMultipleTimes;
    }

    /**
     * ����allowSameURLMultipleTimes���Ե�ֵ��
     * 
     */
    public void setAllowSameURLMultipleTimes(boolean value) {
        this.allowSameURLMultipleTimes = value;
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

}
