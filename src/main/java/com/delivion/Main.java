package com.delivion;

import com.delivion.DAO.Adress;
import com.delivion.DAO.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        User user = new User("Artem", "123", 31, new Adress("Ukraine", "Kahovka", "Ivana Franka", 10));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(user);
        System.out.println(json);

        String asd = new String("asdasd");



        int a = 5;
        boolean b = true;
        char c = 'c';

        String string = "sadasd";
    }
}
