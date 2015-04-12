package fr.unice.polytech.appserv.client;


import stub1.*;
import stub2.*;
import stub3.*;

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

        // Dynamically building the targeted web service location (default to localhost if not provided)
        String host = ( args.length == 0 ? "localhost" : args[0]);

        String address = "http://" + host + ":8080//webservices/ServiceManageFranchise";
        String address2 = "http://" + host + ":8080//webservices/ServicePrendreRendezvous";
        String address3 = "http://"+ host +":8080//webservices/ServicePasseUneCommande";


        URL wsdlLocation = null;
        URL wsdlLocation2 = null;
        URL wsdlLocation3 = null;
        try {
            wsdlLocation = new URL(address + "?wsdl");
            wsdlLocation3 = new URL(address2 + "?wsdl");
            wsdlLocation3 = new URL(address3 + "?wsdl");

        } catch (Exception e) {
            System.exit(0);
        }

        // Instantiating the client stub1 code
        ServiceManageFranchiseImplementsService srv = new ServiceManageFranchiseImplementsService(wsdlLocation);
        ServiceManageFranchise port = srv.getServiceManageFranchiseImplementsPort();

        // Instantiating the client stub2 code
        ServicePrendreRendezvousBeanService srv2 = new ServicePrendreRendezvousBeanService(wsdlLocation2);
        ServicePrendreRendezvous port2 = srv2.getServicePrendreRendezvousBeanPort();

        // Instantiating the client stub3 code
        ServicePasseUneCommandeBeanService svpc = new ServicePasseUneCommandeBeanService(wsdlLocation3);
        ServicePasseUneCommande port3 = svpc.getServicePasseUneCommandeBeanPort();

        // Running the demonstration scenario from the client point of view
        System.out.println("\n#####################################\n");
        System.out.println("Scenario pour la Creation d'un Boutique pour le directeur de la franchise\n");
        System.out.println("\n#####################################\n");

        //On print la liste de Magasin vide
        System.out.println("\nListe de Magasin : " +port.getListeMagasin()+"\n");

        String name = "Magasin1";
        port.creerBoutique2(name);



        /*

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
      //  port.creerBoutique2(name3);
        System.out.println("\n#####################################\n");
        System.out.println("Liste de Magasins :\n");
        for (int i = 0; i < port.getListeMagasin().size(); i++) {
            System.out.println(port.getListeMagasin().get(i).getName());
        }

        System.out.println("\n#####################################\n");

        System.out.println("\n#####################################\n");
        System.out.println("Fin premiere WEB SERVICE");
        System.out.println("\n#####################################\n");
        System.out.println("Debut deuxieme WEB SERVICE : Prendre Rendezvous");
        System.out.println("\n#####################################\n");



        String date = "11/11/2015";
        port2.getListeMagasin();
        stub2.Magasin m = port2.getListeMagasin().get(0);
        System.out.print("Rendezvous : ");
        port2.prendreRendezvous(port2.getListeMagasin().get(0).getName(),date);
        System.out.println( port2.getListeRendezvous().get(0).getMagasin()+" "+port2.getListeRendezvous().get(0).getDate());

        System.out.println("\n#####################################\n");
        System.out.println("Fin de Conection");
        System.out.println("\n#####################################\n");



        stub1.Cookie coo = port.creerUnCookie("Chocalat",1.1,12);
        System.out.println("cooooooooo"+coo.getName());

        System.out.println(port.creerUnCookie("Chocalat",1.1,12).getName());
        //port3.choisirCookies();
        //port.creerUnCookie("Cholalal",1.1,12);
        System.out.println(port2.getListeRendezvous().get(0).getMagasin()+" "+port2.getListeRendezvous().get(0).getDate());
        System.out.println(port.creerUnCookie("Chocalat",1.1,12).getName());

        stub3.Commande c = port3.passerUneCommande(port.creerUnCookie("Chocalat",1.1,12).getPrixHT(),port2.getListeRendezvous().get(0).getMagasin()+" "+port2.getListeRendezvous().get(0).getDate(),port.creerUnCookie("Chocalat",1.1,12).getName());

        System.out.println(port3.passerUneCommande(port.creerUnCookie("Chocalat",1.1,12).getPrixHT(),port2.getListeRendezvous().get(0).getMagasin()+" "+port2.getListeRendezvous().get(0).getDate(),port.creerUnCookie("Chocalat",1.1,12).getName()).getCookies());

        stub3.Commande c2 = port3.passerUneCommande(12.11,"salut","salut2");
        System.out.println(c2.getCookies());

        System.out.println("Commande : "+c.getCookies()+" "+c.getPrixHT()+" "+c.getRendezvous()+" ");


        System.out.println("oui");

        */
	}

}
