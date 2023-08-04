package com.assistencia.helpdesk.atendimento.repositories;

import com.assistencia.helpdesk.atendimento.models.Atendimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AtendimentoRepository extends JpaRepository <Atendimento, Integer> {

    Optional<Atendimento> findById(Integer id);

}
