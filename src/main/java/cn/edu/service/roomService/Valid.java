
package cn.edu.service.roomService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>valid�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="valid"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OneTime"/&gt;
 *     &lt;enumeration value="Period"/&gt;
 *     &lt;enumeration value="Endless"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "valid")
@XmlEnum
public enum Valid {

    @XmlEnumValue("OneTime")
    ONE_TIME("OneTime"),
    @XmlEnumValue("Period")
    PERIOD("Period"),
    @XmlEnumValue("Endless")
    ENDLESS("Endless");
    private final String value;

    Valid(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Valid fromValue(String v) {
        for (Valid c: Valid.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
