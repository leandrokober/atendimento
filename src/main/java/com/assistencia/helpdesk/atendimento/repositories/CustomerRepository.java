package com.assistencia.helpdesk.atendimento.repositories;

import com.assistencia.helpdesk.atendimento.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Optional<Customer> findById (Integer id);
}
