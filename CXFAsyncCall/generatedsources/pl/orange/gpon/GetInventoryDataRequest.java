
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GetInventoryDataRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetInventoryDataRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invokerData" type="{http://inventorydata.req.dto.mp.channels.overlay.tp.atos.pl/}InvokerData"/&gt;
 *         &lt;element name="getInventoryDataCommon" type="{http://inventorydata.req.dto.mp.channels.overlay.tp.atos.pl/}GetInventoryDataCommon"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInventoryDataRequest", namespace = "http://inventorydata.req.dto.mp.channels.overlay.tp.atos.pl/", propOrder = {
    "invokerData",
    "getInventoryDataCommon"
})
public class GetInventoryDataRequest {

    @XmlElement(required = true)
    protected InvokerData invokerData;
    @XmlElement(required = true)
    protected GetInventoryDataCommon2 getInventoryDataCommon;

    /**
     * Obtient la valeur de la propriété invokerData.
     * 
     * @return
     *     possible object is
     *     {@link InvokerData }
     *     
     */
    public InvokerData getInvokerData() {
        return invokerData;
    }

    /**
     * Définit la valeur de la propriété invokerData.
     * 
     * @param value
     *     allowed object is
     *     {@link InvokerData }
     *     
     */
    public void setInvokerData(InvokerData value) {
        this.invokerData = value;
    }

    /**
     * Obtient la valeur de la propriété getInventoryDataCommon.
     * 
     * @return
     *     possible object is
     *     {@link GetInventoryDataCommon2 }
     *     
     */
    public GetInventoryDataCommon2 getGetInventoryDataCommon() {
        return getInventoryDataCommon;
    }

    /**
     * Définit la valeur de la propriété getInventoryDataCommon.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInventoryDataCommon2 }
     *     
     */
    public void setGetInventoryDataCommon(GetInventoryDataCommon2 value) {
        this.getInventoryDataCommon = value;
    }

}
