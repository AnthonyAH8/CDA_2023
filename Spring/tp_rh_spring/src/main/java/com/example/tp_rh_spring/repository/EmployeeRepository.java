package com.example.tp_rh_spring.repository;

import com.example.tp_rh_spring.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
