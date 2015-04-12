package fr.unice.polytech.se.demo.entities.commande;

import fr.unice.polytech.se.demo.entities.cookie.Cookie;
import fr.unice.polytech.se.demo.entities.magasin.Magasin;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Garrigos Fernando on 08/04/15.
 */
@Stateful
public class CommandeManagerBean implements CommandeManager{

    private ArrayList<Commande> _contents = new ArrayList<Commande>();

    @PersistenceContext
    EntityManager entityManager;

    @EJB
    CommandeFinder finder;

    @Override
    public Commande creerUneCommande(Commande c) {
        Commande commande = finder.findByid(c.getId());
        if (commande == null) {
            commande = new Commande(c.getPrixHT(), c.getRendezvous(), c.getCookies());
            _contents.add(commande);
            entityManager.persist(commande);
        }
        return commande;
    }

    @Override
    public Commande creerUneCommande(Double prixHT, String rendezvous, String cookies) {
       Commande commande = new Commande(prixHT,rendezvous,cookies);
       _contents.add(commande);
       entityManager.persist(commande);
       return commande;
    }

    @Override
    public List<Commande> getContents() {
        return _contents;
    }



}
