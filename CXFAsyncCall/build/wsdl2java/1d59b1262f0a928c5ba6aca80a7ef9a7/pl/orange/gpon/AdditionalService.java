
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 E13.2 PPK 
 *                 Zrodlo: getDataUpPow
 *             
 * 
 * <p>Classe Java pour AdditionalService complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AdditionalService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalServiceTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalServiceOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalServiceEthL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalService", propOrder = {
    "additionalServiceTypeName",
    "additionalServiceOption",
    "additionalServiceEthL"
})
public class AdditionalService {

    protected String additionalServiceTypeName;
    protected String additionalServiceOption;
    protected String additionalServiceEthL;

    /**
     * Obtient la valeur de la propriété additionalServiceTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalServiceTypeName() {
        return additionalServiceTypeName;
    }

    /**
     * Définit la valeur de la propriété additionalServiceTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalServiceTypeName(String value) {
        this.additionalServiceTypeName = value;
    }

    /**
     * Obtient la valeur de la propriété additionalServiceOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalServiceOption() {
        return additionalServiceOption;
    }

    /**
     * Définit la valeur de la propriété additionalServiceOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalServiceOption(String value) {
        this.additionalServiceOption = value;
    }

    /**
     * Obtient la valeur de la propriété additionalServiceEthL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalServiceEthL() {
        return additionalServiceEthL;
    }

    /**
     * Définit la valeur de la propriété additionalServiceEthL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalServiceEthL(String value) {
        this.additionalServiceEthL = value;
    }

}
