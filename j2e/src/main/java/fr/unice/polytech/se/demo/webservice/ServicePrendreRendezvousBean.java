package fr.unice.polytech.se.demo.webservice;

/**
 * Created by Garrigos Fernando on 10/04/15.
 */
public class ServicePrendreRendezvousBean {
    private static ServicePrendreRendezvousBean ourInstance = new ServicePrendreRendezvousBean();

    public static ServicePrendreRendezvousBean getInstance() {
        return ourInstance;
    }

    private ServicePrendreRendezvousBean() {
    }
}
