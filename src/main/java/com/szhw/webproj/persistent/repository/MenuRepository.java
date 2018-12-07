package com.szhw.webproj.persistent.repository;

import com.szhw.webproj.persistent.entity.to.MainMenu;
import com.szhw.webproj.persistent.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 表示每一个菜单项，如果这个菜单是主菜单就变成{@link MainMenu};
 * @author HJF
 * @date 2018/11/23 18:50
 */
public interface MenuRepository extends JpaRepository<Menu,Integer> {
}
