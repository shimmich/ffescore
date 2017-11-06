package fr.ffes.ffescore.services;

import fr.ffes.ffescore.daos.ModeLivraisonDao;
import fr.ffes.ffescore.entites.ModeLivraison;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ModeLivraisonServiceImpl implements ModeLivraisonService {

    @Resource
    private ModeLivraisonDao modeLivraisonDao;

    @Override
    public ModeLivraison rechercherModeLivraisonParUid(Integer uid) {
        return modeLivraisonDao.findOne(uid);
    }

    @Override
    public ModeLivraison ajouterModeLivraison(ModeLivraison modeLivraison) {
        return modeLivraisonDao.save(modeLivraison);
    }

    @Override
    public ModeLivraison modifierModeLivraison(ModeLivraison modeLivraison) {
        return modeLivraisonDao.save(modeLivraison);
    }

    @Override
    public void supprimerModeLivraison(Integer uid) {
        modeLivraisonDao.delete(uid);
    }
}
