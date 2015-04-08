package fr.unice.polytech.se.demo.entities.cookie;

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

        private Double prixHT;

        private Integer quantite;

        private String name;

        public Cookie() {
        this("", 0.0, 0);
        }

        public Cookie(String n, Double prixHT, Integer quantite) {
            super();
            this.name = n;
            this.prixHT = prixHT;
            this.quantite = quantite;
        }


        @Override
        public String toString() {
            return "[" + this.getId() + "]#" + this.getName();
        }

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        public Long getId() {
            return id;
        }

        @Column(name = "COOKIE_NAME")
        @NotNull
        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof Cookie) {
                Cookie that = (Cookie) o;
                return that.getName().equals(this.getName());
            }
            return false;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrixHT() {
            return prixHT;
        }

        public void setPrixHT(Double prixHT) {
            this.prixHT = prixHT;
        }

        public Integer getQuantite() {
            return quantite;
        }

        public void setQuantite(Integer quantite) {
            this.quantite = quantite;
        }


}
