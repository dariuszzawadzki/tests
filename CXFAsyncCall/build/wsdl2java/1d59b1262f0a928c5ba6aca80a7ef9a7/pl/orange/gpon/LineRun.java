
package pl.orange.gpon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LineRun complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LineRun"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lpOdcinek" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="typOdcinek" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rodzajKblOdcinek" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nazwaKblOdcinek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paraKblOdcinek" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="czyPcm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="numberSciezki" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="krotnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kanal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineRun", propOrder = {
    "lpOdcinek",
    "typOdcinek",
    "rodzajKblOdcinek",
    "nazwaKblOdcinek",
    "paraKblOdcinek",
    "czyPcm",
    "numberSciezki",
    "krotnica",
    "kanal"
})
public class LineRun {

    protected int lpOdcinek;
    @XmlElement(required = true)
    protected String typOdcinek;
    @XmlElement(required = true)
    protected String rodzajKblOdcinek;
    protected String nazwaKblOdcinek;
    protected Integer paraKblOdcinek;
    protected Boolean czyPcm;
    protected String numberSciezki;
    protected String krotnica;
    protected String kanal;

    /**
     * Obtient la valeur de la propriété lpOdcinek.
     * 
     */
    public int getLpOdcinek() {
        return lpOdcinek;
    }

    /**
     * Définit la valeur de la propriété lpOdcinek.
     * 
     */
    public void setLpOdcinek(int value) {
        this.lpOdcinek = value;
    }

    /**
     * Obtient la valeur de la propriété typOdcinek.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypOdcinek() {
        return typOdcinek;
    }

    /**
     * Définit la valeur de la propriété typOdcinek.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypOdcinek(String value) {
        this.typOdcinek = value;
    }

    /**
     * Obtient la valeur de la propriété rodzajKblOdcinek.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodzajKblOdcinek() {
        return rodzajKblOdcinek;
    }

    /**
     * Définit la valeur de la propriété rodzajKblOdcinek.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodzajKblOdcinek(String value) {
        this.rodzajKblOdcinek = value;
    }

    /**
     * Obtient la valeur de la propriété nazwaKblOdcinek.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwaKblOdcinek() {
        return nazwaKblOdcinek;
    }

    /**
     * Définit la valeur de la propriété nazwaKblOdcinek.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwaKblOdcinek(String value) {
        this.nazwaKblOdcinek = value;
    }

    /**
     * Obtient la valeur de la propriété paraKblOdcinek.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParaKblOdcinek() {
        return paraKblOdcinek;
    }

    /**
     * Définit la valeur de la propriété paraKblOdcinek.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParaKblOdcinek(Integer value) {
        this.paraKblOdcinek = value;
    }

    /**
     * Obtient la valeur de la propriété czyPcm.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCzyPcm() {
        return czyPcm;
    }

    /**
     * Définit la valeur de la propriété czyPcm.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCzyPcm(Boolean value) {
        this.czyPcm = value;
    }

    /**
     * Obtient la valeur de la propriété numberSciezki.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberSciezki() {
        return numberSciezki;
    }

    /**
     * Définit la valeur de la propriété numberSciezki.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberSciezki(String value) {
        this.numberSciezki = value;
    }

    /**
     * Obtient la valeur de la propriété krotnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKrotnica() {
        return krotnica;
    }

    /**
     * Définit la valeur de la propriété krotnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKrotnica(String value) {
        this.krotnica = value;
    }

    /**
     * Obtient la valeur de la propriété kanal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKanal() {
        return kanal;
    }

    /**
     * Définit la valeur de la propriété kanal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKanal(String value) {
        this.kanal = value;
    }

}
