package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Item {

    private ItemName name;
    private double time;
    private int sellPrice;
    private List<Item> ingredients;
    private Group group;

    public Item() {
        this.time = -1;
        this.sellPrice = -1;
        this.ingredients = new ArrayList<>();
        this.group = null;
    }

    public ItemName getName() {
        return name;
    }

    public Item setName(ItemName name) {
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

    public Stream<Need> getItemTree(int depth) {
        return Stream.concat(
                Stream.of(new Need(this.getGroup(), this.getName(), depth)),
                this.ingredients.stream().flatMap(i -> i.getItemTree(depth + 1))
        );
    }

    @Override
    public String toString() {
        return "Item{" +
                "name=" + name +
                ", time=" + time +
                ", sellPrice=" + sellPrice +
                ", ingredients=" + ingredients +
                ", group=" + group +
                '}';
    }
}
