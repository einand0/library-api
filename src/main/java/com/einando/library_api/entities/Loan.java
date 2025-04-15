package com.einando.library_api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tb_loans")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID loan_id;
    private Date loanDate;
    private Date returnDate;
    private boolean returned;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    private Book book;

}
