package ccc.dd;

import java.util.*;
import java.util.stream.Collectors;

public class LIstDemo {
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>(List.of("Rahim","Karim","Jamal","Anwar"));
        System.out.println("Initial:             " + names);

        // ২) get, set
        String third = names.get(2);            // Jamal
        System.out.println("get(2):             " + third);
        names.set(1, "Karim-Updated");          // Karim → Karim-Updated
        System.out.println("after set(1):       " + names);

        // ৩) contains, indexOf, lastIndexOf
        boolean hasAnwar = names.contains("Anwar");
        System.out.println("contains Anwar?:    " + hasAnwar);
        int idxJamal = names.indexOf("Jamal");
        System.out.println("indexOf Jamal:      " + idxJamal);
        names.add("Rahim");                    
        int lastRahim = names.lastIndexOf("Rahim");
        System.out.println("lastIndexOf Rahim:  " + lastRahim);

        // ৪) subList
        List<String> slice = names.subList(1, 4);  // index 1–3
        System.out.println("subList(1,4):       " + slice);

        // ৫) size, isEmpty
        System.out.println("size():             " + names.size());
        System.out.println("isEmpty():          " + names.isEmpty());

        // ৬) sort, reverse, shuffle, rotate
        Collections.sort(names);
        System.out.println("after sort():       " + names);
        Collections.reverse(names);
        System.out.println("after reverse():    " + names);
        Collections.shuffle(names);
        System.out.println("after shuffle():    " + names);
        Collections.rotate(names, 2);
        System.out.println("after rotate(2):    " + names);

        // ৭) toArray এবং asList
        String[] array = names.toArray(new String[0]);
        System.out.println("toArray():          " + Arrays.toString(array));
        List<String> fromArray = new ArrayList<>(Arrays.asList(array));
        System.out.println("fromArrayList():    " + fromArray);

        // ৮) addAll, removeAll, retainAll
        List<String> extras = List.of("X","Y");
        names.addAll(extras);
        System.out.println("after addAll:       " + names);
        names.removeAll(List.of("X"));
        System.out.println("after removeAll(X): " + names);
        names.retainAll(List.of("Rahim","Y","Anwar-NotExist"));
        System.out.println("after retainAll:    " + names);

        // ৯) replaceAll & custom sort
        names.replaceAll(s -> s.toUpperCase());
        System.out.println("after replaceAll(): " + names);
        names.sort(Comparator.comparingInt(String::length));
        System.out.println("after custom sort:  " + names);

        // ১০) clear
        names.clear();
        System.out.println("after clear():      " + names + " (isEmpty? " + names.isEmpty() + ")");
    }
}

