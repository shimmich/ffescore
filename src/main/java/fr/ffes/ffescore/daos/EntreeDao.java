package fr.ffes.ffescore.daos;

import fr.ffes.ffescore.entites.Entree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntreeDao extends JpaRepository<Entree, Integer> {
}
