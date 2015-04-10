package fr.unice.polytech.se.demo.entities.rendezvous;

import fr.unice.polytech.se.demo.entities.magasin.Magasin;
import fr.unice.polytech.se.demo.entities.magasin.MagasinFinder;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Garrigos Fernando on 10/04/15.
 */
@Stateful
public class RendezvousManagerBean implements RendezvousManager{


    private ArrayList<Rendezvous> _contents = new ArrayList<Rendezvous>();

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Rendezvous> getContents(){
        return _contents;
    }
    @Override
    public Rendezvous prendreRendezvous(Magasin m, Date date) {

        Rendezvous  rv = new Rendezvous(m,date);
        _contents.add(rv);
        entityManager.persist(rv);
        return rv;
    }

}
