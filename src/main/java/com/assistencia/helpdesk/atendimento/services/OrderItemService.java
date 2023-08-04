package com.assistencia.helpdesk.atendimento.services;

import com.assistencia.helpdesk.atendimento.models.Order;
import com.assistencia.helpdesk.atendimento.models.OrderItem;
import com.assistencia.helpdesk.atendimento.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderItemService {
    @Autowired
    OrderItemRepository orderItemRepository;

    public OrderItem findById(Integer id) {
        Optional<OrderItem> ite = orderItemRepository.findById(id);
        return ite.orElse(null);

    }
}