package org.example.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.example.departement.DepartmentService;
import org.example.dto.DepartmentDto;
import org.example.entity.Employee;
import org.example.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@ApplicationScoped
public class EmployeeService {

    @Inject
    EmployeeRepository employeeRepository;

    @Inject
    @RestClient
    DepartmentService departmentService;

    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeRepository.listAll();
        return employees.stream()
                .map(this::employeeDepartment)
                .collect(Collectors.toList());
    }

    public Employee getEmployee(int id) {
        return Optional.ofNullable(employeeRepository.findById((long) id))
                .map(this::employeeDepartment)
                .orElseThrow(() -> new WebApplicationException("Employé non trouvé", 404));
    }

    @Transactional
    public Response createEmployee(Employee employee) {
        validateEmployee(employee);
        DepartmentDto departmentDto = departmentService.getDepartmentById(employee.getDepartementDto().getId());
        employee.setDepartementDto(departmentDto);
        employeeRepository.persist(employee);
        return Response.status(Response.Status.CREATED).entity(departmentDto).build();
    }

    @Transactional
    public Response updateEmployee(int id, Employee employee) {
        validateEmployee(employee);
        DepartmentDto departmentDto = departmentService.getDepartmentById(employee.getDepartementDto().getId());
        employee.setDepartementDto(departmentDto);
        employeeRepository.persist(employee);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @Transactional
    public Response deleteEmployee(int id) {
        Optional.ofNullable(employeeRepository.findById((long) id))
                .ifPresentOrElse(employee -> employeeRepository.deleteById((long) id), () -> {
                    throw new WebApplicationException("Employé introuvable", 404);
                });
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    public List<Employee> getEmployeeByDepartment(Long departmentId) {
        if (departmentId == null){
            throw new WebApplicationException(Response.Status.BAD_REQUEST.getStatusCode());
        }
        List<Employee> employees = employeeRepository.getEmployees(Math.toIntExact(departmentId));

        if (employees.isEmpty()){
            throw new WebApplicationException(Response.Status.BAD_REQUEST.getStatusCode());
        }
        return employees.stream()
                .map(this::employeeDepartment)
                .collect(Collectors.toList());
    }

    private Employee employeeDepartment(Employee employee) {
        if (employee != null) {
            DepartmentDto department = departmentService.getDepartmentById(Math.toIntExact(employee.getDepartementDto().getId()));
            if (department == null) {
                throw new WebApplicationException("Departement non trouvé pour l'employé avec ID: " + employee.getId(), 404);
            }
            employee.setDepartementDto(department);
        }
        return employee;
    }

    private void validateEmployee(Employee employee) {
        if (employee == null) {
            throw new WebApplicationException("Les informations de l'employé ne peuvent pas être nulles", 400);
        }
        if (employee.getDepartementDto() == null) {
            throw new WebApplicationException("Le département de l'employé ne peut pas être nul", 400);
        }
        if (employee.getDepartementDto().getId() == 0) {
            throw new WebApplicationException("L'ID du département ne peut pas être nul ou égal à zéro", 400);
        }
    }
}
