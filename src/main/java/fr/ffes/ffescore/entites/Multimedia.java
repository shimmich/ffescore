package fr.ffes.ffescore.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Multimedia {

    //**************** ATTRIBUTS *****************//
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer uid;

    //*************** CONSTRUCTEURS ***************//
    public Multimedia() {

    }

    //************ GETTERS & SETTERS *************//
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}