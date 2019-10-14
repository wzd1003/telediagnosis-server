
package cn.edu.service.roomService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>roomElement的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="roomElement"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TopBar"/&gt;
 *     &lt;enumeration value="Chat"/&gt;
 *     &lt;enumeration value="Activities"/&gt;
 *     &lt;enumeration value="Files"/&gt;
 *     &lt;enumeration value="ActionMenu"/&gt;
 *     &lt;enumeration value="PollMenu"/&gt;
 *     &lt;enumeration value="ScreenSharing"/&gt;
 *     &lt;enumeration value="Whiteboard"/&gt;
 *     &lt;enumeration value="MicrophoneStatus"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "roomElement", namespace = "org.apache.openmeetings.room.element")
@XmlEnum
public enum RoomElement {

    @XmlEnumValue("TopBar")
    TOP_BAR("TopBar"),
    @XmlEnumValue("Chat")
    CHAT("Chat"),
    @XmlEnumValue("Activities")
    ACTIVITIES("Activities"),
    @XmlEnumValue("Files")
    FILES("Files"),
    @XmlEnumValue("ActionMenu")
    ACTION_MENU("ActionMenu"),
    @XmlEnumValue("PollMenu")
    POLL_MENU("PollMenu"),
    @XmlEnumValue("ScreenSharing")
    SCREEN_SHARING("ScreenSharing"),
    @XmlEnumValue("Whiteboard")
    WHITEBOARD("Whiteboard"),
    @XmlEnumValue("MicrophoneStatus")
    MICROPHONE_STATUS("MicrophoneStatus");
    private final String value;

    RoomElement(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoomElement fromValue(String v) {
        for (RoomElement c: RoomElement.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
