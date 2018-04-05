import model.Item;
import model.ItemName;
import model.Need;
import service.ItemService;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

    public static void main(String[] args) {

        ItemService itemService = new ItemService();

        Stream<Need> needs = itemService.processItem(ItemName.CAP);
        System.out.println(needs.collect(Collectors.toList()));
    }

}
