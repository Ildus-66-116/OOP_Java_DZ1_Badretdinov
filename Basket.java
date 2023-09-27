package dz1OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class Basket {
    ArrayList<String> buyProduct = new ArrayList<>();
    public void addBuyProduct(String str) {
        buyProduct.add(str);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "buyProduct=" + buyProduct +
                '}';
    }
}
