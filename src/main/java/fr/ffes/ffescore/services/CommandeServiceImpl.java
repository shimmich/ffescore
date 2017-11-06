package fr.ffes.ffescore.services;

import fr.ffes.ffescore.daos.CommandeDao;
import fr.ffes.ffescore.entites.Commande;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CommandeServiceImpl implements CommandeService {

    @Resource
    private CommandeDao commandeDao;

    @Override
    public Commande rechercherCommandeParUid(Integer uid) {
        return commandeDao.findOne(uid);
    }

    @Override
    public Commande ajouterCommande(Commande commande) {
        return commandeDao.save(commande);
    }

    @Override
    public Commande modifierCommande(Commande commande) {
        return commandeDao.save(commande);
    }

    @Override
    public void supprimerCommande(Integer uid) {
        commandeDao.delete(uid);
    }
}
