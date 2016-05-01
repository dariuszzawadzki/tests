
package pl.orange.gpon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ServiceOptionsData complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceOptionsData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="currentServiceOption" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="identifier"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="alternativeServiceOptions" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}AlternativeServiceOptions" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceOptionsData", propOrder = {
    "serviceType",
    "currentServiceOption",
    "identifier",
    "alternativeServiceOptions"
})
public class ServiceOptionsData {

    @XmlElement(required = true)
    protected String serviceType;
    @XmlElement(required = true)
    protected String currentServiceOption;
    @XmlElement(required = true)
    protected String identifier;
    @XmlElement(required = true)
    protected List<AlternativeServiceOptions> alternativeServiceOptions;

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
     * Obtient la valeur de la propriété currentServiceOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentServiceOption() {
        return currentServiceOption;
    }

    /**
     * Définit la valeur de la propriété currentServiceOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentServiceOption(String value) {
        this.currentServiceOption = value;
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
     * Gets the value of the alternativeServiceOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeServiceOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeServiceOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternativeServiceOptions }
     * 
     * 
     */
    public List<AlternativeServiceOptions> getAlternativeServiceOptions() {
        if (alternativeServiceOptions == null) {
            alternativeServiceOptions = new ArrayList<AlternativeServiceOptions>();
        }
        return this.alternativeServiceOptions;
    }

}
