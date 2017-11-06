package fr.ffes.ffescore.services;

import fr.ffes.ffescore.daos.MultimediaDao;
import fr.ffes.ffescore.entites.Multimedia;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MultimediaServiceImpl implements MultimediaService {

    @Resource
    private MultimediaDao multimediaDao;

    @Override
    public Multimedia rechercherMultimediaParUid(Integer uid) {
        return multimediaDao.findOne(uid);
    }

    @Override
    public Multimedia ajouterMultimedia(Multimedia multimedia) {
        return multimediaDao.save(multimedia);
    }

    @Override
    public Multimedia modifierMultimedia(Multimedia multimedia) {
        return multimediaDao.save(multimedia);
    }

    @Override
    public void supprimerMultimedia(Integer uid) {
        multimediaDao.delete(uid);
    }
}
