package fr.unice.polytech.appserv.mini_jira.client;


import stub1.Cookie;
import stub1.ServiceManageFranchise;
import stub1.ServiceManageFranchiseImplementsService;

import javax.xml.ws.BindingProvider;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * To create the stub classes, using IntelliJ:
 *   - right click on the module, select WebServices, Generate Java Code from WSDL
 *   - Fill in the form
 *   - click on Generate
 */
public class Demo {

	// Usage: mvn exec:java -Dexec.args="52.16.30.145", where 52.16.30.145 is the host IP (default is localhost)

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
        ServiceManageFranchiseImplementsService srv = new ServiceManageFranchiseImplementsService(wsdlLocation); // dynamic WSDL location
        ServiceManageFranchise port = srv.getServiceManageFranchiseImplementsPort();

        //   Dynamically setting the address where the web service is really deployed
        //  ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);

        // Running the demonstration scenario from the client point of view


        //Cookie cookie = new Cookie();

        // List<Commande> listcookies = null;
        Double tax = 0.0;

        port.creerBoutique2(name, null, null, tax);

        System.out.println("\n#####################################\n");
        System.out.println("Creation d'un Magasin\n");
        String name = "Magasin1";
        Cookie c = new Cookie();
        port.creerBoutique2(name, c, null, tax);
        System.out.println("\n#####################################\n");
        System.out.println("\n#####################################\n");
        System.out.println("Creation d'un Magasin\n");
        String name2 = "Magasin2";
        Cookie c2 = new Cookie();
        port.creerBoutique2(name2, c2, null, tax);
        System.out.println("\n#####################################\n");
        System.out.println("Liste de Magasins\n");
        System.out.println(port.getListeMagasin().get(0).getName());
        System.out.println("\n#####################################\n");


        // retrieving the tasks
     /* System.out.println("## 3. Retrieving the added tasks");

      System.out.println("  - " + t.getProjectId() + " / " + t.getDeveloperId());

      List<stub.Task> tasks = port.listTasks("proj#1");
      for(stub.Task t: tasks)
          System.out.println("  - " + t.getProjectId() + " / " + t.getDeveloperId());

    */
        System.out.println("Fin de Conection");
        System.out.println("\n#####################################\n");
	}

}
