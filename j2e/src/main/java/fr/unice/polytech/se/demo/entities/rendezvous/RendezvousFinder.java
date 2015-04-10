package fr.unice.polytech.se.demo.entities.rendezvous;

import fr.unice.polytech.se.demo.entities.magasin.Magasin;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by Garrigos Fernando on 10/04/15.
 */
@Stateless
public interface RendezvousFinder {

    public Rendezvous findByName(Long id);

    public List<Rendezvous> findAll();

}
