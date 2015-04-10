package fr.unice.polytech.se.demo.entities.rendezvous;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by Garrigos Fernando on 10/04/15.
 */
public class RendezvouFinderBean implements  RendezvousFinder{


    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Rendezvous findByName(Long id){
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Rendezvous> criteria = builder.createQuery(Rendezvous.class);
        Root<Rendezvous> from = criteria.from(Rendezvous.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("id"), id));
        TypedQuery<Rendezvous> query = entityManager.createQuery(criteria);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    @Override
    public List<Rendezvous> findAll(){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Rendezvous> cq = cb.createQuery(Rendezvous.class);
        TypedQuery<Rendezvous> allQuery = entityManager.createQuery(cq.select(cq
                .from(Rendezvous.class)));
        return allQuery.getResultList();
    }
}
