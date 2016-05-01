
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RfsService complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RfsService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rfsPatternSymbol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rfsPatternName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rfsStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rfsID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RfsService", propOrder = {
    "rfsPatternSymbol",
    "rfsPatternName",
    "rfsStatus",
    "rfsID"
})
public class RfsService {

    @XmlElement(required = true)
    protected String rfsPatternSymbol;
    @XmlElement(required = true)
    protected String rfsPatternName;
    @XmlElement(required = true)
    protected String rfsStatus;
    protected String rfsID;

    /**
     * Obtient la valeur de la propriété rfsPatternSymbol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfsPatternSymbol() {
        return rfsPatternSymbol;
    }

    /**
     * Définit la valeur de la propriété rfsPatternSymbol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfsPatternSymbol(String value) {
        this.rfsPatternSymbol = value;
    }

    /**
     * Obtient la valeur de la propriété rfsPatternName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfsPatternName() {
        return rfsPatternName;
    }

    /**
     * Définit la valeur de la propriété rfsPatternName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfsPatternName(String value) {
        this.rfsPatternName = value;
    }

    /**
     * Obtient la valeur de la propriété rfsStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfsStatus() {
        return rfsStatus;
    }

    /**
     * Définit la valeur de la propriété rfsStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfsStatus(String value) {
        this.rfsStatus = value;
    }

    /**
     * Obtient la valeur de la propriété rfsID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfsID() {
        return rfsID;
    }

    /**
     * Définit la valeur de la propriété rfsID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfsID(String value) {
        this.rfsID = value;
    }

}
