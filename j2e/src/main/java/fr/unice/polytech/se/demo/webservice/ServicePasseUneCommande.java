package fr.unice.polytech.se.demo.webservice;

import fr.unice.polytech.se.demo.domain.impl.ManageFranchise;
import fr.unice.polytech.se.demo.entities.magasin.Magasin;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by Garrigos Fernando on 11/04/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/ServicePasseUneCommande")
public interface ServicePasseUneCommande {

    @WebMethod
    @WebResult(name = "creerBoutique")
    public boolean creerBoutique2(@WebParam(name = "name")String n);

    @WebMethod
    @WebResult(name = "regarderListeMagasin")
    public List<Magasin> getListeMagasin();

    }

}
