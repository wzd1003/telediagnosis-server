
package cn.edu.service.roomService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>roomFileDTO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="roomFileDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="fileId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="wbIdx" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roomFileDTO", propOrder = {
    "id",
    "fileId",
    "wbIdx"
})
public class RoomFileDTO {

    protected Long id;
    protected long fileId;
    protected long wbIdx;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * 获取fileId属性的值。
     * 
     */
    public long getFileId() {
        return fileId;
    }

    /**
     * 设置fileId属性的值。
     * 
     */
    public void setFileId(long value) {
        this.fileId = value;
    }

    /**
     * 获取wbIdx属性的值。
     * 
     */
    public long getWbIdx() {
        return wbIdx;
    }

    /**
     * 设置wbIdx属性的值。
     * 
     */
    public void setWbIdx(long value) {
        this.wbIdx = value;
    }

}
