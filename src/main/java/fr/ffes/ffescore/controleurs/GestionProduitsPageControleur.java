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
        public String gestionProduitsPage(Model model, @RequestParam(name="numeroPage")Integer numeroPage){
            Produit produit = new Produit();
            produitService.ajouterProduit(produit);
            model.addAttribute("produit", produit);
            return "gestionProduitsPage";
        }

}
