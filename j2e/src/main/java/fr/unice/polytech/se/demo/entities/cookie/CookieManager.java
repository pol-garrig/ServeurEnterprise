package fr.unice.polytech.se.demo.entities.cookie;

import java.util.List;

/**
 * Created by Garrigos Fernando on 07/04/15.
 */
public interface CookieManager {

    public Cookie creerUnCookie(String name, Double prixHT, Integer quantite);

    public Cookie creerUnCookie(Cookie c);

    public List<Cookie> getContents();
}
