package model;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private String name;
    private double time;
    private int sellPrice;
    private List<Item> ingredients;
    private Group group;

    public Item() {
        this.name = "UNDEFINED";
        this.time = -1;
        this.sellPrice = -1;
        this.ingredients = new ArrayList<>();
        this.group = null;
    }

    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public double getTime() {
        return time;
    }

    public Item setTime(double time) {
        this.time = time;
        return this;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public Item setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
        return this;
    }

    public List<Item> getIngredients() {
        return ingredients;
    }

    public Item setIngredients(List<Item> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    public Group getGroup() {
        return group;
    }

    public Item setGroup(Group group) {
        this.group = group;
        return this;
    }
}
