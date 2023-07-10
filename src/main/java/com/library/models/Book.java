package com.library.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {

    private int id_book;
    private int id_person;
    private boolean taken;

    @NotEmpty(message = "Введите название книги")
    @Size(min = 1, max = 100, message = "Вы вышли за границы допустимого значения")
    private String title;

    @NotEmpty(message = "Введите полный ФИО автора")
    @Size(min = 1, max = 90, message = "Вы вышли за границы допустимого значения")
    private String author;

    @NotEmpty(message = "Введите год выпуска книги")
    private int year_book;

    public Book(){}

    public Book(int id_book, String title, String author, int year_book
            //, int id_person, boolean taken
    ) {
        this.id_book = id_book;
       // this.id_person = id_person;
        this.title = title;
        this.author = author;
        this.year_book = year_book;
       // this.taken = taken;
    }

    public int getId_book() {
        return id_book;
    }

    public void setId_book(int id_book) {
        this.id_book = id_book;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear_book() {
        return year_book;
    }

    public void setYear_book(int year_book) {
        this.year_book = year_book;
    }

    public int getId_person() {
        return id_person;
    }

    public void setId_person(int id_person) {
        this.id_person = id_person;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }
}
