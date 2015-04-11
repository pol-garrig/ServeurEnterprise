
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
 *         &lt;element name="creerUnCookie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "creerUnCookie"
})
public class CreerUnCookieResponse {

    protected String creerUnCookie;

    /**
     * Gets the value of the creerUnCookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreerUnCookie() {
        return creerUnCookie;
    }

    /**
     * Sets the value of the creerUnCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreerUnCookie(String value) {
        this.creerUnCookie = value;
    }

}
