package dz1OOP;

import java.util.ArrayList;

public class Product {
    String name;
    Integer price;
    Integer rating;

    public Product(String name, Integer price, Integer rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    public Product() {
    }
}
