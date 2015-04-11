
package stub3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getListeCommandeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getListeCommandeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regarderListeCommande" type="{http://www.polytech.unice.fr/ServicePasseUneCommande}commande" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListeCommandeResponse", propOrder = {
    "regarderListeCommande"
})
public class GetListeCommandeResponse {

    protected List<Commande> regarderListeCommande;

    /**
     * Gets the value of the regarderListeCommande property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regarderListeCommande property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegarderListeCommande().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commande }
     * 
     * 
     */
    public List<Commande> getRegarderListeCommande() {
        if (regarderListeCommande == null) {
            regarderListeCommande = new ArrayList<Commande>();
        }
        return this.regarderListeCommande;
    }

}
