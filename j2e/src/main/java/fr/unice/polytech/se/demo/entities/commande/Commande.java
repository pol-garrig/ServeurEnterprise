package fr.unice.polytech.se.demo.entities.commande;

import fr.unice.polytech.se.demo.entities.cookie.Cookie;
import fr.unice.polytech.se.demo.entities.magasin.Magasin;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by Garrigos Fernando on 31/03/15.
 */

@Entity
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Double prixHT;

    private String Rendezvous;

    private String cookies;

    public  Commande(){
        this(0.0,null,null);
    }

    public Commande(Double prixHT,String Rendezvous,String cookies){
        super();
        this.prixHT = prixHT;
    }

    @Override
    public String toString() {
        return "[" + this.getId() + "]#" + this.getLieuRetrait() + this.getCookies() ;
    }

    public Double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(Double prixHT) {
        this.prixHT = prixHT;
    }

    public String getLieuRetrait() {
        return Rendezvous;
    }

    public void setLieuRetrait(String Rendezvous) {
        this.Rendezvous = Rendezvous;
    }

    public  String getCookies() {
        return cookies;
    }

    public void setCookies( String cookies) {
        this.cookies = cookies;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (o instanceof Commande) {
            Commande that = (Commande) o;
            return that.getId().equals(this.getId());
        }
        return false;
    }
}