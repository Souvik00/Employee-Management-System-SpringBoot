package net.javaguides.ems_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.ems_backend.entity.Employee;

public interface EmployeeRopository extends JpaRepository<Employee, Long> {
    

}
