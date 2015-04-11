
package stub3;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicePasseUneCommandeBeanService", targetNamespace = "http://www.polytech.unice.fr/ServicePasseUneCommande", wsdlLocation = "http://localhost:8080//webservices/ServicePasseUneCommande?wsdl")
public class ServicePasseUneCommandeBeanService
    extends Service
{

    private final static URL SERVICEPASSEUNECOMMANDEBEANSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICEPASSEUNECOMMANDEBEANSERVICE_EXCEPTION;
    private final static QName SERVICEPASSEUNECOMMANDEBEANSERVICE_QNAME = new QName("http://www.polytech.unice.fr/ServicePasseUneCommande", "ServicePasseUneCommandeBeanService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080//webservices/ServicePasseUneCommande?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEPASSEUNECOMMANDEBEANSERVICE_WSDL_LOCATION = url;
        SERVICEPASSEUNECOMMANDEBEANSERVICE_EXCEPTION = e;
    }

    public ServicePasseUneCommandeBeanService() {
        super(__getWsdlLocation(), SERVICEPASSEUNECOMMANDEBEANSERVICE_QNAME);
    }

    public ServicePasseUneCommandeBeanService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEPASSEUNECOMMANDEBEANSERVICE_QNAME, features);
    }

    public ServicePasseUneCommandeBeanService(URL wsdlLocation) {
        super(wsdlLocation, SERVICEPASSEUNECOMMANDEBEANSERVICE_QNAME);
    }

    public ServicePasseUneCommandeBeanService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEPASSEUNECOMMANDEBEANSERVICE_QNAME, features);
    }

    public ServicePasseUneCommandeBeanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicePasseUneCommandeBeanService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicePasseUneCommande
     */
    @WebEndpoint(name = "ServicePasseUneCommandeBeanPort")
    public ServicePasseUneCommande getServicePasseUneCommandeBeanPort() {
        return super.getPort(new QName("http://www.polytech.unice.fr/ServicePasseUneCommande", "ServicePasseUneCommandeBeanPort"), ServicePasseUneCommande.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicePasseUneCommande
     */
    @WebEndpoint(name = "ServicePasseUneCommandeBeanPort")
    public ServicePasseUneCommande getServicePasseUneCommandeBeanPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.polytech.unice.fr/ServicePasseUneCommande", "ServicePasseUneCommandeBeanPort"), ServicePasseUneCommande.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEPASSEUNECOMMANDEBEANSERVICE_EXCEPTION!= null) {
            throw SERVICEPASSEUNECOMMANDEBEANSERVICE_EXCEPTION;
        }
        return SERVICEPASSEUNECOMMANDEBEANSERVICE_WSDL_LOCATION;
    }

}