package com.example.employee_service.model;

public record Employee(Long id, Long departmentId, String name, int age, String position) {
  public Employee {
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be negative");
    }
  }


}
