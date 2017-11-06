package fr.ffes.ffescore.services;

import fr.ffes.ffescore.daos.ProduitDao;
import fr.ffes.ffescore.entites.Produit;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProduitServiceImpl implements ProduitService {

    @Resource
    private ProduitDao produitDao;

    @Override
    public Produit rechercherProduitParUid(Integer uid) {
        return produitDao.findOne(uid);
    }

    @Override
    public Produit ajouterProduit(Produit produit) {
        return produitDao.save(produit);
    }

    @Override
    public Produit modifierProduit(Produit produit) {
        return produitDao.save(produit);
    }

    @Override
    public void supprimerProduit(Integer uid) {
        produitDao.delete(uid);
    }
}
