package fr.unice.polytech.se.demo.entities.magasin;

import fr.unice.polytech.se.demo.entities.commande.Commande;
import fr.unice.polytech.se.demo.entities.cookie.Cookie;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Fernando Garrigos on 30/03/15.
 */
@Entity
public class Magasin implements Serializable {


        private static final long serialVersionUID = 1L;

        private Long id;

        private Long tax;

        private Cookie todaySpecial;

        private List<Commande> listCommande;

        private String name;

        public Magasin(){
            this("",null,null,0);
        }

        public Magasin(String n, Cookie c, List<Commande> l, long tax) {
            this.name = n;
            this.tax = tax;
            this.todaySpecial = c;
            this.listCommande = l;            ;
        }

        @Override
        public String toString() {
            return "[" + this.id + "]#" + this.name + this.tax + this.todaySpecial + this.listCommande;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        public Long getId() {
            return id;
        }

        @Column(name = "MAGASIN_NAME")
        @NotNull
        public String getName() {
            return name;
        }

        public long getTax(){
            return tax;
        }
        public Cookie getTodaySpecial(){
            return todaySpecial;
        }

        public List<Commande> getListCommande(){
            return listCommande;
        }

        public boolean equals(Object o) {
            if (o instanceof Magasin) {
                Magasin that = (Magasin) o;
                return that.name.equals(this.name);
            }
            return false;
        }


        public void setId(Long id) {
            this.id = id;
        }

        public void setTax(Long t) {
        this.tax = t;
    }

        public void setName(String name) {
            this.name = name;
        }

        public void setListCommande(List<Commande> l){
            this.listCommande = l;
        }

        public void setTodaySpecial(Cookie c){
            this.todaySpecial = c;
        }

}
