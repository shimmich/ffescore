package fr.ffes.ffescore.services;

import fr.ffes.ffescore.daos.PromotionPourcentageDao;
import fr.ffes.ffescore.entites.PromotionPourcentage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PromotionPourcentageServiceImpl implements PromotionPourcentageService {

    @Resource
    private PromotionPourcentageDao promotionPourcentageDao;

    @Override
    public PromotionPourcentage rechercherPromotionPourcentageParUid(Integer uid) {
        return promotionPourcentageDao.findOne(uid);
    }

    @Override
    public PromotionPourcentage ajouterPromotionPourcentage(PromotionPourcentage promotionPourcentage) {
        return promotionPourcentageDao.save(promotionPourcentage);
    }

    @Override
    public PromotionPourcentage modifierPromotionPourcentage(PromotionPourcentage promotionPourcentage) {
        return promotionPourcentageDao.save(promotionPourcentage);
    }

    @Override
    public void supprimerPromotionPourcentage(Integer uid) {
        promotionPourcentageDao.delete(uid);
    }
}
