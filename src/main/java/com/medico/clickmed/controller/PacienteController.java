package com.medico.clickmed.controller;

import com.medico.clickmed.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

}
