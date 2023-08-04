package com.assistencia.helpdesk.atendimento.services;

import com.assistencia.helpdesk.atendimento.models.Order;
import com.assistencia.helpdesk.atendimento.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order findById(Integer id) {
        Optional<Order> ord = orderRepository.findById(id);
        return ord.orElse(null);
    }
}
