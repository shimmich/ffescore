package fr.ffes.ffescore.daos;

import fr.ffes.ffescore.entites.Prix;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrixDao extends JpaRepository<Prix, Integer> {
}
