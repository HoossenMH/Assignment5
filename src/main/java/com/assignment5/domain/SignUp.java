package com.assignment5.domain;

/**
 * Created by Toshiba on 2016/04/07.
 */
public class SignUp {

    private String first;
    private String last;
    private String username;
    private String password;
    private int age;
    private String email;
    private String gender;

    public SignUp() {
    }

    public SignUp(String first, String last, String username, String password, int age, String email, String gender) {
        this.first = first;
        this.last = last;
        this.username = username;
        this.password = password;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }
}
