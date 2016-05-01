
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VasData complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VasData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberList" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}VasNumberList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VasData", propOrder = {
    "numberList"
})
public class VasData {

    @XmlElement(required = true)
    protected VasNumberList numberList;

    /**
     * Obtient la valeur de la propriété numberList.
     * 
     * @return
     *     possible object is
     *     {@link VasNumberList }
     *     
     */
    public VasNumberList getNumberList() {
        return numberList;
    }

    /**
     * Définit la valeur de la propriété numberList.
     * 
     * @param value
     *     allowed object is
     *     {@link VasNumberList }
     *     
     */
    public void setNumberList(VasNumberList value) {
        this.numberList = value;
    }

}
