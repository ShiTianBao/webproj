package com.szhw.webproj.controller;

import com.szhw.webproj.common.CommonResult;
import com.szhw.webproj.common.GlobalConstant;
import com.szhw.webproj.persistent.entity.to.MainMenu;
import com.szhw.webproj.persistent.entity.Menu;
import com.szhw.webproj.persistent.repository.MenuRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author HJF
 * @date 2018/11/23 18:47
 */
@RestController
@RequestMapping(value = "/menu", method = {RequestMethod.POST, RequestMethod.GET})
public class MenuController implements GlobalConstant {
    @Resource
    MenuRepository menuRepository;

    @GetMapping
    public ModelAndView menu() {
        return new ModelAndView("/mgr-item/menu-list");
    }

    /**
     * 获取全部菜单项，子菜单作为父菜单的Children
     */
    @GetMapping("/get")
    @ResponseBody
    public List<MainMenu> getMenu() {
        List<Menu> resultMenuList = menuRepository.findAll();
        //所有子菜单
        HashMap<Integer, List<Menu>> childrenMap = new HashMap<>(10);
        //所有主菜单
        List<MainMenu> mainMenuList = new ArrayList<>(10);

        for (Menu menu : resultMenuList) {
            if (menu.getFatherId() == ID_MENU_FATHER) {
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

    @GetMapping("/list")
    public CommonResult listMenu() {
        CommonResult result = new CommonResult();
        result.setData(menuRepository.findAll());
        return result;
    }

    @PostMapping("/add")
    @ResponseBody
    public CommonResult addMenu(Menu menu) {
        CommonResult result = new CommonResult();
        menuRepository.saveAndFlush(menu);
        return result;
    }

    @GetMapping("/delete")
    @ResponseBody
    public CommonResult deleteMenu(Integer id) {
        CommonResult result = new CommonResult();
        if (null == id) {
            result.setCode(CODE_PARAM_MISS);
            result.setMessage("参数缺失");
            return result;
        }
        menuRepository.deleteById(id);
        return result;
    }

    @PostMapping("/modify")
    public CommonResult modifyMenu(Menu menu){
        return addMenu(menu);
    }
}
