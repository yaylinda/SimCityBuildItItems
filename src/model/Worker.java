package model;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private int numSlots;
    private List<Item> productionQueue;

    public Worker(String name, int numSlots) {
        this.name = name;
        this.numSlots = numSlots;
        this.productionQueue = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumSlots() {
        return numSlots;
    }

    public void setNumSlots(int numSlots) {
        this.numSlots = numSlots;
    }

    public List<Item> getProductionQueue() {
        return productionQueue;
    }

    public void setProductionQueue(List<Item> productionQueue) {
        this.productionQueue = productionQueue;
    }
}
