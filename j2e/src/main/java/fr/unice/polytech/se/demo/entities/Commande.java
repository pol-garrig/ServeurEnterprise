package fr.unice.polytech.se.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Garrigos Fernando on 31/03/15.
 */

@Entity
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Double prixHT;

    private Magasin lieuRetrait;

    private Set<Cookie> cookies;

    private Date date;

    public  Commande(){
        this(0.0,null,null);
    }

    public Commande(Double prixHT,Magasin lieuRetrait,Set<Cookie> cookies){
        this.cookies = cookies;
        date = new Date();
        this.lieuRetrait = lieuRetrait;
        this.prixHT = prixHT;
    }

    public Double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(Double prixHT) {
        this.prixHT = prixHT;
    }

    public Magasin getLieuRetrait() {
        return lieuRetrait;
    }

    public void setLieuRetrait(Magasin lieuRetrait) {
        this.lieuRetrait = lieuRetrait;
    }

    public  Set<Cookie> getCookies() {
        return cookies;
    }

    public void setCookies( Set<Cookie> cookies) {
        this.cookies = cookies;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}