package fr.ffes.ffescore.services;

import fr.ffes.ffescore.daos.EntreeDao;
import fr.ffes.ffescore.entites.Entree;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EntreeServiceImpl implements EntreeService {

    @Resource
    private EntreeDao entreeDao;

    @Override
    public Entree rechercherEntreeParUid(Integer uid) {
        return entreeDao.findOne(uid);
    }

    @Override
    public Entree ajouterEntree(Entree entree) {
        return entreeDao.save(entree);
    }

    @Override
    public Entree modifierEntree(Entree entree) {
        return entreeDao.save(entree);
    }

    @Override
    public void supprimerEntree(Integer uid) {
        entreeDao.delete(uid);
    }
}
