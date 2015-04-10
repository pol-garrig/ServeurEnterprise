package fr.unice.polytech.se.demo.entities.magasin;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by Garrigos Fernando on 07/04/15.
 */
@Stateless
public class MagasinFinderBean implements MagasinFinder {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Magasin findByName(Long n){
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Magasin> criteria = builder.createQuery(Magasin.class);
        Root<Magasin> from = criteria.from(Magasin.class);
        criteria.select(from);
        criteria.where(builder.equal(from.get("name"), n));
        TypedQuery<Magasin> query = entityManager.createQuery(criteria);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    @Override
    public List<Magasin> findAll(){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Magasin> cq = cb.createQuery(Magasin.class);
        TypedQuery<Magasin> allQuery = entityManager.createQuery(cq.select(cq
                .from(Magasin.class)));
        return allQuery.getResultList();
    }
}
