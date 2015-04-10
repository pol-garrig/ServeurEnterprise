package fr.unice.polytech.se.demo.webservice;

import fr.unice.polytech.se.demo.entities.commande.Commande;
import fr.unice.polytech.se.demo.entities.cookie.Cookie;
import fr.unice.polytech.se.demo.entities.magasin.Magasin;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.*;

/**
 * Created by Garrigos Fernando on 08/04/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/serviceManageFranchise")
public interface ServiceManageFranchise {

        @WebMethod
        @WebResult(name = "creerBoutique")
        public boolean creerBoutique2(@WebParam(name = "name")String n);

        @WebMethod
        @WebResult(name = "regarderListeMagasin")
        public List<Magasin> getListeMagasin();
    
}
