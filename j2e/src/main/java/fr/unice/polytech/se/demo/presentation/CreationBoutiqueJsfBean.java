package fr.unice.polytech.se.demo.presentation;

import fr.unice.polytech.se.demo.entities.commande.Commande;
import fr.unice.polytech.se.demo.entities.cookie.Cookie;
import fr.unice.polytech.se.demo.entities.magasin.Magasin;
import fr.unice.polytech.se.demo.entities.magasin.MagasinFinder;
import fr.unice.polytech.se.demo.entities.magasin.MagasinManager;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Garrigos Fernando on 08/04/15.
 */
@ManagedBean
public class CreationBoutiqueJsfBean  implements Serializable {

        private static final int PAGINATION_QUANTITY = 5;

        @EJB
        private MagasinFinder magasinFinder;

        @EJB
        private MagasinManager magasinManager;

        private Long tax;

        private Cookie todaySpecial;

        private List<Commande> listCommande;

        private String name;

        private String errorMessage;

        private int paginationStartIndex = 0;

        public String add() {
           //     magasinManager.creerUnMagasin(name,todaySpecial,listCommande,tax);

                return "success";
        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public int getPaginationStartIndex() {
            return paginationStartIndex;
        }

        public int getNextPaginationIndex() {
            return paginationStartIndex + PAGINATION_QUANTITY;
        }

        public int getPreviousPaginationIndex() {
            return Math.max(0, paginationStartIndex - PAGINATION_QUANTITY);
        }

        public Long getTax() {
            return tax;
        }

        public void setTax(Long tax) {
            this.tax = tax;
        }

        public Cookie getTodaySpecial() {
            return todaySpecial;
        }

        public void setTodaySpecial(Cookie todaySpecial) {
            this.todaySpecial = todaySpecial;
        }

        public List<Commande> getListCommande() {
            return listCommande;
        }

        public void setListCommande(List<Commande> listCommande) {
            this.listCommande = listCommande;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Magasin> getMagasin() {
                Map<String, String> parameters = FacesContext.getCurrentInstance()
                        .getExternalContext().getRequestParameterMap();

            int startIndex = -1;

            try {
                startIndex = Integer.parseInt(parameters.get("start"));
            } catch (NumberFormatException e) {
            }

            if (startIndex > -1) {
                paginationStartIndex = startIndex;
            }

            return magasinFinder.findAll();
        }
}

