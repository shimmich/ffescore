package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.Menu;

public interface MenuService {

    Menu rechercherMenuParUid(Integer uid);

    Menu ajouterMenu(Menu menu);

    Menu modifierMenu(Menu menu);

    void supprimerMenu(Integer uid);

}
