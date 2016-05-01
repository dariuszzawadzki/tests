
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
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="identifierType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="relatedServices" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="servicesDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="userOperatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalDataList" type="{http://inventorydata.req.dto.mp.channels.overlay.tp.atos.pl/}AdditionalDataList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInventoryDataCommon", namespace = "http://inventorydata.req.dto.mp.channels.overlay.tp.atos.pl/", propOrder = {
    "identifier",
    "identifierType",
    "relatedServices",
    "servicesDetails",
    "userOperatorId",
    "additionalDataList"
})
public class GetInventoryDataCommon {

    @XmlElement(required = true)
    protected String identifier;
    @XmlElement(required = true)
    protected String identifierType;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean relatedServices;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean servicesDetails;
    protected String userOperatorId;
    protected AdditionalDataList additionalDataList;

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
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelatedServices() {
        return relatedServices;
    }

    /**
     * Définit la valeur de la propriété relatedServices.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelatedServices(Boolean value) {
        this.relatedServices = value;
    }

    /**
     * Obtient la valeur de la propriété servicesDetails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServicesDetails() {
        return servicesDetails;
    }

    /**
     * Définit la valeur de la propriété servicesDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServicesDetails(Boolean value) {
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
     *     {@link AdditionalDataList }
     *     
     */
    public AdditionalDataList getAdditionalDataList() {
        return additionalDataList;
    }

    /**
     * Définit la valeur de la propriété additionalDataList.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDataList }
     *     
     */
    public void setAdditionalDataList(AdditionalDataList value) {
        this.additionalDataList = value;
    }

}