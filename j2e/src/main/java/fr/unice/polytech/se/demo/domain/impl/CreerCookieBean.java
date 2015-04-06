package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.CookieFinder;
import fr.unice.polytech.se.demo.domain.CreerCookie;
import fr.unice.polytech.se.demo.domain.PetFinder;
import fr.unice.polytech.se.demo.entities.Cookie;
import fr.unice.polytech.se.demo.entities.Pet;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Garrigos Fernando on 06/04/15.
 */
@Stateless
public class CreerCookieBean implements CreerCookie{


    @PersistenceContext
    EntityManager entityManager;

    @EJB
    CookieFinder finder;


    @Override
    public Cookie creerCookie(String name) {
       // Cookie r = finder.findByName(name);
       // if (r == null) {
         Cookie r = new Cookie(name);
            entityManager.persist(r);
       // }
        return r;
    }

    @PostConstruct
    public void initialize() {
        System.out.println("Initializing PetManager");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Destroying PetManager");
    }

}
