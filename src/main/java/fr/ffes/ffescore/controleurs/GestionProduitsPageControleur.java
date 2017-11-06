package fr.ffes.ffescore.controleurs;

import fr.ffes.ffescore.daos.ProduitDao;
import fr.ffes.ffescore.entites.Produit;
import fr.ffes.ffescore.services.ProduitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("/gestionProduits")
public class GestionProduitsPageControleur {

    @Resource
    private ProduitService produitService;

    @RequestMapping("/ajouterProduit")
    public String ajouterProduit(Model model, @RequestParam(name="titre")String titre){
        Produit produit = new Produit();
        produitService.ajouterProduit(produit);
        return "gestionProduitsPage";
    }

    @RequestMapping("/modifierProduit")
    public String modifierProduit(Model model, @RequestParam(name="uid")Integer uid, @RequestParam(name="titre")String titre){
        Produit produit = produitService.rechercherProduitParUid(uid);
        produitService.modifierProduit(produit);
        return "gestionProduitsPage";
    }

    @RequestMapping("/supprimerProduit")
    public String supprimerProduit(Model model, @RequestParam(name="uid")Integer uid){
        produitService.supprimerProduit(uid);
        return "gestionProduitsPage";
    }

    @RequestMapping("/rechercherProduit")
    public String rechercherProduit(Model model, @RequestParam(name="uid")Integer uid){
        Produit produit = produitService.rechercherProduitParUid(uid);
        model.addAttribute("produit", produit);
        return "gestionProduitsPage";
    }

}
