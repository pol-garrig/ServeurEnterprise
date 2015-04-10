package fr.unice.polytech.appserv.mini_jira.client;


import stub1.Cookie;
import stub1.Magasin;
import stub1.ServiceManageFranchise;
import stub1.ServiceManageFranchiseImplementsService;
import stub2.ServicePrendreRendezvous;
import stub2.ServicePrendreRendezvousBeanService;

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
        String name = "Magasin1";
        //Cookie c = new Cookie();
        port.creerBoutique2(name);
        System.out.println("\n#####################################\n");
        System.out.println("\n#####################################\n");
        System.out.println("Creation d'un Magasin\n");
        String name2 = "Magasin2";
        //Cookie c2 = new Cookie();
        port.creerBoutique2(name2);
        System.out.println("\n#####################################\n");
        System.out.println("\n#####################################\n");
        System.out.println("Creation d'un Magasin\n");
        String name3 = "Magasin3";
        //Cookie c2 = new Cookie();
        port.creerBoutique2(name3);
        System.out.println("\n#####################################\n");
        System.out.println("Liste de Magasins :\n");
        for (int i = 0; i < port.getListeMagasin().size(); i++) {
            System.out.println(port.getListeMagasin().get(i).getName());
        }
        System.out.println("\n#####################################\n");

        System.out.println("\n#####################################\n");
        System.out.println("Fin de Conection");
        System.out.println("\n#####################################\n");

       /* String address2 = "http://localhost:8080//webservices/ServicePrendreRendezvous";
        URL wsdlLocation2 = null;
        try {
            wsdlLocation2 = new URL(address2 + "?wsdl");
        } catch (Exception e) {
            System.exit(0);
        } */// UGLY ><
        // Instantiating the client stub code
        String address2 = "http://localhost:8080//webservices/ServicePrendreRendezvous";
        URL wsdlLocation2 = null;
        try {
            wsdlLocation = new URL(address2 + "?wsdl");
        } catch (Exception e) {
            System.exit(0);
        } // UGLY ><

       // http://localhost:8080//webservices/ServicePrendreRendezvous

      ServicePrendreRendezvousBeanService srv2 = new ServicePrendreRendezvousBeanService(wsdlLocation2); // dynamic WSDL location
      ServicePrendreRendezvous port2 = srv2.getServicePrendreRendezvousBeanPort();

        String date = "11/11/2015";
        port2.getListeMagasin();
        stub2.Magasin m = port2.getListeMagasin().get(0);
        System.out.println(m);
        port2.prendreRendezvous(port2.getListeMagasin().get(0),date);
        //System.out.println( port2.prendreRendezvous(port2.getListeMagasin().get(0),date));

       //System.out.println(port2.getListeMagasin().get(0).getName());
        //System.out.println( port2.prendreRendezvous(m,date));

        System.out.println("\n#####################################\n");
        System.out.println("Fin de Conection");
        System.out.println("\n#####################################\n");

	}

}
