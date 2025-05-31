package com.medico.clickmed.repository;

import com.medico.clickmed.model.Medico;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> { // primeiro a model, depois o tipo da Primarykey
}
