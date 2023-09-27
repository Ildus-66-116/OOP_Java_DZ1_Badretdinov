package dz1OOP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> magazin = new ArrayList<>();
        Product dezodarant = new Product("desodorant", 200, 8);
        Product milk = new Product("milk", 89, 4);
        Product fish = new Product("fish", 252, 8);
        Product krem = new Product("krem", 150, 5);
        Category food = new Category();
        food.addCategory(milk.getName());
        food.addCategory(fish.getName());
        magazin.addAll(food.getCategory());
        Category cosmetic = new Category();
        cosmetic.addCategory(krem.getName());
        cosmetic.addCategory(dezodarant.getName());
        magazin.addAll(cosmetic.getCategory());
        System.out.println("magazin = " + magazin);
        Basket buyProduct = new Basket();
        User user1 = new User("ildus", "123", "milk");
        buyProduct.addBuyProduct(user1.getBuyProduct());
        User user2 = new User("roman", "123", "krem");
        buyProduct.addBuyProduct(user2.getBuyProduct());
        User user3 = new User("ksana", "123", "fish");
        buyProduct.addBuyProduct(user3.getBuyProduct());
        System.out.println("buyProduct = " + buyProduct);
        magazin.removeAll(buyProduct.getBuyProduct());
        System.out.println("magazin = " + magazin);
    }
}