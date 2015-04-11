package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.entities.commande.Commande;
import fr.unice.polytech.se.demo.entities.commande.CommandeFinder;
import fr.unice.polytech.se.demo.entities.commande.CommandeManager;
import fr.unice.polytech.se.demo.entities.cookie.CookieManager;


import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Garrigos Fernando on 11/04/15.
 */
@Stateless
public class PasseUneCommandeBean implements PasseUneCommande {

    private ArrayList<Commande> commandes = new ArrayList<Commande>();

    @EJB
    CommandeManager mg;

    @EJB
    CookieManager mgCookie;

    @EJB
    CommandeFinder finder;

    @Override
    public Commande passeUneCommande(Double prixHT, String rendezvous, String cookies) {
            Commande m = mg.creerUneCommande(prixHT,rendezvous,cookies);
            commandes.add(m);
            return m;
    }

    @Override
    public List<String>  choisirCookies() {

        List<String> cookies = new ArrayList<String>();
        String temp = "";
        for (int i = 0; i <mgCookie.getContents().size() ; i++) {
            temp = mgCookie.getContents().get(i).getName();
            cookies.add(temp);
        }
        return cookies;
    }


    @Override
    public List<Commande> getCommandes(){
        return commandes;
    }
}
