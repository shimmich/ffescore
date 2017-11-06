package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.Multimedia;

public interface MultimediaService {

    Multimedia rechercherMultimediaParUid(Integer uid);

    Multimedia ajouterMultimedia(Multimedia multimedia);

    Multimedia modifierMultimedia(Multimedia multimedia);

    void supprimerMultimedia(Integer uid);
    
}
