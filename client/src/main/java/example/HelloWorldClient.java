package example;

import stub1.Service;
import stub1.ServiceImplementsService;

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
      String address = "http://" + host + ":8080/demo/webservices/Fefe";
      URL wsdlLocation = null;
      try {
          wsdlLocation = new URL(address + "?wsdl");
      } catch (Exception e) {
          System.exit(0);
      } // UGLY ><

      // Instantiating the client stub code
      ServiceImplementsService srv = new ServiceImplementsService(wsdlLocation); // dynamic WSDL location
      Service port = srv.getServiceImplementsPort();

      // Dynamically setting the address where the web service is really deployed
      ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);

      System.out.println("\n#####################################\n");


  }
}
