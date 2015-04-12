
package stub3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passerUneCommande complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passerUneCommande">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prixHT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rendevous" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cookies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passerUneCommande", propOrder = {
    "prixHT",
    "rendevous",
    "cookies"
})
public class PasserUneCommande {

    protected Double prixHT;
    protected String rendevous;
    protected String cookies;

    /**
     * Gets the value of the prixHT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrixHT() {
        return prixHT;
    }

    /**
     * Sets the value of the prixHT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrixHT(Double value) {
        this.prixHT = value;
    }

    /**
     * Gets the value of the rendevous property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRendevous() {
        return rendevous;
    }

    /**
     * Sets the value of the rendevous property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRendevous(String value) {
        this.rendevous = value;
    }

    /**
     * Gets the value of the cookies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCookies() {
        return cookies;
    }

    /**
     * Sets the value of the cookies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCookies(String value) {
        this.cookies = value;
    }

}
