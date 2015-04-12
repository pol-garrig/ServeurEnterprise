package fr.unice.polytech.se.demo.entities.commande;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Garrigos Fernando on 31/03/15.
 */

@Entity
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Double prixHT;

    private String rendezvous;

    private String cookies;

    public  Commande(){
        this(0.0,null,null);
    }

    public Commande(Double prixHT,String rendezvous,String cookies){
        super();
        this.prixHT = prixHT;
        this.rendezvous = rendezvous;
        this.cookies = cookies;
    }

    @Override
    public String toString() {
        return "[" + this.getId() + "]#" + this.getRendezvous() + this.getCookies() ;
    }

    public Double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(Double prixHT) {
        this.prixHT = prixHT;
    }

    public String getRendezvous() {
        return rendezvous;
    }

    public void setRendezvous(String rendezvous) {
        this.rendezvous = rendezvous;
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