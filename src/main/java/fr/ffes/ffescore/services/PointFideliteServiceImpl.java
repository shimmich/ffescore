package fr.ffes.ffescore.services;

import fr.ffes.ffescore.daos.PointFideliteDao;
import fr.ffes.ffescore.entites.PointFidelite;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PointFideliteServiceImpl implements PointFideliteService {

    @Resource
    private PointFideliteDao pointFideliteDao;

    @Override
    public PointFidelite rechercherPointFideliteParUid(Integer uid) {
        return pointFideliteDao.findOne(uid);
    }

    @Override
    public PointFidelite ajouterPointFidelite(PointFidelite pointFidelite) {
        return pointFideliteDao.save(pointFidelite);
    }

    @Override
    public PointFidelite modifierPointFidelite(PointFidelite pointFidelite) {
        return pointFideliteDao.save(pointFidelite);
    }

    @Override
    public void supprimerPointFidelite(Integer uid) {
        pointFideliteDao.delete(uid);
    }
}
