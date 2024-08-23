package com.example.employee.domain.service;

import com.example.employee.domain.entity.Employee;
import com.example.employee.shared.port.EmployeePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeePort employeePort;

    public EmployeeService(EmployeePort employeePort) {
        this.employeePort = employeePort;
    }

    public Employee save(Employee employee){
        Employee employee1 = new Employee(employee.getId(), employee.getFirstname(), employee.getLastname(), employee.getEmail());
        employee1 = Employee.save(employee1);
        return employee1;
    }

    public List<Employee> get(){
        
    }
}
