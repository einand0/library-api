package com.einando.library_api.repositories;

import com.einando.library_api.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LoanRepository extends JpaRepository<UUID, Loan> {
}
