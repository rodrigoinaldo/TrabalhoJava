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
    @JoinColumn(name = "medico_id") // quando for chave estrangeira colocar esse "JoinColumn"
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "paciente_id")// quando for chave estrangeira colocar esse "JoinColumn"
    private Paciente paciente;

    @Column(name = "data_hora", nullable = false)
    private LocalDateTime dataHora;

}
