package fr.ffes.ffescore.daos;

import fr.ffes.ffescore.entites.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeDao extends JpaRepository<Commande, Integer> {
}
