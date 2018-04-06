import model.Group;
import model.ItemName;
import model.Need;
import service.ItemService;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        ItemService itemService = new ItemService();

        System.out.print("Request: ");
        Arrays.stream(args).forEach(a -> System.out.print(a + " "));

        System.out.println("\n");

        Map<Group, List<Need>> groupNeedsMap = Arrays.stream(args).flatMap(a -> {
            ItemName itemName = ItemName.valueOf(a.toUpperCase());
            return itemService.processItem(itemName);
        }).collect(Collectors.groupingBy(Need::getGroup));

        groupNeedsMap.forEach((g, nList) -> {
            System.out.println(g);
            nList.stream().collect(Collectors.groupingBy(Need::getItemName, Collectors.counting())).forEach((i, c) -> {
                System.out.println(String.format("\t%d %s", Math.toIntExact(c), i));
            });
        });
    }

}
