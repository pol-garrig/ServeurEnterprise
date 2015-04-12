
package stub3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stub3 package. 
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

    private final static QName _ChoisirCookiesResponse_QNAME = new QName("http://www.polytech.unice.fr/ServicePasseUneCommande", "choisirCookiesResponse");
    private final static QName _PasserUneCommandeResponse_QNAME = new QName("http://www.polytech.unice.fr/ServicePasseUneCommande", "passerUneCommandeResponse");
    private final static QName _ChoisirCookies_QNAME = new QName("http://www.polytech.unice.fr/ServicePasseUneCommande", "choisirCookies");
    private final static QName _GetListeCommandeResponse_QNAME = new QName("http://www.polytech.unice.fr/ServicePasseUneCommande", "getListeCommandeResponse");
    private final static QName _PasserUneCommande_QNAME = new QName("http://www.polytech.unice.fr/ServicePasseUneCommande", "passerUneCommande");
    private final static QName _GetListeCommande_QNAME = new QName("http://www.polytech.unice.fr/ServicePasseUneCommande", "getListeCommande");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListeCommande }
     * 
     */
    public GetListeCommande createGetListeCommande() {
        return new GetListeCommande();
    }

    /**
     * Create an instance of {@link PasserUneCommande }
     * 
     */
    public PasserUneCommande createPasserUneCommande() {
        return new PasserUneCommande();
    }

    /**
     * Create an instance of {@link GetListeCommandeResponse }
     * 
     */
    public GetListeCommandeResponse createGetListeCommandeResponse() {
        return new GetListeCommandeResponse();
    }

    /**
     * Create an instance of {@link ChoisirCookies }
     * 
     */
    public ChoisirCookies createChoisirCookies() {
        return new ChoisirCookies();
    }

    /**
     * Create an instance of {@link PasserUneCommandeResponse }
     * 
     */
    public PasserUneCommandeResponse createPasserUneCommandeResponse() {
        return new PasserUneCommandeResponse();
    }

    /**
     * Create an instance of {@link ChoisirCookiesResponse }
     * 
     */
    public ChoisirCookiesResponse createChoisirCookiesResponse() {
        return new ChoisirCookiesResponse();
    }

    /**
     * Create an instance of {@link Commande }
     * 
     */
    public Commande createCommande() {
        return new Commande();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChoisirCookiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/ServicePasseUneCommande", name = "choisirCookiesResponse")
    public JAXBElement<ChoisirCookiesResponse> createChoisirCookiesResponse(ChoisirCookiesResponse value) {
        return new JAXBElement<ChoisirCookiesResponse>(_ChoisirCookiesResponse_QNAME, ChoisirCookiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasserUneCommandeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/ServicePasseUneCommande", name = "passerUneCommandeResponse")
    public JAXBElement<PasserUneCommandeResponse> createPasserUneCommandeResponse(PasserUneCommandeResponse value) {
        return new JAXBElement<PasserUneCommandeResponse>(_PasserUneCommandeResponse_QNAME, PasserUneCommandeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChoisirCookies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/ServicePasseUneCommande", name = "choisirCookies")
    public JAXBElement<ChoisirCookies> createChoisirCookies(ChoisirCookies value) {
        return new JAXBElement<ChoisirCookies>(_ChoisirCookies_QNAME, ChoisirCookies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeCommandeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/ServicePasseUneCommande", name = "getListeCommandeResponse")
    public JAXBElement<GetListeCommandeResponse> createGetListeCommandeResponse(GetListeCommandeResponse value) {
        return new JAXBElement<GetListeCommandeResponse>(_GetListeCommandeResponse_QNAME, GetListeCommandeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasserUneCommande }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/ServicePasseUneCommande", name = "passerUneCommande")
    public JAXBElement<PasserUneCommande> createPasserUneCommande(PasserUneCommande value) {
        return new JAXBElement<PasserUneCommande>(_PasserUneCommande_QNAME, PasserUneCommande.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeCommande }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/ServicePasseUneCommande", name = "getListeCommande")
    public JAXBElement<GetListeCommande> createGetListeCommande(GetListeCommande value) {
        return new JAXBElement<GetListeCommande>(_GetListeCommande_QNAME, GetListeCommande.class, null, value);
    }

}
