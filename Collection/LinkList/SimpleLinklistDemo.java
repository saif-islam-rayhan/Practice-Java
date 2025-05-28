package collec.jav.link;

import java.util.LinkedList;

public class SimpleLinklistDemo {
    public static void main(String[] args){
        LinkedList<String>list=new LinkedList<>();
        list.add("Rayhan");
        list.add("Nusrat");
        list.add("Saif");
        list.add("Sayra");
        System.out.println(list.get(1));
        for(String it:list){
            System.out.println(it);
        }
    }
}
