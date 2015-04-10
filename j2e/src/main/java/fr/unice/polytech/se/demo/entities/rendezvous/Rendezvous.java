package fr.unice.polytech.se.demo.entities.rendezvous;

import fr.unice.polytech.se.demo.entities.magasin.Magasin;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Garrigos Fernando on 10/04/15.
 */
@Entity
public class Rendezvous implements Serializable {

    private static final long serialVersionUID = 1L;

    private String magasin ;

    private String date;

    private Long id;

    Rendezvous(){
        this(null,null);
    }
    Rendezvous(String magasin,String date){
        this.magasin = magasin;
        this.date = date;
    }
    public String getMagasin() {
        return magasin;
    }

    public void setMagasin(String magasin) {
        this.magasin = magasin;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[" + this.getId()+ "]# " + "Magasin = "+this.getMagasin()+" "+ this.getDate();
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Magasin) {
            Rendezvous that = (Rendezvous) o;
            return that.getId().equals(this.getId());
        }
        return false;
    }

}
