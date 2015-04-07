package fr.unice.polytech.se.demo.entities;

import fr.unice.polytech.se.demo.domain.PetFinder;
import fr.unice.polytech.se.demo.entities.MagasinManager;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import fr.unice.polytech.se.demo.entities.Commande;
import fr.unice.polytech.se.demo.entities.Cookie;
import fr.unice.polytech.se.demo.entities.Magasin;

import javax.ejb.Stateful;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Garrigos Fernando on 06/04/15.
 */
@Stateful
public class MagasinManagerBean implements MagasinManager {


    private ArrayList<Magasin> _contents = new ArrayList<Magasin>();

    @PersistenceContext
    EntityManager entityManager;

    @EJB
    MagasinFinder finder;

    @Override
    public Magasin creerUnMagasin(String name, Cookie c, List<Commande> l, long tax) {

        Magasin mg= finder.findByName(name);
        if (mg == null) {
            mg = new Magasin(name,c,l,tax);
            _contents.add(mg);
            entityManager.persist(mg);
        }
        return mg;
    }

    @Override
    public Magasin creerUnMagasin(Magasin mg) {
        _contents.add(mg);
        entityManager.persist(mg);
        return mg;
    }

    @Override
    public List<Magasin> getContents(){
        return _contents;
    }
}
