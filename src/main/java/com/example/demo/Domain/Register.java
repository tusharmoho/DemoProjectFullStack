package com.example.demo.Domain;

public class Register {

    private String username;

    private String name;

    private String password;

    private String surname;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Register(String username, String name, String password, String surname) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.surname = surname;
    }

    public Register() {
        super();
    }
}
