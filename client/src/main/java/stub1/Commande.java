
package stub1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="cookies" type="{http://www.polytech.unice.fr/serviceManageFranchise}cookie" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lieuRetrait" type="{http://www.polytech.unice.fr/serviceManageFranchise}magasin" minOccurs="0"/>
 *         &lt;element name="prixHT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "date",
    "id",
    "lieuRetrait",
    "prixHT"
})
public class Commande {

    @XmlElement(nillable = true)
    protected List<Cookie> cookies;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected Long id;
    protected Magasin lieuRetrait;
    protected Double prixHT;

    /**
     * Gets the value of the cookies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cookies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCookies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cookie }
     * 
     * 
     */
    public List<Cookie> getCookies() {
        if (cookies == null) {
            cookies = new ArrayList<Cookie>();
        }
        return this.cookies;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
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
     * Gets the value of the lieuRetrait property.
     * 
     * @return
     *     possible object is
     *     {@link Magasin }
     *     
     */
    public Magasin getLieuRetrait() {
        return lieuRetrait;
    }

    /**
     * Sets the value of the lieuRetrait property.
     * 
     * @param value
     *     allowed object is
     *     {@link Magasin }
     *     
     */
    public void setLieuRetrait(Magasin value) {
        this.lieuRetrait = value;
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

}
