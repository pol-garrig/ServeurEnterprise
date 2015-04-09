package fr.unice.polytech.se.demo.entities.magasin;

import fr.unice.polytech.se.demo.entities.commande.Commande;
import fr.unice.polytech.se.demo.entities.cookie.Cookie;

import javax.ejb.Remote;

import java.util.List;

/**
 * Created by Garrigos Fernando on 06/04/15.
 */
@Remote
public interface MagasinManager {

    public Magasin creerUnMagasin(String n, Cookie c, List<Commande> l, Double tax);

    public Magasin creerUnMagasin(Magasin m);

    public List<Magasin> getContents();
}
