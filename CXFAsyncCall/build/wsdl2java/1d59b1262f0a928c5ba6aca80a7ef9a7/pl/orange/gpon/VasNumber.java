
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VasNumber complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VasNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributes" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}VasNumberListAttributes"/&gt;
 *         &lt;element name="vasList" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}VasList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VasNumber", propOrder = {
    "attributes",
    "vasList"
})
public class VasNumber {

    @XmlElement(required = true)
    protected VasNumberListAttributes attributes;
    protected VasList vasList;

    /**
     * Obtient la valeur de la propriété attributes.
     * 
     * @return
     *     possible object is
     *     {@link VasNumberListAttributes }
     *     
     */
    public VasNumberListAttributes getAttributes() {
        return attributes;
    }

    /**
     * Définit la valeur de la propriété attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link VasNumberListAttributes }
     *     
     */
    public void setAttributes(VasNumberListAttributes value) {
        this.attributes = value;
    }

    /**
     * Obtient la valeur de la propriété vasList.
     * 
     * @return
     *     possible object is
     *     {@link VasList }
     *     
     */
    public VasList getVasList() {
        return vasList;
    }

    /**
     * Définit la valeur de la propriété vasList.
     * 
     * @param value
     *     allowed object is
     *     {@link VasList }
     *     
     */
    public void setVasList(VasList value) {
        this.vasList = value;
    }

}
