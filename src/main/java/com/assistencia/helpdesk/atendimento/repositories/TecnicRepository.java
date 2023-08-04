package com.assistencia.helpdesk.atendimento.repositories;

import com.assistencia.helpdesk.atendimento.models.Tecnic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface TecnicRepository extends JpaRepository <Tecnic, Integer> {


    Optional<Tecnic> findById(Integer id);
}
