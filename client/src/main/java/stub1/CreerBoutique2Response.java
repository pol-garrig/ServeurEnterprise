
package stub1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creerBoutique2Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creerBoutique2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creerBoutique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerBoutique2Response", propOrder = {
    "creerBoutique"
})
public class CreerBoutique2Response {

    protected String creerBoutique;

    /**
     * Gets the value of the creerBoutique property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreerBoutique() {
        return creerBoutique;
    }

    /**
     * Sets the value of the creerBoutique property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreerBoutique(String value) {
        this.creerBoutique = value;
    }

}
