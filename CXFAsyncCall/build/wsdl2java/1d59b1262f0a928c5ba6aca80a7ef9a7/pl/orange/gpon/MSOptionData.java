
package pl.orange.gpon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 E13.2 PPK 
 *                 Zrodlo: getDataUpPow
 *             
 * 
 * <p>Classe Java pour MSOptionData complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MSOptionData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dslUp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dslDown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ethLMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ethLMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalServicesData" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}AdditionalService" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSOptionData", propOrder = {
    "dslUp",
    "dslDown",
    "ethLMin",
    "ethLMax",
    "additionalServicesData"
})
public class MSOptionData {

    protected String dslUp;
    protected String dslDown;
    protected String ethLMin;
    protected String ethLMax;
    protected List<AdditionalService> additionalServicesData;

    /**
     * Obtient la valeur de la propriété dslUp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDslUp() {
        return dslUp;
    }

    /**
     * Définit la valeur de la propriété dslUp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDslUp(String value) {
        this.dslUp = value;
    }

    /**
     * Obtient la valeur de la propriété dslDown.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDslDown() {
        return dslDown;
    }

    /**
     * Définit la valeur de la propriété dslDown.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDslDown(String value) {
        this.dslDown = value;
    }

    /**
     * Obtient la valeur de la propriété ethLMin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthLMin() {
        return ethLMin;
    }

    /**
     * Définit la valeur de la propriété ethLMin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthLMin(String value) {
        this.ethLMin = value;
    }

    /**
     * Obtient la valeur de la propriété ethLMax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthLMax() {
        return ethLMax;
    }

    /**
     * Définit la valeur de la propriété ethLMax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthLMax(String value) {
        this.ethLMax = value;
    }

    /**
     * Gets the value of the additionalServicesData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalServicesData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalServicesData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalService }
     * 
     * 
     */
    public List<AdditionalService> getAdditionalServicesData() {
        if (additionalServicesData == null) {
            additionalServicesData = new ArrayList<AdditionalService>();
        }
        return this.additionalServicesData;
    }

}
