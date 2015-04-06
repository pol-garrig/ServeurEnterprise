package fr.unice.polytech.se.demo.domain.impl;

import fr.unice.polytech.se.demo.domain.CreerUnMagasin;
import fr.unice.polytech.se.demo.entities.Magasin;

import javax.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Garrigos Fernando on 06/04/15.
 */
@Stateful
public class CreerUnMagasinBean implements CreerUnMagasin {


    private ArrayList<Magasin> _contents = new ArrayList<Magasin>();

    @Override
    public void creerUnMagasin(Magasin mg) {
        _contents.add(mg);
    }

    @Override
    public List<Magasin> getContents(){
        return _contents;
    }
}
