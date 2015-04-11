package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.entities.commande.Commande;

import java.util.List;

/**
 * Created by Garrigos Fernando on 11/04/15.
 */
public class PasseUneCommandeBean implements PasseUneCommande {
    @Override
    public boolean passeUneCommande(Double prixHT, String Rendezvous, String cookies) {
        return false;
    }

    @Override
    public String choisirCookies() {
        return null;
    }

    @Override
    public List<Commande> getCommandes() {
        return null;
    }
}
