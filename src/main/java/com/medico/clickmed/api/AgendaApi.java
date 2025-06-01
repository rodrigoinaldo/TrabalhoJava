package com.medico.clickmed.api;

import com.medico.clickmed.model.Agenda;
import com.medico.clickmed.service.AgendaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "api/agenda", produces = MediaType.APPLICATION_JSON_VALUE)
public class AgendaApi {

    @Autowired
    private AgendaService agendaService;

    @GetMapping
    public ResponseEntity<List<Agenda>> listarTodos(){
        return ResponseEntity.ok(agendaService.listartodos());
    }

    @PostMapping
    public ResponseEntity salvar(@RequestBody Agenda agenda){
        if (agenda.getMedico() == null) return ResponseEntity.badRequest().build();
        agendaService.criar(agenda);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity alterar(@RequestBody Agenda agenda){
        if (agenda.getMedico() == null) return ResponseEntity.badRequest().build();
        agendaService.criar(agenda);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id){
        if (id == null) return ResponseEntity.badRequest().build();
        agendaService.deletar(id);
        return ResponseEntity.ok().build();
    }
}