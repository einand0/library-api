package com.einando.library_api.repositories;

import com.einando.library_api.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PublisherRepository extends JpaRepository<UUID, Publisher> {
}
