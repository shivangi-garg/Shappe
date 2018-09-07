package com.shappe.shappe.Model;

public class User {
    private String Password;
    private String Age;
    private String Gender;


    public User() {
    }

    public User(String password, String age, String gender) {
        Password = password;
        Age = age;
        Gender = gender;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}

