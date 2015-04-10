
package stub2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getListeRendezvousResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getListeRendezvousResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regarderListeRendezvous" type="{http://www.polytech.unice.fr/servicePrendreRendezvous}rendezvous" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListeRendezvousResponse", propOrder = {
    "regarderListeRendezvous"
})
public class GetListeRendezvousResponse {

    protected List<Rendezvous> regarderListeRendezvous;

    /**
     * Gets the value of the regarderListeRendezvous property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regarderListeRendezvous property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegarderListeRendezvous().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rendezvous }
     * 
     * 
     */
    public List<Rendezvous> getRegarderListeRendezvous() {
        if (regarderListeRendezvous == null) {
            regarderListeRendezvous = new ArrayList<Rendezvous>();
        }
        return this.regarderListeRendezvous;
    }

}
