package com.example.employee.shared.port;

import com.example.employee.domain.entity.Employee;

import java.util.List;

public interface EmployeePort {
    Employee save(Employee employee);
    List<Employee> get();
}
