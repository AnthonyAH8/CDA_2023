package com.example.exercice_microservice_1_order.repository;

import com.example.exercice_microservice_1_order.domain.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
