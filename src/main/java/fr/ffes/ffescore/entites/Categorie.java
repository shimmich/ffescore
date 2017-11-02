package fr.ffes.ffescore.entites;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categorie{

    //**************** ATTRIBUTS *****************//
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer uid;

    @OneToMany(mappedBy = "categorie")
    private List<Offre> offres;

    @ManyToOne
    private Categorie categorieParent;

    @OneToMany(mappedBy = "categorieParent")
    private List<Categorie> categoriesEnfant;

    @ManyToOne
    private Promotion promotion;

    //*************** CONSTRUCTEURS ***************//
    public Categorie() {

    }

    //************ GETTERS & SETTERS *************//
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
