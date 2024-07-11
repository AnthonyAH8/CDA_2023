package com.example.tp_rh_spring.controller;

import com.example.tp_rh_spring.dto.employee.EmployeeDtoGet;
import com.example.tp_rh_spring.dto.employee.EmployeeDtoPost;
import com.example.tp_rh_spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080/employees")
@RestController
@RequestMapping("/rh")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDtoGet>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.findAll());
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeDtoGet> getEmployeeById(@PathVariable int id) {
        return ResponseEntity.ok(employeeService.findById(id));
    }

    @PostMapping("/employees/add")
    public ResponseEntity<EmployeeDtoGet> addEmployee(@Validated EmployeeDtoPost employeeDtoPost) {
       return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.create(employeeDtoPost));
    }

    @PutMapping("/employees/update/{id}")
    public ResponseEntity<EmployeeDtoGet> updateEmployee(@PathVariable int id, @Validated EmployeeDtoPost employeeDtoPost) {
        return ResponseEntity.ok(employeeService.update(id, employeeDtoPost));
    }

    @DeleteMapping("/employees/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
        employeeService.delete(id);
        return ResponseEntity.ok("Employé " + id + " supprimé");
    }
}
