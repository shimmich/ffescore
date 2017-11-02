package fr.ffes.ffescore.entites;

import javax.persistence.*;

@Entity
public class ModeLivraison {

    //**************** ATTRIBUTS *****************//
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer uid;

    @OneToOne(cascade = CascadeType.ALL)
    private Prix frais;

    //*************** CONSTRUCTEURS ***************//
    public ModeLivraison() {

    }

    //************ GETTERS & SETTERS *************//
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

}
