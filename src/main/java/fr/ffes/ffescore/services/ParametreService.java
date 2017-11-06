package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.Parametre;

public interface ParametreService {

    Parametre rechercherParametreParUid(Integer uid);

    Parametre ajouterParametre(Parametre parametre);

    Parametre modifierParametre(Parametre parametre);

    void supprimerParametre(Integer uid);
    
}
