
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 E13.2 PPK 
 *                 Zrodlo: getIPDslamfullCascadeResources
 *             
 * 
 * <p>Classe Java pour DambackRouter complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DambackRouter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dambackName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="portName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DambackRouter", propOrder = {
    "dambackName",
    "portName"
})
public class DambackRouter {

    protected String dambackName;
    protected String portName;

    /**
     * Obtient la valeur de la propriété dambackName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDambackName() {
        return dambackName;
    }

    /**
     * Définit la valeur de la propriété dambackName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDambackName(String value) {
        this.dambackName = value;
    }

    /**
     * Obtient la valeur de la propriété portName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortName() {
        return portName;
    }

    /**
     * Définit la valeur de la propriété portName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortName(String value) {
        this.portName = value;
    }

}
