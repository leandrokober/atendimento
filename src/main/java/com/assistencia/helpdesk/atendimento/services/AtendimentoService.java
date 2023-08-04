package com.assistencia.helpdesk.atendimento.services;

import com.assistencia.helpdesk.atendimento.models.Atendimento;
import com.assistencia.helpdesk.atendimento.repositories.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AtendimentoService {

    @Autowired
    AtendimentoRepository atendimentoRepository;

    public Atendimento findById(Integer id) {
        Optional<Atendimento> atd = atendimentoRepository.findById(id);
        return atd.orElse(null);
    }
}
