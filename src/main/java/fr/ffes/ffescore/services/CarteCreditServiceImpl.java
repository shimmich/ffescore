package fr.ffes.ffescore.services;

import fr.ffes.ffescore.daos.CarteCreditDao;
import fr.ffes.ffescore.entites.CarteCredit;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CarteCreditServiceImpl implements CarteCreditService{

    @Resource
    private CarteCreditDao carteCreditDao;

    public CarteCredit rechercherCarteCreditParUid(Integer uid){
        return carteCreditDao.findOne(uid);
    }

    public CarteCredit ajouterCarteCredit(CarteCredit carteCredit){
        return carteCreditDao.save(carteCredit);
    }

    public CarteCredit modifierCarteCredit(CarteCredit carteCredit){
        return carteCreditDao.save(carteCredit);
    }

    public void supprimerCarteCredit(Integer uid){
        carteCreditDao.delete(uid);
    }

}
