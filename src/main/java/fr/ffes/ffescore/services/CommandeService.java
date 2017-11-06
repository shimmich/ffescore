package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.Commande;

public interface CommandeService {

    Commande rechercherCommandeParUid(Integer uid);

    Commande ajouterCommande(Commande commande);

    Commande modifierCommande(Commande commande);

    void supprimerCommande(Integer uid);
    
}
