package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.ModeLivraison;

public interface ModeLivraisonService {

    ModeLivraison rechercherModeLivraisonParUid(Integer uid);

    ModeLivraison ajouterModeLivraison(ModeLivraison modeLivraison);

    ModeLivraison modifierModeLivraison(ModeLivraison modeLivraison);

    void supprimerModeLivraison(Integer uid);
    
}
