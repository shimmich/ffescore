package fr.ffes.ffescore.daos;

import fr.ffes.ffescore.entites.CarteCredit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteCreditDao extends JpaRepository<CarteCredit, Integer> {
}
