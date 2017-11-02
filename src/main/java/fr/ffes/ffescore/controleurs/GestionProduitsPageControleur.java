package fr.ffes.ffescore.controleurs;

import fr.ffes.ffescore.daos.ProduitDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("/gestionProduitsPage")
public class GestionProduitsPageControleur {

        @Resource
        private ProduitDao produitDao;

        @RequestMapping("/ajouterProduit")
        public String gestionProduitsPage(Model model, @RequestParam(name="numeroPage")Integer numeroPage){
            System.out.println("LOOOOOOOOL");
            String nom = new String("Samir");
            model.addAttribute("nom", nom);
            return "gestionProduitsPage";//appel la page gestionProduitsPage dans le repertoire template depuis l'url /gestionProduits
        }

}
