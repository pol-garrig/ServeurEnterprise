
package stub1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stub1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreerBoutique_QNAME = new QName("http://webservice.demo.se.polytech.unice.fr/", "creerBoutique");
    private final static QName _CreerBoutiqueResponse_QNAME = new QName("http://webservice.demo.se.polytech.unice.fr/", "creerBoutiqueResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreerBoutiqueResponse }
     * 
     */
    public CreerBoutiqueResponse createCreerBoutiqueResponse() {
        return new CreerBoutiqueResponse();
    }

    /**
     * Create an instance of {@link CreerBoutique }
     * 
     */
    public CreerBoutique createCreerBoutique() {
        return new CreerBoutique();
    }

    /**
     * Create an instance of {@link Cookie }
     * 
     */
    public Cookie createCookie() {
        return new Cookie();
    }

    /**
     * Create an instance of {@link Magasin }
     * 
     */
    public Magasin createMagasin() {
        return new Magasin();
    }

    /**
     * Create an instance of {@link Commande }
     * 
     */
    public Commande createCommande() {
        return new Commande();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerBoutique }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.demo.se.polytech.unice.fr/", name = "creerBoutique")
    public JAXBElement<CreerBoutique> createCreerBoutique(CreerBoutique value) {
        return new JAXBElement<CreerBoutique>(_CreerBoutique_QNAME, CreerBoutique.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerBoutiqueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.demo.se.polytech.unice.fr/", name = "creerBoutiqueResponse")
    public JAXBElement<CreerBoutiqueResponse> createCreerBoutiqueResponse(CreerBoutiqueResponse value) {
        return new JAXBElement<CreerBoutiqueResponse>(_CreerBoutiqueResponse_QNAME, CreerBoutiqueResponse.class, null, value);
    }

}
