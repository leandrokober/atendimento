package com.assistencia.helpdesk.atendimento.services;

import com.assistencia.helpdesk.atendimento.models.Customer;
import com.assistencia.helpdesk.atendimento.models.SystemUser;
import com.assistencia.helpdesk.atendimento.repositories.CustomerRepository;
import com.assistencia.helpdesk.atendimento.repositories.SystemUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
    public class SystemUserService {

    @Autowired
        private SystemUserRepository systemUserRepository;

    public SystemUser findById(Integer id) {
        Optional<SystemUser> usr = systemUserRepository.findById(id);
        return usr.orElse(null);
    }



}
