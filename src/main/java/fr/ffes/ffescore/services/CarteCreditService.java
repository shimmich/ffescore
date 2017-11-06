package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.CarteCredit;

public interface CarteCreditService {

    CarteCredit rechercherCarteCreditParUid(Integer uid);

    CarteCredit ajouterCarteCredit(CarteCredit carteCredit);

    CarteCredit modifierCarteCredit(CarteCredit carteCredit);

    void supprimerCarteCredit(Integer uid);

}
