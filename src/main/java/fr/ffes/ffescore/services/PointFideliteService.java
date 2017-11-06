package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.PointFidelite;

public interface PointFideliteService {

    PointFidelite rechercherPointFideliteParUid(Integer uid);

    PointFidelite ajouterPointFidelite(PointFidelite pointFidelite);

    PointFidelite modifierPointFidelite(PointFidelite pointFidelite);

    void supprimerPointFidelite(Integer uid);
    
}
