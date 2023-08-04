package com.assistencia.helpdesk.atendimento.repositories;

import com.assistencia.helpdesk.atendimento.models.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface SystemUserRepository extends JpaRepository <SystemUser, Integer> {


    Optional<SystemUser> findById(Integer id);
}
