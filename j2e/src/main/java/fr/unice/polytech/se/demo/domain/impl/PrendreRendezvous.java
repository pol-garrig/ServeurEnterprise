package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.entities.magasin.Magasin;
import fr.unice.polytech.se.demo.entities.rendezvous.Rendezvous;

import javax.ejb.Remote;
import java.util.Date;
import java.util.List;

/**
 * Created by Garrigos Fernando on 10/04/15.
 */
@Remote
public interface PrendreRendezvous {

   public boolean prendreRendezvous(Magasin m,Date date);

   public List<Rendezvous> getRendezvous();

}
