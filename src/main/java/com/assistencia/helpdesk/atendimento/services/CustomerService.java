package com.assistencia.helpdesk.atendimento.services;

import com.assistencia.helpdesk.atendimento.models.Customer;
import com.assistencia.helpdesk.atendimento.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
    public class CustomerService {

    @Autowired
        private CustomerRepository customerRepository;

    public Customer findById(Integer id) {
        Optional<Customer> cst = customerRepository.findById(id);
        return cst.orElse(null);
    }



}
