
package cn.edu.service.roomService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>right的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="right"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Admin"/&gt;
 *     &lt;enumeration value="GroupAdmin"/&gt;
 *     &lt;enumeration value="Room"/&gt;
 *     &lt;enumeration value="Dashboard"/&gt;
 *     &lt;enumeration value="Login"/&gt;
 *     &lt;enumeration value="Soap"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "right", namespace = "org.apache.openmeetings.user.right")
@XmlEnum
public enum Right {

    @XmlEnumValue("Admin")
    ADMIN("Admin"),
    @XmlEnumValue("GroupAdmin")
    GROUP_ADMIN("GroupAdmin"),
    @XmlEnumValue("Room")
    ROOM("Room"),
    @XmlEnumValue("Dashboard")
    DASHBOARD("Dashboard"),
    @XmlEnumValue("Login")
    LOGIN("Login"),
    @XmlEnumValue("Soap")
    SOAP("Soap");
    private final String value;

    Right(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Right fromValue(String v) {
        for (Right c: Right.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
