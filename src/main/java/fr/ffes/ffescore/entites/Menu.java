package fr.ffes.ffescore.entites;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Menu extends Offre{

    //**************** ATTRIBUTS *****************//
    @OneToMany
    private List<Offre> offres;

    //*************** CONSTRUCTEURS ***************//


    //************ GETTERS & SETTERS *************//


}
