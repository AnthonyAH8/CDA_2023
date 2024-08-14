package com.example.exercice_microservice_1_order.domain.service;

import com.example.exercice_microservice_1_order.domain.entity.Order;
import com.example.exercice_microservice_1_order.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return (List<Order>) orderRepository.findAll();
    }

    public Order getOrderById(int id) {
        Optional<Order> order = orderRepository.findById(id);
        if (order.isPresent()) {
            return order.get();
        }else {
            throw new RuntimeException("Order not found");
        }
    }
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrderById(int id) {
        orderRepository.deleteById(id);
    }
}
