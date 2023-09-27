package dz1OOP;

import java.util.ArrayList;

public class User {
   private String login;
   private String password;
   private String buyProduct;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBuyProduct() {
        return buyProduct;
    }

    public void setBuyProduct(String buyProduct) {
        this.buyProduct = buyProduct;
    }

    public User(String login, String password, String buyProduct) {
        this.login = login;
        this.password = password;
        this.buyProduct = buyProduct;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", buyProduct='" + buyProduct + '\'' +
                '}';
    }

    public User() {
    }

}
