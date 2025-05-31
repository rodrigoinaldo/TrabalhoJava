package com.medico.clickmed.controller;

import com.medico.clickmed.model.Agenda;
import com.medico.clickmed.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("agenda")
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

}
