package com.medico.clickmed.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome" )
    private String nome;

    @Column(name = "cpf"  )
    private String CPF;

    @Column(name = "dataNascimeno"  )
    private LocalDate data;

    @Column(name = "telegone/whatsapp", nullable = true)
    private String telefone;

}
