package com.es2.composite;

import java.util.ArrayList;
import java.util.List;

public class SubMenu extends Menu {
    List<Menu> subMenus = new ArrayList<>();

    public void addChild(Menu child){
        this.subMenus.add(child);
    }

    public void removeChild(Menu child){
        this.subMenus.remove(child);
    }

    @Override
    public void showOptions() {
        System.out.println(this.getLabel());
        this.subMenus.forEach(Menu::showOptions);
    }
}
