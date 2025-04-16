package com.einando.library_api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID author_id;
    private String name;

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    public Author(UUID author_id, String name, List<Book> books) {
        this.author_id = author_id;
        this.name = name;
        this.books = books;
    }

    @ManyToMany(mappedBy = "authors")
    private List<Book> books;

    public UUID getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(UUID author_id) {
        this.author_id = author_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
