package com.medico.clickmed.service;

import com.medico.clickmed.model.Agenda;
import com.medico.clickmed.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public Agenda criar(Agenda agenda){
        return agendaRepository.save(agenda);
    }

    public List<Agenda> listartodos(){
        return agendaRepository.findAll();
    }

    public Agenda buscarId(Long id){
        return  agendaRepository.findById(id).get();
    }

    public void  deletar(long id){
        agendaRepository.deleteById(id);
    }
}
