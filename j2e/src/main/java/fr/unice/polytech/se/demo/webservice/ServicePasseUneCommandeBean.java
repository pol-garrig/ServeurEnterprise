package fr.unice.polytech.se.demo.webservice;

import fr.unice.polytech.se.demo.domain.impl.ManageFranchise;
import fr.unice.polytech.se.demo.domain.impl.PasseUneCommande;
import fr.unice.polytech.se.demo.entities.commande.Commande;
import fr.unice.polytech.se.demo.entities.magasin.Magasin;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by Garrigos Fernando on 11/04/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/ServicePasseUneCommande")
@Stateless(name = "ServicePasseUneCommande")
public class ServicePasseUneCommandeBean  implements ServicePasseUneCommande {


   @EJB
    private PasseUneCommande pc;

    @WebMethod
    @Override
    public Commande passerUneCommande(Double prixHT, String rendezvous, String cookies) {
       return pc.passeUneCommande(prixHT, rendezvous, cookies);
    }

    @WebMethod
    @Override
    public List<Commande> getListeCommande() {
        return pc.getCommandes();
    }

    @WebMethod
    @Override
    public List<String> choisirCookies() {
        return pc.choisirCookies();
    }
}
