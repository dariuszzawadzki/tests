
package pl.orange.gpon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Port complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Port"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EQN1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EQN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EQN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lineTerminationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lineRun" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}LineRun" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Port", propOrder = {
    "eqn1",
    "eqn2",
    "eqn3",
    "lineTerminationType",
    "lineRun"
})
public class Port {

    @XmlElement(name = "EQN1", required = true)
    protected String eqn1;
    @XmlElement(name = "EQN2")
    protected String eqn2;
    @XmlElement(name = "EQN3")
    protected String eqn3;
    protected String lineTerminationType;
    protected List<LineRun> lineRun;

    /**
     * Obtient la valeur de la propriété eqn1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEQN1() {
        return eqn1;
    }

    /**
     * Définit la valeur de la propriété eqn1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEQN1(String value) {
        this.eqn1 = value;
    }

    /**
     * Obtient la valeur de la propriété eqn2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEQN2() {
        return eqn2;
    }

    /**
     * Définit la valeur de la propriété eqn2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEQN2(String value) {
        this.eqn2 = value;
    }

    /**
     * Obtient la valeur de la propriété eqn3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEQN3() {
        return eqn3;
    }

    /**
     * Définit la valeur de la propriété eqn3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEQN3(String value) {
        this.eqn3 = value;
    }

    /**
     * Obtient la valeur de la propriété lineTerminationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineTerminationType() {
        return lineTerminationType;
    }

    /**
     * Définit la valeur de la propriété lineTerminationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineTerminationType(String value) {
        this.lineTerminationType = value;
    }

    /**
     * Gets the value of the lineRun property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineRun property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineRun().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineRun }
     * 
     * 
     */
    public List<LineRun> getLineRun() {
        if (lineRun == null) {
            lineRun = new ArrayList<LineRun>();
        }
        return this.lineRun;
    }

}
