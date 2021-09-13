package com.company.restaurant;

import java.util.Date;

public class MenuItem {
    private String category;
    private String name;
    private Double price;
    private String description;
    private Boolean isNew;
    private Date updatedOn = new Date();

    public MenuItem() {
    }

    public MenuItem(String aCategory, String aName, Double aPrice, String aDescription) {
        this.category = aCategory;
        this.name = aName;
        this.price = aPrice;
        this.description = aDescription;
        this.isNew = true;
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

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}
