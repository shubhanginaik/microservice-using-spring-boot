package com.example.department_service.repository;

import com.example.department_service.model.Department;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentRepository {

  private final List<Department> departments = new ArrayList<>();

  public Department addDepartment(Department department){
    departments.add(department);
    return department;
  }

  public Department findById(Long id){
    return  departments.stream()
        .filter(department -> Long.valueOf(department.getId()).equals(id))
        .findFirst()
        .orElseThrow();
  }

  public List<Department> findAll(){
    return departments;
  }

}
