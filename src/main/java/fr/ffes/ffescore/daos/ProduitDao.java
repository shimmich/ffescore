package fr.ffes.ffescore.daos;

import fr.ffes.ffescore.entites.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProduitDao extends JpaRepository<Produit, Integer> {

    //Spring Data va automatiquement comprendre que cette méthode fait un
    //SELECT Produit WHERE Nom = nom
    List<Produit> findByUid(String uid);


    @Query("SELECT p FROM Produit AS p WHERE p.uid = :uid ")
    List<Produit> rechercheAvancer(@Param("uid")Integer id);

}
