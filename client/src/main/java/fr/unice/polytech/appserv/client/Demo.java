package fr.unice.polytech.appserv.client;


import stub1.*;
import stub2.*;
import stub3.*;

import javax.xml.ws.BindingProvider;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Une classe pour Tester les Web service
 *@author  Garrigos Fernando
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
            wsdlLocation2 = new URL(address2 + "?wsdl");
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
        System.out.println("Scenario pour la Creation d'une Boutique ");
        System.out.println("\n#####################################\n");

        //On print la liste de Magasin vide
        System.out.println("\nListe de Magasin : " +port.getListeMagasin()+"\n");

        System.out.println("Creation d'un Magasin : CookiesFer\n");

        //On cree un Magasin avec le nom CookiesFer
        port.creerBoutique2("CookiesFer");

        System.out.println("Creation d'un Magasin : SuperCookies\n");

        //On cree un Magasin avec le nom SuperCookies
        port.creerBoutique2("SuperCookies");

        System.out.println("Creation d'un Magasin : YepCookies\n");

        //On cree un Magasin avec le nom YepCookies
        port.creerBoutique2("YepCookies");

        //On print la liste de Magasin avec Les nouveaux magasin
        System.out.println("Liste de Magasin : \n");
        for (int i = 0; i < port.getListeMagasin().size(); i++) {
            System.out.println("Magasin : "+ port.getListeMagasin().get(i).getName());
        }
        System.out.println("\n#####################################\n");
        System.out.println("Fin Scenario pour la Creation d'une Boutique ");
        System.out.println("\n#####################################\n");

        System.out.println("\n#####################################\n");
        System.out.println("Scenario Choisir une Boutique ");
        System.out.println("\n#####################################\n");

        //On print la liste de Magasin avec Les nouveaux magasin
        System.out.println("Liste de Magasin : \n");
        for (int i = 0; i < port.getListeMagasin().size(); i++) {
            System.out.println("Magasin : "+ port.getListeMagasin().get(i).getName());
        }

        System.out.println("\nOn prendre RENDEZVOUS : date 13/7/2015 et MAGASIN : CookiesFer");

        //On recupere le magasin
        String magasin = port2.getListeMagasin().get(0).getName();

        //On prendre RENDEZVOUS à la date 13/13/2015 et avec le MAGASIN : CookiesFer
        port2.prendreRendezvous(magasin, "13/7/2015");

        System.out.println("\nOn prendre RENDEZVOUS : date 3/3/2015 et MAGASIN : SuperCookies");

        //On recupere le magasin
        String magasin2 = port2.getListeMagasin().get(1).getName();

        //On prendre RENDEZVOUS à la date 3/3/2015 et avec le MAGASIN : SuperCookies
        port2.prendreRendezvous(magasin2,"3/3/2015 ");

        System.out.println("\nOn prendre RENDEZVOUS : date 12/12/2015 et MAGASIN : YepCookies");

        //On recupere le magasin
        String magasin3 = port2.getListeMagasin().get(2).getName();

        //On prendre RENDEZVOUS à la date 12/12/2015 et avec le MAGASIN : YepCookies
        port2.prendreRendezvous(magasin3,"12/12/2015");

        //On print la liste de Rendezvous
        System.out.print("\nListe de Rendezvous : \n\n");
        for (int i = 0; i < port2.getListeRendezvous().size(); i++) {
            System.out.println("Rendezvous : " + port2.getListeRendezvous().get(i).getMagasin()
                    + " " + port2.getListeRendezvous().get(i).getDate());
        }

        System.out.println("\n#####################################\n");
        System.out.println("Fin Scenario Choisir une Boutique ");
        System.out.println("\n#####################################\n");


        System.out.println("\n#####################################\n");
        System.out.println("Scenario Passer une commande ");
        System.out.println("\n#####################################\n");

        //On creer des cookies pour choisir
        stub1.Cookie c1 = port.creerUnCookie("Chocalat",1.1,1);
        stub1.Cookie c2 = port.creerUnCookie("Classic",1.1,2);
        stub1.Cookie c3 = port.creerUnCookie("Ammandes",1.1,4);

        //On print la liste de Cookies
        System.out.print("\nListe de Cookies : \n\n");
        for (int i = 0; i < port.getListeCookies().size() ; i++) {
            System.out.println("Cookie : " + port.getListeCookies().get(i).getName());
        }

        System.out.println("\nOn Commande avec : \nRENDEZVOUS : date 12/12/2015 et MAGASIN : CookiesFer \nCookies : Chocalat \nQuantite : 1 \n");

        //on recupere le rendezvous
        String rv1 = port2.getListeRendezvous().get(0).getMagasin()
                + " " + port2.getListeRendezvous().get(0).getDate();
        //On creer la commande
        stub3.Commande commande = port3.passerUneCommande(c1.getPrixHT(),rv1,c1.getName() +"\nQuantite :" +c1.getQuantite() );

        System.out.println("\nOn Commande avec : \nRENDEZVOUS : date 3/3/2015 et MAGASIN : SuperCookies \nCookies : Classic \nQuantite : 2 \n");

        //on recupere le rendezvous
        String rv2 = port2.getListeRendezvous().get(1).getMagasin()
                + " " + port2.getListeRendezvous().get(1).getDate();
        //On creer la commande
        stub3.Commande commande2 = port3.passerUneCommande(c2.getPrixHT()*c2.getQuantite(),rv2,c2.getName() +"\nQuantite :" +c2.getQuantite() );

        System.out.println("\nOn Commande avec : \nRENDEZVOUS : date 12/12/2015 et MAGASIN : YepCookies \nCookies : Ammandes \nQuantite : 4 \n");

        //on recupere le rendezvous
        String rv3 = port2.getListeRendezvous().get(2).getMagasin()
                + " " + port2.getListeRendezvous().get(2).getDate();
        //On creer la commande
        stub3.Commande commande3 = port3.passerUneCommande(c3.getPrixHT()*c3.getQuantite(),rv3,c3.getName() +"\nQuantite : " +c3.getQuantite() );

        //On print la liste de Commandes
        System.out.print("\nListe de Commandes : \n\n");
        for (int i = 0; i < port3.getListeCommande().size() ; i++) {
            System.out.println("Commande : " +
                    "\nRENDEZVOUS : " + port3.getListeCommande().get(i).getRendezvous()+
                    "\nCookies : " +  port3.getListeCommande().get(i).getCookies() +
                    "\nPrix : " + port3.getListeCommande().get(i).getPrixHT()
            );
        }

        System.out.println("\n#####################################\n");
        System.out.println("Fin Scenario Passer une commande ");
        System.out.println("\n#####################################\n");

	}

}
