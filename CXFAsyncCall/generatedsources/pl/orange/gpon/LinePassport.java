
package pl.orange.gpon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LinePassport complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LinePassport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerDn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="m1400" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hostType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lineType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="port" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}Port" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinePassport", propOrder = {
    "customerDn",
    "m1400",
    "hostType",
    "lineType",
    "port"
})
public class LinePassport {

    @XmlElement(required = true)
    protected String customerDn;
    @XmlElement(required = true)
    protected String m1400;
    @XmlElement(required = true)
    protected String hostType;
    @XmlElement(required = true)
    protected String lineType;
    @XmlElement(required = true)
    protected List<Port> port;

    /**
     * Obtient la valeur de la propriété customerDn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDn() {
        return customerDn;
    }

    /**
     * Définit la valeur de la propriété customerDn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDn(String value) {
        this.customerDn = value;
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
     * Obtient la valeur de la propriété hostType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostType() {
        return hostType;
    }

    /**
     * Définit la valeur de la propriété hostType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostType(String value) {
        this.hostType = value;
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
     * Gets the value of the port property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the port property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Port }
     * 
     * 
     */
    public List<Port> getPort() {
        if (port == null) {
            port = new ArrayList<Port>();
        }
        return this.port;
    }

}
