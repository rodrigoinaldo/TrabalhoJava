package com.medico.clickmed.controller;

import com.medico.clickmed.model.Medico;
import com.medico.clickmed.model.Paciente;
import com.medico.clickmed.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping()
    public  String iniciar(Paciente paciente, Model model){
        return "paciente/formulario";
    }

    @PostMapping()
    public String inserir(Paciente paciente, Model model){
        return iniciar( paciente, model );
    }

    @GetMapping("/listar")
    public  String paginaListar(Model model){
        model.addAttribute("paciente", pacienteService.listartodos());
        return "paciente/lista";
    }

}
