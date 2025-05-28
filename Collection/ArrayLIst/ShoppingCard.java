package jav.aaa;

import java.util.ArrayList;

class Product {
    String name;
    int price;
  public   Product(String name,int price){
        this.name=name;
        this.price=price;
    }
}


public class ShoppingCard {
    public static void main(String[] args){
        ArrayList<Product> card= new ArrayList<>();

        card.add(new Product("phone", 250000));
        card.add(new Product("leptop",2222222));
        card.add(new Product("Watch",22223));

        int total=0;
        for(Product c:card){
            total+=c.price;
        }
        System.out.println(total);
    }
}


