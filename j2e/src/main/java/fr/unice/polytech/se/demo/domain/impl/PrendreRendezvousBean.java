package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.entities.magasin.Magasin;
import fr.unice.polytech.se.demo.entities.magasin.MagasinFinder;
import fr.unice.polytech.se.demo.entities.magasin.MagasinManager;
import fr.unice.polytech.se.demo.entities.rendezvous.Rendezvous;
import fr.unice.polytech.se.demo.entities.rendezvous.RendezvousFinder;
import fr.unice.polytech.se.demo.entities.rendezvous.RendezvousManager;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Garrigos Fernando on 10/04/15.
 */
@Stateless
public class PrendreRendezvousBean implements PrendreRendezvous {

    private ArrayList<Rendezvous> _contents = new ArrayList<Rendezvous>();

    @EJB
    RendezvousManager mg;

    @EJB
    RendezvousFinder finder;

    @Override
    public boolean prendreRendezvous(String magasin, String date) {

        Rendezvous rv = mg.prendreRendezvous(magasin,date);

       // if(!finder.findById(rv.getId())) {
            _contents.add(rv);
            return true;
        //}else{
          //  return false;
        //}
    }

    @Override
    public List<Rendezvous> getRendezvous() {
        return _contents;
    }
}
