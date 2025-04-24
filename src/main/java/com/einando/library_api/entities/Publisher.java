package com.einando.library_api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_publishers")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID publisher_id;
    private String name;
    private String cnpj;

    @OneToMany(mappedBy = "publisher")
    private List<Book> books;

    public Publisher() {
    }

    public Publisher(String name, String cnpj) {
        this.name = name;
        this.cnpj = cnpj;
    }

    public Publisher(String name, String cnpj, List<Book> books) {
        this.name = name;
        this.cnpj = cnpj;
        this.books = books;
    }

    public UUID getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(UUID publisher_id) {
        this.publisher_id = publisher_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
