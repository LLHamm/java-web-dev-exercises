package com.company.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String name;
    private Date updatedAt = new Date();
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu() {
    }

    public Menu(String aName) {
        this.name = aName;
    }

    public Menu(String aName, ArrayList<MenuItem> menuItemList) {
        this.name = aName;
        this.menuItems = menuItemList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addMenuItem(MenuItem aMenuItem) {
        this.menuItems.add(aMenuItem);
    }
}
