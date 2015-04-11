package fr.unice.polytech.se.demo.webservice;

import fr.unice.polytech.se.demo.domain.impl.ManageFranchise;
import fr.unice.polytech.se.demo.entities.commande.Commande;
import fr.unice.polytech.se.demo.entities.cookie.Cookie;
import fr.unice.polytech.se.demo.entities.magasin.Magasin;


import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.*;

/**
 * Created by Garrigos Fernando on 08/04/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/serviceManageFranchise")
@Stateless(name = "ServiceManageFranchise")
public class ServiceManageFranchiseImplements implements ServiceManageFranchise {

    @EJB
    private ManageFranchise manageFranchise;

    @WebMethod
    @Override
    public boolean creerBoutique2(String n) {
    
        if (manageFranchise.ajouterUnMagasin(n)) {
            return true;
        } else {
            return false;
        }
    }
    @WebMethod
    @Override
    public List<Magasin> getListeMagasin(){
        return manageFranchise.getMagasin();
    }

    @Override
    public String creerUnCookie(String name,Double prix,Integer quantite) {
        return manageFranchise.creerUnCookie(name, prix, quantite);
    }

}
