package bd.sEt;

import java.util.*;

public class HashSetExample1 {
    public static void main(String[] ars){
        String[] s={"A","B","C","C","D","A"};
        Set<String>set=new HashSet<>(Arrays.asList(s));
        System.out.println(set);
    }
}
