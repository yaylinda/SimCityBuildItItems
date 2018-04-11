import model.Group;
import model.ItemName;
import model.Need;
import service.ItemService;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Runner {

    private static ItemService itemService = new ItemService();

    public static void main(String[] args) {

        System.out.println("Mode options:");
        System.out.println("1 - Request");
        System.out.println("2 - Print All Items");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        switch (i) {
            case 1:
                handleRequests();
                break;
            case 2:
                printAllItems();
                break;
            default:
                break;
        }
    }

    private static void handleRequests() {
        System.out.print("Enter Request: ");

        Scanner sc = new Scanner(System.in);
        String requestString = sc.nextLine();
        String[] requestArray = requestString.split(" ");

        Map<Group, List<Need>> groupNeedsMap = Arrays.stream(requestArray).flatMap(a -> {
            ItemName itemName = ItemName.valueOf(a.toUpperCase());
            return itemService.processItem(itemName);
        }).collect(Collectors.groupingBy(Need::getGroup));

        printGroupNeedsMap(groupNeedsMap);
    }

    private static void printAllItems() {
        System.out.println("Printing All Items: ");

        Map<Group, List<Need>> groupNeedsMap = itemService.processAllItems()
                .collect(Collectors.groupingBy(Need::getGroup));

        printGroupNeedsMap(groupNeedsMap);
    }

    private static void printGroupNeedsMap(Map<Group, List<Need>> groupNeedsMap) {
        groupNeedsMap.forEach((g, nList) -> {
            System.out.println(g);
            nList.stream().collect(Collectors.groupingBy(Need::getItemName, Collectors.counting())).forEach((i, c) ->
                    System.out.println(String.format("\t%d %s", Math.toIntExact(c), i))
            );
        });
    }


}
