
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AlternativeServiceOptions complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AlternativeServiceOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alternativeServiceOption" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="alternativeBitrateDslUp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="alternativeBitrateDslDown" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeServiceOptions", propOrder = {
    "alternativeServiceOption",
    "alternativeBitrateDslUp",
    "alternativeBitrateDslDown"
})
public class AlternativeServiceOptions {

    @XmlElement(required = true)
    protected String alternativeServiceOption;
    @XmlElement(required = true)
    protected String alternativeBitrateDslUp;
    @XmlElement(required = true)
    protected String alternativeBitrateDslDown;

    /**
     * Obtient la valeur de la propriété alternativeServiceOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeServiceOption() {
        return alternativeServiceOption;
    }

    /**
     * Définit la valeur de la propriété alternativeServiceOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeServiceOption(String value) {
        this.alternativeServiceOption = value;
    }

    /**
     * Obtient la valeur de la propriété alternativeBitrateDslUp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeBitrateDslUp() {
        return alternativeBitrateDslUp;
    }

    /**
     * Définit la valeur de la propriété alternativeBitrateDslUp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeBitrateDslUp(String value) {
        this.alternativeBitrateDslUp = value;
    }

    /**
     * Obtient la valeur de la propriété alternativeBitrateDslDown.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeBitrateDslDown() {
        return alternativeBitrateDslDown;
    }

    /**
     * Définit la valeur de la propriété alternativeBitrateDslDown.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeBitrateDslDown(String value) {
        this.alternativeBitrateDslDown = value;
    }

}
