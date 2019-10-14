
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
 *     &lt;enumeration value="user"/&gt;
 *     &lt;enumeration value="ldap"/&gt;
 *     &lt;enumeration value="oauth"/&gt;
 *     &lt;enumeration value="external"/&gt;
 *     &lt;enumeration value="contact"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "type", namespace = "org.apache.openmeetings.user.type")
@XmlEnum
public enum Type {

    @XmlEnumValue("user")
    USER("user"),
    @XmlEnumValue("ldap")
    LDAP("ldap"),
    @XmlEnumValue("oauth")
    OAUTH("oauth"),
    @XmlEnumValue("external")
    EXTERNAL("external"),
    @XmlEnumValue("contact")
    CONTACT("contact");
    private final String value;

    Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type fromValue(String v) {
        for (Type c: Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
