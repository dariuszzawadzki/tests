
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour InvokerData complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InvokerData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invokerName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="PP"/&gt;
 *               &lt;enumeration value="OPUS"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvokerData", namespace = "http://inventorydata.req.dto.mp.channels.overlay.tp.atos.pl/", propOrder = {
    "invokerName"
})
public class InvokerData {

    @XmlElement(required = true)
    protected String invokerName;

    /**
     * Obtient la valeur de la propriété invokerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvokerName() {
        return invokerName;
    }

    /**
     * Définit la valeur de la propriété invokerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvokerName(String value) {
        this.invokerName = value;
    }

}
