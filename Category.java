package dz1OOP;

import java.util.ArrayList;

public class Category {
    ArrayList<String> category = new ArrayList<>();

    public void addCategory(String str) {
        category.add(str);
    }

    @Override
    public String toString() {
        return "Category{" +
                "category=" + category +
                '}';
    }

    public Category() {
    }
}
