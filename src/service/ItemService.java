package service;

import model.*;


import java.util.*;
import java.util.stream.Stream;

public class ItemService {

    private Map<ItemName, Item> items;

    public ItemService() {
        this.items = new HashMap<>();
        this.initializeItems();
    }

    public void processRequest(List<Item> requests) {

    }

    public Stream<Need> processItem(ItemName itemName) {
        return items.get(itemName).getItemTree(0);
    }

    private void initializeItems() {

        // FACTORIES
        Item metal = new Item()
                .setName(ItemName.METAL)
                .setTime(1)
                .setSellPrice(10)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        this.items.put(ItemName.METAL, metal);

        Item wood = new Item()
                .setName(ItemName.WOOD)
                .setTime(3)
                .setSellPrice(20)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        this.items.put(ItemName.WOOD, wood);

        Item plastic = new Item()
                .setName(ItemName.PLASTIC)
                .setTime(9)
                .setSellPrice(25)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        this.items.put(ItemName.PLASTIC, plastic);

        Item seeds = new Item()
                .setName(ItemName.SEEDS)
                .setTime(20)
                .setSellPrice(30)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        this.items.put(ItemName.SEEDS, seeds);

        Item minerals = new Item()
                .setName(ItemName.MINERALS)
                .setTime(30)
                .setSellPrice(40)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        this.items.put(ItemName.MINERALS, minerals);

        Item chemicals = new Item()
                .setName(ItemName.CHEMICALS)
                .setTime(120)
                .setSellPrice(60)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        this.items.put(ItemName.CHEMICALS, chemicals);

        Item textiles = new Item()
                .setName(ItemName.TEXTILES)
                .setTime(180)
                .setSellPrice(90)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        this.items.put(ItemName.TEXTILES, textiles);

        Item sugarAndSpices = new Item()
                .setName(ItemName.SUGARANDSPICES)
                .setTime(240)
                .setSellPrice(110)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        this.items.put(ItemName.SUGARANDSPICES, sugarAndSpices);

        Item glass = new Item()
                .setName(ItemName.GLASS)
                .setTime(300)
                .setSellPrice(120)
                .setIngredients(Collections.emptyList())
                .setGroup(Group.FACTORY);
        this.items.put(ItemName.GLASS, glass);


        // BUILDING SUPPLIES STORE
        Item nails = new Item()
                .setName(ItemName.NAILS)
                .setTime(4.5)
                .setSellPrice(120)
                .setIngredients(Arrays.asList(metal, metal))
                .setGroup(Group.BUILDING_SUPPLIES_STORE);
        this.items.put(ItemName.NAILS, nails);

        Item planks = new Item()
                .setName(ItemName.PLANKS)
                .setTime(27)
                .setSellPrice(110)
                .setIngredients(Arrays.asList(wood, wood))
                .setGroup(Group.BUILDING_SUPPLIES_STORE);
        this.items.put(ItemName.PLANKS, planks);

        Item bricks = new Item()
                .setName(ItemName.BRICKS)
                .setTime(18)
                .setSellPrice(190)
                .setIngredients(Arrays.asList(minerals, minerals))
                .setGroup(Group.BUILDING_SUPPLIES_STORE);
        this.items.put(ItemName.BRICKS, bricks);

        Item cement = new Item()
                .setName(ItemName.CEMENT)
                .setTime(45)
                .setSellPrice(440)
                .setIngredients(Arrays.asList(minerals, minerals, chemicals))
                .setGroup(Group.BUILDING_SUPPLIES_STORE);
        this.items.put(ItemName.CEMENT, cement);

        Item glue = new Item()
                .setName(ItemName.GLUE)
                .setTime(54)
                .setSellPrice(440)
                .setIngredients(Arrays.asList(plastic, chemicals, chemicals))
                .setGroup(Group.BUILDING_SUPPLIES_STORE);
        this.items.put(ItemName.GLUE, glue);

        Item paint = new Item()
                .setName(ItemName.PAINT)
                .setTime(54)
                .setSellPrice(320)
                .setIngredients(Arrays.asList(metal, metal, minerals, chemicals, chemicals))
                .setGroup(Group.BUILDING_SUPPLIES_STORE);
        this.items.put(ItemName.PAINT, paint);


        // HARDWARE STORE
        Item hammer = new Item()
                .setName(ItemName.HAMMER)
                .setTime(14)
                .setSellPrice(90)
                .setIngredients(Arrays.asList(metal, wood))
                .setGroup(Group.HARDWARE_STORE);
        this.items.put(ItemName.HAMMER, hammer);

        Item measuringTape = new Item()
                .setName(ItemName.MEASURINGTAPE)
                .setTime(20)
                .setSellPrice(110)
                .setIngredients(Arrays.asList(metal, plastic))
                .setGroup(Group.HARDWARE_STORE);
        this.items.put(ItemName.MEASURINGTAPE, measuringTape);

        Item shovel = new Item()
                .setName(ItemName.SHOVEL)
                .setTime(30)
                .setSellPrice(150)
                .setIngredients(Arrays.asList(metal, wood, plastic))
                .setGroup(Group.HARDWARE_STORE);
        this.items.put(ItemName.SHOVEL, shovel);

        Item cookingUtensils = new Item()
                .setName(ItemName.COOKINGUTENSILS)
                .setTime(40.5)
                .setSellPrice(250)
                .setIngredients(Arrays.asList(metal, metal, wood, wood, plastic, plastic))
                .setGroup(Group.HARDWARE_STORE);
        this.items.put(ItemName.COOKINGUTENSILS, cookingUtensils);


        // FARMER'S MARKET
        Item vegetables = new Item()
                .setName(ItemName.VEGETABLES)
                .setTime(20)
                .setSellPrice(160)
                .setIngredients(Arrays.asList(seeds, seeds))
                .setGroup(Group.FARMERS_MARKET);
        this.items.put(ItemName.VEGETABLES, vegetables);

        Item flourBag = new Item()
                .setName(ItemName.FLOURBAG)
                .setTime(30)
                .setSellPrice(570)
                .setIngredients(Arrays.asList(seeds, seeds, textiles, textiles))
                .setGroup(Group.FARMERS_MARKET);
        this.items.put(ItemName.FLOURBAG, flourBag);


        // FURNITURE STORE
        Item chairs = new Item()
                .setName(ItemName.CHAIRS)
                .setTime(20)
                .setSellPrice(300)
                .setIngredients(Arrays.asList(wood, wood, nails, hammer))
                .setGroup(Group.FURNITURE_STORE);
        this.items.put(ItemName.CHAIRS, chairs);

        Item tables = new Item()
                .setName(ItemName.TABLES)
                .setTime(30)
                .setSellPrice(500)
                .setIngredients(Arrays.asList(nails, nails, planks, hammer))
                .setGroup(Group.FURNITURE_STORE);
        this.items.put(ItemName.TABLES, tables);


        // GARDENING SUPPLIES
        Item grass = new Item()
                .setName(ItemName.GRASS)
                .setTime(30)
                .setSellPrice(310)
                .setIngredients(Arrays.asList(seeds, shovel))
                .setGroup(Group.GARDENING_SUPPLIES);
        this.items.put(ItemName.GRASS, grass);

        Item treeSapling = new Item()
                .setName(ItemName.TREESAPLINGS)
                .setTime(90)
                .setSellPrice(420)
                .setIngredients(Arrays.asList(seeds, seeds, shovel))
                .setGroup(Group.GARDENING_SUPPLIES);
        this.items.put(ItemName.TREESAPLINGS, treeSapling);


        // DONUT SHOP
        Item donuts = new Item()
                .setName(ItemName.DONUTS)
                .setTime(45)
                .setSellPrice(950)
                .setIngredients(Arrays.asList(flourBag, sugarAndSpices))
                .setGroup(Group.DONUT_SHOP);
        this.items.put(ItemName.DONUTS, donuts);


        // FASHION STORE
        Item cap = new Item()
                .setName(ItemName.CAP)
                .setTime(60)
                .setSellPrice(600)
                .setIngredients(Arrays.asList(textiles, textiles, measuringTape))
                .setGroup(Group.FASHION_STORE);
        this.items.put(ItemName.CAP, cap);


        // FARMER'S MARKET
        Item fruitAndBerries = new Item()
                .setName(ItemName.FRUITANDBERRIES)
                .setTime(90)
                .setSellPrice(730)
                .setIngredients(Arrays.asList(seeds, seeds, treeSapling))
                .setGroup(Group.FARMERS_MARKET);
        this.items.put(ItemName.FRUITANDBERRIES, fruitAndBerries);

    }
}
