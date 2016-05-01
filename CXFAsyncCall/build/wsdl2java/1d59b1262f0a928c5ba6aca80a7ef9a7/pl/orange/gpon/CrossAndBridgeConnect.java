
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CrossAndBridgeConnect complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CrossAndBridgeConnect"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uniVpi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="uniVci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nniVpi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nniVci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nniBgNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nniVlanNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossAndBridgeConnect", propOrder = {
    "uniVpi",
    "uniVci",
    "nniVpi",
    "nniVci",
    "nniBgNumber",
    "nniVlanNumber"
})
public class CrossAndBridgeConnect {

    protected Integer uniVpi;
    protected Integer uniVci;
    protected Integer nniVpi;
    protected Integer nniVci;
    protected Integer nniBgNumber;
    protected Integer nniVlanNumber;

    /**
     * Obtient la valeur de la propriété uniVpi.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniVpi() {
        return uniVpi;
    }

    /**
     * Définit la valeur de la propriété uniVpi.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniVpi(Integer value) {
        this.uniVpi = value;
    }

    /**
     * Obtient la valeur de la propriété uniVci.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniVci() {
        return uniVci;
    }

    /**
     * Définit la valeur de la propriété uniVci.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniVci(Integer value) {
        this.uniVci = value;
    }

    /**
     * Obtient la valeur de la propriété nniVpi.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNniVpi() {
        return nniVpi;
    }

    /**
     * Définit la valeur de la propriété nniVpi.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNniVpi(Integer value) {
        this.nniVpi = value;
    }

    /**
     * Obtient la valeur de la propriété nniVci.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNniVci() {
        return nniVci;
    }

    /**
     * Définit la valeur de la propriété nniVci.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNniVci(Integer value) {
        this.nniVci = value;
    }

    /**
     * Obtient la valeur de la propriété nniBgNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNniBgNumber() {
        return nniBgNumber;
    }

    /**
     * Définit la valeur de la propriété nniBgNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNniBgNumber(Integer value) {
        this.nniBgNumber = value;
    }

    /**
     * Obtient la valeur de la propriété nniVlanNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNniVlanNumber() {
        return nniVlanNumber;
    }

    /**
     * Définit la valeur de la propriété nniVlanNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNniVlanNumber(Integer value) {
        this.nniVlanNumber = value;
    }

}
