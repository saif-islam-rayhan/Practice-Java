package bd.sEt;

import java.util.*;

public class HashSetExample1 {
    public static void main(String[] ars){
        Set<String>names=new HashSet<>();
        names.add("Saif");
        names.add("Saif");
        names.add("Rayhan");
        names.add("Rafi");
        names.add("Saimun");
        names.add("Busra");
        names.add("Mahi");

        names.remove("Rayhan");
        System.out.println(names);
    }
}
