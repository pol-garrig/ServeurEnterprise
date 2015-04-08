package fr.unice.polytech.se.demo.entities.magasin;

import fr.unice.polytech.se.demo.entities.commande.Commande;
import fr.unice.polytech.se.demo.entities.cookie.Cookie;

import java.util.List;

/**
 * Created by Garrigos Fernando on 06/04/15.
 */
public interface MagasinManager {

    public Magasin creerUnMagasin(String n, Cookie c, List<Commande> l, long tax);

    public Magasin creerUnMagasin(Magasin m);

    public List<Magasin> getContents();
}
