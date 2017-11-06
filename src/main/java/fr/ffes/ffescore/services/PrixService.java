package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.Prix;

public interface PrixService {

    Prix rechercherPrixParUid(Integer uid);

    Prix ajouterPrix(Prix prix);

    Prix modifierPrix(Prix prix);

    void supprimerPrix(Integer uid);
    
}
