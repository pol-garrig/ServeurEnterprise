
package stub2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stub2 package. 
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

    private final static QName _GetListeMagasinResponse_QNAME = new QName("http://www.polytech.unice.fr/servicePrendreRendezvous", "getListeMagasinResponse");
    private final static QName _GetListeRendezvous_QNAME = new QName("http://www.polytech.unice.fr/servicePrendreRendezvous", "getListeRendezvous");
    private final static QName _PrendreRendezvousResponse_QNAME = new QName("http://www.polytech.unice.fr/servicePrendreRendezvous", "prendreRendezvousResponse");
    private final static QName _GetListeRendezvousResponse_QNAME = new QName("http://www.polytech.unice.fr/servicePrendreRendezvous", "getListeRendezvousResponse");
    private final static QName _GetListeMagasin_QNAME = new QName("http://www.polytech.unice.fr/servicePrendreRendezvous", "getListeMagasin");
    private final static QName _PrendreRendezvous_QNAME = new QName("http://www.polytech.unice.fr/servicePrendreRendezvous", "prendreRendezvous");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stub2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrendreRendezvous }
     * 
     */
    public PrendreRendezvous createPrendreRendezvous() {
        return new PrendreRendezvous();
    }

    /**
     * Create an instance of {@link GetListeMagasin }
     * 
     */
    public GetListeMagasin createGetListeMagasin() {
        return new GetListeMagasin();
    }

    /**
     * Create an instance of {@link GetListeRendezvousResponse }
     * 
     */
    public GetListeRendezvousResponse createGetListeRendezvousResponse() {
        return new GetListeRendezvousResponse();
    }

    /**
     * Create an instance of {@link PrendreRendezvousResponse }
     * 
     */
    public PrendreRendezvousResponse createPrendreRendezvousResponse() {
        return new PrendreRendezvousResponse();
    }

    /**
     * Create an instance of {@link GetListeRendezvous }
     * 
     */
    public GetListeRendezvous createGetListeRendezvous() {
        return new GetListeRendezvous();
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
     * Create an instance of {@link Rendezvous }
     * 
     */
    public Rendezvous createRendezvous() {
        return new Rendezvous();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeMagasinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/servicePrendreRendezvous", name = "getListeMagasinResponse")
    public JAXBElement<GetListeMagasinResponse> createGetListeMagasinResponse(GetListeMagasinResponse value) {
        return new JAXBElement<GetListeMagasinResponse>(_GetListeMagasinResponse_QNAME, GetListeMagasinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeRendezvous }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/servicePrendreRendezvous", name = "getListeRendezvous")
    public JAXBElement<GetListeRendezvous> createGetListeRendezvous(GetListeRendezvous value) {
        return new JAXBElement<GetListeRendezvous>(_GetListeRendezvous_QNAME, GetListeRendezvous.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrendreRendezvousResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/servicePrendreRendezvous", name = "prendreRendezvousResponse")
    public JAXBElement<PrendreRendezvousResponse> createPrendreRendezvousResponse(PrendreRendezvousResponse value) {
        return new JAXBElement<PrendreRendezvousResponse>(_PrendreRendezvousResponse_QNAME, PrendreRendezvousResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeRendezvousResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/servicePrendreRendezvous", name = "getListeRendezvousResponse")
    public JAXBElement<GetListeRendezvousResponse> createGetListeRendezvousResponse(GetListeRendezvousResponse value) {
        return new JAXBElement<GetListeRendezvousResponse>(_GetListeRendezvousResponse_QNAME, GetListeRendezvousResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeMagasin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/servicePrendreRendezvous", name = "getListeMagasin")
    public JAXBElement<GetListeMagasin> createGetListeMagasin(GetListeMagasin value) {
        return new JAXBElement<GetListeMagasin>(_GetListeMagasin_QNAME, GetListeMagasin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrendreRendezvous }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/servicePrendreRendezvous", name = "prendreRendezvous")
    public JAXBElement<PrendreRendezvous> createPrendreRendezvous(PrendreRendezvous value) {
        return new JAXBElement<PrendreRendezvous>(_PrendreRendezvous_QNAME, PrendreRendezvous.class, null, value);
    }

}
