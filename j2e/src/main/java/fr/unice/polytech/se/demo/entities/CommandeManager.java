package fr.unice.polytech.se.demo.entities;

import java.util.List;
import java.util.Set;

/**
 * Created by Garrigos Fernando on 08/04/15.
 */
public interface CommandeManager {

    public Commande creerUneCommande(Double prixHT,Magasin lieuRetrait,Set<Cookie> cookies);

    public Commande creerUneCommande(Commande c);

    public List<Commande> getContents();

}
