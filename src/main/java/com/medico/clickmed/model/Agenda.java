package com.medico.clickmed.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // interligação de tabelas
    @Column(name = "medico_id")
    private Medico medico;

    @ManyToOne
    @Column(name = "paciente_id")
    private Paciente paciente;

    @Column(name = "data_hora", nullable = false)
    private LocalDateTime dataHora;

}
