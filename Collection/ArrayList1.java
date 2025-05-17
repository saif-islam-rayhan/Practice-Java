import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Step 1: " + list);
        
        list.add(1, "Blueberry");
        System.out.println("Step 2: " + list);
        
        String fruit = list.get(2);
        System.out.println("Step 3 (get): " + fruit);
        
        list.set(2, "Mango");
        System.out.println("Step 4 (set): " + list);
        
        list.remove("Apple");
        list.remove(1);
        System.out.println("Step 5 (remove): " + list);
        
        System.out.println("Size: " + list.size());
        System.out.println("Is empty? " + list.isEmpty());
    }
}
