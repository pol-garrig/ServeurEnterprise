package fr.unice.polytech.se.demo.entities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Garrigos Fernando on 08/04/15.
 */

public interface CommandeFinder {

    public Commande findByid(Long id);

}
