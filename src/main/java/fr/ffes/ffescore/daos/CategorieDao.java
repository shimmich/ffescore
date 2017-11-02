package fr.ffes.ffescore.daos;

import fr.ffes.ffescore.entites.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieDao extends JpaRepository<Categorie, Integer> {
}
