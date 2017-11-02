package fr.ffes.ffescore.entites;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class PromotionFixe extends Promotion {

    //**************** ATTRIBUTS *****************//
    @OneToOne(cascade = CascadeType.ALL)
    private Prix prix;

    //*************** CONSTRUCTEURS ***************//


    //************ GETTERS & SETTERS *************//

}
