package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.PromotionCode;

public interface PromotionCodeService {

    PromotionCode rechercherPromotionCodeParUid(Integer uid);

    PromotionCode ajouterPromotionCode(PromotionCode promotionCode);

    PromotionCode modifierPromotionCode(PromotionCode promotionCode);

    void supprimerPromotionCode(Integer uid);
    
}
