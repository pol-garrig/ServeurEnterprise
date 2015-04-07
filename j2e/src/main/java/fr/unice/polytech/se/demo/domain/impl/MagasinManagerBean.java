package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.MagasinManager;
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

    @Override
    public Magasin creerUnMagasin(String n, Cookie c, List<Commande> l, long tax) {
        Magasin mg = new Magasin(n,c,l,tax);
        _contents.add(mg);
        entityManager.persist(mg);
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
