package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.Entree;

public interface EntreeService {

    Entree rechercherEntreeParUid(Integer uid);

    Entree ajouterEntree(Entree entree);

    Entree modifierEntree(Entree entree);

    void supprimerEntree(Integer uid);
}
