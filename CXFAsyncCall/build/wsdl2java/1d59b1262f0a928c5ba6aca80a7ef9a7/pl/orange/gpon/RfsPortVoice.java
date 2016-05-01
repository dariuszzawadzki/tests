
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RfsPortVoice complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RfsPortVoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="linePassport" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}LinePassport"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RfsPortVoice", propOrder = {
    "linePassport"
})
public class RfsPortVoice {

    @XmlElement(required = true)
    protected LinePassport linePassport;

    /**
     * Obtient la valeur de la propriété linePassport.
     * 
     * @return
     *     possible object is
     *     {@link LinePassport }
     *     
     */
    public LinePassport getLinePassport() {
        return linePassport;
    }

    /**
     * Définit la valeur de la propriété linePassport.
     * 
     * @param value
     *     allowed object is
     *     {@link LinePassport }
     *     
     */
    public void setLinePassport(LinePassport value) {
        this.linePassport = value;
    }

}
