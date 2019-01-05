package com.hll.pojo;

import java.util.List;

/**
 * 左侧菜单
 * @author 何龙
 * @create 2018-12-16 22:28
 */
public class Menu {
    /**
     * 父级菜单
     */
    private AMenu aMenu;
    /**
     * 父级下的子菜单
     */
    private List<SecondaryMenu> bMenu;

    public AMenu getaMenu() {
        return aMenu;
    }

    public void setaMenu(AMenu aMenu) {
        this.aMenu = aMenu;
    }

    public List<SecondaryMenu> getbMenu() {
        return bMenu;
    }

    public void setbMenu(List<SecondaryMenu> bMenu) {
        this.bMenu = bMenu;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "aMenu=" + aMenu +
                ", bMenu=" + bMenu +
                '}';
    }
}
