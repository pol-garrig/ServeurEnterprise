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

        System.out.println("\n#####################################\n");
        System.out.println("Creation d'un Magasin\n");
        Double tax = 0.0;
        String name = "Magasin1";
        //Cookie c = new Cookie();
        port.creerBoutique2(name, null, null, tax);
        System.out.println("\n#####################################\n");
        System.out.println("\n#####################################\n");
        System.out.println("Creation d'un Magasin\n");
        String name2 = "Magasin2";
        //Cookie c2 = new Cookie();
        port.creerBoutique2(name2, null, null, tax);
        System.out.println("\n#####################################\n");
        System.out.println("\n#####################################\n");
        System.out.println("Creation d'un Magasin\n");
        String name3 = "Magasin3";
        //Cookie c2 = new Cookie();
        port.creerBoutique2(name3, null, null, tax);
        System.out.println("\n#####################################\n");
        System.out.println("Liste de Magasins :\n");
        for (int i = 0; i < port.getListeMagasin().size(); i++) {
            System.out.println(port.getListeMagasin().get(i).getName());
        }
        System.out.println("\n#####################################\n");
        System.out.println("Fin de Conection");
        System.out.println("\n#####################################\n");
	}

}
