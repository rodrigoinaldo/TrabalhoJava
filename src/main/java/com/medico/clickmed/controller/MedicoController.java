package com.medico.clickmed.controller;

import com.medico.clickmed.model.Medico;
import com.medico.clickmed.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping()
        public String inserir(Medico medico, Model model){
            return iniciar( medico, model );
    }

    @GetMapping("/listar")
    public  String paginaListar(Model model){
        model.addAttribute("medico", medicoService.listartodos());
        return "medico/lista";
    }


}
