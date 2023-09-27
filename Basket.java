package dz1OOP;

import java.util.ArrayList;

public class Basket {
   private ArrayList<String> buyProduct = new ArrayList<>();
    public void addBuyProduct(String str) {
        buyProduct.add(str);
    }

    public ArrayList<String> getBuyProduct() {
        return buyProduct;
    }

    public void setBuyProduct(ArrayList<String> buyProduct) {
        this.buyProduct = buyProduct;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "buyProduct=" + buyProduct +
                '}';
    }
}
