package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.Categorie;

public interface CategorieService {

    Categorie rechercherCategorieParUid(Integer uid);

    Categorie ajouterCategorie(Categorie categorie);

    Categorie modifierCategorie(Categorie categorie);

    void supprimerCategorie(Integer uid);

}
