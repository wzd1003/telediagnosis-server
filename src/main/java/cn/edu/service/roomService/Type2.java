
package cn.edu.service.roomService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="conference"/&gt;
 *     &lt;enumeration value="presentation"/&gt;
 *     &lt;enumeration value="interview"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "type", namespace = "org.apache.openmeetings.room.type")
@XmlEnum
public enum Type2 {

    @XmlEnumValue("conference")
    CONFERENCE("conference"),
    @XmlEnumValue("presentation")
    PRESENTATION("presentation"),
    @XmlEnumValue("interview")
    INTERVIEW("interview");
    private final String value;

    Type2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type2 fromValue(String v) {
        for (Type2 c: Type2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
