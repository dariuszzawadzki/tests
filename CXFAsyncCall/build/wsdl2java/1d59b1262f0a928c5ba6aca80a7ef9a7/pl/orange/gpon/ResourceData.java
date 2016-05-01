
package pl.orange.gpon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ResourceData complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ResourceData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cfsService" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}CfsService4ResourceData" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceData", propOrder = {
    "cfsService"
})
public class ResourceData {

    @XmlElement(required = true)
    protected List<CfsService4ResourceData> cfsService;

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
     * {@link CfsService4ResourceData }
     * 
     * 
     */
    public List<CfsService4ResourceData> getCfsService() {
        if (cfsService == null) {
            cfsService = new ArrayList<CfsService4ResourceData>();
        }
        return this.cfsService;
    }

}
