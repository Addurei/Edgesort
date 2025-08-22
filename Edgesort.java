import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Edgesort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose sorting order:");
        System.out.println("1 - Ascending");
        System.out.println("2 - Descending");
        int choice = scanner.nextInt();
        
        System.out.println("Enter the number of elements: ");       
        int n = scanner.nextInt();

        List<Integer> unsortedList = new ArrayList<>();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            unsortedList.add(scanner.nextInt());
        }

        List<Integer> sortedList = new ArrayList<>();

        switch (choice) {
            case 1: 
                while (!unsortedList.isEmpty()) {
                    int first = unsortedList.get(0);
                    int last = unsortedList.get(unsortedList.size() - 1);

                    if (first < last) {
                        sortedList.add(first);
                        unsortedList.remove(0);
                    } else {
                        sortedList.add(last);
                        unsortedList.remove(unsortedList.size() - 1); 
                    }

                    System.out.print("Current Sorted Ascending: ");
                    printList(sortedList);
                }
                Collections.sort(sortedList);
                System.out.println("------------------------------------------");
                System.out.print("Final Sorted Ascending: ");
                printList(sortedList);
                break;

            case 2:
                while (!unsortedList.isEmpty()) {
                    int first = unsortedList.get(0);
                    int last = unsortedList.get(unsortedList.size() - 1);

                    if (first > last) {
                        sortedList.add(first);
                        unsortedList.remove(0);
                    } else {
                        sortedList.add(last);
                        unsortedList.remove(unsortedList.size() - 1);
                    }

                    System.out.print("Current Sorted Descending: ");
                    printList(sortedList);
                }
                Collections.sort(sortedList, Collections.reverseOrder());
                System.out.println("------------------------------------------");
                System.out.print("Final Sorted Descending: ");
                printList(sortedList);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 for Ascending or 2 for Descending.");
                break;
        }

        scanner.close();
    }

    public static void printList(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }    
}