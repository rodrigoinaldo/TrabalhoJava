package com.medico.clickmed.service;

import com.medico.clickmed.model.Medico;
import com.medico.clickmed.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public Medico criar(Medico medico){
        return medicoRepository.save(medico);
    }

    public List<Medico> listartodos(){
        return medicoRepository.findAll();
    }

    public Medico buscarId(Long id){
        return  medicoRepository.findById(id).get();
    }

    public void  deletar(long id){
        medicoRepository.deleteById(id);
    }
}
