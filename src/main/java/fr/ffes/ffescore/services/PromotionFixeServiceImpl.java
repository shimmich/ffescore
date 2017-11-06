package fr.ffes.ffescore.services;


import fr.ffes.ffescore.daos.PromotionFixeDao;
import fr.ffes.ffescore.entites.PromotionFixe;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PromotionFixeServiceImpl implements PromotionFixeService {

    @Resource
    private PromotionFixeDao promotionFixeDao;

    @Override
    public PromotionFixe rechercherPromotionFixeParUid(Integer uid) {
        return promotionFixeDao.findOne(uid);
    }

    @Override
    public PromotionFixe ajouterPromotionFixe(PromotionFixe promotionFixe) {
        return promotionFixeDao.save(promotionFixe);
    }

    @Override
    public PromotionFixe modifierPromotionFixe(PromotionFixe promotionFixe) {
        return promotionFixeDao.save(promotionFixe);
    }

    @Override
    public void supprimerPromotionFixe(Integer uid) {
        promotionFixeDao.delete(uid);
    }
}
