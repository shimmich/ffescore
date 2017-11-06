package fr.ffes.ffescore.services;

import fr.ffes.ffescore.daos.ParametreDao;
import fr.ffes.ffescore.entites.Parametre;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ParametreServiceImpl implements ParametreService {

    @Resource
    private ParametreDao parametreDao;

    @Override
    public Parametre rechercherParametreParUid(Integer uid) {
        return parametreDao.findOne(uid);
    }

    @Override
    public Parametre ajouterParametre(Parametre parametre) {
        return parametreDao.save(parametre);
    }

    @Override
    public Parametre modifierParametre(Parametre parametre) {
        return parametreDao.save(parametre);
    }

    @Override
    public void supprimerParametre(Integer uid) {
        parametreDao.delete(uid);
    }
}
