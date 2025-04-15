package com.einando.library_api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tb_books")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID book_id;
    private String title;
    private Integer releaseYear;
    private boolean available;

    @ManyToOne
    private Publisher publisher;

    @ManyToMany
    private Author author;

    @OneToMany
    private Loan loan;
}
