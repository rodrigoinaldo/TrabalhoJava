package com.medico.clickmed.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeProfissional")
    private String nome;

    @Column(name = "crm", nullable = true)
    private String CRM;

    @Column(name = "especialidade" )
    private String especialidade;

}
