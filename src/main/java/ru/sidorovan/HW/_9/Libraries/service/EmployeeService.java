package ru.sidorovan.HW._9.Libraries.service;

import ru.sidorovan.HW._9.Libraries.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String lastName, int salary, int departmentId);
    Employee add(String firstName, String lastName);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);
    Collection<Employee> findAll();
}
