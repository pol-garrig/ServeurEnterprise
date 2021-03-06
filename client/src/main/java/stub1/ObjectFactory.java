
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
    private final static QName _CreerUnCookieResponse_QNAME = new QName("http://www.polytech.unice.fr/serviceManageFranchise", "creerUnCookieResponse");
    private final static QName _CreerUnCookie_QNAME = new QName("http://www.polytech.unice.fr/serviceManageFranchise", "creerUnCookie");
    private final static QName _GetListeCookiesResponse_QNAME = new QName("http://www.polytech.unice.fr/serviceManageFranchise", "getListeCookiesResponse");
    private final static QName _CreerBoutique2_QNAME = new QName("http://www.polytech.unice.fr/serviceManageFranchise", "creerBoutique2");
    private final static QName _GetListeCookies_QNAME = new QName("http://www.polytech.unice.fr/serviceManageFranchise", "getListeCookies");
    private final static QName _GetListeMagasin_QNAME = new QName("http://www.polytech.unice.fr/serviceManageFranchise", "getListeMagasin");
    private final static QName _GetListeMagasinResponse_QNAME = new QName("http://www.polytech.unice.fr/serviceManageFranchise", "getListeMagasinResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListeMagasin }
     * 
     */
    public GetListeMagasin createGetListeMagasin() {
        return new GetListeMagasin();
    }

    /**
     * Create an instance of {@link GetListeCookies }
     * 
     */
    public GetListeCookies createGetListeCookies() {
        return new GetListeCookies();
    }

    /**
     * Create an instance of {@link CreerBoutique2 }
     * 
     */
    public CreerBoutique2 createCreerBoutique2() {
        return new CreerBoutique2();
    }

    /**
     * Create an instance of {@link GetListeCookiesResponse }
     * 
     */
    public GetListeCookiesResponse createGetListeCookiesResponse() {
        return new GetListeCookiesResponse();
    }

    /**
     * Create an instance of {@link CreerUnCookie }
     * 
     */
    public CreerUnCookie createCreerUnCookie() {
        return new CreerUnCookie();
    }

    /**
     * Create an instance of {@link CreerUnCookieResponse }
     * 
     */
    public CreerUnCookieResponse createCreerUnCookieResponse() {
        return new CreerUnCookieResponse();
    }

    /**
     * Create an instance of {@link CreerBoutique2Response }
     * 
     */
    public CreerBoutique2Response createCreerBoutique2Response() {
        return new CreerBoutique2Response();
    }

    /**
     * Create an instance of {@link GetListeMagasinResponse }
     * 
     */
    public GetListeMagasinResponse createGetListeMagasinResponse() {
        return new GetListeMagasinResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerUnCookieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/serviceManageFranchise", name = "creerUnCookieResponse")
    public JAXBElement<CreerUnCookieResponse> createCreerUnCookieResponse(CreerUnCookieResponse value) {
        return new JAXBElement<CreerUnCookieResponse>(_CreerUnCookieResponse_QNAME, CreerUnCookieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerUnCookie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/serviceManageFranchise", name = "creerUnCookie")
    public JAXBElement<CreerUnCookie> createCreerUnCookie(CreerUnCookie value) {
        return new JAXBElement<CreerUnCookie>(_CreerUnCookie_QNAME, CreerUnCookie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeCookiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/serviceManageFranchise", name = "getListeCookiesResponse")
    public JAXBElement<GetListeCookiesResponse> createGetListeCookiesResponse(GetListeCookiesResponse value) {
        return new JAXBElement<GetListeCookiesResponse>(_GetListeCookiesResponse_QNAME, GetListeCookiesResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeCookies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/serviceManageFranchise", name = "getListeCookies")
    public JAXBElement<GetListeCookies> createGetListeCookies(GetListeCookies value) {
        return new JAXBElement<GetListeCookies>(_GetListeCookies_QNAME, GetListeCookies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeMagasin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/serviceManageFranchise", name = "getListeMagasin")
    public JAXBElement<GetListeMagasin> createGetListeMagasin(GetListeMagasin value) {
        return new JAXBElement<GetListeMagasin>(_GetListeMagasin_QNAME, GetListeMagasin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeMagasinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/serviceManageFranchise", name = "getListeMagasinResponse")
    public JAXBElement<GetListeMagasinResponse> createGetListeMagasinResponse(GetListeMagasinResponse value) {
        return new JAXBElement<GetListeMagasinResponse>(_GetListeMagasinResponse_QNAME, GetListeMagasinResponse.class, null, value);
    }

}
