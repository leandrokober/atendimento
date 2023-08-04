package com.assistencia.helpdesk.atendimento.services;

import com.assistencia.helpdesk.atendimento.models.Tecnic;
import com.assistencia.helpdesk.atendimento.repositories.TecnicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
    public class TecnicService {

    @Autowired
        private TecnicRepository tecnicRepository;

    public Tecnic findById(Integer id) {
        Optional<Tecnic> usr = tecnicRepository.findById(id);
        return usr.orElse(null);
    }



}
