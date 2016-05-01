
package pl.orange.gpon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour UniPort complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="UniPort"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="master" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="uniPortNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="uniPortShelf" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="uniPortSlot" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="uniRackNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="uniSlotName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="crossAndBridgeConnect" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}CrossAndBridgeConnect" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lineRun" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}LineRun" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenceBitrate" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}referenceBitrate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniPort", propOrder = {
    "master",
    "uniPortNumber",
    "uniPortShelf",
    "uniPortSlot",
    "uniRackNumber",
    "uniSlotName",
    "crossAndBridgeConnect",
    "lineRun",
    "referenceBitrate"
})
public class UniPort {

    protected Boolean master;
    protected int uniPortNumber;
    protected int uniPortShelf;
    protected int uniPortSlot;
    protected Integer uniRackNumber;
    @XmlElement(required = true)
    protected String uniSlotName;
    protected List<CrossAndBridgeConnect> crossAndBridgeConnect;
    protected List<LineRun> lineRun;
    protected ReferenceBitrate referenceBitrate;

    /**
     * Obtient la valeur de la propriété master.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaster() {
        return master;
    }

    /**
     * Définit la valeur de la propriété master.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaster(Boolean value) {
        this.master = value;
    }

    /**
     * Obtient la valeur de la propriété uniPortNumber.
     * 
     */
    public int getUniPortNumber() {
        return uniPortNumber;
    }

    /**
     * Définit la valeur de la propriété uniPortNumber.
     * 
     */
    public void setUniPortNumber(int value) {
        this.uniPortNumber = value;
    }

    /**
     * Obtient la valeur de la propriété uniPortShelf.
     * 
     */
    public int getUniPortShelf() {
        return uniPortShelf;
    }

    /**
     * Définit la valeur de la propriété uniPortShelf.
     * 
     */
    public void setUniPortShelf(int value) {
        this.uniPortShelf = value;
    }

    /**
     * Obtient la valeur de la propriété uniPortSlot.
     * 
     */
    public int getUniPortSlot() {
        return uniPortSlot;
    }

    /**
     * Définit la valeur de la propriété uniPortSlot.
     * 
     */
    public void setUniPortSlot(int value) {
        this.uniPortSlot = value;
    }

    /**
     * Obtient la valeur de la propriété uniRackNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniRackNumber() {
        return uniRackNumber;
    }

    /**
     * Définit la valeur de la propriété uniRackNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniRackNumber(Integer value) {
        this.uniRackNumber = value;
    }

    /**
     * Obtient la valeur de la propriété uniSlotName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniSlotName() {
        return uniSlotName;
    }

    /**
     * Définit la valeur de la propriété uniSlotName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniSlotName(String value) {
        this.uniSlotName = value;
    }

    /**
     * Gets the value of the crossAndBridgeConnect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossAndBridgeConnect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossAndBridgeConnect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrossAndBridgeConnect }
     * 
     * 
     */
    public List<CrossAndBridgeConnect> getCrossAndBridgeConnect() {
        if (crossAndBridgeConnect == null) {
            crossAndBridgeConnect = new ArrayList<CrossAndBridgeConnect>();
        }
        return this.crossAndBridgeConnect;
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

    /**
     * Obtient la valeur de la propriété referenceBitrate.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceBitrate }
     *     
     */
    public ReferenceBitrate getReferenceBitrate() {
        return referenceBitrate;
    }

    /**
     * Définit la valeur de la propriété referenceBitrate.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceBitrate }
     *     
     */
    public void setReferenceBitrate(ReferenceBitrate value) {
        this.referenceBitrate = value;
    }

}
