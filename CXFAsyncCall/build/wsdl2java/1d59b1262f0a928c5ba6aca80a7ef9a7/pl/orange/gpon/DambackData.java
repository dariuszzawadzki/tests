
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 E13.2 PPK 
 *                 Rekord zawierajacy informacje o kaskadzie DAMBACK 
 *                 Zrodlo: getIPDslamfullCascadeResources
 *             
 * 
 * <p>Classe Java pour DambackData complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DambackData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dambackRouter" type="{http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/}DambackRouter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DambackData", propOrder = {
    "dambackRouter"
})
public class DambackData {

    protected DambackRouter dambackRouter;

    /**
     * Obtient la valeur de la propriété dambackRouter.
     * 
     * @return
     *     possible object is
     *     {@link DambackRouter }
     *     
     */
    public DambackRouter getDambackRouter() {
        return dambackRouter;
    }

    /**
     * Définit la valeur de la propriété dambackRouter.
     * 
     * @param value
     *     allowed object is
     *     {@link DambackRouter }
     *     
     */
    public void setDambackRouter(DambackRouter value) {
        this.dambackRouter = value;
    }

}
