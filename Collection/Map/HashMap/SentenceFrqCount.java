package edu.learn.mp;

import java.util.*;

public class HashMapSimple {
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
       System.out.println("Enter Sentence: ");
       String line=sc.nextLine();
       String[] arr=line.split("\\W+");
       Map<String,Integer>freq=new HashMap<>();
       for(String w:arr){
           w=w.toLowerCase();
           freq.put(w, freq.getOrDefault(w,0)+1);
       }
       for( Map.Entry<String ,Integer>entry : freq.entrySet() ){
           System.out.println("Key:"+ entry.getKey()+"Value:"+entry.getValue());
       }
   }
}
