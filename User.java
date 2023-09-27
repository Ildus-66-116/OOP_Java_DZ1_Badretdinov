package dz1OOP;

import java.util.ArrayList;

public class User {
    String login;
    String password;
    String buyProduct;

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
