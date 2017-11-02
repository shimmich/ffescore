package fr.ffes.ffescore.daos;

import fr.ffes.ffescore.entites.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultimediaDao extends JpaRepository<Multimedia, Integer> {
}
