package fr.unice.polytech.se.demo.entities.rendezvous;

import fr.unice.polytech.se.demo.entities.magasin.Magasin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Garrigos Fernando on 10/04/15.
 */
@Entity
public class Rendezvous {

    private Magasin m ;

    private Date date;

    private Long id;

    Rendezvous(){
        this(null,null);
    }
    Rendezvous(Magasin m,Date date){
        this.m = m;
        this.date = date;
    }

    public Magasin getM() {
        return m;
    }

    public void setM(Magasin m) {
        this.m = m;
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
    @Override
    public String toString() {
        return "[" + this.id+ "]#" + "Magasin = "+this.getM()+" "+ this.getDate();
    }

}
