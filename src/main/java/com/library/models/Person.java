package com.library.models;

import javax.validation.constraints.*;

/**
 * @author Neil Alishev
 */
public class Person {

    private int id;

    @NotEmpty(message = "Введите год рождения")
    @Min(value = 1900, message = "Введите год, больший 1900")
    @Max(value = 2018, message = "Люди с таким годом рождения не регистрируются")
    private int year;
    @NotEmpty(message = "Введите ФИО")
    @Size(min = 2, max = 50, message = "Введите ФИО полностью")
    private String name;

    public Person(){}

    public Person(int id, int year, String name) {
        this.id = id;
        this.year = year;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    private int id;
//
//    @NotEmpty(message = "Name should not be empty")
//    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
//    private String name;
//
//    @Min(value = 0, message = "Age should be greater than 0")
//    private String age;
//
//    @NotEmpty(message = "Email should not be empty")
//    @Email(message = "Email should be valid")
//    private String email;
//
//    public Person() {
//
//    }
//
//    public Person(int id, String name, String age, String email) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.email = email;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAge() {
//        return age;
//    }
//
//    public void setAge(String age) {
//        this.age = age;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
}
