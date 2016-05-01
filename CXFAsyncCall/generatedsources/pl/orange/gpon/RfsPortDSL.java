
package pl.orange.gpon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RfsPortDSL complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RfsPortDSL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dslamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dslamVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dslamModel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="m1400" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telediagnosisIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceOption" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lineType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isVideoService" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="uniPort" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}UniPort" maxOccurs="unbounded"/&gt;
 *         &lt;element name="group" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}Group" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RfsPortDSL", propOrder = {
    "dslamName",
    "dslamVendor",
    "dslamModel",
    "m1400",
    "suffix",
    "telediagnosisIP",
    "area",
    "serviceType",
    "serviceOption",
    "lineType",
    "isVideoService",
    "uniPort",
    "group"
})
public class RfsPortDSL {

    protected String dslamName;
    protected String dslamVendor;
    @XmlElement(required = true)
    protected String dslamModel;
    @XmlElement(required = true)
    protected String m1400;
    @XmlElement(required = true)
    protected String suffix;
    protected String telediagnosisIP;
    @XmlElement(required = true)
    protected String area;
    @XmlElement(required = true)
    protected String serviceType;
    @XmlElement(required = true)
    protected String serviceOption;
    @XmlElement(required = true)
    protected String lineType;
    protected boolean isVideoService;
    @XmlElement(required = true)
    protected List<UniPort> uniPort;
    protected Group group;

    /**
     * Obtient la valeur de la propriété dslamName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDslamName() {
        return dslamName;
    }

    /**
     * Définit la valeur de la propriété dslamName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDslamName(String value) {
        this.dslamName = value;
    }

    /**
     * Obtient la valeur de la propriété dslamVendor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDslamVendor() {
        return dslamVendor;
    }

    /**
     * Définit la valeur de la propriété dslamVendor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDslamVendor(String value) {
        this.dslamVendor = value;
    }

    /**
     * Obtient la valeur de la propriété dslamModel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDslamModel() {
        return dslamModel;
    }

    /**
     * Définit la valeur de la propriété dslamModel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDslamModel(String value) {
        this.dslamModel = value;
    }

    /**
     * Obtient la valeur de la propriété m1400.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM1400() {
        return m1400;
    }

    /**
     * Définit la valeur de la propriété m1400.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM1400(String value) {
        this.m1400 = value;
    }

    /**
     * Obtient la valeur de la propriété suffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Définit la valeur de la propriété suffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Obtient la valeur de la propriété telediagnosisIP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelediagnosisIP() {
        return telediagnosisIP;
    }

    /**
     * Définit la valeur de la propriété telediagnosisIP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelediagnosisIP(String value) {
        this.telediagnosisIP = value;
    }

    /**
     * Obtient la valeur de la propriété area.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Définit la valeur de la propriété area.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Obtient la valeur de la propriété serviceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Définit la valeur de la propriété serviceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Obtient la valeur de la propriété serviceOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOption() {
        return serviceOption;
    }

    /**
     * Définit la valeur de la propriété serviceOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOption(String value) {
        this.serviceOption = value;
    }

    /**
     * Obtient la valeur de la propriété lineType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * Définit la valeur de la propriété lineType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineType(String value) {
        this.lineType = value;
    }

    /**
     * Obtient la valeur de la propriété isVideoService.
     * 
     */
    public boolean isIsVideoService() {
        return isVideoService;
    }

    /**
     * Définit la valeur de la propriété isVideoService.
     * 
     */
    public void setIsVideoService(boolean value) {
        this.isVideoService = value;
    }

    /**
     * Gets the value of the uniPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniPort }
     * 
     * 
     */
    public List<UniPort> getUniPort() {
        if (uniPort == null) {
            uniPort = new ArrayList<UniPort>();
        }
        return this.uniPort;
    }

    /**
     * Obtient la valeur de la propriété group.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Définit la valeur de la propriété group.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setGroup(Group value) {
        this.group = value;
    }

}
