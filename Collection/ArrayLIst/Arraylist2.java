import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListFullExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Declare an ArrayList with initial capacity of 10
        ArrayList<String> list = new ArrayList<>(10);

        // 2. Read n items from the user
        System.out.print("How many items would you like to add? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            list.add(sc.nextLine());    // add(item)
        }

        // 3. Insert at a specific index
        if (list.size() >= 2) {
            list.add(1, "INSERTED_AT_INDEX_1"); // add(index, item)
        }

        // 4. Retrieve and display items
        System.out.println("\n▶ All items (size = " + list.size() + "):");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));  // get(i)
        }
        System.out.println("Is the list empty? " + list.isEmpty());

        // 5. Update the first element
        if (!list.isEmpty()) {
            String old = list.set(0, "UPDATED_FIRST_ITEM"); // set(index, newValue)
            System.out.println("\nReplaced \"" + old + "\" with \"" + list.get(0) + "\" at index 0.");
        }

        // 6. Search for an element
        String key = list.size() > 1 ? list.get(1) : "UNKNOWN";
        System.out.println("\nDoes the list contain \"" + key + "\"? " + list.contains(key));
        System.out.println("Index of \"" + key + "\": " + list.indexOf(key));

        // 7. Sort the list
        Collections.sort(list);
        System.out.println("\n▶ Items after sorting:");
        for (String item : list) {
            System.out.println(item);
        }

        // 8. Remove by value and by index
        if (list.contains("INSERTED_AT_INDEX_1")) {
            list.remove("INSERTED_AT_INDEX_1");
            System.out.println("\nRemoved \"INSERTED_AT_INDEX_1\" by value.");
        }
        if (list.size() > 2) {
            String removed = list.remove(2);
            System.out.println("Removed \"" + removed + "\" at index 2.");
        }

        // 9. Convert to array
        String[] array = list.toArray(new String[0]);
        System.out.println("\n▶ Converted to String[] array:");
        for (String s : array) {
            System.out.println(s);
        }

        sc.close();
    }
}
