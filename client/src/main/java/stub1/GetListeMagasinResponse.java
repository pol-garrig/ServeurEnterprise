
package stub1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getListeMagasinResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getListeMagasinResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regarderListeMagasin" type="{http://www.polytech.unice.fr/serviceManageFranchise}magasin" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListeMagasinResponse", propOrder = {
    "regarderListeMagasin"
})
public class GetListeMagasinResponse {

    protected List<Magasin> regarderListeMagasin;

    /**
     * Gets the value of the regarderListeMagasin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regarderListeMagasin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegarderListeMagasin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Magasin }
     * 
     * 
     */
    public List<Magasin> getRegarderListeMagasin() {
        if (regarderListeMagasin == null) {
            regarderListeMagasin = new ArrayList<Magasin>();
        }
        return this.regarderListeMagasin;
    }

}
