package com.delivion.DAO;

public class User {
    String name;
    String password;
    int age;
    Adress adress;

    public User(String name, String password, int age, Adress adress) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.adress=adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("\n").append(age);
        return sb.toString();
    }
}
