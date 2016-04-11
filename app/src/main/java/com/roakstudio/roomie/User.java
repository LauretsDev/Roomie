package com.roakstudio.roomie;


import java.util.ArrayList;

/**
 * Created by Diego Laurentino on 06/04/2016.
 */
public class User {

    private String name;
    private String email;
    private int number;
    private ArrayList<User> listUsers;
    private User user;

    public User() {

    }

    public User(String name, String email, int number) {
        this.name = name;
        this.email = email;
        this.number = number;
        createList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<User> getListUsers() {
        return listUsers;
    }

    public void setListUsers(ArrayList<User> listUsers) {
        this.listUsers = listUsers;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void createList() {
        this.user = new User();
        this.listUsers = new ArrayList<User>();
        for (int i=0;i<10;i++) {
            this.listUsers.add(this.user);
        }
    }
}
