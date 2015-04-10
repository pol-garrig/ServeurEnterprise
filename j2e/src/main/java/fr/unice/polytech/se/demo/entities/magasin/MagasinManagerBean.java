package fr.unice.polytech.se.demo.entities.magasin;

import javax.ejb.EJB;
import javax.persistence.EntityManager;

import fr.unice.polytech.se.demo.entities.commande.Commande;
import fr.unice.polytech.se.demo.entities.cookie.Cookie;

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
    public Magasin creerUnMagasin(String name) {

        Magasin mg= finder.findByName(name);
        if (mg == null) {
            mg = new Magasin(name);
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
