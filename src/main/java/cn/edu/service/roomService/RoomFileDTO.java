
package cn.edu.service.roomService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>roomFileDTO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡid���Ե�ֵ��
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
     * ����id���Ե�ֵ��
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
     * ��ȡfileId���Ե�ֵ��
     * 
     */
    public long getFileId() {
        return fileId;
    }

    /**
     * ����fileId���Ե�ֵ��
     * 
     */
    public void setFileId(long value) {
        this.fileId = value;
    }

    /**
     * ��ȡwbIdx���Ե�ֵ��
     * 
     */
    public long getWbIdx() {
        return wbIdx;
    }

    /**
     * ����wbIdx���Ե�ֵ��
     * 
     */
    public void setWbIdx(long value) {
        this.wbIdx = value;
    }

}
