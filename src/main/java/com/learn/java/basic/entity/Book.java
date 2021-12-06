package com.learn.java.basic.entity;

import java.util.Objects;

public class Book implements Good{

    private String name;
    private String title;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String name, String title, String author, double price) {
        this.name = name;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && Objects.equals(name, book.name) && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, title, author, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String name() {
        return name;
    }
}
