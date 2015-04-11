package fr.unice.polytech.se.demo.entities.commande;

import fr.unice.polytech.se.demo.entities.cookie.Cookie;
import fr.unice.polytech.se.demo.entities.magasin.Magasin;

import java.util.List;
import java.util.Set;

/**
 * Created by Garrigos Fernando on 08/04/15.
 */
public interface CommandeManager {

    public Commande creerUneCommande(Double prixHT,String rendezvous,String cookies);

    public Commande creerUneCommande(Commande c);

    public List<Commande> getContents();

}
