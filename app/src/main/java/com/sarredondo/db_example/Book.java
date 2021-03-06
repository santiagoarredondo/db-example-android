package com.sarredondo.db_example;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.Objects;

@DatabaseTable(tableName = "book")
public class Book  implements Serializable {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(index = true, canBeNull = false)
    private String name;
    @DatabaseField
    private String author;
    @DatabaseField
    private String ISBN;
    @DatabaseField
    private String language;
    @DatabaseField
    private String publisher;

    public Book(String name, String author, String ISBN, String language, String publisher) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.language = language;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) &&
                Objects.equals(author, book.author) &&
                Objects.equals(ISBN, book.ISBN) &&
                Objects.equals(language, book.language) &&
                Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, ISBN, language, publisher);
    }
}
