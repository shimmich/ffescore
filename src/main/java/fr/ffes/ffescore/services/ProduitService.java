package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.Produit;
import org.springframework.stereotype.Service;

public interface ProduitService {

    Produit rechercherProduitParUid(Integer uid);

    Produit ajouterProduit(Produit produit);

    Produit modifierProduit(Produit produit);

    void supprimerProduit(Integer uid);

}
