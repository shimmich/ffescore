package fr.ffes.ffescore.services;

import fr.ffes.ffescore.daos.CategorieDao;
import fr.ffes.ffescore.entites.Categorie;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CategorieServiceImpl implements CategorieService {

    @Resource
    private CategorieDao categorieDao;

    @Override
    public Categorie rechercherCategorieParUid(Integer uid) {
        return categorieDao.findOne(uid);
    }

    @Override
    public Categorie ajouterCategorie(Categorie categorie) {
        return categorieDao.save(categorie);
    }

    @Override
    public Categorie modifierCategorie(Categorie categorie) {
        return categorieDao.save(categorie);
    }

    @Override
    public void supprimerCategorie(Integer uid) {
        categorieDao.delete(uid);
    }
}
