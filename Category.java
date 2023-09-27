package dz1OOP;

import java.util.ArrayList;

public class Category {
   private ArrayList<String> category = new ArrayList<>();

    public ArrayList<String> getCategory() {
        return category;
    }

    public void setCategory(ArrayList<String> category) {
        this.category = category;
    }

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
