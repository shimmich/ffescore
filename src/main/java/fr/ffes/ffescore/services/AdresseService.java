package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.Adresse;

public interface AdresseService {

    Adresse rechercherAdresseParUid(Integer uid);

    Adresse ajouterAdresse(Adresse adresse);

    Adresse modifierAdresse(Adresse adresse);

    void supprimerAdresse(Integer uid);

}
