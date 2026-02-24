package com.pbe.spring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "pessoa")

public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    private String cpf;
    private String rg;

    @Email
    private String email;

    private LocalDate data_nasc;
    private BigDecimal salario;
    private String ra;


}
