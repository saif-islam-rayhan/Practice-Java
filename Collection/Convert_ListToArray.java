package conver.arr.lis.arr;
import java.util.*;
public class LIstToArray {
   public static void main(String[] args){
       List<String>citysList=new ArrayList<>();
       citysList.add("Dhaka");
       citysList.add("Cumilla");
       citysList.add("Barishal");
       citysList.add("Rajshahi");


       String[] citysArray= citysList.toArray(new  String[0]);
       for(int i=0;i<citysArray.length;i++){
           System.out.println(citysArray[i]);
       }

   }
}
