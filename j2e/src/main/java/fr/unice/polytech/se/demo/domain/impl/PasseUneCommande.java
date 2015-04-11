package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.entities.commande.Commande;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by Garrigos Fernando on 11/04/15.
 */
@Remote

public interface PasseUneCommande {

        public boolean passeUneCommande(Double prixHT,String Rendezvous,String cookies);

        public String choisirCookies();

        public List<Commande> getCommandes();


}
