package fr.ffes.ffescore.entites;

import javax.persistence.*;
import java.util.List;

@Entity
public abstract class Offre{

    //**************** ATTRIBUTS *****************//
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer uid;

    @OneToMany
    private List<Parametre> parametres;

    @OneToOne(cascade = CascadeType.ALL)
    private Parametre parametreCourant;

    @OneToMany
    private List<Multimedia> multimedias;

    @ManyToOne
    private Categorie categorie;

    @OneToOne(cascade = CascadeType.ALL)
    private Prix prix;

    @OneToOne(cascade = CascadeType.ALL)
    private Prix prixPromotionnel;

    @ManyToOne
    private Promotion promotion;


    //*************** CONSTRUCTEURS ***************//
    public Offre() {

    }

    //************ GETTERS & SETTERS *************//
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }


}