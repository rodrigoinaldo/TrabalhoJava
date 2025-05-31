package com.medico.clickmed.service;

import com.medico.clickmed.model.Paciente;
import com.medico.clickmed.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private  PacienteRepository pacienteRepository; // autorizando ele a ser usado

    public Paciente save(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> listartodos(){
        return pacienteRepository.findAll();
    }

    public Paciente buscarId(Long id){
        return  pacienteRepository.findById(id).get();
    }

    public void  deletar(long id){
        pacienteRepository.deleteById(id);
    }
}
