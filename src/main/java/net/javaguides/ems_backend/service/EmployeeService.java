package net.javaguides.ems_backend.service;

import net.javaguides.ems_backend.dto.EmployeeDto;

public interface EmployeeService {
   EmployeeDto createEmployee(EmployeeDto employeeDto); 
   //EmployeeDto updateEmployee(EmployeeDto employeeDto);
   //void deleteEmployee(long id);
   EmployeeDto getEmployeeById(long id);

    
}
