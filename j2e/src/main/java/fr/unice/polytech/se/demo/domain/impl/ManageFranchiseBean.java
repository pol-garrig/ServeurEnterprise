package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.entities.commande.Commande;
import fr.unice.polytech.se.demo.entities.cookie.Cookie;
import fr.unice.polytech.se.demo.entities.cookie.CookieManager;
import fr.unice.polytech.se.demo.entities.magasin.Magasin;
import fr.unice.polytech.se.demo.entities.magasin.MagasinFinder;
import fr.unice.polytech.se.demo.entities.magasin.MagasinManager;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Garrigos Fernando on 08/04/15.
 */
@Stateless
public class ManageFranchiseBean implements ManageFranchise {

    private ArrayList<Magasin> _contents = new ArrayList<Magasin>();

    @EJB
    MagasinManager mg;

    @EJB
    CookieManager mgc;

    @EJB
    MagasinFinder finder;

    @Override
    public boolean ajouterUnMagasin(String n) {

       if(finder.findByName(n) == null) {
           Magasin m = mg.creerUnMagasin(n);
            _contents.add(m);
           return true;
       }
        return false;
    }

    @Override
    public List<Magasin> getMagasin(){
        return _contents;
    }

    @Override
    public String creerUnCookie(String name,Double prix,Integer quantite){
        Cookie c = mgc.creerUnCookie(name,prix,quantite);
        String temp = c.getName()+" "+c.getPrixHT()+" "+c.getQuantite();
        return temp;
    }

}
