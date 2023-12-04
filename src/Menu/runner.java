package Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

////////Dynamic Menu Using ArrayList ////////////

public class runner {
    static void displayMenu() {
        System.out.println("\n 1. Add element\n" + " 2. Remove element\n" + " 3. Get Max value\n" + " 4. Get Min value\n" + " 5. Get Average value\n" + " 6. Sort by Ascending\n" + " 7. Sort by Descending\n" + " 8. print Distinct elements\n" +" 9. print elements\n" + " 10. Exit\n");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList arr = new ArrayList<>();

        while (true) {
            displayMenu();
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter an Integer");
                    arr.add(in.nextInt());
                    System.out.println("Element Added");
                    break;
                case 2:
                    if (arr.isEmpty()) System.out.println("No Elements Found!");
                    else {
                        System.out.println("Element number to be removed");
                        int element = in.nextInt();
                        if (arr.contains(element)) {
                            arr.remove((Integer) element);
                            System.out.println("Element Removed");

                        } else System.out.println("Element not found!");
                    }
                    break;
                case 3:
                    if (arr.isEmpty()) System.out.println("No Elements Found!");
                    else System.out.println("Max Value= " + Collections.max(arr));
                    break;
                case 4:
                    if (arr.isEmpty()) System.out.println("No Elements Found!");
                    else System.out.println("Min Value= " + Collections.min(arr));
                    break;
                case 5:
                    if (arr.isEmpty()) System.out.println("No Elements Found!");
                    else
                        System.out.println("Average Value= " + Arrays.stream(arr.toArray()).mapToInt(ele -> (int) ele).average().getAsDouble());
                    break;
                case 6:
                    if (arr.isEmpty()) System.out.println("No Elements Found!");
                    else {
                        Collections.sort(arr);
                        System.out.println(arr);
                    }
                    break;
                case 7:
                    if (arr.isEmpty()) System.out.println("No Elements Found!");
                    else {
                        Collections.sort(arr, Collections.reverseOrder());
                        System.out.println(arr);
                    }
                    break;
                case 8:
                    if (arr.isEmpty()) System.out.println("No Elements Found!");
                    else System.out.println(Arrays.stream(arr.toArray()).distinct().collect(Collectors.toList()));
                    break;
                case 9:
                    if (arr.isEmpty()) System.out.println("No Elements Found!");
                    else System.out.println(arr);
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

