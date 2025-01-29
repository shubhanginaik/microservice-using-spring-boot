package com.example.employee_service.repository;

import com.example.employee_service.model.Employee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

  private final List<Employee> employees = new ArrayList<>();

  public Employee addEmployee(Employee employee) {
    employees.add(employee);
    return employee;
  }

  public List<Employee> findAll() {
    return employees;
  }

  public Employee findById(Long id) {
    return employees.stream()
        .filter(employee -> employee.id().equals(id))
        .findFirst()
        .orElse(null);
  }

  public List<Employee> findByDepartmentId(Long departmentId) {
    return employees.stream()
        .filter(employee -> employee.departmentId().equals(departmentId))
        .toList();
  }

}
