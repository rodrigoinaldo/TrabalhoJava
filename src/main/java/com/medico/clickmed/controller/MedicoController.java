package com.medico.clickmed.controller;

import com.medico.clickmed.model.Medico;
import com.medico.clickmed.model.Paciente;
import com.medico.clickmed.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("medico")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping()
    public  String iniciar(Medico medico, Model model){
        return "medico/formulario";
    }

    @GetMapping("/listar")
    public  String paginaListar(Model model){
        model.addAttribute("medicos", medicoService.listartodos());
        return "medico/lista";
    }

    @PostMapping()
    public String salvar(Medico medico, Model model){
        medicoService.criar(medico);
        return "redirect:medico/listar";
    }

    @GetMapping("editar/{id}")
    public String alterar(@PathVariable Long id, Model model){
        model.addAttribute("medico", medicoService.buscarId(id));
        return "medico/formulario";
    }

    @GetMapping("remover/{id}")
    public String remover(@PathVariable Long id, Model model){
        medicoService.deletar(id);
        return "medico/lista";
    }
}