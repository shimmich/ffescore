package fr.ffes.ffescore.daos;

import fr.ffes.ffescore.entites.Panier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanierDao extends JpaRepository<Panier, Integer> {
}
