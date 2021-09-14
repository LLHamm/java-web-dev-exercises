package com.company.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private String name;
    private LocalDate updatedAt = LocalDate.now();
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

    // #3 a way to tell when the menu was last updated
    public void setName(String name) {
        this.name = name;
        this.updateTimeStamp();
    }

    // #3 a way to tell when the menu was last updated
    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.updateTimeStamp();
    }

    // #1 a way to add and remove menu items from the menu
    // #3 a way to tell when the menu was last updated
    public void addMenuItem(MenuItem aMenuItem) {
        this.menuItems.add(aMenuItem);
        this.updateTimeStamp();
    }

    public void removeMenuItem(MenuItem aMenuItem) {
        this.menuItems.add(aMenuItem);
        this.updateTimeStamp();
    }

    // #4 a way to print out both a menu item and an entire menu
    public void  printMenuItem(Integer index) {
        System.out.println(this.menuItems.get(index));
    }

    // #4 a way to print out both a menu item and an entire menu
    public void  printMenu() {
        System.out.println(this.name);
        System.out.println(this.updatedAt);
        for (MenuItem item : this.menuItems) {
            System.out.println(item);
        }
    }

    private void updateTimeStamp() {
        this.updatedAt = LocalDate.now();
    }
}
