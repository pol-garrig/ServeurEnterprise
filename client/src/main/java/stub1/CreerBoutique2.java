
package stub1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerBoutique2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerBoutique2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cookie" type="{http://www.polytech.unice.fr/serviceManageFranchise}cookie" minOccurs="0"/>
 *         &lt;element name="listcookies" type="{http://www.polytech.unice.fr/serviceManageFranchise}commande" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "creerBoutique2", propOrder = {
    "name",
    "cookie",
    "listcookies",
    "tax"
})
public class CreerBoutique2 {

    protected String name;
    protected Cookie cookie;
    protected List<Commande> listcookies;
    protected Double tax;

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
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
     * Gets the value of the cookie property.
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
     * Sets the value of the cookie property.
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
     * Gets the value of the listcookies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listcookies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListcookies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commande }
     * 
     * 
     */
    public List<Commande> getListcookies() {
        if (listcookies == null) {
            listcookies = new ArrayList<Commande>();
        }
        return this.listcookies;
    }

    /**
     * Gets the value of the tax property.
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
     * Sets the value of the tax property.
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
