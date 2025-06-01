package com.medico.clickmed.controller;

import com.medico.clickmed.model.Medico;
import com.medico.clickmed.model.Paciente;
import com.medico.clickmed.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/listar")
    public  String paginaListar(Model model){
        model.addAttribute("pacientes", pacienteService.listartodos());
        return "paciente/lista";
    }

    @PostMapping()
    public String salvar(Paciente paciente, Model model){
        pacienteService.save(paciente);
        return "redirect:paciente/listar";
    }

    @GetMapping("editar/{id}")
    public String alterar(@PathVariable Long id, Model model){
        model.addAttribute("paciente", pacienteService.buscarId(id));
        return "paciente/formulario";
    }

    @GetMapping("remover/{id}")
    public String remover(@PathVariable Long id, Model model){
        pacienteService.deletar(id);
        return "paciente/lista";
    }


}