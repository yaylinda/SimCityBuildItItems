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

        while (true) {
            System.out.println("Mode options:");
            System.out.println("1 - Request");
            System.out.println("2 - Print All Items");
            System.out.println("3 - Total Time");
            System.out.println("0 - Exit.");

            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();

            switch (i) {
                case 1:
                    handleRequests();
                    break;
                case 2:
                    printAllItems();
                    break;
                case 3:
                    getTotalTime();
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    private static void handleRequests() {
        System.out.print("Enter Item Name(s): ");

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

    private static void getTotalTime() {
        System.out.println("Enter Item Name(s): ");

        Scanner sc = new Scanner(System.in);
        String requestString = sc.nextLine();
        String[] requestArray = requestString.split(" ");

        System.out.println("\n");

        double sumTotalTime = Arrays.stream(requestArray).mapToDouble(a -> {
            ItemName itemName = ItemName.valueOf(a.toUpperCase());
            double totalTime = itemService.getTotalTime(itemName);
            System.out.println(itemName.name() + ": " + totalTime + " min.");
            return totalTime;
        }).sum();

        System.out.println("Total time for all items: " + sumTotalTime + " min.\n");
    }

    private static void printGroupNeedsMap(Map<Group, List<Need>> groupNeedsMap) {
        System.out.println("\n");
        groupNeedsMap.forEach((g, nList) -> {
            System.out.println(g);
            nList.stream().collect(Collectors.groupingBy(Need::getItemName, Collectors.counting())).forEach((i, c) ->
                    System.out.println(String.format("\t%d %s", Math.toIntExact(c), i))
            );
        });
        System.out.println("\n");
    }


}
