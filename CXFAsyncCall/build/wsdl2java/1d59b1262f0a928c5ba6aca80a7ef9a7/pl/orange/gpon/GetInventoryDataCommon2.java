
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GetInventoryDataCommon complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetInventoryDataCommon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="identifierType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="relatedServices" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="servicesDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="userOperatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalDataList" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}AdditionalDataList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInventoryDataCommon", propOrder = {
    "identifier",
    "identifierType",
    "relatedServices",
    "servicesDetails",
    "userOperatorId",
    "additionalDataList"
})
public class GetInventoryDataCommon2 {

    @XmlElement(required = true)
    protected String identifier;
    @XmlElement(required = true)
    protected String identifierType;
    protected boolean relatedServices;
    protected boolean servicesDetails;
    protected String userOperatorId;
    protected AdditionalDataList2 additionalDataList;

    /**
     * Obtient la valeur de la propriété identifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Définit la valeur de la propriété identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Obtient la valeur de la propriété identifierType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierType() {
        return identifierType;
    }

    /**
     * Définit la valeur de la propriété identifierType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierType(String value) {
        this.identifierType = value;
    }

    /**
     * Obtient la valeur de la propriété relatedServices.
     * 
     */
    public boolean isRelatedServices() {
        return relatedServices;
    }

    /**
     * Définit la valeur de la propriété relatedServices.
     * 
     */
    public void setRelatedServices(boolean value) {
        this.relatedServices = value;
    }

    /**
     * Obtient la valeur de la propriété servicesDetails.
     * 
     */
    public boolean isServicesDetails() {
        return servicesDetails;
    }

    /**
     * Définit la valeur de la propriété servicesDetails.
     * 
     */
    public void setServicesDetails(boolean value) {
        this.servicesDetails = value;
    }

    /**
     * Obtient la valeur de la propriété userOperatorId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserOperatorId() {
        return userOperatorId;
    }

    /**
     * Définit la valeur de la propriété userOperatorId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserOperatorId(String value) {
        this.userOperatorId = value;
    }

    /**
     * Obtient la valeur de la propriété additionalDataList.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDataList2 }
     *     
     */
    public AdditionalDataList2 getAdditionalDataList() {
        return additionalDataList;
    }

    /**
     * Définit la valeur de la propriété additionalDataList.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDataList2 }
     *     
     */
    public void setAdditionalDataList(AdditionalDataList2 value) {
        this.additionalDataList = value;
    }

}
