
package stub1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commande complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commande">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cookies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="prixHT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rendezvous" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commande", propOrder = {
    "cookies",
    "id",
    "prixHT",
    "rendezvous"
})
public class Commande {

    protected String cookies;
    protected Long id;
    protected Double prixHT;
    protected String rendezvous;

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

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

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
     * Gets the value of the rendezvous property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRendezvous() {
        return rendezvous;
    }

    /**
     * Sets the value of the rendezvous property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRendezvous(String value) {
        this.rendezvous = value;
    }

}
