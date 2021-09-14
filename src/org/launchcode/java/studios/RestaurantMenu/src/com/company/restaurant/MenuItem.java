package com.company.restaurant;

import java.time.LocalDate;
import java.time.Period;

public class MenuItem {
    private String category;
    private String name;
    private Double price;
    private String description;
    private Boolean isNew;
    private LocalDate updatedOn = LocalDate.now();

    public MenuItem() {
    }

    public MenuItem(String aCategory, String aName, Double aPrice, String aDescription) {
        this.category = aCategory;
        this.name = aName;
        this.price = aPrice;
        this.description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getUpdatedOn() {
        return updatedOn;
    }

    // #2 a way to tell if a menu item is "new", or created within the last 3 days.
    public boolean isMenuItemNew() {
        Period period = Period.between(LocalDate.now(), this.updatedOn);
        return period.getDays() < 3;
    }

    // #4 a way to print out both a menu item and an entire menu
    // This assists w/setting up how menuItems displays when printed.
    @Override
    public String toString() {
        return "CATEGORY: " + this.category + "NAME: " + this.name + "PRICE: " + this.price + "DESCRIPTION: " + this.description;
    }

    // #5 a way to determine whether or not 2 menu items are =
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        MenuItem item = (MenuItem) o;
        return item.getName() == getName();
    }
}
