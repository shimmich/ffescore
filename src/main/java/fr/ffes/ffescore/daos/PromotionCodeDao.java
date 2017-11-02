package fr.ffes.ffescore.daos;

import fr.ffes.ffescore.entites.PromotionCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionCodeDao extends JpaRepository<PromotionCode, Integer> {
}
