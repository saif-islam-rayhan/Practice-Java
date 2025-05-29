package bd.sEt;

import java.util.*;

public class HashSetExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // 1) User input
            System.out.print("Enter values (comma, semicolon, dot, dash etc): ");
            String inputLine = sc.nextLine().trim();

            // 2) Validate raw input
            if (inputLine.isEmpty()) {
                throw new IllegalArgumentException("Input cannot be empty!");
            }

            // 3) Clean & split into array
            String cleaned = inputLine.replaceAll("[,;.|\\-]+", " ");
            String[] arr = cleaned.trim().split("\\s+");
            if (arr.length == 0) {
                throw new IllegalArgumentException("No elements found after splitting input!");
            }

            // 4) Show original array
            System.out.println("\nInput as Array:");
            for (String s : arr) {
                System.out.println("  " + s);
            }

            // 5) Array → HashSet (validate elements)
            Set<String> set = new HashSet<>();
            for (String s : arr) {
                if (s == null || s.isBlank()) {
                    throw new IllegalArgumentException("Cannot add blank or null element to Set!");
                }
                set.add(s);
            }
            System.out.println("\nConverted to HashSet (no duplicates): " + set);

            // 6) Set → Array (validate elements)
            if (set.isEmpty()) {
                throw new IllegalArgumentException("Set is empty, cannot convert back to array!");
            }
            String[] backToArray = set.toArray(new String[0]);
            System.out.println("\nConverted back to Array:");
            for (String s : backToArray) {
                System.out.println("  " + s);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(" Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
