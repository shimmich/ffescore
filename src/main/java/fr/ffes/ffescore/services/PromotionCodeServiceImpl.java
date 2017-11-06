package fr.ffes.ffescore.services;

import fr.ffes.ffescore.daos.PromotionCodeDao;
import fr.ffes.ffescore.entites.PromotionCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PromotionCodeServiceImpl implements PromotionCodeService {

    @Resource
    private PromotionCodeDao promotionCodeDao;

    @Override
    public PromotionCode rechercherPromotionCodeParUid(Integer uid) {
        return promotionCodeDao.findOne(uid);
    }

    @Override
    public PromotionCode ajouterPromotionCode(PromotionCode promotionCode) {
        return promotionCodeDao.save(promotionCode);
    }

    @Override
    public PromotionCode modifierPromotionCode(PromotionCode promotionCode) {
        return promotionCodeDao.save(promotionCode);
    }

    @Override
    public void supprimerPromotionCode(Integer uid) {
        promotionCodeDao.delete(uid);
    }
}
