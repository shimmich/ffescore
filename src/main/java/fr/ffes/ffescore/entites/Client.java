package fr.ffes.ffescore.entites;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {

    //**************** ATTRIBUTS *****************//
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer uid;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CarteCredit> cartesCredit;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Adresse> adresses;

    @OneToOne(cascade = CascadeType.ALL)
    private Panier panierCourant;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Commande> commandes;

    @OneToMany(cascade = CascadeType.ALL)
    private List<PointFidelite> pointsFidelite;


    //*************** CONSTRUCTEURS ***************//
    public Client() {

    }

    //************ GETTERS & SETTERS *************//
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
