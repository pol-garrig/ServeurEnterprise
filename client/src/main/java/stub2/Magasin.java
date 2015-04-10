
package stub2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for magasin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="magasin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="listCommande" type="{http://www.polytech.unice.fr/servicePrendreRendezvous}commande" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="todaySpecial" type="{http://www.polytech.unice.fr/servicePrendreRendezvous}cookie" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "magasin", propOrder = {
    "id",
    "listCommande",
    "name",
    "tax",
    "todaySpecial"
})
public class Magasin {

    protected Long id;
    @XmlElement(nillable = true)
    protected List<Commande> listCommande;
    protected String name;
    protected Double tax;
    protected Cookie todaySpecial;

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
     * Gets the value of the listCommande property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listCommande property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListCommande().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commande }
     * 
     * 
     */
    public List<Commande> getListCommande() {
        if (listCommande == null) {
            listCommande = new ArrayList<Commande>();
        }
        return this.listCommande;
    }

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

    /**
     * Gets the value of the todaySpecial property.
     * 
     * @return
     *     possible object is
     *     {@link Cookie }
     *     
     */
    public Cookie getTodaySpecial() {
        return todaySpecial;
    }

    /**
     * Sets the value of the todaySpecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cookie }
     *     
     */
    public void setTodaySpecial(Cookie value) {
        this.todaySpecial = value;
    }

}
