package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.Client;

public interface ClientService {

    Client rechercherClientParUid(Integer uid);

    Client ajouterClient(Client client);

    Client modifierClient(Client client);

    void supprimerClient(Integer uid);
    
}
