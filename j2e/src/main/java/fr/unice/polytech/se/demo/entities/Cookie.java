package fr.unice.polytech.se.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Garrigos Fernando on 31/03/15.
 */

@Entity
public class Cookie  implements Serializable  {

        private static final long serialVersionUID = 1L;

        private Long id;

        private double prixHT;

        private int quantite;

        private String name;

        public Cookie() {
        this("", 0, 0);
        }



        public Cookie(String n, double prixHT, int quantite) {
            this.name = n;
            this.prixHT = prixHT;
            this.quantite = quantite;
        }




        public String toString() {
            return "Pet[" + this.id + "]#" + this.name;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        public Long getId() {
            return id;
        }

        @NotNull
        public String getName() {
            return name;
        }

        public boolean equals(Object o) {
            if (o instanceof Cookie) {
                Cookie that = (Cookie) o;
                return that.name.equals(this.name);
            }
            return false;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static long getSerialVersionUID() {
            return serialVersionUID;
        }

        public double getPrixHT() {
            return prixHT;
        }

        public void setPrixHT(double prixHT) {
            this.prixHT = prixHT;
        }

        public int getQuantite() {
            return quantite;
        }

        public void setQuantite(int quantite) {
            this.quantite = quantite;
        }


}
