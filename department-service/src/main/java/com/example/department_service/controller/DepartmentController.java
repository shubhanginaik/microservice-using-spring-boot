package com.example.department_service.controller;

import com.example.department_service.model.Department;
import com.example.department_service.repository.DepartmentRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
  private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

  @Autowired
  private DepartmentRepository repository;

  @PostMapping
  public  Department add(@RequestBody Department department) {
    LOGGER.info("Department add: {}", department);
    return repository.addDepartment(department);
  }

  @GetMapping
  public List<Department> findAll(){
    LOGGER.info("Department find");
    return repository.findAll();
  }

  @GetMapping("/{id}")
  public Department findById(@PathVariable Long id){
    LOGGER.info("Department find: id={}", id);
    return repository.findById(id);
  }

}
