package fr.ffes.ffescore.daos;

import fr.ffes.ffescore.entites.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuDao extends JpaRepository<Menu, Integer> {
}
