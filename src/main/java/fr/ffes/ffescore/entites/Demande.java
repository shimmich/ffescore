package fr.ffes.ffescore.entites;

import javax.persistence.*;
import java.util.Map;

@Entity
public abstract class Demande {

    //**************** ATTRIBUTS *****************//
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer uid;

    @OneToOne
    private MoyenPaiement moyenPaiement;

    @OneToOne
    private ModeLivraison modeLivraison;

    @OneToMany(cascade = CascadeType.ALL)
    private Map<Integer, Entree> entrees;

    @OneToOne(cascade = CascadeType.ALL)
    private Prix prixTotal;

    @OneToOne(cascade = CascadeType.ALL)
    private Prix prixFinal;

    @OneToOne(cascade = CascadeType.ALL)
    private PointFidelite pointFidelite;

    @ManyToOne
    private Promotion promotion;

    //*************** CONSTRUCTEURS ***************//
    public Demande() {

    }

    //************ GETTERS & SETTERS *************//
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
