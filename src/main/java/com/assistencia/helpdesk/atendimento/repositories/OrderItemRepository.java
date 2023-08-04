package com.assistencia.helpdesk.atendimento.repositories;
import com.assistencia.helpdesk.atendimento.models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {


    Optional<OrderItem> findById(Integer id);
}
