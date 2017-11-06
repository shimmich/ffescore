package fr.ffes.ffescore.services;

import fr.ffes.ffescore.entites.PromotionFixe;

public interface PromotionFixeService {

    PromotionFixe rechercherPromotionFixeParUid(Integer uid);

    PromotionFixe ajouterPromotionFixe(PromotionFixe promotionFixe);

    PromotionFixe modifierPromotionFixe(PromotionFixe promotionFixe);

    void supprimerPromotionFixe(Integer uid);
    
}
