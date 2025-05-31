package com.medico.clickmed.controller;

import com.medico.clickmed.model.Medico;
import com.medico.clickmed.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("medico")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;


}
