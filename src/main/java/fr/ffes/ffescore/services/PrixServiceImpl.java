package fr.ffes.ffescore.services;

import fr.ffes.ffescore.daos.PrixDao;
import fr.ffes.ffescore.entites.Prix;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PrixServiceImpl implements PrixService {

    @Resource
    private PrixDao prixDao;

    @Override
    public Prix rechercherPrixParUid(Integer uid) {
        return prixDao.findOne(uid);
    }

    @Override
    public Prix ajouterPrix(Prix prix) {
        return prixDao.save(prix);
    }

    @Override
    public Prix modifierPrix(Prix prix) {
        return prixDao.save(prix);
    }

    @Override
    public void supprimerPrix(Integer uid) {
        prixDao.delete(uid);
    }
}
