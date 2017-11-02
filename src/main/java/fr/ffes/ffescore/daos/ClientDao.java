package fr.ffes.ffescore.daos;

import fr.ffes.ffescore.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client, Integer> {
}
