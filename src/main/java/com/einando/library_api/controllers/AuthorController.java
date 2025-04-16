package com.einando.library_api.controllers;

import com.einando.library_api.entities.Author;
import com.einando.library_api.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping
    public ResponseEntity<Author> createAuthor(@RequestBody Author author){
        System.out.println(author.getName());
        Author newAuthor = authorService.createAuthor(author);
        return ResponseEntity.status(HttpStatus.CREATED).body(newAuthor);
    }
}
