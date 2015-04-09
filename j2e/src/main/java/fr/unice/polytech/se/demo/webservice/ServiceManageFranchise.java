package fr.unice.polytech.se.demo.webservice;

import fr.unice.polytech.se.demo.entities.commande.Commande;
import fr.unice.polytech.se.demo.entities.cookie.Cookie;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by Garrigos Fernando on 08/04/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/serviceManageFranchise")
public interface ServiceManageFranchise {

        @WebMethod
        @WebResult(name = "created")
        public boolean creerBoutique(@WebParam(name = "name") String n,
                                        @WebParam(name = "cookie") Cookie c,
                                        @WebParam (name = "listeCommande")  List<Commande> l,
                                        @WebParam(name = "tax") Double t

                                        );

}
