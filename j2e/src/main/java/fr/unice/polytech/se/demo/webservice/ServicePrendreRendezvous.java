package fr.unice.polytech.se.demo.webservice;

import fr.unice.polytech.se.demo.entities.magasin.Magasin;
import fr.unice.polytech.se.demo.entities.rendezvous.Rendezvous;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Date;
import java.util.List;

/**
 * Created by Garrigos Fernando on 10/04/15.
 */
@WebService(targetNamespace = "http://www.polytech.unice.fr/servicePrendreRendezvous")
public interface ServicePrendreRendezvous {

        @WebMethod
        @WebResult(name = "creerBoutique")
        public boolean prendreRendezvous(@WebParam(name = "name")Magasin m,@WebParam(name = "date")String date);

        @WebMethod
        @WebResult(name = "regarderListeRendezvous")
        public List<Rendezvous> getListeRendezvous();

        @WebMethod
        @WebResult(name = "regarderListeMagasin")
        public List<Magasin> getListeMagasin();
}
