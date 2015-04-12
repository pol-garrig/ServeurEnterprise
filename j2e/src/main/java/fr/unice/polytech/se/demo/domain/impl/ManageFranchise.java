package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.entities.commande.Commande;
import fr.unice.polytech.se.demo.entities.cookie.Cookie;
import fr.unice.polytech.se.demo.entities.magasin.Magasin;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by Garrigos Fernando on 08/04/15.
 */
@Remote
public interface ManageFranchise {

    public boolean ajouterUnMagasin(String n);

    public List<Magasin> getMagasin();

    public Cookie creerUnCookie(String name,Double prix,Integer quantite);

}
