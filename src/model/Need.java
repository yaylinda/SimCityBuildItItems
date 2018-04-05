package model;

public class Need {

    private Group group;
    private ItemName itemName;
    private int depth;

    public Need() {
    }

    public Need(Group group, ItemName itemName, int depth) {
        this.group = group;
        this.itemName = itemName;
        this.depth = depth;
    }

    public Group getGroup() {
        return group;
    }

    public Need setGroup(Group group) {
        this.group = group;
        return this;
    }

    public ItemName getItemName() {
        return itemName;
    }

    public Need setItemName(ItemName itemName) {
        this.itemName = itemName;
        return this;
    }

    public int getDepth() {
        return depth;
    }

    public Need setDepth(int depth) {
        this.depth = depth;
        return this;
    }

    @Override
    public String toString() {
        return "Need{" +
                "group=" + group +
                ", itemName=" + itemName +
                ", depth=" + depth +
                '}';
    }
}
