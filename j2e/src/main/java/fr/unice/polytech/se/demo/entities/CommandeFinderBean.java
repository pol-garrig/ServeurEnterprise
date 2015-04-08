package fr.unice.polytech.se.demo.entities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Created by Garrigos Fernando on 08/04/15.
 */
@Stateless
public class CommandeFinderBean implements CommandeFinder {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Commande findByid(Long id) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Commande> criteria = builder.createQuery(Commande.class);
        Root<Commande> from = criteria.from(Commande.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("id"), id));
        TypedQuery<Commande> query = entityManager.createQuery(criteria);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
