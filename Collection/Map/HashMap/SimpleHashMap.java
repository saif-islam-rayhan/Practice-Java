package edu.learn.mp;

import java.util.*;

public class HashMapSimple {
   public static void main(String[] args){
       Map<String,Integer>map=new HashMap<>();
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the input");
       int n=sc.nextInt();
       sc.nextLine();
       for(int i=0;i<n;i++){
           System.out.println("Enter the name:");
           String name=sc.nextLine().trim();
           System.out.println("Enter the marks:");
           int marks=sc.nextInt();
           sc.nextLine();
           map.put(name,marks);
       }
       System.out.println(map);
   }
}
