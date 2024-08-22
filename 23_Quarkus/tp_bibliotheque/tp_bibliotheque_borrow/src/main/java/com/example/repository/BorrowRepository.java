package com.example.repository;

import com.example.entity.Borrow;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BorrowRepository implements PanacheRepository<Borrow> {
}
