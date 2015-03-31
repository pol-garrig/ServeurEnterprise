package fr.unice.polytech.se.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Garrigos Fernando on 31/03/15.
 */
@Entity
@Table(name = "COOKIE")
public class Cookie  implements Serializable  {

        private static final long serialVersionUID = 1L;

        public Long id;

        public Long prixHT;

        public Cookie todaySpecial;

        public List<Commande> listCommande;

        public String name;

        public Magasin() {
        }

        public Magasin(String n) {
            this.name = n;
        }

        public String toString() {
            return "Pet[" + this.id + "]#" + this.name;
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


}
