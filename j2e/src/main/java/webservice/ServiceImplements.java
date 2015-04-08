package webservice;

import fr.unice.polytech.se.demo.domain.impl.ManageFranchise;
import fr.unice.polytech.se.demo.entities.commande.Commande;
import fr.unice.polytech.se.demo.entities.cookie.Cookie;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by Garrigos Fernando on 08/04/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/appserv/demos")
@Stateless(name = "ServiceImplements")
public class ServiceImplements implements Service {

    @EJB
    private ManageFranchise manageFranchise;

    @WebMethod
    @Override
    public boolean creerBoutique(String n, Cookie c, List<Commande> l, Double t) {
        if (manageFranchise.ajouterUnMagasin(n, c, l, t)) {
            return true;
        } else {
            return false;
        }
    }
}
