package fr.ffes.ffescore.services;

import fr.ffes.ffescore.daos.AdresseDao;
import fr.ffes.ffescore.entites.Adresse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdresseServiceImpl implements AdresseService{

    @Resource
    private AdresseDao adresseDao;

    public Adresse rechercherAdresseParUid(Integer uid){
        return adresseDao.findOne(uid);
    }

    public Adresse ajouterAdresse(Adresse adresse){
        return adresseDao.save(adresse);
    }

    public Adresse modifierAdresse(Adresse adresse){
        return adresseDao.save(adresse);
    }

    public void supprimerAdresse(Integer uid){
        adresseDao.delete(uid);
    }
}
