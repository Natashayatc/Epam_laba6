package ru.rsreu.java6.users;
/**
 * @version 1.0 11 декабря 2018 г.
 * @author Наташа Яценя
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
