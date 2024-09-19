package org.example.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.example.entity.Department;

import java.util.List;

@ApplicationScoped
public class DepartmentRepository implements PanacheRepository<Department> {

    public List<Department> getDepartments(int departmentId) {
        return find("from Department", departmentId).list();
    }
}
