package com.example.myapplication;

public class User {

    public String fullName, username, email, phone, password, age;

    public User() {}

    public User(String fullName, String username, String email, String phone, String password,String age) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.age = age;
    }
}