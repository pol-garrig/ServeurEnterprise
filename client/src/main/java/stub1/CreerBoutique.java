
package stub1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour creerBoutique complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="creerBoutique">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cookie" type="{http://webservice.demo.se.polytech.unice.fr/}cookie" minOccurs="0"/>
 *         &lt;element name="listeCommande" type="{http://webservice.demo.se.polytech.unice.fr/}commande" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerBoutique", propOrder = {
    "name",
    "cookie",
    "listeCommande",
    "tax"
})
public class CreerBoutique {

    protected String name;
    protected Cookie cookie;
    protected List<Commande> listeCommande;
    protected Double tax;

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété cookie.
     * 
     * @return
     *     possible object is
     *     {@link Cookie }
     *     
     */
    public Cookie getCookie() {
        return cookie;
    }

    /**
     * Définit la valeur de la propriété cookie.
     * 
     * @param value
     *     allowed object is
     *     {@link Cookie }
     *     
     */
    public void setCookie(Cookie value) {
        this.cookie = value;
    }

    /**
     * Gets the value of the listeCommande property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeCommande property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeCommande().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commande }
     * 
     * 
     */
    public List<Commande> getListeCommande() {
        if (listeCommande == null) {
            listeCommande = new ArrayList<Commande>();
        }
        return this.listeCommande;
    }

    /**
     * Obtient la valeur de la propriété tax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTax() {
        return tax;
    }

    /**
     * Définit la valeur de la propriété tax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTax(Double value) {
        this.tax = value;
    }

}
