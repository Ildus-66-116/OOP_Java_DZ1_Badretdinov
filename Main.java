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
        food.addCategory(milk.name);
        food.addCategory(fish.name);
        magazin.addAll(food.category);
        Category cosmetic = new Category();
        cosmetic.addCategory(krem.name);
        cosmetic.addCategory(dezodarant.name);
        magazin.addAll(cosmetic.category);
        System.out.println("magazin = " + magazin);
        Basket buyProduct = new Basket();
        User user1 = new User("ildus", "123", "milk");
        buyProduct.addBuyProduct(user1.buyProduct);
        User user2 = new User("roman", "123", "krem");
        buyProduct.addBuyProduct(user2.buyProduct);
        User user3 = new User("ksana", "123", "fish");
        buyProduct.addBuyProduct(user3.buyProduct);
        System.out.println("buyProduct = " + buyProduct);
        magazin.removeAll(buyProduct.buyProduct);
        System.out.println("magazin = " + magazin);
    }
}