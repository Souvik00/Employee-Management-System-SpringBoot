package net.javaguides.ems_backend.service.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.javaguides.ems_backend.dto.EmployeeDto;
import net.javaguides.ems_backend.entity.Employee;
import net.javaguides.ems_backend.exception.ResourceNotFound;
import net.javaguides.ems_backend.mapper.EmployeeMapper;
import net.javaguides.ems_backend.repository.EmployeeRopository;
import net.javaguides.ems_backend.service.EmployeeService;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRopository employeeRopository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.toEmployee(employeeDto);
        employeeRopository.save(employee);

        return employeeDto;
    }
    
    @Override
    public EmployeeDto getEmployeeById(long id) {
        Employee employee = employeeRopository.findById(id).orElseThrow(() -> new ResourceNotFound("Employee not exist with id: " + id));
        return EmployeeMapper.toEmployeeDto(employee);
    }

}
