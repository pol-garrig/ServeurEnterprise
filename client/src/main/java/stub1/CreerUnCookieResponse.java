
package stub1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerUnCookieResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerUnCookieResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creerCookie" type="{http://www.polytech.unice.fr/serviceManageFranchise}cookie" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerUnCookieResponse", propOrder = {
    "creerCookie"
})
public class CreerUnCookieResponse {

    protected Cookie creerCookie;

    /**
     * Gets the value of the creerCookie property.
     * 
     * @return
     *     possible object is
     *     {@link Cookie }
     *     
     */
    public Cookie getCreerCookie() {
        return creerCookie;
    }

    /**
     * Sets the value of the creerCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cookie }
     *     
     */
    public void setCreerCookie(Cookie value) {
        this.creerCookie = value;
    }

}
