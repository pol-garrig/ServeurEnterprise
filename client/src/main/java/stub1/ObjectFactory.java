
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

    private final static QName _CreerBoutique2Response_QNAME = new QName("http://www.polytech.unice.fr/serviceManageFranchise", "creerBoutique2Response");
    private final static QName _Coucou_QNAME = new QName("http://www.polytech.unice.fr/serviceManageFranchise", "coucou");
    private final static QName _CreerBoutique2_QNAME = new QName("http://www.polytech.unice.fr/serviceManageFranchise", "creerBoutique2");
    private final static QName _CoucouResponse_QNAME = new QName("http://www.polytech.unice.fr/serviceManageFranchise", "coucouResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreerBoutique2 }
     * 
     */
    public CreerBoutique2 createCreerBoutique2() {
        return new CreerBoutique2();
    }

    /**
     * Create an instance of {@link Coucou }
     * 
     */
    public Coucou createCoucou() {
        return new Coucou();
    }

    /**
     * Create an instance of {@link CreerBoutique2Response }
     * 
     */
    public CreerBoutique2Response createCreerBoutique2Response() {
        return new CreerBoutique2Response();
    }

    /**
     * Create an instance of {@link CoucouResponse }
     * 
     */
    public CoucouResponse createCoucouResponse() {
        return new CoucouResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerBoutique2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/serviceManageFranchise", name = "creerBoutique2Response")
    public JAXBElement<CreerBoutique2Response> createCreerBoutique2Response(CreerBoutique2Response value) {
        return new JAXBElement<CreerBoutique2Response>(_CreerBoutique2Response_QNAME, CreerBoutique2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coucou }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/serviceManageFranchise", name = "coucou")
    public JAXBElement<Coucou> createCoucou(Coucou value) {
        return new JAXBElement<Coucou>(_Coucou_QNAME, Coucou.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerBoutique2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/serviceManageFranchise", name = "creerBoutique2")
    public JAXBElement<CreerBoutique2> createCreerBoutique2(CreerBoutique2 value) {
        return new JAXBElement<CreerBoutique2>(_CreerBoutique2_QNAME, CreerBoutique2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoucouResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/serviceManageFranchise", name = "coucouResponse")
    public JAXBElement<CoucouResponse> createCoucouResponse(CoucouResponse value) {
        return new JAXBElement<CoucouResponse>(_CoucouResponse_QNAME, CoucouResponse.class, null, value);
    }

}
