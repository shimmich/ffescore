package fr.ffes.ffescore.entites;

import javax.persistence.*;
import java.util.List;

@Entity
public abstract class Promotion {

    //**************** ATTRIBUTS *****************//
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer uid;

    @OneToOne(cascade = CascadeType.ALL)
    private Multimedia multimedia;

    @OneToMany(mappedBy = "promotion")
    private List<Demande> demandes;

    @OneToMany(mappedBy = "promotion")
    private List<Offre> offres;

    @OneToMany(mappedBy = "promotion")
    private List<Categorie> categories;

    //*************** CONSTRUCTEURS ***************//
    public Promotion() {

    }

    //************ GETTERS & SETTERS *************//
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

}
