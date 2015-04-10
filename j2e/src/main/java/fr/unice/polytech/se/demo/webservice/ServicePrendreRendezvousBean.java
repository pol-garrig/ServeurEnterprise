package fr.unice.polytech.se.demo.webservice;

import fr.unice.polytech.se.demo.domain.impl.ManageFranchise;
import fr.unice.polytech.se.demo.domain.impl.PrendreRendezvous;
import fr.unice.polytech.se.demo.entities.magasin.Magasin;
import fr.unice.polytech.se.demo.entities.rendezvous.Rendezvous;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Date;
import java.util.List;

/**
 * Created by Garrigos Fernando on 10/04/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/servicePrendreRendezvous")
@Stateless(name = "ServicePrendreRendezvous")
public class ServicePrendreRendezvousBean implements ServicePrendreRendezvous{

    @EJB
    private PrendreRendezvous prv;


    @WebMethod
    @Override
    public boolean prendreRendezvous(Magasin m, Date date) {

        if (prv.prendreRendezvous(m,date)) {
            return true;
        } else {
            return false;
        }
    }
    @WebMethod
    @Override
    public List<Rendezvous> getListeRendezvous() {
        return prv.getRendezvous();
    }
}
