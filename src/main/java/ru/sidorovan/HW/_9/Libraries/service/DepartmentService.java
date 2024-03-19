package ru.sidorovan.HW._9.Libraries.service;

import ru.sidorovan.HW._9.Libraries.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee findEmployeeWithMaxSalary(int DepartmentId);
    Employee findEmployeeWithMinSalary(int DepartmentId);
    Collection<Employee> findEmployeesByDepartment(int departmentId);
    Map<Integer, List<Employee>> findEmployeesByDepartment();
}
