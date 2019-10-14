
package cn.edu.service.userwebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>roomOptionsDTO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取roomId属性的值。
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
     * 设置roomId属性的值。
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
     * 获取recordingId属性的值。
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
     * 设置recordingId属性的值。
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
     * 获取moderator属性的值。
     * 
     */
    public boolean isModerator() {
        return moderator;
    }

    /**
     * 设置moderator属性的值。
     * 
     */
    public void setModerator(boolean value) {
        this.moderator = value;
    }

    /**
     * 获取showAudioVideoTest属性的值。
     * 
     */
    public boolean isShowAudioVideoTest() {
        return showAudioVideoTest;
    }

    /**
     * 设置showAudioVideoTest属性的值。
     * 
     */
    public void setShowAudioVideoTest(boolean value) {
        this.showAudioVideoTest = value;
    }

    /**
     * 获取allowSameURLMultipleTimes属性的值。
     * 
     */
    public boolean isAllowSameURLMultipleTimes() {
        return allowSameURLMultipleTimes;
    }

    /**
     * 设置allowSameURLMultipleTimes属性的值。
     * 
     */
    public void setAllowSameURLMultipleTimes(boolean value) {
        this.allowSameURLMultipleTimes = value;
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

}
