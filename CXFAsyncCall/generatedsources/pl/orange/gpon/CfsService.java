
package pl.orange.gpon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CfsService complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CfsService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inventoryId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="identifier"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cfsPatternSymbol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cfsPatternName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cfsStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceOwnerUkeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rfsPortType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rfsService" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}RfsService" maxOccurs="unbounded"/&gt;
 *         &lt;element name="rfsPortDSL" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}RfsPortDSL" minOccurs="0"/&gt;
 *         &lt;element name="rfsPortVoice" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}RfsPortVoice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CfsService", propOrder = {
    "inventoryId",
    "identifier",
    "cfsPatternSymbol",
    "cfsPatternName",
    "cfsStatus",
    "serviceOwnerUkeId",
    "rfsPortType",
    "rfsService",
    "rfsPortDSL",
    "rfsPortVoice"
})
public class CfsService {

    protected long inventoryId;
    @XmlElement(required = true)
    protected String identifier;
    @XmlElement(required = true)
    protected String cfsPatternSymbol;
    @XmlElement(required = true)
    protected String cfsPatternName;
    @XmlElement(required = true)
    protected String cfsStatus;
    protected String serviceOwnerUkeId;
    @XmlElement(required = true)
    protected String rfsPortType;
    @XmlElement(required = true)
    protected List<RfsService> rfsService;
    protected RfsPortDSL rfsPortDSL;
    protected RfsPortVoice rfsPortVoice;

    /**
     * Obtient la valeur de la propriété inventoryId.
     * 
     */
    public long getInventoryId() {
        return inventoryId;
    }

    /**
     * Définit la valeur de la propriété inventoryId.
     * 
     */
    public void setInventoryId(long value) {
        this.inventoryId = value;
    }

    /**
     * Obtient la valeur de la propriété identifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Définit la valeur de la propriété identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Obtient la valeur de la propriété cfsPatternSymbol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfsPatternSymbol() {
        return cfsPatternSymbol;
    }

    /**
     * Définit la valeur de la propriété cfsPatternSymbol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfsPatternSymbol(String value) {
        this.cfsPatternSymbol = value;
    }

    /**
     * Obtient la valeur de la propriété cfsPatternName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfsPatternName() {
        return cfsPatternName;
    }

    /**
     * Définit la valeur de la propriété cfsPatternName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfsPatternName(String value) {
        this.cfsPatternName = value;
    }

    /**
     * Obtient la valeur de la propriété cfsStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfsStatus() {
        return cfsStatus;
    }

    /**
     * Définit la valeur de la propriété cfsStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfsStatus(String value) {
        this.cfsStatus = value;
    }

    /**
     * Obtient la valeur de la propriété serviceOwnerUkeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOwnerUkeId() {
        return serviceOwnerUkeId;
    }

    /**
     * Définit la valeur de la propriété serviceOwnerUkeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOwnerUkeId(String value) {
        this.serviceOwnerUkeId = value;
    }

    /**
     * Obtient la valeur de la propriété rfsPortType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfsPortType() {
        return rfsPortType;
    }

    /**
     * Définit la valeur de la propriété rfsPortType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfsPortType(String value) {
        this.rfsPortType = value;
    }

    /**
     * Gets the value of the rfsService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfsService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfsService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RfsService }
     * 
     * 
     */
    public List<RfsService> getRfsService() {
        if (rfsService == null) {
            rfsService = new ArrayList<RfsService>();
        }
        return this.rfsService;
    }

    /**
     * Obtient la valeur de la propriété rfsPortDSL.
     * 
     * @return
     *     possible object is
     *     {@link RfsPortDSL }
     *     
     */
    public RfsPortDSL getRfsPortDSL() {
        return rfsPortDSL;
    }

    /**
     * Définit la valeur de la propriété rfsPortDSL.
     * 
     * @param value
     *     allowed object is
     *     {@link RfsPortDSL }
     *     
     */
    public void setRfsPortDSL(RfsPortDSL value) {
        this.rfsPortDSL = value;
    }

    /**
     * Obtient la valeur de la propriété rfsPortVoice.
     * 
     * @return
     *     possible object is
     *     {@link RfsPortVoice }
     *     
     */
    public RfsPortVoice getRfsPortVoice() {
        return rfsPortVoice;
    }

    /**
     * Définit la valeur de la propriété rfsPortVoice.
     * 
     * @param value
     *     allowed object is
     *     {@link RfsPortVoice }
     *     
     */
    public void setRfsPortVoice(RfsPortVoice value) {
        this.rfsPortVoice = value;
    }

}
