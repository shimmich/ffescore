package fr.ffes.ffescore.entites;

import javax.persistence.*;

@Entity
public class Entree {

    //**************** ATTRIBUTS *****************//
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer uid;

    @OneToOne(cascade = CascadeType.ALL)
    private Prix prix;

    @OneToOne(cascade = CascadeType.ALL)
    private Offre offre;

    //*************** CONSTRUCTEURS ***************//
    public Entree() {

    }

    //************ GETTERS & SETTERS *************//
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

}
