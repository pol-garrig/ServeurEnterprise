package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.entities.commande.Commande;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by Garrigos Fernando on 11/04/15.
 */
@Remote
public interface PasseUneCommande {

        public Commande passeUneCommande(Double prixHT,String rendezvous,String cookies);

        public List<String> choisirCookies();

        public List<Commande> getCommandes();


}
