package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.CookieFinder;
import fr.unice.polytech.se.demo.entities.Cookie;
import fr.unice.polytech.se.demo.entities.Pet;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Created by Garrigos Fernando on 06/04/15.
 */
@Stateless
public class CookieFinderBean implements CookieFinder{

    @PersistenceContext
    EntityManager entityManager;
    @Override
    public Cookie findByName(String n){
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Cookie> criteria = builder.createQuery(Cookie.class);
        Root<Cookie> from = criteria.from(Cookie.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("name"), n));
        TypedQuery<Cookie> query = entityManager.createQuery(criteria);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
