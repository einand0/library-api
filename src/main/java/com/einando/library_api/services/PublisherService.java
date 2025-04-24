package com.einando.library_api.services;

import com.einando.library_api.entities.Publisher;
import com.einando.library_api.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public Publisher createPublisher(Publisher publisher){
        return publisherRepository.save(publisher);
    }

    public List<Publisher> getAllPublishers(){
        return publisherRepository.findAll();
    }
}
