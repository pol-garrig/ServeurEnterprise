package fr.unice.polytech.se.demo.domain;

import fr.unice.polytech.se.demo.entities.Commande;
import fr.unice.polytech.se.demo.entities.Cookie;
import fr.unice.polytech.se.demo.entities.Magasin;

import java.util.List;

/**
 * Created by Garrigos Fernando on 06/04/15.
 */
public interface MagasinManager {

    public Magasin creerUnMagasin(String n, Cookie c, List<Commande> l, long tax);

    public Magasin creerUnMagasin(Magasin m);

    public List<Magasin> getContents();
}
