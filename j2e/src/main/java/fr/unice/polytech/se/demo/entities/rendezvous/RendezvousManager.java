package fr.unice.polytech.se.demo.entities.rendezvous;

import fr.unice.polytech.se.demo.entities.magasin.Magasin;

import javax.ejb.Remote;
import java.util.Date;
import java.util.List;

/**
 * Created by Garrigos Fernando on 10/04/15.
 */
@Remote
public interface RendezvousManager {

    public Rendezvous prendreRendezvous(Magasin m,Date date );

    public List<Rendezvous> getContents();
}
