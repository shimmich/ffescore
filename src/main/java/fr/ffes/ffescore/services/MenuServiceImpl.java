package fr.ffes.ffescore.services;

import fr.ffes.ffescore.daos.MenuDao;
import fr.ffes.ffescore.entites.Menu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MenuServiceImpl implements MenuService {

    @Resource
    private MenuDao menuDao;

    @Override
    public Menu rechercherMenuParUid(Integer uid) {
        return menuDao.findOne(uid);
    }

    @Override
    public Menu ajouterMenu(Menu menu) {
        return menuDao.save(menu);
    }

    @Override
    public Menu modifierMenu(Menu menu) {
        return menuDao.save(menu);
    }

    @Override
    public void supprimerMenu(Integer uid) {
        menuDao.delete(uid);
    }
}
