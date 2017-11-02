package fr.ffes.ffescore.daos;

import fr.ffes.ffescore.entites.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseDao extends JpaRepository<Adresse, Integer> {
}
