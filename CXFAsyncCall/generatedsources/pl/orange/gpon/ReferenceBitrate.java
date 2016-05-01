
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour referenceBitrate complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="referenceBitrate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceBitrateDown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stabilizationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenceBitrate", propOrder = {
    "referenceBitrateDown",
    "stabilizationDate"
})
public class ReferenceBitrate {

    protected String referenceBitrateDown;
    protected String stabilizationDate;

    /**
     * Obtient la valeur de la propriété referenceBitrateDown.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceBitrateDown() {
        return referenceBitrateDown;
    }

    /**
     * Définit la valeur de la propriété referenceBitrateDown.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceBitrateDown(String value) {
        this.referenceBitrateDown = value;
    }

    /**
     * Obtient la valeur de la propriété stabilizationDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStabilizationDate() {
        return stabilizationDate;
    }

    /**
     * Définit la valeur de la propriété stabilizationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStabilizationDate(String value) {
        this.stabilizationDate = value;
    }

}
