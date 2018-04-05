import model.ItemName;
import model.Need;
import service.ItemService;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        ItemService itemService = new ItemService();

        System.out.println(Arrays.stream(args).flatMap(a -> {
            ItemName itemName = ItemName.valueOf(a.toUpperCase());
            return itemService.processItem(itemName);
        }).collect(Collectors.groupingBy(Need::getGroup)));
    }

}
