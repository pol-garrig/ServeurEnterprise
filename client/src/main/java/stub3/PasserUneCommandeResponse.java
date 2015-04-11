
package stub3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passerUneCommandeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passerUneCommandeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passerUneCommande" type="{http://www.polytech.unice.fr/ServicePasseUneCommande}commande" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passerUneCommandeResponse", propOrder = {
    "passerUneCommande"
})
public class PasserUneCommandeResponse {

    protected Commande passerUneCommande;

    /**
     * Gets the value of the passerUneCommande property.
     * 
     * @return
     *     possible object is
     *     {@link Commande }
     *     
     */
    public Commande getPasserUneCommande() {
        return passerUneCommande;
    }

    /**
     * Sets the value of the passerUneCommande property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commande }
     *     
     */
    public void setPasserUneCommande(Commande value) {
        this.passerUneCommande = value;
    }

}
