package com.medico.clickmed.controller;

import com.medico.clickmed.model.Agenda;
import com.medico.clickmed.model.Medico;
import com.medico.clickmed.model.Paciente;
import com.medico.clickmed.repository.MedicoRepository;
import com.medico.clickmed.service.AgendaService;
import com.medico.clickmed.service.MedicoService;
import com.medico.clickmed.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("agenda")
public class AgendaController {

    @Autowired
    private MedicoService medicoService;

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private AgendaService agendaService;


    @GetMapping()
    public  String iniciar(Agenda agenda, Model model){

        List<Medico> medicos = medicoService.listartodos();
        List<Paciente> pacientes = pacienteService.listartodos();

        model.addAttribute("agenda", new Agenda()); // Criar objeto vazio para o formulário
        model.addAttribute("medicos", medicos);
        model.addAttribute("pacientes", pacientes);


        return "agenda/formulario";
    }

    @GetMapping("/listar")
    public  String paginaListar(Model model){
        model.addAttribute("agendas", agendaService.listartodos());
        return "agenda/lista";
    }

    @PostMapping()
    public String salvar(Agenda agenda, Model model){
        agendaService.criar(agenda);
        return "redirect:agenda/listar";
    }

    @GetMapping("editar/{id}")
    public String alterar(@PathVariable Long id, Model model){

        Agenda agenda = agendaService.buscarId(id);
        List<Medico> medicos = medicoService.listartodos();
        List<Paciente> pacientes = pacienteService.listartodos();

        model.addAttribute("agenda", agenda);
        model.addAttribute("medicos", medicos);
        model.addAttribute("pacientes", pacientes);

        return "agenda/formulario";

    }

    @GetMapping("remover/{id}")
    public String remover(@PathVariable Long id, Model model){
        agendaService.deletar(id);
        return "agenda/lista";
    }

}