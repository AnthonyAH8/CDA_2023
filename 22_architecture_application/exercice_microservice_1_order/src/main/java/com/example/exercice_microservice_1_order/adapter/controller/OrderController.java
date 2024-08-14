package com.example.exercice_microservice_1_order.adapter.controller;

import com.example.exercice_microservice_1_order.domain.entity.Order;
import com.example.exercice_microservice_1_order.domain.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<List<Order>> getOrders() {
        return ResponseEntity.ok(orderService.getAllOrders());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@RequestParam int id) {
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    @PostMapping("/addorder")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.saveOrder(order));
    }
}
