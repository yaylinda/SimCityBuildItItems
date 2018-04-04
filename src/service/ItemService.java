package service;

import model.Group;
import model.Item;
import model.ItemNames;
import model.Worker;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemService {

    private List<Item> items;

    public ItemService() {
        this.items = new ArrayList<>();
        this.initializeItems();
    }

    private void initializeItems() {

        // FACTORIES
        Item metal = new Item()
                .setName(ItemNames.METAL.name())
                .setTime(1)
                .setSellPrice(10)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        Item wood = new Item()
                .setName(ItemNames.WOOD.name())
                .setTime(3)
                .setSellPrice(20)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        Item plastic = new Item()
                .setName(ItemNames.PLASTIC.name())
                .setTime(9)
                .setSellPrice(25)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        Item seeds = new Item()
                .setName(ItemNames.SEEDS.name())
                .setTime(20)
                .setSellPrice(30)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        Item minerals = new Item()
                .setName(ItemNames.MINERALS.name())
                .setTime(30)
                .setSellPrice(40)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        Item chemicals = new Item()
                .setName(ItemNames.CHEMICALS.name())
                .setTime(120)
                .setSellPrice(60)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        Item textiles = new Item()
                .setName(ItemNames.TEXTILES.name())
                .setTime(180)
                .setSellPrice(90)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        Item sugarAndSpices = new Item()
                .setName(ItemNames.SUGARANDSPICES.name())
                .setTime(240)
                .setSellPrice(110)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        Item glass = new Item()
                .setName(ItemNames.GLASS.name())
                .setTime(300)
                .setSellPrice(120)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);

        // BUILDING SUPPLIES STORE
        Item nails = new Item()
                .setName(ItemNames.NAILS.name())
                .setTime(4.5)
                .setSellPrice(120)
                .setIngredients(Arrays.asList(metal, metal))
                .setGroup(Group.BUILDING_SUPPLIES_STORE);
        Item planks = new Item()
                .setName(ItemNames.PLANKS.name())
                .setTime(27)
                .setSellPrice(110)
                .setIngredients(Arrays.asList(wood, wood))
                .setGroup(Group.BUILDING_SUPPLIES_STORE);
        Item bricks = new Item()
                .setName(ItemNames.BRICKS.name())
                .setTime(18)
                .setSellPrice(190)
                .setIngredients(Arrays.asList(minerals, minerals))
                .setGroup(Group.BUILDING_SUPPLIES_STORE);
        Item cement = new Item()
                .setName(ItemNames.CEMENT.name())
                .setTime(45)
                .setSellPrice(440)
                .setIngredients(Arrays.asList(minerals, minerals, chemicals))
                .setGroup(Group.BUILDING_SUPPLIES_STORE);
        Item glue = new Item()
                .setName(ItemNames.GLUE.name())
                .setTime(54)
                .setSellPrice(440)
                .setIngredients(Arrays.asList(plastic, chemicals, chemicals))
                .setGroup(Group.BUILDING_SUPPLIES_STORE);
        Item paint = new Item()
                .setName(ItemNames.PAINT.name())
                .setTime(54)
                .setSellPrice(320)
                .setIngredients(Arrays.asList(metal, metal, minerals, chemicals, chemicals))
                .setGroup(Group.BUILDING_SUPPLIES_STORE);

        // HARDWARE STORE
        Item hammer = new Item()
                .setName(ItemNames.HAMMER.name())
                .setTime(14)
                .setSellPrice(90)
                .setIngredients(Arrays.asList(metal, wood))
                .setGroup(Group.HARDWARE_STORE);
        Item measuringTape = new Item()
                .setName(ItemNames.MEASURINGTAPE.name())
                .setTime(20)
                .setSellPrice(110)
                .setIngredients(Arrays.asList(metal, plastic))
                .setGroup(Group.HARDWARE_STORE);
        Item shovel = new Item()
                .setName(ItemNames.SHOVEL.name())
                .setTime(30)
                .setSellPrice(150)
                .setIngredients(Arrays.asList(metal, wood, plastic))
                .setGroup(Group.HARDWARE_STORE);
        Item cookingUtensils = new Item()
                .setName(ItemNames.COOKINGUTENSILS.name())
                .setTime(40.5)
                .setSellPrice(250)
                .setIngredients(Arrays.asList(metal, metal, wood, wood, plastic, plastic))
                .setGroup(Group.HARDWARE_STORE);

        // FARMER'S MARKET
        Item vegetables = new Item()
                .setName(ItemNames.VEGETABLES.name())
                .setTime(20)
                .setSellPrice(160)
                .setIngredients(Arrays.asList(seeds, seeds))
                .setGroup(Group.FARMERS_MARKET);
        Item flourBag = new Item()
                .setName(ItemNames.FLOURBAG.name())
                .setTime(30)
                .setSellPrice(570)
                .setIngredients(Arrays.asList(seeds, seeds, textiles, textiles))
                .setGroup(Group.FARMERS_MARKET);

        // FURNITURE STORE
        Item chairs = new Item()
                .setName(ItemNames.CHAIRS.name())
                .setTime(20)
                .setSellPrice(300)
                .setIngredients(Arrays.asList(wood, wood, nails, hammer))
                .setGroup(Group.FURNITURE_STORE);
        Item tables = new Item()
                .setName(ItemNames.TABLES.name())
                .setTime(30)
                .setSellPrice(500)
                .setIngredients(Arrays.asList(nails, nails, planks, hammer))
                .setGroup(Group.FURNITURE_STORE);

        // GARDENING SUPPLIES
        Item grass = new Item()
                .setName(ItemNames.GRASS.name())
                .setTime(30)
                .setSellPrice(310)
                .setIngredients(Arrays.asList(seeds, shovel))
                .setGroup(Group.GARDENING_SUPPLIES);
        Item treeSapling = new Item()
                .setName(ItemNames.TREESAPLINGS.name())
                .setTime(90)
                .setSellPrice(420)
                .setIngredients(Arrays.asList(seeds, seeds, shovel))
                .setGroup(Group.GARDENING_SUPPLIES);

        // DONUT SHOP
        Item donuts = new Item()
                .setName(ItemNames.DONUTS.name())
                .setTime(45)
                .setSellPrice(950)
                .setIngredients(Arrays.asList(flourBag, sugarAndSpices))
                .setGroup(Group.DONUT_SHOP);

        // FASHION STORE
        Item cap = new Item()
                .setName(ItemNames.CAP.name())
                .setTime(60)
                .setSellPrice(600)
                .setIngredients(Arrays.asList(textiles, textiles, measuringTape))
                .setGroup(Group.FASHION_STORE);

        // FARMER'S MARKET
        Item fruitAndBerries = new Item()
                .setName(ItemNames.FRUITANDBERRIES.name())
                .setTime(90)
                .setSellPrice(730)
                .setIngredients(Arrays.asList(seeds, seeds, treeSapling))
                .setGroup(Group.FARMERS_MARKET);
    }
}
