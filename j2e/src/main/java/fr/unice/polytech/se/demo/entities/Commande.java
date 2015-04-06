package fr.unice.polytech.se.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Garrigos Fernando on 31/03/15.
 */

@Entity
@Table(name = "COMMANDE")
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private Long prixHT;

    private Magasin lieuRetrait;

    private ArrayList<Cookie> cookies;

    private Date date;

    public  Commande(){

    }

    public Commande(Long prixHT,Magasin lieuRetrait,ArrayList<Cookie> cookies,Date date){
        this.cookies = cookies;
        this.date = date;
        this.lieuRetrait = lieuRetrait;
        this.prixHT = prixHT;
    }

    public Long getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(Long prixHT) {
        this.prixHT = prixHT;
    }

    public Magasin getLieuRetrait() {
        return lieuRetrait;
    }

    public void setLieuRetrait(Magasin lieuRetrait) {
        this.lieuRetrait = lieuRetrait;
    }

    public ArrayList<Cookie> getCookies() {
        return cookies;
    }

    public void setCookies(ArrayList<Cookie> cookies) {
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
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}