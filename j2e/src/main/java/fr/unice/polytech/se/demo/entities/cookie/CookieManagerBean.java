package fr.unice.polytech.se.demo.entities.cookie;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Garrigos Fernando on 07/04/15.
 */
@Stateful
public class CookieManagerBean implements CookieManager{

    private ArrayList<Cookie> _contents = new ArrayList<Cookie>();

    @PersistenceContext
    EntityManager entityManager;

    @EJB
    CookieFinder finder;

    @Override
    public Cookie creerUnCookie(String name, Double prixHT, Integer quantite) {

        Cookie cookie = new Cookie(name,prixHT,quantite);
        _contents.add(cookie);
        entityManager.persist(cookie);
        return cookie;
    }

    @Override
    public Cookie creerUnCookie(Cookie c) {
        _contents.add(c);
        entityManager.persist(c);
        return c;
    }

    @Override
    public List<Cookie> getContents() {
        return _contents;
    }
}
