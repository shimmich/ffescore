package fr.ffes.ffescore.services;

import fr.ffes.ffescore.daos.ClientDao;
import fr.ffes.ffescore.entites.Client;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ClientServiceImpl implements ClientService {

    @Resource
    private ClientDao clientDao;

    @Override
    public Client rechercherClientParUid(Integer uid) {
        return clientDao.findOne(uid);
    }

    @Override
    public Client ajouterClient(Client client) {
        return clientDao.save(client);
    }

    @Override
    public Client modifierClient(Client client) {
        return clientDao.save(client);
    }

    @Override
    public void supprimerClient(Integer uid) {
        clientDao.delete(uid);
    }
}
