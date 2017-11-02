package fr.ffes.ffescore.entites;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Livrer extends ModeLivraison {

    //**************** ATTRIBUTS *****************//
    @OneToOne
    private Adresse adresse;

    //*************** CONSTRUCTEURS ***************//
    public Livrer() {

    }

    //************ GETTERS & SETTERS *************//


}
