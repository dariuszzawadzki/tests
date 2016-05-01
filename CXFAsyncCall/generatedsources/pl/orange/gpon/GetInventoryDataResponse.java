
package pl.orange.gpon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GetInventoryDataResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetInventoryDataResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="error" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}Error"/&gt;
 *         &lt;element name="getInventoryDataCommon" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}GetInventoryDataCommon"/&gt;
 *         &lt;element name="cfsService" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}CfsService" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dambackData" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}DambackData" minOccurs="0"/&gt;
 *         &lt;element name="msOptionData" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}MSOptionData" minOccurs="0"/&gt;
 *         &lt;element name="serviceOptionsData" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}ServiceOptionsData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vasData" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}VasData" minOccurs="0"/&gt;
 *         &lt;element name="resourceData" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}ResourceData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInventoryDataResponse", propOrder = {
    "error",
    "getInventoryDataCommon",
    "cfsService",
    "dambackData",
    "msOptionData",
    "serviceOptionsData",
    "vasData",
    "resourceData"
})
public class GetInventoryDataResponse {

    @XmlElement(required = true)
    protected Error error;
    @XmlElement(required = true)
    protected GetInventoryDataCommon getInventoryDataCommon;
    protected List<CfsService> cfsService;
    protected DambackData dambackData;
    protected MSOptionData msOptionData;
    protected List<ServiceOptionsData> serviceOptionsData;
    protected VasData vasData;
    protected ResourceData resourceData;

    /**
     * Obtient la valeur de la propriété error.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Définit la valeur de la propriété error.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

    /**
     * Obtient la valeur de la propriété getInventoryDataCommon.
     * 
     * @return
     *     possible object is
     *     {@link GetInventoryDataCommon }
     *     
     */
    public GetInventoryDataCommon getGetInventoryDataCommon() {
        return getInventoryDataCommon;
    }

    /**
     * Définit la valeur de la propriété getInventoryDataCommon.
     * 
     * @param value
     *     allowed object is
     *     {@link GetInventoryDataCommon }
     *     
     */
    public void setGetInventoryDataCommon(GetInventoryDataCommon value) {
        this.getInventoryDataCommon = value;
    }

    /**
     * Gets the value of the cfsService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfsService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCfsService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfsService }
     * 
     * 
     */
    public List<CfsService> getCfsService() {
        if (cfsService == null) {
            cfsService = new ArrayList<CfsService>();
        }
        return this.cfsService;
    }

    /**
     * Obtient la valeur de la propriété dambackData.
     * 
     * @return
     *     possible object is
     *     {@link DambackData }
     *     
     */
    public DambackData getDambackData() {
        return dambackData;
    }

    /**
     * Définit la valeur de la propriété dambackData.
     * 
     * @param value
     *     allowed object is
     *     {@link DambackData }
     *     
     */
    public void setDambackData(DambackData value) {
        this.dambackData = value;
    }

    /**
     * Obtient la valeur de la propriété msOptionData.
     * 
     * @return
     *     possible object is
     *     {@link MSOptionData }
     *     
     */
    public MSOptionData getMsOptionData() {
        return msOptionData;
    }

    /**
     * Définit la valeur de la propriété msOptionData.
     * 
     * @param value
     *     allowed object is
     *     {@link MSOptionData }
     *     
     */
    public void setMsOptionData(MSOptionData value) {
        this.msOptionData = value;
    }

    /**
     * Gets the value of the serviceOptionsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceOptionsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceOptionsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceOptionsData }
     * 
     * 
     */
    public List<ServiceOptionsData> getServiceOptionsData() {
        if (serviceOptionsData == null) {
            serviceOptionsData = new ArrayList<ServiceOptionsData>();
        }
        return this.serviceOptionsData;
    }

    /**
     * Obtient la valeur de la propriété vasData.
     * 
     * @return
     *     possible object is
     *     {@link VasData }
     *     
     */
    public VasData getVasData() {
        return vasData;
    }

    /**
     * Définit la valeur de la propriété vasData.
     * 
     * @param value
     *     allowed object is
     *     {@link VasData }
     *     
     */
    public void setVasData(VasData value) {
        this.vasData = value;
    }

    /**
     * Obtient la valeur de la propriété resourceData.
     * 
     * @return
     *     possible object is
     *     {@link ResourceData }
     *     
     */
    public ResourceData getResourceData() {
        return resourceData;
    }

    /**
     * Définit la valeur de la propriété resourceData.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceData }
     *     
     */
    public void setResourceData(ResourceData value) {
        this.resourceData = value;
    }

}
