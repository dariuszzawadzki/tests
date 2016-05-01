
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CfsService4ResourceData complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CfsService4ResourceData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cfsPatternSymbol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cfsStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rfsPortDSL" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}RfsPortDSL4ResourceData" minOccurs="0"/&gt;
 *         &lt;element name="rfsPortVoice" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}RfsPortVoice4ResourceData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CfsService4ResourceData", propOrder = {
    "identifier",
    "cfsPatternSymbol",
    "cfsStatus",
    "rfsPortDSL",
    "rfsPortVoice"
})
public class CfsService4ResourceData {

    @XmlElement(required = true)
    protected String identifier;
    @XmlElement(required = true)
    protected String cfsPatternSymbol;
    @XmlElement(required = true)
    protected String cfsStatus;
    protected RfsPortDSL4ResourceData rfsPortDSL;
    protected RfsPortVoice4ResourceData rfsPortVoice;

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
     * Obtient la valeur de la propriété rfsPortDSL.
     * 
     * @return
     *     possible object is
     *     {@link RfsPortDSL4ResourceData }
     *     
     */
    public RfsPortDSL4ResourceData getRfsPortDSL() {
        return rfsPortDSL;
    }

    /**
     * Définit la valeur de la propriété rfsPortDSL.
     * 
     * @param value
     *     allowed object is
     *     {@link RfsPortDSL4ResourceData }
     *     
     */
    public void setRfsPortDSL(RfsPortDSL4ResourceData value) {
        this.rfsPortDSL = value;
    }

    /**
     * Obtient la valeur de la propriété rfsPortVoice.
     * 
     * @return
     *     possible object is
     *     {@link RfsPortVoice4ResourceData }
     *     
     */
    public RfsPortVoice4ResourceData getRfsPortVoice() {
        return rfsPortVoice;
    }

    /**
     * Définit la valeur de la propriété rfsPortVoice.
     * 
     * @param value
     *     allowed object is
     *     {@link RfsPortVoice4ResourceData }
     *     
     */
    public void setRfsPortVoice(RfsPortVoice4ResourceData value) {
        this.rfsPortVoice = value;
    }

}
