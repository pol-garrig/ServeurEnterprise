
package stub1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getListeCookiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getListeCookiesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listedeCookies" type="{http://www.polytech.unice.fr/serviceManageFranchise}cookie" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListeCookiesResponse", propOrder = {
    "listedeCookies"
})
public class GetListeCookiesResponse {

    protected List<Cookie> listedeCookies;

    /**
     * Gets the value of the listedeCookies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listedeCookies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListedeCookies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cookie }
     * 
     * 
     */
    public List<Cookie> getListedeCookies() {
        if (listedeCookies == null) {
            listedeCookies = new ArrayList<Cookie>();
        }
        return this.listedeCookies;
    }

}
