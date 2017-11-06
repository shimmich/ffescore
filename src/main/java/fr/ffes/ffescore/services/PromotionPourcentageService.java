package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.PromotionPourcentage;

public interface PromotionPourcentageService {

    PromotionPourcentage rechercherPromotionPourcentageParUid(Integer uid);

    PromotionPourcentage ajouterPromotionPourcentage(PromotionPourcentage promotionPourcentage);

    PromotionPourcentage modifierPromotionPourcentage(PromotionPourcentage promotionPourcentage);

    void supprimerPromotionPourcentage(Integer uid);
}
