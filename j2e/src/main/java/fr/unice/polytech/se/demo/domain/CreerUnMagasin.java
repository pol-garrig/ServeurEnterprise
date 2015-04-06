package fr.unice.polytech.se.demo.domain;

import fr.unice.polytech.se.demo.entities.Magasin;

import java.util.List;

/**
 * Created by Garrigos Fernando on 06/04/15.
 */
public interface CreerUnMagasin {

    public void  CreerUnMagasin(Magasin mg);

    public List<Magasin> getContents();
}
