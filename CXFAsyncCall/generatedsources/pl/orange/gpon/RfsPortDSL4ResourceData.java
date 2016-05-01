
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RfsPortDSL4ResourceData complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RfsPortDSL4ResourceData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dslamModel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RfsPortDSL4ResourceData", propOrder = {
    "dslamModel"
})
public class RfsPortDSL4ResourceData {

    @XmlElement(required = true)
    protected String dslamModel;

    /**
     * Obtient la valeur de la propriété dslamModel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDslamModel() {
        return dslamModel;
    }

    /**
     * Définit la valeur de la propriété dslamModel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDslamModel(String value) {
        this.dslamModel = value;
    }

}
