package fr.unice.polytech.se.demo.entities.magasin;

import java.util.List;

/**
 * Created by Garrigos Fernando on 07/04/15.
 */
public interface MagasinFinder {

    public Magasin findByName(String n);

    public List<Magasin> findAll();
}
