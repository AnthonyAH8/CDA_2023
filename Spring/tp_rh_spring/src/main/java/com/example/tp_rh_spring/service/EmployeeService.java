package com.example.tp_rh_spring.service;

import com.example.tp_rh_spring.dto.employee.EmployeeDtoGet;
import com.example.tp_rh_spring.dto.employee.EmployeeDtoPost;
import com.example.tp_rh_spring.entity.Employee;
import com.example.tp_rh_spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements BaseService<EmployeeDtoPost, EmployeeDtoGet> {

    @Autowired
    private EmployeeRepository employeeRepository;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Override
    public EmployeeDtoGet findById(int id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById((long) id);
        return optionalEmployee.map(this::employeeToEmployeeGet)
                .orElseThrow(() -> new RuntimeException("Employé non présent"));
    }

    @Override
    public List<EmployeeDtoGet> findAll() {
        List<Employee> employees = (List<Employee>) employeeRepository.findAll();
        return employees.stream()
                .map(this::employeeToEmployeeGet)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDtoGet create(EmployeeDtoPost employeeDtoPost) {
        Employee employee = Employee.builder()
                .name(employeeDtoPost.getName())
                .identificationNumber(employeeDtoPost.getIdentificationNumber())
                .adress(employeeDtoPost.getAddress())
                .phoneNumber(employeeDtoPost.getPhoneNumber())
                .email(employeeDtoPost.getEmail())
                .dateOfBirth(LocalDate.parse(employeeDtoPost.getDateOfBirth(), formatter))
                .contractStart(LocalDate.parse(employeeDtoPost.getContractStart(), formatter))
                .contractEnd(LocalDate.parse(employeeDtoPost.getContractEnd(), formatter))
                .occupation(employeeDtoPost.getOccupation())
                .admin(employeeDtoPost.isAdmin())
                .salary(employeeDtoPost.getSalary())
                .observation(employeeDtoPost.getObservation())
                .build();
        employeeRepository.save(employee);
        return employeeToEmployeeGet(employee);
    }

    @Override
    public EmployeeDtoGet update(int id, EmployeeDtoPost employeeDtoPost) {
        Optional<Employee> optionalEmployee = employeeRepository.findById((long) id);
        Employee employee = optionalEmployee.get();
        employee.setName(employeeDtoPost.getName());
        employee.setIdentificationNumber(employeeDtoPost.getIdentificationNumber());
        employee.setAdress(employeeDtoPost.getAddress());
        employee.setPhoneNumber(employeeDtoPost.getPhoneNumber());
        employee.setEmail(employeeDtoPost.getEmail());
        employee.setDateOfBirth(LocalDate.parse(employeeDtoPost.getDateOfBirth(), formatter));
        employee.setContractStart(LocalDate.parse(employeeDtoPost.getContractStart(), formatter));
        employee.setContractEnd(LocalDate.parse(employeeDtoPost.getContractEnd(), formatter));
        employee.setOccupation(employeeDtoPost.getOccupation());
        employee.setAdmin(employeeDtoPost.isAdmin());
        employee.setSalary(employeeDtoPost.getSalary());
        employee.setObservation(employeeDtoPost.getObservation());
        employeeRepository.save(employee);
        return employeeToEmployeeGet(employee);
    }

    @Override
    public boolean delete(int id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById((long) id);
        employeeRepository.delete(optionalEmployee.get());
        return true;
    }

    private EmployeeDtoGet employeeToEmployeeGet(Employee employee) {
        return EmployeeDtoGet.builder()
                .id(employee.getId())
                .name(employee.getName())
                .identificationNumber(employee.getIdentificationNumber())
                .address(employee.getAdress())
                .phoneNumber(employee.getPhoneNumber())
                .email(employee.getEmail())
                .dateOfBirth(employee.getDateOfBirth())
                .contractStart(employee.getContractStart())
                .contractEnd(employee.getContractEnd())
                .occupation(employee.getOccupation())
                .admin(employee.isAdmin())
                .salary(employee.getSalary())
                .observation(employee.getObservation())
                .build();
    }
}
