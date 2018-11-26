package com.szhw.webproj.controller;

import com.szhw.webproj.common.GlobalConstant;
import com.szhw.webproj.common.RESTResult;
import com.szhw.webproj.persistent.menu.Menu;
import com.szhw.webproj.persistent.menu.MenuRepository;
import com.szhw.webproj.persistent.menu.MainMenu;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author HJF
 * @date 2018/11/23 18:47
 */
@RequestMapping(value = "/menu", method = {RequestMethod.POST, RequestMethod.GET})
@RestController
public class MenuController implements GlobalConstant {
    @Resource
    MenuRepository menuRepository;

    @GetMapping("/get")
    public List<MainMenu> getMenu() {
        List<Menu> resultMenuList = menuRepository.findAll();
        //所有子菜单
        HashMap<Integer, List<Menu>> childrenMap = new HashMap<>(10);
        //所有主菜单
        List<MainMenu> mainMenuList = new ArrayList<>(10);

        for (Menu menu : resultMenuList) {
            if (menu.getFatherId() == MENU_FATHER_ID) {
                MainMenu mainMenu = new MainMenu();
                BeanUtils.copyProperties(menu, mainMenu);
                mainMenuList.add(mainMenu);
            } else {
                if (!childrenMap.containsKey(menu.getFatherId())) {
                    childrenMap.put(menu.getFatherId(), new ArrayList<>(10));
                }
                childrenMap.get(menu.getFatherId()).add(menu);
            }
        }
        for (MainMenu mainMenu : mainMenuList) {
            mainMenu.setChildren(childrenMap.get(mainMenu.getId()));
        }
        return mainMenuList;
    }

    @PostMapping("/add")
    public RESTResult addMenu(Menu menu) {
        RESTResult result = new RESTResult();
        menuRepository.saveAndFlush(menu);
        return result;
    }

    @PostMapping("/delete")
    public RESTResult deleteMenu(Integer id) {
        RESTResult result = new RESTResult();
        menuRepository.deleteById(id);
        return result;
    }
}
