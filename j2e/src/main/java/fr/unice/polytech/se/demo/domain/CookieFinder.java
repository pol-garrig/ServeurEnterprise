package fr.unice.polytech.se.demo.domain;

import fr.unice.polytech.se.demo.entities.Cookie;
import fr.unice.polytech.se.demo.entities.Pet;

/**
 * Created by Garrigos Fernando on 06/04/15.
 */
public interface CookieFinder {

    public Cookie findByName(String n);
}
