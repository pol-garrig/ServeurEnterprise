package example;


//import stub1.ServiceManageFranchise;
//import stub1.ServiceManageFranchiseImplementsService;

import javax.xml.ws.BindingProvider;
import java.net.URL;

/**
 * Created by Garrigos Fernando on 09/04/15.
 */
public class HelloWorldClient {

  public static void main(String[] args) {

      //encontrar el url agragar ?wsdl
      //y despues crear el stub desde inteligi
      // Dynamically building the targeted web service location (default to localhost if not provided)
      String host = "localhost";
      String address = "http://" + host + ":8080//webservices/ServiceManageFranchise";
      URL wsdlLocation = null;
      try {
          wsdlLocation = new URL(address + "?wsdl");
      } catch (Exception e) {
          System.exit(0);
      } // UGLY ><
      // Instantiating the client stub code
      //ServiceManageFranchiseImplementsService srv = new ServiceManageFranchiseImplementsService(wsdlLocation); // dynamic WSDL location
      //ServiceManageFranchise port = srv.getServiceManageFranchiseImplementsPort();

    //   Dynamically setting the address where the web service is really deployed
    //  ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);


      System.out.println("Fin de Conection");
      System.out.println("\n#####################################\n");
  }
}
