
package cn.edu.service.userwebService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="user"/>
 *     &lt;enumeration value="ldap"/>
 *     &lt;enumeration value="oauth"/>
 *     &lt;enumeration value="external"/>
 *     &lt;enumeration value="contact"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
