import java.util.LinkedList;

public class SimpleLinkedListDemo {
    public static void main(String[] args) {
        // 1. LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // 2. Add elements
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

        // 3. Print elements
        System.out.println("Initial list: " + numbers);

        // 4. addFirst() এবং addLast()
        numbers.addFirst(1);
        numbers.addLast(20);
        System.out.println("After addFirst/addLast: " + numbers);

        // 5. removeFirst(), removeLast()
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("After removeFirst/removeLast: " + numbers);

        // 6. get() এবং set()
        int element = numbers.get(1);           // index 1
        numbers.set(1, element * 2);            // double
        System.out.println("After doubling index 1: " + numbers);
    }
}
