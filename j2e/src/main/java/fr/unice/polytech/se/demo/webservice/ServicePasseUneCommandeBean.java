package fr.unice.polytech.se.demo.webservice;

import fr.unice.polytech.se.demo.entities.magasin.Magasin;

import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by Garrigos Fernando on 11/04/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/ServicePasseUneCommande")
@Stateless(name = "ServicePasseUneCommande")
public class ServicePasseUneCommandeBean  implements ServicePasseUneCommande {

    @Override
    public boolean creerBoutique2(String n) {
        return false;
    }

    @Override
    public List<Magasin> getListeMagasin() {
        return null;
    }
}
