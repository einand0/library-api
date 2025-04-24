package com.einando.library_api.controllers;

import com.einando.library_api.entities.Publisher;
import com.einando.library_api.services.PublisherService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publishers")
public class PublisherController {

    @Autowired
    public PublisherService publisherService;

    @PostMapping
    public ResponseEntity<Publisher> createPublisher(@RequestBody Publisher publisher){
        Publisher newPublisher = publisherService.createPublisher(publisher);
        return ResponseEntity.status(HttpStatus.CREATED).body(newPublisher);
    }

    @GetMapping
    public ResponseEntity<List<Publisher>> getAllPublishers(){
        List<Publisher> publishers = publisherService.getAllPublishers();
        return ResponseEntity.status(HttpStatus.FOUND).body(publishers);
    }
}
